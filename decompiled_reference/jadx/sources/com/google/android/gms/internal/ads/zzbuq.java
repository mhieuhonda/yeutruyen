package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbuq implements zzcgh {
    final /* synthetic */ zzbtv zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzcgd zzc;
    final /* synthetic */ zzbut zzd;

    zzbuq(zzbut zzbutVar, zzbtv zzbtvVar, Object obj, zzcgd zzcgdVar) {
        this.zza = zzbtvVar;
        this.zzb = obj;
        this.zzc = zzcgdVar;
        Objects.requireNonNull(zzbutVar);
        this.zzd = zzbutVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzcgd zzcgdVar = this.zzc;
        this.zzd.zzc(this.zza, (zzbuc) obj, obj2, zzcgdVar);
    }
}
