package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnj {
    private final zzcna zza;
    private final zzdzt zzb;

    zzcnj(zzcna zzcnaVar, zzdzt zzdztVar) {
        this.zza = zzcnaVar;
        this.zzb = zzdztVar;
    }

    public final void zza(final Context context, final VersionInfoParcel versionInfoParcel) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpD)).booleanValue()) {
            Executor threadPoolExecutor = zzcfy.zza;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpF)).booleanValue()) {
                zzcni zzcniVar = new zzcni(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpH)).intValue(), null);
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpG)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcniVar);
            }
            threadPoolExecutor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcng
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb(context, versionInfoParcel);
                }
            });
        }
    }

    final /* synthetic */ void zzb(Context context, VersionInfoParcel versionInfoParcel) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpE)).booleanValue()) {
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            zzdzs zzdzsVarZza = this.zzb.zza();
            zzdzsVarZza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length());
            sb.append(jElapsedRealtime2);
            zzdzsVarZza.zzc("webview_startup_l", sb.toString());
            zzdzsVarZza.zzd();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpK)).booleanValue()) {
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    final /* synthetic */ void zzc() {
        this.zza.zzb(new zzcne(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    final /* synthetic */ zzdzt zzd() {
        return this.zzb;
    }
}
