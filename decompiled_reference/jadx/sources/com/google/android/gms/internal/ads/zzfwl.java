package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwl implements Runnable {
    final /* synthetic */ zzfwm zza;
    private final WebView zzb;

    zzfwl(zzfwm zzfwmVar) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
        this.zzb = zzfwmVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
