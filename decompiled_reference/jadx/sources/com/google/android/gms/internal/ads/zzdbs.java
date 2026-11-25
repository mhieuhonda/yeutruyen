package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbs implements zzdcz, zzdkl, zzdib, zzddp, zzbex {
    private final zzddr zza;
    private final zzdfs zzb;
    private final zzfkn zzc;
    private final ScheduledExecutorService zzd;
    private final Executor zze;
    private ScheduledFuture zzg;
    private final String zzi;
    private final zzhcy zzf = zzhcy.zze();
    private final AtomicBoolean zzh = new AtomicBoolean();

    zzdbs(zzddr zzddrVar, zzfkn zzfknVar, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, zzdfs zzdfsVar) {
        this.zza = zzddrVar;
        this.zzc = zzfknVar;
        this.zzd = scheduledExecutorService;
        this.zze = executor;
        this.zzi = str;
        this.zzb = zzdfsVar;
    }

    private final boolean zzl() {
        return this.zzi.equals("com.google.ads.mediation.admob.AdMobAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzd(zzcbw zzcbwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final synchronized void zzdH() {
        if (this.zzc.zze == 4) {
            this.zza.zza();
            return;
        }
        zzhcy zzhcyVar = this.zzf;
        if (zzhcyVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcyVar.zza((Object) true);
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdK() {
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzng)).booleanValue() && zzl() && zzbewVar.zzj && this.zzh.compareAndSet(false, true) && this.zzc.zze != 3) {
            com.google.android.gms.ads.internal.util.zze.zza("Full screen 1px impression occurred");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzdt() {
        zzfkn zzfknVar = this.zzc;
        if (zzfknVar.zze == 3) {
            return;
        }
        int i = zzfknVar.zzY;
        if (i == 0 || i == 1) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzng)).booleanValue() && zzl()) {
                return;
            }
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcz
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzg() {
        zzfkn zzfknVar = this.zzc;
        int i = zzfknVar.zze;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.zzb.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcm)).booleanValue() && zzfknVar.zzY == 2) {
            int i2 = zzfknVar.zzq;
            if (i2 == 0) {
                this.zza.zza();
            } else {
                zzhcf.zzr(this.zzf, new zzdbq(this), this.zze);
                this.zzg = this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdbr
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzi();
                    }
                }, i2, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzh() {
    }

    final /* synthetic */ void zzi() {
        synchronized (this) {
            zzhcy zzhcyVar = this.zzf;
            if (zzhcyVar.isDone()) {
                return;
            }
            zzhcyVar.zza((Object) true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzhcy zzhcyVar = this.zzf;
        if (zzhcyVar.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzhcyVar.zzb(new Exception());
    }

    final /* synthetic */ zzddr zzk() {
        return this.zza;
    }
}
