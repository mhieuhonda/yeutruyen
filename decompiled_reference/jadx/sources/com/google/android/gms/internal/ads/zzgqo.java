package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgqo {
    private final zzgfs zza;
    private final zzgcy zzb;

    zzgqo(zzgcy zzgcyVar, zzgfs zzgfsVar) {
        this.zza = zzgfsVar;
        this.zzb = zzgcyVar;
    }

    public final zzgqm zza(int i) {
        return new zzgqm(i, this.zzb, this.zza);
    }

    public final void zzb(int i) {
        this.zza.zzb(i - 1, -1L, null, null);
    }

    public final void zzc(int i, String str) {
        this.zza.zzb(i - 1, -1L, null, str);
    }

    public final void zzd(int i, Throwable th) {
        this.zza.zzb(i - 1, -1L, th, null);
    }

    public final ListenableFuture zze(int i, ListenableFuture listenableFuture) {
        zzgqm zzgqmVarZza = zza(i);
        zzgqmVarZza.zza();
        zzhcf.zzr(listenableFuture, new zzgqn(this, zzgqmVarZza), zzhcw.zza());
        return listenableFuture;
    }

    public final void zzf(int i, Runnable runnable) {
        zzgqm zzgqmVarZza = zza(i);
        try {
            zzgqmVarZza.zza();
            runnable.run();
            zzgqmVarZza.zzc();
        } catch (Throwable th) {
            try {
                zzgqmVarZza.zzb(th);
                throw th;
            } catch (Throwable th2) {
                zzgqmVarZza.zzc();
                throw th2;
            }
        }
    }
}
