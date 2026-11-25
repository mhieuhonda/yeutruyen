package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzcmo extends zzclm {
    public zzcmo(zzclb zzclbVar, zzbhw zzbhwVar, boolean z, zzekz zzekzVar) {
        super(zzclbVar, zzbhwVar, z, new zzbym(zzclbVar, zzclbVar.zzK(), new zzbie(zzclbVar.getContext())), null, zzekzVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final WebResourceResponse zzac(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof zzclb)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        zzclb zzclbVar = (zzclb) webView;
        zzcdu zzcduVar = this.zzb;
        if (zzcduVar != null) {
            zzcduVar.zze(str, map, 1);
        }
        zzfzu.zza();
        zzfzz zzfzzVar = zzfzz.zza;
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.emptyMap();
            }
            return super.zzL(str, map);
        }
        if (zzclbVar.zzP() != null) {
            zzclbVar.zzP().zzN();
        }
        if (zzclbVar.zzN().zzg()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaG);
        } else if (zzclbVar.zzW()) {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaF);
        } else {
            str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaE);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzz(zzclbVar.getContext(), zzclbVar.zzs().afmaVersion, str2);
    }
}
