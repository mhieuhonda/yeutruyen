package io.flutter.plugins.googlemobileads;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class FlutterInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterInterstitialAd";
    private InterstitialAd ad;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;

    public FlutterInterstitialAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void load() {
        String str;
        FlutterAdRequest flutterAdRequest;
        if (this.manager == null || (str = this.adUnitId) == null || (flutterAdRequest = this.request) == null) {
            return;
        }
        this.flutterAdLoader.loadInterstitial(str, flutterAdRequest.asAdRequest(str), new DelegatingInterstitialAdLoadCallback(this));
    }

    void onAdLoaded(InterstitialAd interstitialAd) {
        this.ad = interstitialAd;
        interstitialAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, interstitialAd.getResponseInfo());
    }

    void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        this.ad = null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.ad == null) {
            Log.e(TAG, "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.ad.show(this.manager.getActivity());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z) {
        InterstitialAd interstitialAd = this.ad;
        if (interstitialAd == null) {
            Log.e(TAG, "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            interstitialAd.setImmersiveMode(z);
        }
    }

    private static final class DelegatingInterstitialAdLoadCallback extends InterstitialAdLoadCallback {
        private final WeakReference<FlutterInterstitialAd> delegate;

        DelegatingInterstitialAdLoadCallback(FlutterInterstitialAd flutterInterstitialAd) {
            this.delegate = new WeakReference<>(flutterInterstitialAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(InterstitialAd interstitialAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(interstitialAd);
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
