package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaeq {
    private final Handler zza;
    private final zzaer zzb;

    public zzaeq(Handler handler, zzaer zzaerVar) {
        if (zzaerVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzaerVar;
    }

    public final void zza(final zzjd zzjdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaep
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzl(zzjdVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaef
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzm(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzje zzjeVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzn(zzvVar, zzjeVar);
                }
            });
        }
    }

    public final void zzd(final int i, final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(i, j);
                }
            });
        }
    }

    public final void zze(final long j, final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaei
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(j, i);
                }
            });
        }
    }

    public final void zzf(final zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaej
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzbvVar);
                }
            });
        }
    }

    public final void zzg(final Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaek
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void zzh(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzael
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(str);
                }
            });
        }
    }

    public final void zzi(final zzjd zzjdVar) {
        zzjdVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaem
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(zzjdVar);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaen
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(exc);
                }
            });
        }
    }

    public final void zzk(final zzjb zzjbVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaeo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(zzjbVar);
                }
            });
        }
    }

    final /* synthetic */ void zzl(zzjd zzjdVar) {
        String str = zzfm.zza;
        this.zzb.zzb(zzjdVar);
    }

    final /* synthetic */ void zzm(String str, long j, long j2) {
        String str2 = zzfm.zza;
        this.zzb.zzc(str, j, j2);
    }

    final /* synthetic */ void zzn(zzv zzvVar, zzje zzjeVar) {
        String str = zzfm.zza;
        this.zzb.zzd(zzvVar, zzjeVar);
    }

    final /* synthetic */ void zzo(int i, long j) {
        String str = zzfm.zza;
        this.zzb.zze(i, j);
    }

    final /* synthetic */ void zzp(long j, int i) {
        String str = zzfm.zza;
        this.zzb.zzj(j, i);
    }

    final /* synthetic */ void zzq(zzbv zzbvVar) {
        String str = zzfm.zza;
        this.zzb.zzf(zzbvVar);
    }

    final /* synthetic */ void zzr(Object obj, long j) {
        String str = zzfm.zza;
        this.zzb.zzg(obj, j);
    }

    final /* synthetic */ void zzs(String str) {
        String str2 = zzfm.zza;
        this.zzb.zzh(str);
    }

    final /* synthetic */ void zzt(zzjd zzjdVar) {
        zzjdVar.zza();
        String str = zzfm.zza;
        this.zzb.zzi(zzjdVar);
    }

    final /* synthetic */ void zzu(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzk(exc);
    }

    final /* synthetic */ void zzv(zzjb zzjbVar) {
        String str = zzfm.zza;
        this.zzb.zzz(zzjbVar);
    }
}
