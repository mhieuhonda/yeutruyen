package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcnh extends Thread {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzcni zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcnh(zzcni zzcniVar, Runnable runnable, String str, Runnable runnable2) {
        super(runnable, str);
        this.zza = runnable2;
        Objects.requireNonNull(zzcniVar);
        this.zzb = zzcniVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.zzb.zza());
        this.zza.run();
    }
}
