package io.flutter.plugins.googlemobileads;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class FlutterAdManagerInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FltGAMInterstitialAd";
    private AdManagerInterstitialAd ad;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdManagerAdRequest request;

    public FlutterAdManagerInterstitialAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void load() {
        FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
        String str = this.adUnitId;
        flutterAdLoader.loadAdManagerInterstitial(str, this.request.asAdManagerAdRequest(str), new DelegatingAdManagerInterstitialAdCallbacks(this));
    }

    void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        this.ad = adManagerInterstitialAd;
        adManagerInterstitialAd.setAppEventListener(new DelegatingAdManagerInterstitialAdCallbacks(this));
        adManagerInterstitialAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, adManagerInterstitialAd.getResponseInfo());
    }

    void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    void onAppEvent(String str, String str2) {
        this.manager.onAppEvent(this.adId, str, str2);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.ad == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.ad.show(this.manager.getActivity());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.ad;
        if (adManagerInterstitialAd == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else {
            adManagerInterstitialAd.setImmersiveMode(z);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    void dispose() {
        this.ad = null;
    }

    private static final class DelegatingAdManagerInterstitialAdCallbacks extends AdManagerInterstitialAdLoadCallback implements AppEventListener {
        private final WeakReference<FlutterAdManagerInterstitialAd> delegate;

        DelegatingAdManagerInterstitialAdCallbacks(FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd) {
            this.delegate = new WeakReference<>(flutterAdManagerInterstitialAd);
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(adManagerInterstitialAd);
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(loadAdError);
            }
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(String str, String str2) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAppEvent(str, str2);
            }
        }
    }
}
