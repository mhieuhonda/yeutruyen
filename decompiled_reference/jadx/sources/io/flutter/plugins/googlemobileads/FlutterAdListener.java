package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes3.dex */
class FlutterAdListener extends AdListener {
    protected final int adId;
    protected final AdInstanceManager manager;

    FlutterAdListener(int i, AdInstanceManager adInstanceManager) {
        this.adId = i;
        this.manager = adInstanceManager;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        this.manager.onAdClosed(this.adId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        this.manager.onAdOpened(this.adId);
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }
}
