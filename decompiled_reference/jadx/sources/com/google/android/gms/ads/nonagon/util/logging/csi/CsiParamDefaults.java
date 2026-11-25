package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzgui;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private final PackageInfo zzd;
    private final String zze;
    private final DeviceTierManager zzf;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel, PackageInfo packageInfo, String str, DeviceTierManager deviceTierManager) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
        this.zzd = packageInfo;
        this.zze = str;
        this.zzf = deviceTierManager;
    }

    public void set(Map<String, String> map) {
        PackageInfo packageInfo;
        map.put("s", "gmob_sdk");
        map.put("v", ExifInterface.GPS_MEASUREMENT_3D);
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put("device", zzs.zzt());
        map.put("app", this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzH(context) ? "0" : "1");
        zzbio zzbioVar = zzbix.zza;
        List listZzf = zzba.zzb().zzf();
        if (((Boolean) zzba.zzc().zzd(zzbix.zzhV)).booleanValue()) {
            listZzf.addAll(zzt.zzh().zzp().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", listZzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zzd(zzbix.zzmW)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true == zzs.zzE(context) ? "1" : "0");
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzkW)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzd(zzbix.zzdl)).booleanValue()) {
                map.put("plugin", zzgui.zza(zzt.zzh().zzv()));
            }
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzne)).booleanValue()) {
            map.put("uev", zzgui.zza(this.zze));
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzde)).booleanValue()) {
            map.put("mem_tier", this.zzf.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().zzd(zzbix.zzdf)).booleanValue()) {
            map.put("proc_tier", this.zzf.getAvailableProcessorTier().name());
        }
        if (!((Boolean) zzba.zzc().zzd(zzbix.zzdg)).booleanValue() || (packageInfo = this.zzd) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }
}
