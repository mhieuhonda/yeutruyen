package io.flutter.plugins.googlemobileads;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import io.flutter.util.Preconditions;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class FlutterAppOpenAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterAppOpenAd";
    private AppOpenAd ad;
    private final FlutterAdManagerAdRequest adManagerAdRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;

    FlutterAppOpenAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i);
        Preconditions.checkState((flutterAdRequest == null && flutterAdManagerAdRequest == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerAdRequest = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void load() {
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadAppOpen(str, flutterAdRequest.asAdRequest(str), new DelegatingAppOpenAdLoadCallback(this));
        } else {
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerAdRequest;
            if (flutterAdManagerAdRequest != null) {
                FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
                String str2 = this.adUnitId;
                flutterAdLoader2.loadAdManagerAppOpen(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), new DelegatingAppOpenAdLoadCallback(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdLoaded(AppOpenAd appOpenAd) {
        this.ad = appOpenAd;
        appOpenAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, appOpenAd.getResponseInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    void show() {
        if (this.ad == null) {
            Log.w(TAG, "Tried to show app open ad before it was loaded");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.ad.show(this.manager.getActivity());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    void setImmersiveMode(boolean z) {
        AppOpenAd appOpenAd = this.ad;
        if (appOpenAd == null) {
            Log.w(TAG, "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            appOpenAd.setImmersiveMode(z);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        this.ad = null;
    }

    private static final class DelegatingAppOpenAdLoadCallback extends AppOpenAd.AppOpenAdLoadCallback {
        private final WeakReference<FlutterAppOpenAd> delegate;

        DelegatingAppOpenAdLoadCallback(FlutterAppOpenAd flutterAppOpenAd) {
            this.delegate = new WeakReference<>(flutterAppOpenAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AppOpenAd appOpenAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(appOpenAd);
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(loadAdError);
            }
        }
    }
}
