package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwk extends WebViewClient {
    final /* synthetic */ zzfwm zza;

    zzfwk(zzfwm zzfwmVar) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 36 + String.valueOf(strValueOf).length());
        sb.append("WebView renderer gone: ");
        sb.append(string);
        sb.append("for WebView: ");
        sb.append(strValueOf);
        Log.w("NativeBridge", sb.toString());
        zzfwm zzfwmVar = this.zza;
        if (zzfwmVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfwmVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
