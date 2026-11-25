package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes3.dex */
class FlutterFullScreenContentCallback extends FullScreenContentCallback {
    protected final int adId;
    protected final AdInstanceManager manager;

    public FlutterFullScreenContentCallback(AdInstanceManager adInstanceManager, int i) {
        this.manager = adInstanceManager;
        this.adId = i;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdFailedToShowFullScreenContent(AdError adError) {
        this.manager.onFailedToShowFullScreenContent(this.adId, adError);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdShowedFullScreenContent() {
        this.manager.onAdShowedFullScreenContent(this.adId);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdDismissedFullScreenContent() {
        this.manager.onAdDismissedFullScreenContent(this.adId);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }
}
