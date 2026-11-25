package io.flutter.plugins.googlemobileads;

import android.view.ViewGroup;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.util.Preconditions;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class FlutterAdManagerBannerAd extends FlutterAd implements FlutterAdLoadedListener {
    private final String adUnitId;
    protected AdManagerAdView adView;
    private final BannerAdCreator bannerAdCreator;
    protected final AdInstanceManager manager;
    private final FlutterAdManagerAdRequest request;
    private final List<FlutterAdSize> sizes;

    public FlutterAdManagerBannerAd(int i, AdInstanceManager adInstanceManager, String str, List<FlutterAdSize> list, FlutterAdManagerAdRequest flutterAdManagerAdRequest, BannerAdCreator bannerAdCreator) {
        super(i);
        Preconditions.checkNotNull(adInstanceManager);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(flutterAdManagerAdRequest);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.sizes = list;
        this.request = flutterAdManagerAdRequest;
        this.bannerAdCreator = bannerAdCreator;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void load() {
        AdManagerAdView adManagerAdViewCreateAdManagerAdView = this.bannerAdCreator.createAdManagerAdView();
        this.adView = adManagerAdViewCreateAdManagerAdView;
        if (this instanceof FluidAdManagerBannerAd) {
            adManagerAdViewCreateAdManagerAdView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.adView.setAdUnitId(this.adUnitId);
        this.adView.setAppEventListener(new AppEventListener() { // from class: io.flutter.plugins.googlemobileads.FlutterAdManagerBannerAd.1
            @Override // com.google.android.gms.ads.admanager.AppEventListener
            public void onAppEvent(String str, String str2) {
                FlutterAdManagerBannerAd.this.manager.onAppEvent(FlutterAdManagerBannerAd.this.adId, str, str2);
            }
        });
        AdSize[] adSizeArr = new AdSize[this.sizes.size()];
        for (int i = 0; i < this.sizes.size(); i++) {
            adSizeArr[i] = this.sizes.get(i).getAdSize();
        }
        this.adView.setAdSizes(adSizeArr);
        this.adView.setAdListener(new FlutterBannerAdListener(this.adId, this.manager, this));
        this.adView.loadAd(this.request.asAdManagerAdRequest(this.adUnitId));
    }

    public void onAdLoaded() {
        if (this.adView != null) {
            this.manager.onAdLoaded(this.adId, this.adView.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    PlatformView getPlatformView() {
        if (this.adView == null) {
            return null;
        }
        return new FlutterPlatformView(this.adView);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView != null) {
            adManagerAdView.destroy();
            this.adView = null;
        }
    }

    FlutterAdSize getAdSize() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView == null || adManagerAdView.getAdSize() == null) {
            return null;
        }
        return new FlutterAdSize(this.adView.getAdSize());
    }

    boolean isCollapsible() {
        AdManagerAdView adManagerAdView = this.adView;
        if (adManagerAdView == null) {
            return false;
        }
        return adManagerAdView.isCollapsible();
    }
}
