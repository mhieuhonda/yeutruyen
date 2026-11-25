package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbfv implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzbfn zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzbfx zze;

    zzbfv(zzbfx zzbfxVar, final zzbfn zzbfnVar, final WebView webView, final boolean z) {
        this.zzb = zzbfnVar;
        this.zzc = webView;
        this.zzd = z;
        Objects.requireNonNull(zzbfxVar);
        this.zze = zzbfxVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzbfu
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzbfnVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
