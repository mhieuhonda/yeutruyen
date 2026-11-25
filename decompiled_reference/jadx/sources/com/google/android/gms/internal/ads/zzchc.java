package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchc implements Runnable {
    final /* synthetic */ zzchi zza;

    zzchc(zzchi zzchiVar) {
        Objects.requireNonNull(zzchiVar);
        this.zza = zzchiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzI("surfaceCreated", new String[0]);
    }
}
