package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdce {
    private final zzfps zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzimt zzg;
    private final String zzh;
    private final zzfcv zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzflg zzk;
    private final zzdis zzl;

    zzdce(zzfps zzfpsVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzimt zzimtVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzfcv zzfcvVar, zzflg zzflgVar, zzdis zzdisVar) {
        this.zza = zzfpsVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzimtVar;
        this.zzh = str2;
        this.zzi = zzfcvVar;
        this.zzj = zzgVar;
        this.zzk = zzflgVar;
        this.zzl = zzdisVar;
    }

    public final ListenableFuture zza(Bundle bundle) {
        this.zzl.zza();
        zzfpm zzfpmVar = zzfpm.SIGNALS;
        zzfps zzfpsVar = this.zza;
        Objects.requireNonNull(zzfpsVar);
        return zzfpd.zza(this.zzi.zza(new Bundle(), bundle), zzfpmVar, zzfpsVar).zzi();
    }

    public final ListenableFuture zzb() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final ListenableFuture listenableFutureZza = zza(bundle);
        return this.zza.zzb(zzfpm.REQUEST_PARCEL, listenableFutureZza, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdcd
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(listenableFutureZza, bundle);
            }
        }).zzi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzcbk zzc(ListenableFuture listenableFuture, Bundle bundle) {
        Bundle bundle2 = (Bundle) listenableFuture.get();
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzid)).booleanValue() && this.zzj.zzx()) {
            z = true;
        }
        boolean z2 = z;
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        String str3 = this.zzd;
        return new zzcbk(bundle2, this.zzb, this.zzc, str3, list, packageInfo, str, str2, null, null, z2, this.zzk.zza(), bundle);
    }
}
