package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzchp implements Runnable {
    zzchp(zzchr zzchrVar) {
        Objects.requireNonNull(zzchrVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
