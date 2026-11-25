package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvy implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzfvy(zzfvz zzfvzVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzfvzVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvz.zzk(this.zza, this.zzb);
    }
}
