package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbs extends zzhcm {
    private final Executor zza;
    final /* synthetic */ zzhbt zzb;

    zzhbs(zzhbt zzhbtVar, Executor executor) {
        Objects.requireNonNull(zzhbtVar);
        this.zzb = zzhbtVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzhcm
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zzb(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final void zzg(Throwable th) {
        zzhbt zzhbtVar = this.zzb;
        zzhbtVar.zzD(null);
        if (th instanceof ExecutionException) {
            zzhbtVar.zzb(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            zzhbtVar.cancel(false);
        } else {
            zzhbtVar.zzb(th);
        }
    }
}
