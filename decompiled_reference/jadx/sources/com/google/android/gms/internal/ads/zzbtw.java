package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbtw implements zzcgh {
    final /* synthetic */ zzbtv zza;

    zzbtw(zzbua zzbuaVar, zzbtv zzbtvVar) {
        this.zza = zzbtvVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Getting a new session for JS Engine.");
        this.zza.zzf(((zzbsw) obj).zzl());
    }
}
