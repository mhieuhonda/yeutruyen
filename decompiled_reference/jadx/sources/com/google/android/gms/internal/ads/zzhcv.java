package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhcv extends zzhcr implements zzhcq {
    final ScheduledExecutorService zza;

    zzhcv(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzd */
    public final zzhco schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzhde zzhdeVarZze = zzhde.zze(runnable, null);
        return new zzhct(zzhdeVarZze, scheduledExecutorService.schedule(zzhdeVarZze, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zze */
    public final zzhco schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzhde zzhdeVar = new zzhde(callable);
        return new zzhct(zzhdeVar, this.zza.schedule(zzhdeVar, j, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzf */
    public final zzhco scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhcu zzhcuVar = new zzhcu(runnable);
        return new zzhct(zzhcuVar, this.zza.scheduleAtFixedRate(zzhcuVar, j, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: zzg */
    public final zzhco scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzhcu zzhcuVar = new zzhcu(runnable);
        return new zzhct(zzhcuVar, this.zza.scheduleWithFixedDelay(zzhcuVar, j, j2, timeUnit));
    }
}
