package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzigj {
    private static final zzigj zza = new zzigj();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzifq zzb = new zzifq();

    private zzigj() {
    }

    static zzigj zza() {
        return zza;
    }

    private <T> zzigr<T> zzc(Class<T> cls) {
        ConcurrentMap concurrentMap = this.zzc;
        zzigr<T> zzigrVarZza = this.zzb.zza(cls);
        zzigr<T> zzigrVar = (zzigr) concurrentMap.putIfAbsent(cls, zzigrVarZza);
        return zzigrVar != null ? zzigrVar : zzigrVarZza;
    }

    final zzigr zzb(Class cls) {
        Object obj = this.zzc.get(cls);
        return obj == null ? zzc(cls) : (zzigr) obj;
    }
}
