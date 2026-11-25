package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrw {
    private final Handler zza;
    private final zzrx zzb;

    public zzrw(Handler handler, zzrx zzrxVar) {
        if (zzrxVar == null) {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzrxVar;
    }

    final /* synthetic */ void zzA(int i) {
        String str = zzfm.zza;
        this.zzb.zzx(i);
    }

    final /* synthetic */ void zzB(zzjb zzjbVar) {
        String str = zzfm.zza;
        this.zzb.zzy(zzjbVar);
    }

    public final void zza(final zzjd zzjdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzo(zzjdVar);
                }
            });
        }
    }

    public final void zzb(final String str, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzri
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp(str, j, j2);
                }
            });
        }
    }

    public final void zzc(final zzv zzvVar, final zzje zzjeVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzq(zzvVar, zzjeVar);
                }
            });
        }
    }

    public final void zzd(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzr(j);
                }
            });
        }
    }

    public final void zze(final int i, final long j, final long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzro
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzs(i, j, j2);
                }
            });
        }
    }

    public final void zzf(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzt(str);
                }
            });
        }
    }

    public final void zzg(final zzjd zzjdVar) {
        zzjdVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(zzjdVar);
                }
            });
        }
    }

    public final void zzh(final boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv(z);
                }
            });
        }
    }

    public final void zzi(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzw(exc);
                }
            });
        }
    }

    public final void zzj(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzx(exc);
                }
            });
        }
    }

    public final void zzk(final zzsa zzsaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzru
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzy(zzsaVar);
                }
            });
        }
    }

    public final void zzl(final zzsa zzsaVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzz(zzsaVar);
                }
            });
        }
    }

    public final void zzm(final int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrk
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzA(i);
                }
            });
        }
    }

    public final void zzn(final zzjb zzjbVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzrl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzB(zzjbVar);
                }
            });
        }
    }

    final /* synthetic */ void zzo(zzjd zzjdVar) {
        String str = zzfm.zza;
        this.zzb.zzl(zzjdVar);
    }

    final /* synthetic */ void zzp(String str, long j, long j2) {
        String str2 = zzfm.zza;
        this.zzb.zzm(str, j, j2);
    }

    final /* synthetic */ void zzq(zzv zzvVar, zzje zzjeVar) {
        String str = zzfm.zza;
        this.zzb.zzn(zzvVar, zzjeVar);
    }

    final /* synthetic */ void zzr(long j) {
        String str = zzfm.zza;
        this.zzb.zzo(j);
    }

    final /* synthetic */ void zzs(int i, long j, long j2) {
        String str = zzfm.zza;
        this.zzb.zzp(i, j, j2);
    }

    final /* synthetic */ void zzt(String str) {
        String str2 = zzfm.zza;
        this.zzb.zzq(str);
    }

    final /* synthetic */ void zzu(zzjd zzjdVar) {
        zzjdVar.zza();
        String str = zzfm.zza;
        this.zzb.zzr(zzjdVar);
    }

    final /* synthetic */ void zzv(boolean z) {
        String str = zzfm.zza;
        this.zzb.zzs(z);
    }

    final /* synthetic */ void zzw(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzt(exc);
    }

    final /* synthetic */ void zzx(Exception exc) {
        String str = zzfm.zza;
        this.zzb.zzu(exc);
    }

    final /* synthetic */ void zzy(zzsa zzsaVar) {
        String str = zzfm.zza;
        this.zzb.zzv(zzsaVar);
    }

    final /* synthetic */ void zzz(zzsa zzsaVar) {
        String str = zzfm.zza;
        this.zzb.zzw(zzsaVar);
    }
}
