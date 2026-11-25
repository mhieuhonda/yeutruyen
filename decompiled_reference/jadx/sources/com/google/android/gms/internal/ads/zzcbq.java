package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcbq {
    public final long zza;
    public final zzcbo zzb;

    public zzcbq(zzcbr zzcbrVar, zzcbo zzcboVar) {
        Objects.requireNonNull(zzcbrVar);
        this.zza = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        this.zzb = zzcboVar;
    }
}
