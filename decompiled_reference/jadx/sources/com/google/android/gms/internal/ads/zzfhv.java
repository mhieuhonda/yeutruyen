package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhv implements zzfie {
    private final zzfie zza;
    private zzdch zzb;

    public zzfhv(zzfie zzfieVar) {
        this.zza = zzfieVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfif zzfifVar, zzfid zzfidVar, Object obj) {
        return zzb(zzfifVar, zzfidVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzcbk zzcbkVar;
        this.zzb = zzdchVar;
        if (zzdchVar == null || (zzcbkVar = zzfifVar.zza) == null) {
            return ((zzfhu) this.zza).zzb(zzfifVar, zzfidVar, zzdchVar);
        }
        zzcze zzczeVarZza = zzdchVar.zza();
        return zzczeVarZza.zzc(zzczeVarZza.zza(zzhcf.zza(zzcbkVar)));
    }
}
