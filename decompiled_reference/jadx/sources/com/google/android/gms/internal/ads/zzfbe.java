package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbe implements zzfcs {
    private final zzfcs zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzfbe(zzfcs zzfcsVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfcsVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdj)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j = this.zzb;
        if (j > 0) {
            listenableFutureZza = zzhcf.zzi(listenableFutureZza, j, timeUnit, this.zzc);
        }
        return zzhcf.zzh(listenableFutureZza, Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return this.zza.zzb();
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdh)).booleanValue()) {
            zzfcs zzfcsVar = this.zza;
            zzcfk zzcfkVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            int iZzb = zzfcsVar.zzb();
            StringBuilder sb = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb.append("OptionalSignalTimeout:");
            sb.append(iZzb);
            zzcfkVarZzh.zzh(th, sb.toString());
        }
        return zzhcf.zza(null);
    }
}
