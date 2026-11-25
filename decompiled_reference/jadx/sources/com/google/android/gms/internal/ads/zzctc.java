package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzctc implements zzcsa {
    private final CookieManager zza;

    public zzctc(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zzf().zza(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        CookieManager cookieManager = this.zza;
        if (cookieManager == null) {
            return;
        }
        if (((String) map.get("clear")) == null) {
            String str = (String) map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            cookieManager.setCookie((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbE), str);
            return;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbE);
        String cookie = cookieManager.getCookie(str2);
        if (cookie != null) {
            List listZzg = zzgug.zza(zzgtf.zzd(';')).zzg(cookie);
            for (int i = 0; i < listZzg.size(); i++) {
                Iterator it = zzgug.zza(zzgtf.zzd('=')).zzf((String) listZzg.get(i)).iterator();
                it.getClass();
                if (!it.hasNext()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                    sb.append("position (0) must be less than the number of elements that remained (");
                    sb.append(0);
                    sb.append(")");
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                String str3 = (String) it.next();
                String str4 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbp);
                String.valueOf(str3);
                String.valueOf(str4);
                cookieManager.setCookie(str2, String.valueOf(str3).concat(String.valueOf(str4)));
            }
        }
    }
}
