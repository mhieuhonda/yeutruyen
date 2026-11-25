package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcyj implements zzhcc {
    final /* synthetic */ zzhcc zza;
    final /* synthetic */ zzcyp zzb;

    zzcyj(zzcyp zzcypVar, zzhcc zzhccVar) {
        this.zza = zzhccVar;
        Objects.requireNonNull(zzcypVar);
        this.zzb = zzcypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zza(th);
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcyi) obj).zza, this.zza);
    }
}
