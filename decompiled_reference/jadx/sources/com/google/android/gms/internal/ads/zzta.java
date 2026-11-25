package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzta {
    final /* synthetic */ zztb zza;
    private final Handler zzb;
    private final AudioTrack.StreamEventCallback zzc;

    /* synthetic */ zzta(zztb zztbVar, byte[] bArr) {
        Objects.requireNonNull(zztbVar);
        this.zza = zztbVar;
        final Handler handlerZzd = zzfm.zzd(null);
        this.zzb = handlerZzd;
        zzsy zzsyVar = new zzsy(this);
        this.zzc = zzsyVar;
        Objects.requireNonNull(handlerZzd);
        zztbVar.zzt().registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzsz
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                handlerZzd.post(runnable);
            }
        }, zzsyVar);
    }

    final /* synthetic */ void zza() {
        this.zza.zzt().unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
