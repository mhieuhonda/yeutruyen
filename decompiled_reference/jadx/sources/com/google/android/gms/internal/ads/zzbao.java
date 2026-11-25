package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbao implements zzbar {
    private static zzbao zzb;
    private final Context zzc;
    private final zzfza zzd;
    private final zzfzh zze;
    private final zzfzj zzf;
    private final zzbbt zzg;
    private final zzfxq zzh;
    private final Executor zzi;
    private final zzbdz zzj;
    private final zzfzg zzk;
    private final zzbci zzm;
    private final zzbca zzn;
    private final zzbbr zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzbao(Context context, zzfxq zzfxqVar, zzfza zzfzaVar, zzfzh zzfzhVar, zzfzj zzfzjVar, zzbbt zzbbtVar, Executor executor, zzfxl zzfxlVar, zzbdz zzbdzVar, zzbci zzbciVar, zzbca zzbcaVar, zzbbr zzbbrVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfxqVar;
        this.zzd = zzfzaVar;
        this.zze = zzfzhVar;
        this.zzf = zzfzjVar;
        this.zzg = zzbbtVar;
        this.zzi = executor;
        this.zzj = zzbdzVar;
        this.zzm = zzbciVar;
        this.zzn = zzbcaVar;
        this.zzo = zzbbrVar;
        this.zzr = false;
        this.zzk = new zzbam(this, zzfxlVar);
    }

    public static synchronized zzbao zza(Context context, zzawv zzawvVar, boolean z) {
        zzfxr zzfxrVarZzh;
        zzfxrVarZzh = zzfxs.zzh();
        zzfxrVarZzh.zza(zzawvVar.zza());
        zzfxrVarZzh.zzb(zzawvVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfxrVarZzh.zzh(), z);
    }

    private static synchronized zzbao zzs(Context context, Executor executor, zzfxs zzfxsVar, boolean z) {
        if (zzb == null) {
            zzfxq zzfxqVarZza = zzfxq.zza(context, executor, z);
            zzbbc zzbbcVarZza = zzbbc.zza(context);
            zzbci zzbciVarZza = zzbci.zza(context, executor);
            zzbca zzbcaVar = new zzbca();
            zzbbr zzbbrVar = new zzbbr();
            zzfyg zzfygVarZza = zzfyg.zza(context, executor, zzfxqVarZza, zzfxsVar);
            zzbbs zzbbsVar = new zzbbs(context);
            zzbbt zzbbtVar = new zzbbt(zzfxsVar, zzfygVarZza, new zzbcg(context, zzbbsVar), zzbbsVar, zzbbcVarZza, zzbciVarZza, zzbcaVar, zzbbrVar);
            zzbdz zzbdzVarZzb = zzfyn.zzb(context, zzfxqVarZza);
            zzfxl zzfxlVar = new zzfxl();
            zzbao zzbaoVar = new zzbao(context, zzfxqVarZza, new zzfza(context, zzbdzVarZzb), new zzfzh(context, zzbdzVarZzb, new zzbal(zzfxqVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdq)).booleanValue()), new zzfzj(context, zzbbtVar, zzfxqVarZza, zzfxlVar, false), zzbbtVar, executor, zzfxlVar, zzbdzVarZzb, zzbciVarZza, zzbcaVar, zzbbrVar);
            zzb = zzbaoVar;
            zzbaoVar.zzc();
            zzb.zzm();
        }
        return zzb;
    }

    private final zzfyz zzt(int i) {
        if (zzfyn.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdo)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfyz zzfyzVarZzt = zzt(1);
        if (zzfyzVarZzt == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfyzVarZzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(MotionEvent motionEvent) {
        zzfxt zzfxtVarZzb = this.zzf.zzb();
        if (zzfxtVarZzb != null) {
            try {
                zzfxtVarZzb.zzd(null, motionEvent);
            } catch (zzfzi e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznG)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzf(Context context, String str, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzc();
        zzm();
        zzfxt zzfxtVarZzb = this.zzf.zzb();
        if (zzfxtVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfxtVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzo.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzj(Context context, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzb(context, view);
        zzm();
        zzfxt zzfxtVarZzb = this.zzf.zzb();
        if (zzfxtVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfxtVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzl(Context context) {
        this.zzm.zzb();
        this.zzn.zza();
        zzm();
        zzfxt zzfxtVarZzb = this.zzf.zzb();
        if (zzfxtVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfxtVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfyz zzfyzVarZzc = this.zzf.zzc();
                if ((zzfyzVarZzc == null || zzfyzVarZzc.zze(3600L)) && zzfyn.zza(this.zzj)) {
                    this.zzi.execute(new zzban(this));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[Catch: all -> 0x011c, zzifh -> 0x011e, TryCatch #0 {zzifh -> 0x011e, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:29:0x009e, B:33:0x00b7, B:39:0x00d0, B:40:0x00dd, B:42:0x00e3, B:44:0x00eb, B:45:0x00ed, B:36:0x00c1, B:37:0x00c8, B:23:0x0074, B:25:0x007a, B:27:0x008c, B:46:0x00f7, B:47:0x0104, B:48:0x0111), top: B:58:0x0021, outer: #2 }] */
    final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfyz zzfyzVarZzt;
        zzbei zzbeiVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfyz zzfyzVarZzt2 = zzt(1);
        if (zzfyzVarZzt2 != null) {
            String strZza = zzfyzVarZzt2.zza().zza();
            strZzb = zzfyzVarZzt2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbdz zzbdzVar = this.zzj;
                zzfxq zzfxqVar = this.zzh;
                zzfze zzfzeVarZza = zzfxz.zza(context, 1, zzbdzVar, str, strZzb, "1", zzfxqVar);
                byte[] bArr = zzfzeVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfxqVar.zzb(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzbeb zzbebVarZzd = zzbeb.zzd(zzidl.zzt(bArr, 0, length), zzidz.zzb());
                        if (zzbebVarZzd.zza().zza().isEmpty() || zzbebVarZzd.zza().zzb().isEmpty() || zzbebVarZzd.zzc().zzA().length == 0 || ((zzfyzVarZzt = zzt(1)) != null && (zzbeiVarZza = zzfyzVarZzt.zza()) != null && zzbebVarZzd.zza().zza().equals(zzbeiVarZza.zza()) && zzbebVarZzd.zza().zzb().equals(zzbeiVarZza.zzb()))) {
                            this.zzh.zzb(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfzg zzfzgVar = this.zzk;
                            int i = zzfzeVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdo)).booleanValue()) {
                                zZza = this.zzd.zza(zzbebVarZzd, zzfzgVar);
                            } else if (i == 3) {
                                zZza = this.zze.zzb(zzbebVarZzd);
                            } else if (i == 4) {
                                zZza = this.zze.zza(zzbebVarZzd, zzfzgVar);
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfyz zzfyzVarZzt3 = zzt(1);
                                if (zzfyzVarZzt3 != null) {
                                    if (this.zzf.zza(zzfyzVarZzt3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzifh e) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ zzfxq zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z) {
        this.zzq = z;
    }
}
