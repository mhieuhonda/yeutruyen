package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbuf;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzbup;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzdzs;
import com.google.android.gms.internal.ads.zzdzt;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqt;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.ads.zzhcp;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdzt zzdztVar, zzfqg zzfqgVar, zzfqt zzfqtVar, JSONObject jSONObject) throws JSONException {
        boolean zOptBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (zOptBoolean) {
            zzt.zzh().zzp().zzh(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdztVar, "cld_s", zzt.zzk().elapsedRealtime() - l.longValue());
            }
        }
        String strOptString = jSONObject.optString("errorReason", "");
        if (!TextUtils.isEmpty(strOptString)) {
            zzfqgVar.zzk(strOptString);
        }
        zzfqgVar.zzd(zOptBoolean);
        zzfqtVar.zzb(zzfqgVar.zzm());
        return zzhcf.zza(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzf(zzdzt zzdztVar, String str, long j) {
        if (zzdztVar != null) {
            if (((Boolean) zzba.zzc().zzd(zzbix.zzoq)).booleanValue()) {
                zzdzs zzdzsVarZza = zzdztVar.zza();
                zzdzsVarZza.zzc("action", "lat_init");
                zzdzsVarZza.zzc(str, Long.toString(j));
                zzdzsVarZza.zzd();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfqt zzfqtVar, zzdzt zzdztVar, Long l, boolean z) {
        zzc(context, versionInfoParcel, true, null, str, null, runnable, zzfqtVar, zzdztVar, l, z);
    }

    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, String str, zzcff zzcffVar, zzfqt zzfqtVar, boolean z) {
        zzc(context, versionInfoParcel, false, zzcffVar, zzcffVar != null ? zzcffVar.zze() : null, str, null, zzfqtVar, null, null, z);
    }

    final void zzc(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzcff zzcffVar, String str, String str2, Runnable runnable, final zzfqt zzfqtVar, final zzdzt zzdztVar, final Long l, boolean z2) {
        zzfqg zzfqgVar;
        Exception exc;
        PackageInfo packageInfo;
        if (zzt.zzk().elapsedRealtime() - this.zzb < CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzk().elapsedRealtime();
        if (zzcffVar != null && !TextUtils.isEmpty(zzcffVar.zzd())) {
            if (zzt.zzk().currentTimeMillis() - zzcffVar.zzb() <= ((Long) zzba.zzc().zzd(zzbix.zzfj)).longValue() && zzcffVar.zzc()) {
                return;
            }
        }
        if (context == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        final zzfqg zzfqgVarZzn = zzfqg.zzn(context, 4);
        zzfqgVarZzn.zza();
        zzbup zzbupVarZzb = zzt.zzr().zzb(this.zza, versionInfoParcel, zzfqtVar);
        zzbuj zzbujVar = zzbum.zza;
        zzbuf zzbufVarZza = zzbupVarZzb.zza("google.afma.config.fetchAppSettings", zzbujVar, zzbujVar);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbio zzbioVar = zzbix.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzba.zzb().zze()));
                jSONObject.put("js", versionInfoParcel.afmaVersion);
                if (((Boolean) zzba.zzc().zzd(zzbix.zzlb)).booleanValue()) {
                    jSONObject.put("inspector_enabled", z2);
                }
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (applicationInfo != null && (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                ListenableFuture listenableFutureZzb = zzbufVarZza.zzb(jSONObject);
                try {
                    zzhbn zzhbnVar = new zzhbn(this) { // from class: com.google.android.gms.ads.internal.zzd
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return zzf.zzd(l, zzdztVar, zzfqgVarZzn, zzfqtVar, (JSONObject) obj);
                        }
                    };
                    zzfqgVar = zzfqgVarZzn;
                    try {
                        zzhcp zzhcpVar = zzcfy.zzh;
                        ListenableFuture listenableFutureZzj = zzhcf.zzj(listenableFutureZzb, zzhbnVar, zzhcpVar);
                        if (runnable != null) {
                            listenableFutureZzb.addListener(runnable, zzhcpVar);
                        }
                        if (l != null) {
                            listenableFutureZzb.addListener(new Runnable(this) { // from class: com.google.android.gms.ads.internal.zze
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzf.zzf(zzdztVar, "cld_r", zzt.zzk().elapsedRealtime() - l.longValue());
                                }
                            }, zzhcpVar);
                        }
                        if (((Boolean) zzba.zzc().zzd(zzbix.zziM)).booleanValue()) {
                            zzcgb.zzb(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings");
                        } else {
                            zzcgb.zza(listenableFutureZzj, "ConfigLoader.maybeFetchNewAppSettings", zzhcpVar);
                        }
                    } catch (Exception e) {
                        e = e;
                        exc = e;
                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                        zzfqgVar.zzj(exc);
                        zzfqgVar.zzd(false);
                        zzfqtVar.zzb(zzfqgVar.zzm());
                    }
                } catch (Exception e2) {
                    e = e2;
                    zzfqgVar = zzfqgVarZzn;
                }
            } catch (Exception e3) {
                exc = e3;
                zzfqgVar = zzfqgVarZzn;
                int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error requesting application settings", exc);
                zzfqgVar.zzj(exc);
                zzfqgVar.zzd(false);
                zzfqtVar.zzb(zzfqgVar.zzm());
            }
        } catch (Exception e4) {
            e = e4;
            zzfqgVar = zzfqgVarZzn;
        }
    }
}
