package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzcfy;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public ListenableFuture zzb() {
        return zzcfy.zza.submit(this.zza);
    }

    final /* synthetic */ void zzc(Thread thread) {
        this.zzb = thread;
    }
}
