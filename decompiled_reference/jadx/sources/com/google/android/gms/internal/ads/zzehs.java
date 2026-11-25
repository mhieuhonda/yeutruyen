package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzehs implements zzege {
    final /* synthetic */ zzehv zza;

    zzehs(zzehv zzehvVar) {
        Objects.requireNonNull(zzehvVar);
        this.zza = zzehvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpN)).booleanValue()) {
            zzdzs zzdzsVarZza = this.zza.zzd().zza();
            zzdzsVarZza.zzc("action", "ptard");
            zzdzsVarZza.zzc("ptard", "r");
            zzdzsVarZza.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzege
    public final void zzb(RemoteException remoteException) {
        this.zza.zzc();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpO)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(remoteException, "Preconnect Remote");
        }
    }
}
