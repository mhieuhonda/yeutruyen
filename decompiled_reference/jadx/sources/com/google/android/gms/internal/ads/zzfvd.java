package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvd extends TimerTask {
    final /* synthetic */ zzfvf zza;
    final /* synthetic */ Timer zzb;
    final /* synthetic */ zzfvg zzc;

    zzfvd(zzfvg zzfvgVar, zzfvf zzfvfVar, Timer timer) {
        this.zza = zzfvfVar;
        this.zzb = timer;
        Objects.requireNonNull(zzfvgVar);
        this.zzc = zzfvgVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zzc.zze();
        this.zza.zza(true);
        this.zzb.cancel();
    }
}
