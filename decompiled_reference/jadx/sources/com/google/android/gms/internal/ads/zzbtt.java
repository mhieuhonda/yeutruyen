package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtt implements zzcgh {
    final /* synthetic */ zzbtv zza;

    zzbtt(zzbtv zzbtvVar) {
        Objects.requireNonNull(zzbtvVar);
        this.zza = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Releasing engine reference.");
        this.zza.zzb().zzb();
    }
}
