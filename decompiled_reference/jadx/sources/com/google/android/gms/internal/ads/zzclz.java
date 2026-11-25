package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzclz implements Runnable {
    final /* synthetic */ zzcme zza;

    zzclz(zzcme zzcmeVar) {
        Objects.requireNonNull(zzcmeVar);
        this.zza = zzcmeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
