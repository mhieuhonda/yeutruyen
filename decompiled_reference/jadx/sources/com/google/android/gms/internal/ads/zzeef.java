package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeef implements zzash {
    final /* synthetic */ zzeeg zza;

    zzeef(zzeeg zzeegVar) {
        Objects.requireNonNull(zzeegVar);
        this.zza = zzeegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzash
    public final void zza(int i) {
        zzasi zzasiVarZzd;
        try {
            zzfrd zzfrdVarZza = zzfre.zza();
            int i2 = 3;
            if (i != 0) {
                if (i == 1) {
                    i2 = 4;
                } else if (i != 2) {
                    i2 = i != 3 ? 7 : 6;
                } else {
                    i2 = 5;
                }
            }
            zzfrdVarZza.zzh(i2);
            if (i == 0 && (zzasiVarZzd = this.zza.zzc().zzd()) != null) {
                zzfrdVarZza.zzb(zzasiVarZzd.zzb());
                zzfrdVarZza.zzc(zzasiVarZzd.zzc());
                zzfrdVarZza.zzd(zzasiVarZzd.zzd());
                zzfrdVarZza.zze(zzasiVarZzd.zze());
                zzfrdVarZza.zzf(zzasiVarZzd.zzf());
                if (!TextUtils.isEmpty(zzasiVarZzd.zza())) {
                    zzfrdVarZza.zza(zzasiVarZzd.zza());
                }
                if (!TextUtils.isEmpty(zzasiVarZzd.zzg())) {
                    zzfrdVarZza.zzg(zzasiVarZzd.zzg());
                }
            }
            zzeeg zzeegVar = this.zza;
            zzeegVar.zzc().zzc();
            zzdzt zzdztVarZzd = zzeegVar.zzd();
            String strEncodeToString = Base64.encodeToString(((zzfre) zzfrdVarZza.zzbu()).zzaN(), 1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfY)).booleanValue()) {
                zzdzs zzdzsVarZza = zzdztVarZzd.zza();
                zzdzsVarZza.zzc("action", "irda");
                zzdzsVarZza.zzc("irdd", strEncodeToString);
                zzdzsVarZza.zzf();
            }
            zzeegVar.zze().zzQ(true);
        } catch (Exception e) {
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfZ)).booleanValue();
            zzeeg zzeegVar2 = this.zza;
            if (zBooleanValue) {
                if (zzeegVar2.zzb == null) {
                    zzeegVar2.zzb = zzcaf.zzc(zzeegVar2.zzb());
                }
                zzeegVar2.zzb.zzh(e, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
            } else {
                if (zzeegVar2.zza == null) {
                    zzeegVar2.zza = zzcaf.zza(zzeegVar2.zzb());
                }
                zzeegVar2.zza.zzh(e, "InstallReferrer.onInstallReferrerSetupFinished");
            }
        }
    }
}
