package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfki implements zzetz {
    final /* synthetic */ zzfkk zza;

    zzfki(zzfkk zzfkkVar) {
        Objects.requireNonNull(zzfkkVar);
        this.zza = zzfkkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfkk zzfkkVar = this.zza;
        synchronized (zzfkkVar) {
            zzfkkVar.zzx(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkk zzfkkVar = this.zza;
        zzdvu zzdvuVar = (zzdvu) obj;
        synchronized (zzfkkVar) {
            zzfkkVar.zzx(zzdvuVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeC)).booleanValue()) {
                zzdvuVar.zzh().zza = zzfkkVar.zzv();
            }
            zzfkkVar.zzw().zzj();
        }
    }
}
