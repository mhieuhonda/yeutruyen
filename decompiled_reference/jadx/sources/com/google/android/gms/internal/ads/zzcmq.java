package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcmq extends zzcmp {
    public zzcmq(zzclb zzclbVar, zzbhw zzbhwVar, boolean z, zzekz zzekzVar) {
        super(zzclbVar, zzbhwVar, z, zzekzVar);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.zza.zzaA(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }
}
