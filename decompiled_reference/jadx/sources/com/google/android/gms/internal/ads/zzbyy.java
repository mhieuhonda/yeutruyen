package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbyy extends zzbny {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbyy(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zze(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    public final void zzf() {
        this.zza.onUnconfirmedClickCancelled();
    }
}
