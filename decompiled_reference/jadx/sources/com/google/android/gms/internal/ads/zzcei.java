package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcei {
    public static String zza(String str, Context context, boolean z, Map map) {
        String strZzk;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbg)).booleanValue() && !z) || !com.google.android.gms.ads.internal.zzt.zzD().zzb(context) || TextUtils.isEmpty(str) || (strZzk = com.google.android.gms.ads.internal.zzt.zzD().zzk(context)) == null) {
            return str;
        }
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaZ);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaY)).booleanValue() && str.contains(str2)) {
            if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
                com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzk, (Map) map.get("_ac"));
                return zzd(str, context).replace(str2, strZzk);
            }
            if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
                return str;
            }
            com.google.android.gms.ads.internal.zzt.zzD().zzm(context, strZzk, (Map) map.get("_ai"));
            return zzd(str, context).replace(str2, strZzk);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaX)).booleanValue()) {
            return str;
        }
        if (com.google.android.gms.ads.internal.zzt.zzc().zzh(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzk, (Map) map.get("_ac"));
            return zzc(zzd(str, context), "fbs_aeid", strZzk).toString();
        }
        if (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str)) {
            return str;
        }
        com.google.android.gms.ads.internal.zzt.zzD().zzm(context, strZzk, (Map) map.get("_ai"));
        return zzc(zzd(str, context), "fbs_aeid", strZzk).toString();
    }

    public static String zzb(Uri uri, Context context, Map map) {
        if (!com.google.android.gms.ads.internal.zzt.zzD().zzb(context)) {
            return uri.toString();
        }
        String strZzk = com.google.android.gms.ads.internal.zzt.zzD().zzk(context);
        if (strZzk == null) {
            return uri.toString();
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaZ);
        String string = uri.toString();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaY)).booleanValue() && string.contains(str)) {
            com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzk, (Map) map.get("_ac"));
            return zzd(string, context).replace(str, strZzk);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaX)).booleanValue()) {
                String string2 = zzc(zzd(string, context), "fbs_aeid", strZzk).toString();
                com.google.android.gms.ads.internal.zzt.zzD().zzl(context, strZzk, (Map) map.get("_ac"));
                return string2;
            }
        }
        return string;
    }

    static Uri zzc(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i = iIndexOf + 1;
        return Uri.parse(str.substring(0, i) + str2 + "=" + str3 + "&" + str.substring(i));
    }

    private static String zzd(String str, Context context) {
        String strZzi = com.google.android.gms.ads.internal.zzt.zzD().zzi(context);
        String strZzj = com.google.android.gms.ads.internal.zzt.zzD().zzj(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strZzi)) {
            str = zzc(str, "gmp_app_id", strZzi).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strZzj)) ? str : zzc(str, "fbs_aiid", strZzj).toString();
    }
}
