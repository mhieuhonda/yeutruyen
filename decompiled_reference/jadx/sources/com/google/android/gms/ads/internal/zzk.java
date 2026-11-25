package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzawu;
import com.google.android.gms.internal.ads.zzawv;
import com.google.android.gms.internal.ads.zzbak;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfxq;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzfzh;
import com.google.android.gms.internal.ads.zzhcf;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzk implements Runnable, zzbar {
    private static final long zzc = System.currentTimeMillis();
    protected boolean zza;
    private final boolean zzg;
    private final boolean zzh;
    private final Executor zzi;
    private final zzfxq zzj;
    private Context zzk;
    private final Context zzl;
    private VersionInfoParcel zzm;
    private final VersionInfoParcel zzn;
    private final boolean zzo;
    private int zzp;
    private final List zzd = new Vector();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzk = context;
        this.zzl = context;
        this.zzm = versionInfoParcel;
        this.zzn = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzi = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().zzd(zzbix.zzds)).booleanValue();
        this.zzo = zBooleanValue;
        this.zzj = zzfxq.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzg = ((Boolean) zzba.zzc().zzd(zzbix.zzdp)).booleanValue();
        this.zzh = ((Boolean) zzba.zzc().zzd(zzbix.zzdt)).booleanValue();
        if (((Boolean) zzba.zzc().zzd(zzbix.zzdr)).booleanValue()) {
            this.zzp = 2;
        } else {
            this.zzp = 1;
        }
        if (!((Boolean) zzba.zzc().zzd(zzbix.zzex)).booleanValue()) {
            this.zza = zzm();
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzet)).booleanValue()) {
            zzcfy.zza.execute(this);
            return;
        }
        zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzB()) {
            zzcfy.zza.execute(this);
        } else {
            run();
        }
    }

    private final void zzq() {
        List<Object[]> list = this.zzd;
        zzbar zzbarVarZzs = zzs();
        if (list.isEmpty() || zzbarVarZzs == null) {
            return;
        }
        for (Object[] objArr : list) {
            try {
                int length = objArr.length;
                if (length == 1) {
                    zzbarVarZzs.zzd((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    zzbarVarZzs.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            } catch (NullPointerException unused) {
            }
        }
        this.zzd.clear();
    }

    private final void zzr(boolean z) {
        String str = this.zzm.afmaVersion;
        Context contextZzt = zzt(this.zzk);
        zzawu zzawuVarZze = zzawv.zze();
        zzawuVarZze.zzb(z);
        zzawuVarZze.zza(str);
        this.zze.set(zzbav.zzt(contextZzt, (zzawv) zzawuVarZze.zzbu()));
    }

    private final zzbar zzs() {
        return zzp() == 2 ? (zzbar) this.zzf.get() : (zzbar) this.zze.get();
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzbao zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzawu zzawuVarZze = zzawv.zze();
        zzawuVarZze.zzb(z);
        zzawuVarZze.zza(versionInfoParcel.afmaVersion);
        return zzbao.zza(zzt(context), (zzawv) zzawuVarZze.zzbu(), z2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zzd(zzbix.zzex)).booleanValue()) {
                this.zza = zzm();
            }
            boolean z = this.zzm.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().zzd(zzbix.zzbN)).booleanValue() && z) {
                z2 = true;
            }
            if (zzp() == 1) {
                zzr(z2);
                if (this.zzp == 2) {
                    this.zzi.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzn(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzbao zzbaoVarZzu = zzu(this.zzk, this.zzm, z2, this.zzo);
                    this.zzf.set(zzbaoVarZzu);
                    if (this.zzh && !zzbaoVarZzu.zzb()) {
                        this.zzp = 1;
                        zzr(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzp = 1;
                    zzr(z2);
                    this.zzj.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzk = null;
            this.zzm = null;
            throw th;
        }
    }

    public final boolean zza() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzbar zzbarVarZzs;
        if (!zza() || (zzbarVarZzs = zzs()) == null) {
            return "";
        }
        zzq();
        try {
            return zzbarVarZzs.zzl(zzt(context));
        } catch (NullPointerException unused) {
            return "";
        }
    }

    public final String zzc() {
        int i = this.zzp;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? ExifInterface.GPS_MEASUREMENT_2D : "1";
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzd(MotionEvent motionEvent) {
        zzbar zzbarVarZzs = zzs();
        if (zzbarVarZzs == null) {
            this.zzd.add(new Object[]{motionEvent});
            return;
        }
        zzq();
        try {
            zzbarVarZzs.zzd(motionEvent);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zze(int i, int i2, int i3) {
        zzbar zzbarVarZzs = zzs();
        if (zzbarVarZzs == null) {
            this.zzd.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        zzq();
        try {
            zzbarVarZzs.zze(i, i2, i3);
        } catch (NullPointerException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zza()) {
            return "";
        }
        zzbar zzbarVarZzs = zzs();
        if (((Boolean) zzba.zzc().zzd(zzbix.zzmn)).booleanValue()) {
            zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzM(view, 4, null);
        }
        if (zzbarVarZzs == null) {
            return "";
        }
        zzq();
        try {
            return zzbarVarZzs.zzf(zzt(context), str, view, activity);
        } catch (NullPointerException unused) {
            return "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzh(View view) {
        zzbar zzbarVarZzs = zzs();
        if (zzbarVarZzs != null) {
            try {
                zzbarVarZzs.zzh(view);
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbar zzbarVarZzs;
        zzbar zzbarVarZzs2;
        if (((Boolean) zzba.zzc().zzd(zzbix.zzdM)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzbarVarZzs2 = zzs()) == null) {
                return;
            }
            try {
                zzbarVarZzs2.zzi(stackTraceElementArr);
                return;
            } catch (NullPointerException unused) {
                return;
            }
        }
        if (!zza() || (zzbarVarZzs = zzs()) == null) {
            return;
        }
        try {
            zzbarVarZzs.zzi(stackTraceElementArr);
        } catch (NullPointerException unused2) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzj(Context context, View view, Activity activity) {
        try {
            if (!((Boolean) zzba.zzc().zzd(zzbix.zzmm)).booleanValue()) {
                zzbar zzbarVarZzs = zzs();
                if (((Boolean) zzba.zzc().zzd(zzbix.zzmn)).booleanValue()) {
                    zzt.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
                }
                return zzbarVarZzs != null ? zzbarVarZzs.zzj(context, view, activity) : "";
            }
            if (!zza()) {
                return "";
            }
            zzbar zzbarVarZzs2 = zzs();
            if (((Boolean) zzba.zzc().zzd(zzbix.zzmn)).booleanValue()) {
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzM(view, 2, null);
            }
            return zzbarVarZzs2 != null ? zzbarVarZzs2.zzj(context, view, activity) : "";
        } catch (NullPointerException unused) {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzk(final Context context) {
        try {
            return (String) zzhcf.zzd(new Callable() { // from class: com.google.android.gms.ads.internal.zzj
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzb(context, null);
                }
            }, this.zzi).get(((Integer) zzba.zzc().zzd(zzbix.zzdG)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzbak.zza(context, this.zzn.afmaVersion, zzc, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbar
    public final String zzl(Context context) {
        return zzb(context, null);
    }

    protected final boolean zzm() {
        Context context = this.zzk;
        zzh zzhVar = new zzh(this);
        zzfxq zzfxqVar = this.zzj;
        return new zzfzh(this.zzk, zzfyn.zzb(context, zzfxqVar), zzhVar, ((Boolean) zzba.zzc().zzd(zzbix.zzdq)).booleanValue()).zzd(1);
    }

    final /* synthetic */ void zzn(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzl, this.zzn, z, this.zzo).zzm();
        } catch (NullPointerException e) {
            this.zzj.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    final /* synthetic */ zzfxq zzo() {
        return this.zzj;
    }

    protected final int zzp() {
        if (!this.zzg || this.zza) {
            return this.zzp;
        }
        return 1;
    }
}
