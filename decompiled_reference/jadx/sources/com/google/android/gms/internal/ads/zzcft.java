package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcft {
    private zzhcp zza;
    private zzdzt zzb;
    private Context zzc;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(zzhcp zzhcpVar, zzdzt zzdztVar, Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzhcpVar;
        this.zzb = zzdztVar;
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpx)).longValue();
        this.zzg = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpy)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        zzhcp zzhcpVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzhcpVar = this.zza) == null) {
            return;
        }
        zzhcpVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc();
            }
        });
    }

    final /* synthetic */ void zzc() {
        zzdzt zzdztVar;
        ActivityManager.MemoryInfo memoryInfoZze;
        while (this.zze.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpz)).booleanValue() && (zzdztVar = this.zzb) != null) {
                        zzdzs zzdzsVarZza = zzdztVar.zza();
                        zzdzsVarZza.zzc("action", "panr");
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzqb)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(this.zzc)) != null) {
                            zzdzsVarZza.zzc("mem_avl", String.valueOf(memoryInfoZze.availMem));
                            zzdzsVarZza.zzc("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                            zzdzsVarZza.zzc("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
                        }
                        zzdzsVarZza.zzf();
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpA)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        zzcfs zzcfsVar = new zzcfs("Potential ANR detected");
                        zzcfsVar.setStackTrace(stackTrace);
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpB)).booleanValue()) {
                            zzcaf.zzc(this.zzc).zzi(zzcfsVar, "AnrWatchdog", ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpC)).intValue() / 100.0f);
                        } else {
                            com.google.android.gms.ads.internal.zzt.zzh().zzh(zzcfsVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzg);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
