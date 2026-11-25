package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcyk implements zzhcc {
    final /* synthetic */ zzhcc zza;
    final /* synthetic */ zzcyp zzb;

    zzcyk(zzcyp zzcypVar, zzhcc zzhccVar) {
        this.zza = zzhccVar;
        Objects.requireNonNull(zzcypVar);
        this.zzb = zzcypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zzb.zzf();
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzf();
        this.zza.zzb((zzcya) obj);
    }
}
