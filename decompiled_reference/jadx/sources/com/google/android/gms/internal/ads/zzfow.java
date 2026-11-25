package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfow implements zzbfr {
    private final ScheduledExecutorService zza;
    private final Executor zzb;
    private final Map zzc = new HashMap();
    private boolean zzd = false;

    zzfow(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = scheduledExecutorService;
        this.zzb = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzc() {
        Map map = this.zzc;
        ArrayList arrayList = new ArrayList(map.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
            zzfov zzfovVar = (zzfov) map.get(scheduledFuture);
            if (zzfovVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                scheduledFuture.cancel(false);
                map.remove(scheduledFuture);
                zzb(zzfovVar.zza, Math.max(0L, zzfovVar.zzb - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()), TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z) {
        if (z) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfou
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final synchronized void zzb(Runnable runnable, long j, TimeUnit timeUnit) {
        if (!this.zzd) {
            com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            this.zzd = true;
        }
        final zzfov zzfovVar = new zzfov(this, runnable, com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + timeUnit.toMillis(j));
        ScheduledExecutorService scheduledExecutorService = this.zza;
        Objects.requireNonNull(zzfovVar);
        zzfovVar.zzc = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfot
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzfov zzfovVar2;
                zzfov zzfovVar3 = zzfovVar;
                zzfow zzfowVar = zzfovVar3.zzd;
                synchronized (zzfowVar) {
                    ScheduledFuture scheduledFuture = zzfovVar3.zzc;
                    zzfovVar2 = scheduledFuture != null ? (zzfov) zzfowVar.zze().remove(scheduledFuture) : null;
                }
                if (zzfovVar2 != null) {
                    zzfovVar3.zzd.zzd().execute(zzfovVar3.zza);
                }
            }
        }, j, timeUnit);
        this.zzc.put(zzfovVar.zzc, zzfovVar);
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
