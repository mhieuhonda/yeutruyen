package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzduv implements zzhcc {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbpx zzb;

    zzduv(zzdvf zzdvfVar, String str, zzbpx zzbpxVar) {
        this.zza = str;
        this.zzb = zzbpxVar;
        Objects.requireNonNull(zzdvfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzclb) obj).zzab(this.zza, this.zzb);
    }
}
