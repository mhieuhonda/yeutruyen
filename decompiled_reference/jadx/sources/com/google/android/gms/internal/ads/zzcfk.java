package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzcfk {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcfp zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbjc zzh;
    private zzdzt zzi;
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzcfj zzm;
    private final Object zzn;
    private ListenableFuture zzo;
    private final AtomicBoolean zzp;
    private final AtomicBoolean zzq;

    public zzcfk() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcfp(com.google.android.gms.ads.internal.client.zzay.zzf(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzcfj(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
        this.zzq = new AtomicBoolean(false);
    }

    final /* synthetic */ Context zzA() {
        return this.zze;
    }

    final /* synthetic */ VersionInfoParcel zzB() {
        return this.zzf;
    }

    final /* synthetic */ zzbjc zzC() {
        return this.zzh;
    }

    final /* synthetic */ AtomicBoolean zzD() {
        return this.zzp;
    }

    public final zzbjc zza() {
        zzbjc zzbjcVar;
        synchronized (this.zza) {
            zzbjcVar = this.zzh;
        }
        return zzbjcVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final boolean zze(boolean z) {
        return this.zzq.getAndSet(true);
    }

    public final void zzf(Context context, VersionInfoParcel versionInfoParcel, zzdzt zzdztVar) {
        zzbjc zzbjcVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = versionInfoParcel;
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this.zzc);
                this.zzb.zza(this.zze);
                zzcaf.zzb(this.zze, this.zzf);
                this.zzi = zzdztVar;
                com.google.android.gms.ads.internal.zzt.zzm();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcN)).booleanValue()) {
                    zzbjcVar = new zzbjc();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbjcVar = null;
                }
                this.zzh = zzbjcVar;
                if (zzbjcVar != null) {
                    zzcgb.zza(new zzcfg(this).zzb(), "AppState.registerCsiReporter", zzcfy.zzh);
                }
                Context context2 = this.zze;
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjN)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcfh(this));
                        } catch (RuntimeException e) {
                            int i = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e);
                            this.zzp.set(true);
                        }
                    }
                }
                this.zzd = true;
                zzr();
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpD)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final Resources zzg() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmz)).booleanValue();
            Context context = this.zze;
            if (zBooleanValue) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(context).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(context).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final void zzh(Throwable th, String str) {
        zzcaf.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzi(Throwable th, String str) {
        zzcaf.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzblg.zzf.zze()).floatValue());
    }

    public final void zzj(Throwable th, String str) {
        zzcaf.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzk() {
        this.zzk.incrementAndGet();
    }

    public final void zzl() {
        this.zzk.decrementAndGet();
    }

    public final int zzm() {
        return this.zzk.get();
    }

    public final void zzn() {
        this.zzl.incrementAndGet();
    }

    public final int zzo() {
        return this.zzl.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzp() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final Context zzq() {
        return this.zze;
    }

    public final ListenableFuture zzr() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdV)).booleanValue()) {
                synchronized (this.zzn) {
                    ListenableFuture listenableFuture = this.zzo;
                    if (listenableFuture != null) {
                        return listenableFuture;
                    }
                    ListenableFuture listenableFutureSubmit = zzcfy.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcfi
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzy();
                        }
                    });
                    this.zzo = listenableFutureSubmit;
                    return listenableFutureSubmit;
                }
            }
        }
        return zzhcf.zza(new ArrayList());
    }

    public final zzcfp zzs() {
        return this.zzc;
    }

    public final boolean zzt(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzjN)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzu(String str) {
        this.zzg = str;
    }

    public final String zzv() {
        return this.zzg;
    }

    public final zzdzt zzw() {
        return this.zzi;
    }

    public final ActivityManager.MemoryInfo zzx() {
        return com.google.android.gms.ads.internal.util.client.zzf.zze(this.zze);
    }

    final /* synthetic */ ArrayList zzy() {
        Context contextZza = zzcbu.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                for (int i = 0; i < packageInfo.requestedPermissions.length; i++) {
                    if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(packageInfo.requestedPermissions[i]);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    final /* synthetic */ Object zzz() {
        return this.zza;
    }
}
