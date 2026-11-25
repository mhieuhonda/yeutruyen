package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyx extends zzbnv {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbyx(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zze(zzboc zzbocVar) {
        this.zza.onNativeAdLoaded(new zzbys(zzbocVar));
    }
}
