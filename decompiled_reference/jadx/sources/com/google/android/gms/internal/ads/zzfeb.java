package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfeb implements zzfcs {
    private final zzcfk zza;
    private final ScheduledExecutorService zzb;
    private final zzhcp zzc;

    zzfeb(String str, zzbgz zzbgzVar, zzcfk zzcfkVar, ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar) {
        this.zza = zzcfkVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdW)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeb)).booleanValue()) {
                ListenableFuture listenableFutureZza = zzgdd.zza(Tasks.forResult(null), null);
                zzhcp zzhcpVar = this.zzc;
                ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZza, zzfea.zza, zzhcpVar);
                if (((Boolean) zzbkk.zza.zze()).booleanValue()) {
                    listenableFutureZzj = zzhcf.zzi(listenableFutureZzj, ((Long) zzbkk.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzhcf.zzg(listenableFutureZzj, Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdz
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzhcpVar);
            }
        }
        return zzhcf.zza(new zzfec(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 43;
    }

    final /* synthetic */ zzfec zzc(Exception exc) {
        this.zza.zzh(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfec(null, -1);
    }
}
