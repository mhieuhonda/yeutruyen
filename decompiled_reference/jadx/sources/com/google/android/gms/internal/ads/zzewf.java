package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewf implements zzfcs {
    final zzcfk zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzhcp zzd;
    private final Context zze;

    zzewf(Context context, zzcfk zzcfkVar, ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzea)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcfkVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdW)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeb)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdX)).booleanValue()) {
                    return zzhcf.zzk(zzgdd.zza(this.zzb.getAppSetIdInfo(), null), zzewe.zza, zzcfy.zzh);
                }
                Task<AppSetIdInfo> taskZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzea)).booleanValue() ? zzfml.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZzb == null) {
                    return zzhcf.zza(new zzewg(null, -1));
                }
                ListenableFuture listenableFutureZzj = zzhcf.zzj(zzgdd.zza(taskZzb, null), zzewc.zza, zzcfy.zzh);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdY)).booleanValue()) {
                    listenableFutureZzj = zzhcf.zzi(listenableFutureZzj, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdZ)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzhcf.zzg(listenableFutureZzj, Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzewd
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        this.zza.zza.zzh((Exception) obj, "AppSetIdInfoSignal");
                        return new zzewg(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzhcf.zza(new zzewg(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 11;
    }
}
