package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.webkit.WebViewFeature;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdza implements zzdgf, zzden, zzddc, zzdls {
    private final zzdzo zza;
    private final zzdzy zzb;
    private final Context zzc;

    zzdza(zzdzo zzdzoVar, zzdzy zzdzyVar, Context context) {
        this.zza = zzdzoVar;
        this.zzb = zzdzyVar;
        this.zzc = context;
    }

    private final void zzc(Bundle bundle, zzgwt zzgwtVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcS)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdzc.PUBLIC_API_CALLBACK.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        zzdzo zzdzoVar = this.zza;
        zzdzoVar.zzh();
        if (bundle.containsKey("ls")) {
            zzdzoVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgwtVar.size();
        for (int i = 0; i < size; i++) {
            zzdzd zzdzdVar = (zzdzd) zzgwtVar.get(i);
            long j = bundle.getLong(zzdzdVar.zzb().zza(), -1L);
            long j2 = bundle.getLong(zzdzdVar.zzc().zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdzoVar.zzd(zzdzdVar.zza(), String.valueOf(j2 - j));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    private final void zzh() {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        if (((Boolean) zzbld.zzd.zze()).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zze(true) || !PlatformVersion.isAtLeastR()) {
            return;
        }
        String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlg);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Context context = this.zzc;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1)) == null || historicalProcessExitReasons.isEmpty()) {
                return;
            }
            int reason = historicalProcessExitReasons.get(0).getReason();
            for (String str2 : zzgug.zza(zzgtf.zzd(',')).zze(zzgtf.zzc()).zzd().zzf(str)) {
                try {
                    if (Integer.parseInt(str2) == reason) {
                        zzdzy zzdzyVar = this.zzb;
                        Map mapZza = zzdzyVar.zza();
                        mapZza.put("action", "aei");
                        mapZza.put("aeir", String.valueOf(reason));
                        zzdzyVar.zzf(mapZza);
                        return;
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 53);
                    sb.append("Invalid number format in appExitInfoReasonAllowlist: ");
                    sb.append(str2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                }
            }
        } catch (NoClassDefFoundError | NoSuchMethodError | RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CsiAdLoadListener.maybeLogAppExitInfo");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        String str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhZ)).booleanValue()) {
            if (zzbcVar == null) {
                zzdzo zzdzoVar = this.zza;
                zzdzoVar.zzc().put("action", "sgs");
                zzdzoVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzdzoVar.zzc());
                return;
            }
            zzcbk zzcbkVar = zzbcVar.zzc;
            if (zzcbkVar != null) {
                zzc(zzcbkVar.zzm, zzdzd.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(zzbcVar.zzb);
                zzdzo zzdzoVar2 = this.zza;
                zzdzoVar2.zzc().put("action", "sgs");
                Map mapZzc = zzdzoVar2.zzc();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzln)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                mapZzc.put("tpc", str);
                zzcbk zzcbkVar2 = zzbcVar.zzc;
                if (zzcbkVar2 != null) {
                    this.zza.zzb(zzcbkVar2.zza);
                }
                zzdzo zzdzoVar3 = this.zza;
                zzdzoVar3.zzi();
                this.zzb.zzb(zzdzoVar3.zzc());
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlf)).booleanValue()) {
                    zzh();
                }
            } catch (JSONException unused) {
                zzdzo zzdzoVar4 = this.zza;
                zzdzoVar4.zzc().put("action", "sgf");
                zzdzoVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdzoVar4.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdzo zzdzoVar = this.zza;
        zzdzoVar.zzc().put("action", "ftl");
        zzdzoVar.zzd("ftl", String.valueOf(zzeVar.zza));
        zzdzoVar.zzd("ed", zzeVar.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzio)).booleanValue()) {
            zzdzoVar.zzd("emsg", zzeVar.zzb);
        }
        zzdzoVar.zzi();
        this.zzb.zzb(zzdzoVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        this.zza.zzb(zzcbkVar.zza);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzle)).booleanValue()) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        this.zza.zza(zzfkyVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzld)).booleanValue()) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdls
    public final void zze(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhZ)).booleanValue()) {
            zzdzo zzdzoVar = this.zza;
            zzdzoVar.zzc().put("action", "sgf");
            zzdzoVar.zzd("sgf_reason", str);
            zzdzoVar.zzi();
            this.zzb.zzb(zzdzoVar.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        zzdzo zzdzoVar = this.zza;
        zzdzoVar.zzc().put("action", "loaded");
        zzc(zzdzoVar.zze(), zzdzd.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzoo)).booleanValue()) {
            zzdzoVar.zzc().put("mafe", true != WebViewFeature.isFeatureSupported("MUTE_AUDIO") ? "0" : "1");
        }
        zzdzoVar.zzi();
        this.zzb.zzb(zzdzoVar.zzc());
    }
}
