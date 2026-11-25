package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefs implements zzegy {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzeet zza;
    private final zzhcp zzb;
    private final zzflg zzc;
    private final ScheduledExecutorService zzd;
    private final zzejl zze;
    private final zzfqq zzf;
    private final Context zzg;

    zzefs(Context context, zzflg zzflgVar, zzeet zzeetVar, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzejl zzejlVar, zzfqq zzfqqVar) {
        this.zzg = context;
        this.zzc = zzflgVar;
        this.zza = zzeetVar;
        this.zzb = zzhcpVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzejlVar;
        this.zzf = zzfqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegy
    public final ListenableFuture zza(zzcbk zzcbkVar) {
        Context context = this.zzg;
        ListenableFuture listenableFutureZza = this.zza.zza(zzcbkVar);
        zzfqg zzfqgVarZzn = zzfqg.zzn(context, 11);
        zzfqp.zzb(listenableFutureZza, zzfqgVarZzn);
        ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZza, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb((zzeha) obj);
            }
        }, this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgI)).booleanValue()) {
            listenableFutureZzj = zzhcf.zzh(zzhcf.zzi(listenableFutureZzj, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzefq.zza, zzcfy.zzh);
        }
        zzfqp.zzd(listenableFutureZzj, this.zzf, zzfqgVarZzn);
        zzhcf.zzr(listenableFutureZzj, new zzefp(this), zzcfy.zzh);
        return listenableFutureZzj;
    }

    final /* synthetic */ ListenableFuture zzb(zzeha zzehaVar) {
        return zzhcf.zza(new zzfky(new zzfkv(this.zzc), zzfkx.zza(new InputStreamReader(zzehaVar.zza()), zzehaVar.zzb().zzm)));
    }

    final /* synthetic */ zzejl zzc() {
        return this.zze;
    }
}
