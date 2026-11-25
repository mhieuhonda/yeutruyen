package io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: FlutterAdListener.java */
/* JADX INFO: loaded from: classes3.dex */
class FlutterBannerAdListener extends FlutterAdListener {
    final WeakReference<FlutterAdLoadedListener> adLoadedListenerWeakReference;

    FlutterBannerAdListener(int i, AdInstanceManager adInstanceManager, FlutterAdLoadedListener flutterAdLoadedListener) {
        super(i, adInstanceManager);
        this.adLoadedListenerWeakReference = new WeakReference<>(flutterAdLoadedListener);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        if (this.adLoadedListenerWeakReference.get() != null) {
            this.adLoadedListenerWeakReference.get().onAdLoaded();
        }
    }
}
