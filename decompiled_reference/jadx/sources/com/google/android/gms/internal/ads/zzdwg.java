package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzdwg implements zzbyo {
    final /* synthetic */ zzdwp zza;

    zzdwg(zzdwp zzdwpVar) {
        Objects.requireNonNull(zzdwpVar);
        this.zza = zzdwpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zza(int i, int i2, int i3, int i4) {
        this.zza.zzg().zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzb() {
        this.zza.zzg().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzc() {
        this.zza.zzh().zza();
    }
}
