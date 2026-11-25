package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzata implements Executor {
    final /* synthetic */ Handler zza;

    zzata(zzatc zzatcVar, Handler handler) {
        this.zza = handler;
        Objects.requireNonNull(zzatcVar);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
