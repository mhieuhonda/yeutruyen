package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: FlutterAdListener.java */
/* JADX INFO: loaded from: classes3.dex */
class FlutterNativeAdLoadedListener implements NativeAd.OnNativeAdLoadedListener {
    private final WeakReference<FlutterNativeAd> nativeAdWeakReference;

    FlutterNativeAdLoadedListener(FlutterNativeAd flutterNativeAd) {
        this.nativeAdWeakReference = new WeakReference<>(flutterNativeAd);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public void onNativeAdLoaded(NativeAd nativeAd) {
        if (this.nativeAdWeakReference.get() != null) {
            this.nativeAdWeakReference.get().onNativeAdLoaded(nativeAd);
        }
    }
}
