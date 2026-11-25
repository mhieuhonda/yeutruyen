package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfov {
    final Runnable zza;
    final long zzb;
    ScheduledFuture zzc;
    final /* synthetic */ zzfow zzd;

    zzfov(zzfow zzfowVar, Runnable runnable, long j) {
        Objects.requireNonNull(zzfowVar);
        this.zzd = zzfowVar;
        this.zza = runnable;
        this.zzb = j;
    }
}
