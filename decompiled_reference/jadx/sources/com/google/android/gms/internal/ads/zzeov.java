package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeov {
    private final Context zza;
    private final zzfqq zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzcyd zze;
    private final zzepl zzf;
    private final zzfsi zzg;
    private final zzhcy zzh = zzhcy.zze();
    private final AtomicBoolean zzi = new AtomicBoolean();
    private zzeow zzj;
    private zzfky zzk;

    zzeov(Context context, zzfqq zzfqqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzcyd zzcydVar, zzepl zzeplVar, zzfsi zzfsiVar) {
        this.zza = context;
        this.zzb = zzfqqVar;
        this.zzc = executor;
        this.zzd = scheduledExecutorService;
        this.zze = zzcydVar;
        this.zzf = zzeplVar;
        this.zzg = zzfsiVar;
    }

    private final synchronized ListenableFuture zzd(zzfkn zzfknVar) {
        Iterator it = zzfknVar.zza.iterator();
        while (it.hasNext()) {
            zzema zzemaVarZza = this.zze.zza(zzfknVar.zzb, (String) it.next());
            if (zzemaVarZza != null && zzemaVarZza.zza(this.zzk, zzfknVar)) {
                ListenableFuture listenableFutureZzi = zzhcf.zzi(zzemaVarZza.zzb(this.zzk, zzfknVar), zzfknVar.zzR, TimeUnit.MILLISECONDS, this.zzd);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkr)).booleanValue()) {
                    zzfqg zzfqgVarZzn = zzfqg.zzn(this.zza, 12);
                    zzfqgVarZzn.zzi(zzfknVar.zzE);
                    zzfqgVarZzn.zza();
                    zzfqp.zzd(listenableFutureZzi, this.zzb, zzfqgVarZzn);
                }
                return listenableFutureZzi;
            }
        }
        return zzhcf.zzc(new zzeel(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfkn zzfknVar) {
        ListenableFuture listenableFutureZzd = zzd(zzfknVar);
        this.zzf.zze(this.zzk, zzfknVar, listenableFutureZzd, this.zzg);
        zzhcf.zzr(listenableFutureZzd, new zzeou(this, zzfknVar), this.zzc);
    }

    public final synchronized ListenableFuture zza(zzfky zzfkyVar) {
        if (!this.zzi.getAndSet(true)) {
            List list = zzfkyVar.zzb.zza;
            if (list.isEmpty()) {
                this.zzh.zzb(new zzepp(3, zzeps.zzb(zzfkyVar)));
            } else {
                this.zzk = zzfkyVar;
                zzepl zzeplVar = this.zzf;
                this.zzj = new zzeow(zzfkyVar, zzeplVar, this.zzh);
                zzeplVar.zzc(list);
                zzfkn zzfknVarZza = this.zzj.zza();
                while (zzfknVarZza != null) {
                    zzb(zzfknVarZza);
                    zzfknVarZza = this.zzj.zza();
                }
            }
        }
        return this.zzh;
    }

    final /* synthetic */ zzeow zzc() {
        return this.zzj;
    }
}
