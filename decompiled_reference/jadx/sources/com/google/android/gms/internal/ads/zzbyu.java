package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbyu extends zzbno {
    final /* synthetic */ zzbyv zza;

    /* synthetic */ zzbyu(zzbyv zzbyvVar, byte[] bArr) {
        Objects.requireNonNull(zzbyvVar);
        this.zza = zzbyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnp
    public final void zze(zzbnc zzbncVar) {
        zzbyv zzbyvVar = this.zza;
        zzbyvVar.zzd().onCustomFormatAdLoaded(zzbyvVar.zzc(zzbncVar));
    }
}
