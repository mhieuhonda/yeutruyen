package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdView;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.util.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
class FlutterBannerAd extends FlutterAd implements FlutterAdLoadedListener {
    private final String adUnitId;
    private AdView adView;
    private final BannerAdCreator bannerAdCreator;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    private final FlutterAdSize size;

    public FlutterBannerAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdSize flutterAdSize, BannerAdCreator bannerAdCreator) {
        super(i);
        Preconditions.checkNotNull(adInstanceManager);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(flutterAdRequest);
        Preconditions.checkNotNull(flutterAdSize);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.size = flutterAdSize;
        this.bannerAdCreator = bannerAdCreator;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAdLoadedListener
    public void onAdLoaded() {
        if (this.adView != null) {
            this.manager.onAdLoaded(this.adId, this.adView.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void load() {
        AdView adViewCreateAdView = this.bannerAdCreator.createAdView();
        this.adView = adViewCreateAdView;
        adViewCreateAdView.setAdUnitId(this.adUnitId);
        this.adView.setAdSize(this.size.getAdSize());
        this.adView.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.adView.setAdListener(new FlutterBannerAdListener(this.adId, this.manager, this));
        this.adView.loadAd(this.request.asAdRequest(this.adUnitId));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public PlatformView getPlatformView() {
        if (this.adView == null) {
            return null;
        }
        return new FlutterPlatformView(this.adView);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        AdView adView = this.adView;
        if (adView != null) {
            adView.destroy();
            this.adView = null;
        }
    }

    FlutterAdSize getAdSize() {
        AdView adView = this.adView;
        if (adView == null || adView.getAdSize() == null) {
            return null;
        }
        return new FlutterAdSize(this.adView.getAdSize());
    }

    boolean isCollapsible() {
        AdView adView = this.adView;
        if (adView == null) {
            return false;
        }
        return adView.isCollapsible();
    }
}
