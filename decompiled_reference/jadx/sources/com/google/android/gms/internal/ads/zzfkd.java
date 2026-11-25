package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfkd implements zzetz {
    final /* synthetic */ zzfke zza;

    zzfkd(zzfke zzfkeVar) {
        Objects.requireNonNull(zzfkeVar);
        this.zza = zzfkeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfke zzfkeVar = this.zza;
        synchronized (zzfkeVar) {
            zzfkeVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfke zzfkeVar = this.zza;
        zzdvu zzdvuVar = (zzdvu) obj;
        synchronized (zzfkeVar) {
            zzfkeVar.zzx(zzdvuVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeC)).booleanValue()) {
                zzdvuVar.zzh().zza = zzfkeVar.zzv();
            }
            zzfkeVar.zzw().zzj();
        }
    }
}
