package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdpl implements zzbex {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdpw zzb;

    zzdpl(zzdpw zzdpwVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzdpwVar);
        this.zzb = zzdpwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcz)).booleanValue()) {
            synchronized (this) {
                if (zzbewVar.zzj) {
                    zzdpw zzdpwVar = this.zzb;
                    if (zzdpwVar.zzaa() != null) {
                        zzdpwVar.zzab().put(this.zza, true);
                        if (zzdpwVar.zzaa() == null) {
                            return;
                        } else {
                            zzdpwVar.zzu(zzdpwVar.zzaa().zzdF(), zzdpwVar.zzaa().zzi(), zzdpwVar.zzaa().zzj(), true);
                        }
                    }
                }
                return;
            }
        }
        if (zzbewVar.zzj) {
            zzdpw zzdpwVar2 = this.zzb;
            if (zzdpwVar2.zzaa() != null) {
                zzdpwVar2.zzab().put(this.zza, true);
                if (zzdpwVar2.zzaa() == null) {
                    return;
                }
                zzdpwVar2.zzu(zzdpwVar2.zzaa().zzdF(), zzdpwVar2.zzaa().zzi(), zzdpwVar2.zzaa().zzj(), true);
            }
        }
    }
}
