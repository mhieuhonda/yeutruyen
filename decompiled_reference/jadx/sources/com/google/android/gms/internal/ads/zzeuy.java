package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeuy implements zzfcs {
    private final ListenableFuture zza;
    private final Executor zzb;
    private final ScheduledExecutorService zzc;

    zzeuy(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = listenableFuture;
        this.zzb = executor;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        ListenableFuture listenableFuture = this.zza;
        zzeux zzeuxVar = zzeux.zza;
        Executor executor = this.zzb;
        ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFuture, zzeuxVar, executor);
        zzbio zzbioVar = zzbix.zzoh;
        if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue() > 0) {
            listenableFutureZzj = zzhcf.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).intValue(), TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzhcf.zzh(listenableFutureZzj, Throwable.class, zzeuw.zza, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 6;
    }
}
