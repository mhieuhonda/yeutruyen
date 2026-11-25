package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdzo {
    private final ConcurrentHashMap zza;
    private final zzcfp zzb;
    private final zzflg zzc;
    private final String zzd;
    private final String zze;
    private final zzbaw zzf;
    private final DeviceTierManager zzg;
    private final Bundle zzh = new Bundle();
    private final Context zzi;

    public zzdzo(Context context, zzdzy zzdzyVar, zzcfp zzcfpVar, zzflg zzflgVar, String str, String str2, zzbaw zzbawVar, DeviceTierManager deviceTierManager) {
        ActivityManager.MemoryInfo memoryInfoZze;
        ConcurrentHashMap concurrentHashMapZzd = zzdzyVar.zzd();
        this.zza = concurrentHashMapZzd;
        this.zzb = zzcfpVar;
        this.zzc = zzflgVar;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzbawVar;
        this.zzg = deviceTierManager;
        this.zzi = context;
        concurrentHashMapZzd.put("ad_format", str2.toUpperCase(Locale.ROOT));
        zzi();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzd("rt_f", String.valueOf(runtime.freeMemory()));
            zzd("rt_m", String.valueOf(runtime.maxMemory()));
            zzd("rt_t", String.valueOf(runtime.totalMemory()));
            zzd("wv_c", String.valueOf(com.google.android.gms.ads.internal.zzt.zzh().zzm()));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdb)).booleanValue() && (memoryInfoZze = com.google.android.gms.ads.internal.util.client.zzf.zze(context)) != null) {
                zzd("mem_avl", String.valueOf(memoryInfoZze.availMem));
                zzd("mem_tt", String.valueOf(memoryInfoZze.totalMem));
                zzd("low_m", true != memoryInfoZze.lowMemory ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdi)).booleanValue()) {
            zzd("ad_unit_id", zzflgVar.zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdc)).booleanValue()) {
            zzd("mem_tier", deviceTierManager.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdd)).booleanValue()) {
            zzd("proc_tier", deviceTierManager.getAvailableProcessorTier().name());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhZ)).booleanValue()) {
            int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzflgVar) - 1;
            if (iZzg == 0) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("scar", "false");
                return;
            }
            if (iZzg == 1) {
                concurrentHashMapZzd.put("request_id", str);
                concurrentHashMapZzd.put("se", "query_g");
            } else if (iZzg == 2) {
                concurrentHashMapZzd.put("se", "r_adinfo");
            } else if (iZzg != 3) {
                concurrentHashMapZzd.put("se", "r_both");
            } else {
                concurrentHashMapZzd.put("se", "r_adstring");
            }
            concurrentHashMapZzd.put("scar", "true");
            zzd("ragent", zzflgVar.zzd.zzp);
            zzd("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(zzflgVar.zzd)));
        }
    }

    public final void zza(zzfky zzfkyVar) {
        zzfkx zzfkxVar = zzfkyVar.zzb;
        List list = zzfkxVar.zza;
        if (!list.isEmpty()) {
            int i = ((zzfkn) list.get(0)).zzb;
            zzd("ad_format", zzfkn.zza(i));
            if (i == 6) {
                this.zza.put("as", true != this.zzb.zzl() ? "0" : "1");
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            zzd("mwl", Integer.toString(list.size()));
        }
        zzd("gqi", zzfkxVar.zzb.zzb);
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("cnt")) {
            zzd("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            zzd("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map zzc() {
        return this.zza;
    }

    public final void zzd(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.zza.put(str, str2);
    }

    public final synchronized Bundle zze() {
        return this.zzh;
    }

    public final synchronized void zzf(String str, long j) {
        this.zzh.putLong(str, j);
    }

    public final synchronized void zzg(Bundle bundle) {
        this.zzh.putAll(bundle);
    }

    public final void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoX)).booleanValue()) {
            zzd("brr", true != this.zzc.zzq ? "0" : "1");
        }
    }

    public final void zzi() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlc)).booleanValue()) {
            zzbar zzbarVarZzb = this.zzf.zzb();
            if (zzbarVarZzb instanceof com.google.android.gms.ads.internal.zzk) {
                this.zza.put("asv", ((com.google.android.gms.ads.internal.zzk) zzbarVarZzb).zzc());
            } else if (zzbarVarZzb instanceof zzcnp) {
                this.zza.put("asv", ((zzcnp) zzbarVarZzb).zza());
            } else {
                this.zza.put("asv", "NA");
            }
        }
    }
}
