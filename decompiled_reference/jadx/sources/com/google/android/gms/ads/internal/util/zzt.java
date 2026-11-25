package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzclb;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmp;
import com.google.android.gms.internal.ads.zzekz;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzt extends zzz {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (zzs.zzI()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            int i = zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public zzclm zzb(zzclb zzclbVar, zzbhw zzbhwVar, boolean z, zzekz zzekzVar) {
        return new zzcmp(zzclbVar, zzbhwVar, z, zzekzVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }
}
