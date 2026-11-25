package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfhu implements zzfie {
    private zzdch zza;

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdch zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfif zzfifVar, zzfid zzfidVar, Object obj) {
        return zzb(zzfifVar, zzfidVar, null);
    }

    public final synchronized ListenableFuture zzb(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzcze zzczeVarZza;
        try {
            if (zzdchVar != null) {
                this.zza = zzdchVar;
            } else {
                this.zza = (zzdch) zzfidVar.zza(zzfifVar.zzb).zzh();
            }
            zzczeVarZza = this.zza.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzczeVarZza.zzc(zzczeVarZza.zzb());
    }
}
