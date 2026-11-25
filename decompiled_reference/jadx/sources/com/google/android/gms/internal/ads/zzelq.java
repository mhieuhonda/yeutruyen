package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzelq {
    boolean zza(Context context);

    String zzb(Context context);

    zzelv zzc(String str, WebView webView, String str2, String str3, String str4, zzels zzelsVar, zzelr zzelrVar, String str5);

    zzelv zzd(String str, WebView webView, String str2, String str3, String str4, String str5, zzels zzelsVar, zzelr zzelrVar, String str6);

    void zze(zzfuu zzfuuVar);

    void zzf(zzfuu zzfuuVar);

    void zzg(zzfuu zzfuuVar, View view);

    void zzh(zzfuu zzfuuVar, View view);

    zzfvg zzi(VersionInfoParcel versionInfoParcel, WebView webView, boolean z);

    void zzj(zzfvg zzfvgVar, zzfvf zzfvfVar);

    void zzk(zzfvg zzfvgVar, View view);
}
