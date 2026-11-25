package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbja {
    private final String zza = (String) zzbkr.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbja(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzt());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? "0" : "1");
        Future futureZza = com.google.android.gms.ads.internal.zzt.zzp().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbo) futureZza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbo) futureZza.get()).zzk));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmW)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzE(context) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkW)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdl)).booleanValue() || zzgui.zzc(com.google.android.gms.ads.internal.zzt.zzh().zzv())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzt.zzh().zzv());
        }
    }

    final String zza() {
        return this.zza;
    }

    final Context zzb() {
        return this.zzc;
    }

    final String zzc() {
        return this.zzd;
    }

    final Map zzd() {
        return this.zzb;
    }
}
