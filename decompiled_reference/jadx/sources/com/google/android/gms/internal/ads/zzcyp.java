package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcyp {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ListenableFuture zzc;
    private volatile boolean zzd = true;

    public zzcyp(Executor executor, ScheduledExecutorService scheduledExecutorService, ListenableFuture listenableFuture) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = listenableFuture;
    }

    public final void zza(zzhcc zzhccVar) {
        zzhcf.zzr(this.zzc, new zzcyj(this, zzhccVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    final /* synthetic */ ListenableFuture zzc(zzhcc zzhccVar, ListenableFuture listenableFuture, zzcya zzcyaVar) {
        if (zzcyaVar != null) {
            zzhccVar.zzb(zzcyaVar);
        }
        return zzhcf.zzi(listenableFuture, ((Long) zzbll.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    final /* synthetic */ void zze(List list, final zzhcc zzhccVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhccVar.zza(new zzeel(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureZza = zzhcf.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final ListenableFuture listenableFuture = (ListenableFuture) it.next();
            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcyl
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    zzhccVar.zza((Throwable) obj);
                    return zzhcf.zza(null);
                }
            };
            Executor executor = this.zza;
            listenableFutureZza = zzhcf.zzj(zzhcf.zzh(listenableFutureZza, Throwable.class, zzhbnVar, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcym
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return this.zza.zzc(zzhccVar, listenableFuture, (zzcya) obj);
                }
            }, executor);
        }
        zzhcf.zzr(listenableFutureZza, new zzcyk(this, zzhccVar), this.zza);
    }

    final /* synthetic */ void zzf() {
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
