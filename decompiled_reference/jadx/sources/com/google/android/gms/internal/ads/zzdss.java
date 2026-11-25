package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdss implements zzhcc {
    final /* synthetic */ zzdzc zza;
    final /* synthetic */ zzdsv zzb;

    zzdss(zzdsv zzdsvVar, zzdzc zzdzcVar) {
        this.zza = zzdzcVar;
        Objects.requireNonNull(zzdsvVar);
        this.zzb = zzdsvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zzb.zzd().zzf(this.zza.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
    }
}
