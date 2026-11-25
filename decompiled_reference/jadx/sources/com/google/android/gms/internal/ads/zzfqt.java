package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfqt implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdxh zzj;
    private final List zzk;
    private final zzcnn zzl;
    private final zzcbs zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfqx zzg = zzfra.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfqt(Context context, VersionInfoParcel versionInfoParcel, zzdxh zzdxhVar, zzeiv zzeivVar, zzcbs zzcbsVar, zzcnn zzcnnVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdxhVar;
        this.zzn = zzcbsVar;
        this.zzl = zzcnnVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkk)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzj();
        } else {
            this.zzk = zzgwt.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            if (zzb == null) {
                if (((Boolean) zzbkq.zzb.zze()).booleanValue()) {
                    zzb = Boolean.valueOf(Math.random() < ((Double) zzbkq.zza.zze()).doubleValue());
                } else {
                    zzb = false;
                }
            }
            zBooleanValue = zzb.booleanValue();
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                if (this.zzg.zza() == 0) {
                    return;
                }
                try {
                    synchronized (obj) {
                        zzfqx zzfqxVar = this.zzg;
                        bArrZzaN = ((zzfra) zzfqxVar.zzbu()).zzaN();
                        zzfqxVar.zzc();
                    }
                    zzeis zzeisVar = new zzeis((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzke), 60000, new HashMap(), bArrZzaN, "application/x-protobuf", false);
                    new zzeiu(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(zzeisVar);
                } catch (Exception e) {
                    if ((e instanceof zzeel) && ((zzeel) e).zza() == 3) {
                        return;
                    }
                    com.google.android.gms.ads.internal.zzt.zzh().zzi(e, "CuiMonitor.sendCuiPing");
                }
            }
        }
    }

    public final void zzb(final zzfqj zzfqjVar) {
        zzcfy.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfqs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfqjVar);
            }
        });
    }

    final /* synthetic */ void zzc(zzfqj zzfqjVar) {
        synchronized (zzd) {
            if (!this.zzm) {
                this.zzm = true;
                if (zza()) {
                    try {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        this.zzh = com.google.android.gms.ads.internal.util.zzs.zzr(this.zze);
                    } catch (RemoteException | RuntimeException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CuiMonitor.gettingAppIdFromManifest");
                    }
                    this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                    int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkf)).intValue();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zznB)).booleanValue()) {
                        long j = iIntValue;
                        zzcfy.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                    } else {
                        long j2 = iIntValue;
                        zzcfy.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkl)).booleanValue()) {
                        this.zzl.zza();
                    }
                }
            }
        }
        if (zza() && zzfqjVar != null) {
            synchronized (zzc) {
                zzfqx zzfqxVar = this.zzg;
                if (zzfqxVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkg)).intValue()) {
                    return;
                }
                zzfqu zzfquVarZza = zzfqw.zza();
                zzfquVarZza.zzv(zzfqjVar.zzm());
                zzfquVarZza.zza(zzfqjVar.zzb());
                zzfquVarZza.zzb(zzfqjVar.zza());
                zzfquVarZza.zzw(3);
                zzfquVarZza.zzd(this.zzf.afmaVersion);
                zzfquVarZza.zze(this.zzh);
                zzfquVarZza.zzf(Build.VERSION.RELEASE);
                zzfquVarZza.zzg(Build.VERSION.SDK_INT);
                zzfquVarZza.zzx(zzfqjVar.zzo());
                zzfquVarZza.zzi(zzfqjVar.zzc());
                zzfquVarZza.zzj(this.zzi);
                zzfquVarZza.zzy(zzfqjVar.zzn());
                zzfquVarZza.zzk(zzfqjVar.zzd());
                zzfquVarZza.zzl(zzfqjVar.zze());
                zzfquVarZza.zzm(zzfqjVar.zzf());
                zzfquVarZza.zzn(this.zzj.zzd(zzfqjVar.zzf()));
                zzfquVarZza.zzo(zzfqjVar.zzg());
                zzfquVarZza.zzs(zzfqjVar.zzh());
                zzfquVarZza.zzr(zzfqjVar.zzk());
                zzfquVarZza.zzp(zzfqjVar.zzi());
                zzfquVarZza.zzq(zzfqjVar.zzj());
                zzfquVarZza.zzc(zzfqjVar.zzl());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkk)).booleanValue()) {
                    zzfquVarZza.zzh(this.zzk);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkl)).booleanValue()) {
                    zzcnn zzcnnVar = this.zzl;
                    zziid zziidVarZzd = zzcnnVar.zzd();
                    String strZzc = zzcnnVar.zzc();
                    if (zziidVarZzd != null) {
                        zzfquVarZza.zzt(zziidVarZzd);
                    }
                    if (strZzc != null) {
                        zzfquVarZza.zzu(strZzc);
                    }
                }
                zzfqy zzfqyVarZza = zzfqz.zza();
                zzfqyVarZza.zza(zzfquVarZza);
                zzfqxVar.zzb(zzfqyVarZza);
            }
        }
    }
}
