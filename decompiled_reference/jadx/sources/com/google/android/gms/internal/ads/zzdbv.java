package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbv {
    private final AtomicLong zza;

    zzdbv(zzfky zzfkyVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.zza = atomicLong;
        atomicLong.set(zzfkyVar.zza.zza.zzu.get());
    }

    public final long zza() {
        return this.zza.get();
    }

    public final void zzb(long j) {
        this.zza.set(j);
    }
}
