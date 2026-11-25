package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgin implements zzgjh {
    private final Map zza;
    private final zzaxt zzb;
    private final zzgqm zzc;
    private final long zzd;

    zzgin(zzaxt zzaxtVar, Map map, zzgdq zzgdqVar, zzgqo zzgqoVar) {
        this.zza = map;
        this.zzb = zzaxtVar;
        this.zzc = zzgqoVar.zza(112);
        this.zzd = zzgdqVar.zzl();
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zza();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Void zza() throws Exception {
        zzayt zzaytVar;
        try {
            try {
                this.zzc.zza();
                ListenableFuture listenableFuture = (ListenableFuture) this.zza.get("gs");
                if (listenableFuture != null && (zzaytVar = (zzayt) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) != null) {
                    zzaxt zzaxtVar = this.zzb;
                    synchronized (zzaxtVar) {
                        zzaxtVar.zzad(zzaytVar.zzh());
                        zzaxtVar.zzN(zzaytVar.zzd());
                    }
                }
            } catch (Throwable th) {
                this.zzc.zzc();
                throw th;
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
            this.zzc.zzb(e);
        }
        this.zzc.zzc();
        return null;
    }
}
