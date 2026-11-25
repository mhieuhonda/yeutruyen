package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgfb implements zzgew {
    private final ScheduledExecutorService zza = Executors.newSingleThreadScheduledExecutor();

    zzgfb() {
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zza(Runnable runnable, long j) {
        this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    public final void zzb() {
    }
}
