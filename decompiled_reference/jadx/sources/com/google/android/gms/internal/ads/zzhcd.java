package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhcd implements Runnable {
    final ListenableFuture zza;
    final zzhcc zzb;

    zzhcd(ListenableFuture listenableFuture, zzhcc zzhccVar) {
        this.zza = listenableFuture;
        this.zzb = zzhccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        ListenableFuture listenableFuture = this.zza;
        if ((listenableFuture instanceof zzhdh) && (thZza = zzhdi.zza((zzhdh) listenableFuture)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzhcf.zzs(listenableFuture));
        } catch (ExecutionException e) {
            this.zzb.zza(e.getCause());
        } catch (Throwable th) {
            this.zzb.zza(th);
        }
    }

    public final String toString() {
        zzgtn zzgtnVarZzb = zzgto.zzb(this);
        zzgtnVarZzb.zza(this.zzb);
        return zzgtnVarZzb.toString();
    }
}
