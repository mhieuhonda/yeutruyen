package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfsx {
    final AtomicBoolean zza = new AtomicBoolean(false);
    final Map zzb = new LinkedHashMap();
    final AtomicBoolean zzc = new AtomicBoolean(false);
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzftn zzg;
    private final Clock zzh;

    public zzfsx(com.google.android.gms.ads.internal.util.zzg zzgVar, ScheduledExecutorService scheduledExecutorService, zzftn zzftnVar, Clock clock) {
        this.zzd = zzgVar;
        this.zzf = scheduledExecutorService;
        this.zzg = zzftnVar;
        this.zzh = clock;
    }

    private final boolean zzA(zzful zzfulVar) {
        if (this.zza.get() || zzfulVar.zzt() != 0 || !zzfulVar.zzu()) {
            return false;
        }
        zzfulVar.zze();
        return true;
    }

    private final int zzq() {
        int iZzR = this.zzd.zzR();
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzS)).booleanValue() && iZzR > 0) {
            return iZzR;
        }
        return ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzac)).intValue();
    }

    private static String zzr(String str, AdFormat adFormat) {
        return String.format("%s:%s", str, adFormat);
    }

    private final void zzs(final zzful zzfulVar) {
        if (zzfulVar.zzt() > 0 || zzfulVar.zzw()) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfso
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzi(zzfulVar);
                }
            });
        }
        this.zza.set(true);
        synchronized (this) {
            ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
        }
        this.zzc.set(true);
    }

    private final boolean zzt(zzful zzfulVar) {
        boolean z;
        AdFormat adFormatZzq = zzfulVar.zzq();
        if (adFormatZzq == null) {
            return true;
        }
        Map map = this.zzb;
        synchronized (map) {
            z = !map.containsKey(zzr(zzfulVar.zzp(), adFormatZzq));
        }
        return z;
    }

    private final boolean zzu() {
        zzgwt zzgwtVarZzq;
        Map map = this.zzb;
        synchronized (map) {
            zzgwtVarZzq = zzgwt.zzq(map.values());
        }
        int size = zzgwtVarZzq.size();
        for (int i = 0; i < size; i++) {
            zzful zzfulVar = (zzful) zzgwtVarZzq.get(i);
            if (zzfulVar.zzt() == 0 && zzfulVar.zzu()) {
                return true;
            }
        }
        return false;
    }

    private final void zzv(long j) {
        if (this.zzc.compareAndSet(false, true)) {
            synchronized (this) {
                ScheduledExecutorService scheduledExecutorService = this.zzf;
                try {
                    if (j > 0) {
                        this.zze = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsr
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzl();
                            }
                        }, j, TimeUnit.MILLISECONDS);
                    } else {
                        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsq
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzk();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void zzn() {
        zzful zzfulVar;
        zzgwt zzgwtVarZzq;
        if (this.zza.get()) {
            return;
        }
        synchronized (this) {
            zzfulVar = null;
            this.zze = null;
        }
        int iZzq = zzq();
        if (zzg() < iZzq || zzu()) {
            Map map = this.zzb;
            synchronized (map) {
                zzgwtVarZzq = zzgwt.zzq(map.values());
            }
            int size = zzgwtVarZzq.size();
            double d = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                zzful zzfulVar2 = (zzful) zzgwtVarZzq.get(i);
                if (zzfulVar2.zzu()) {
                    double dZzt = ((double) zzfulVar2.zzt()) / ((double) zzfulVar2.zzs());
                    if (dZzt < d) {
                        d = dZzt;
                    }
                    if (dZzt < d) {
                        zzfulVar = zzfulVar2;
                    }
                }
            }
            if (zzfulVar != null) {
                zzfulVar.zze();
                if (zzfulVar.zzt() > 0) {
                    this.zzg.zzq(this.zzh.currentTimeMillis(), zzfulVar.zzp(), zzfulVar.zzr(), zzfulVar.zzq(), zzfulVar.zzs(), zzfulVar.zzt(), zzg(), iZzq);
                }
            }
            if (zzg() >= iZzq) {
                zzy();
            }
            if (zzg() < iZzq || zzu()) {
                if (zzu()) {
                    this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfss
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzm();
                        }
                    });
                    return;
                }
                synchronized (this) {
                    this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfst
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn();
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzae)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            zzy();
        }
        this.zzc.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzx, reason: merged with bridge method [inline-methods] */
    public final void zzh() {
        this.zza.set(false);
        zzn();
    }

    private final void zzy() {
        int size;
        Map map = this.zzb;
        synchronized (map) {
            size = map.size();
        }
        this.zzg.zzs(this.zzh.currentTimeMillis(), zzq(), size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzj(zzful zzfulVar, int i) {
        this.zzg.zzr(this.zzh.currentTimeMillis(), zzfulVar.zzp(), zzfulVar.zzr(), zzfulVar.zzq(), zzfulVar.zzs(), zzfulVar.zzt(), i, zzg(), zzq());
    }

    public final void zza(zzful zzfulVar) {
        int i = 1;
        if (zzfulVar.zzt() <= 0 && !zzfulVar.zzw()) {
            i = 0;
        }
        zzd(zzfulVar, i);
    }

    public final void zzb(zzful zzfulVar) {
        if (zzt(zzfulVar)) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzY)).booleanValue()) {
            zzs(zzfulVar);
            return;
        }
        long jZzC = zzfulVar.zzC();
        if (jZzC <= 0) {
            zza(zzfulVar);
            return;
        }
        zzs(zzfulVar);
        synchronized (this) {
            this.zze = this.zzf.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzh();
                }
            }, jZzC, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzd(final zzful zzfulVar, final int i) {
        if (zzt(zzfulVar)) {
            return;
        }
        if (i > 0) {
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzj(zzfulVar, i);
                }
            });
        }
        if (!zzA(zzfulVar)) {
            zzv(0L);
        } else {
            zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzad)).longValue());
        }
    }

    public final void zze(String str, AdFormat adFormat, final zzful zzfulVar) {
        Map map = this.zzb;
        String strZzr = zzr(str, adFormat);
        synchronized (map) {
            if (map.containsKey(strZzr)) {
                return;
            }
            map.put(strZzr, zzfulVar);
            this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzfulVar);
                }
            });
        }
    }

    public final void zzf(final zzful zzfulVar) {
        AdFormat adFormatZzq = zzfulVar.zzq();
        if (adFormatZzq == null) {
            return;
        }
        String strZzr = zzr(zzfulVar.zzp(), adFormatZzq);
        Map map = this.zzb;
        synchronized (map) {
            if (map.containsKey(strZzr)) {
                map.remove(strZzr);
                final int iZzx = zzfulVar.zzx();
                this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfsv
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzp(iZzx, zzfulVar);
                    }
                });
            }
        }
    }

    final int zzg() {
        zzgwt zzgwtVarZzq;
        Map map = this.zzb;
        synchronized (map) {
            zzgwtVarZzq = zzgwt.zzq(map.values());
        }
        int size = zzgwtVarZzq.size();
        int iZzx = 0;
        for (int i = 0; i < size; i++) {
            iZzx += ((zzful) zzgwtVarZzq.get(i)).zzx();
        }
        return iZzx;
    }

    final /* synthetic */ void zzi(zzful zzfulVar) {
        zzj(zzfulVar, 1);
    }

    final /* synthetic */ void zzo(zzful zzfulVar) {
        zzA(zzfulVar);
        zzv(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzad)).longValue());
    }

    final /* synthetic */ void zzp(int i, zzful zzfulVar) {
        if (i > 0) {
            zzj(zzfulVar, i);
        }
        zzv(0L);
    }

    public final void zzc(zzful zzfulVar, boolean z) {
        zzftn zzftnVar = this.zzg;
        if (z) {
            zzftnVar.zzu(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzZ)).longValue(), zzfulVar.zzq(), zzfulVar.zzp(), zzfulVar.zzr());
        } else {
            zzftnVar.zzv(this.zzh.currentTimeMillis(), zzfulVar.zzq(), zzfulVar.zzp(), zzfulVar.zzr());
        }
        zzh();
    }
}
