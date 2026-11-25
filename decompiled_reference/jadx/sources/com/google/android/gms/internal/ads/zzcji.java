package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcji implements zzbpx {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            String string = sb.toString();
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjh zzcjkVar;
        int i;
        zzchu zzchuVar = (zzchu) obj;
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcja<zzciz> zzcjaVarZzB = com.google.android.gms.ads.internal.zzt.zzB();
        if (map.containsKey("abort")) {
            if (zzcjaVarZzB.zza(zzchuVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcht zzchtVar = new zzcht((String) map.get("flags"));
        boolean z = zzchtVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzciz zzcizVarZzb = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    i = 0;
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            strArr2[i2] = jSONArray.getString(i2);
                        } catch (JSONException unused) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for precache: ".concat(str2));
                            strArr = null;
                        }
                    }
                    strArr = strArr2;
                } catch (JSONException unused2) {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (strArr == null) {
                strArr = new String[1];
                strArr[i] = str;
            }
            if (z) {
                for (zzciz zzcizVar : zzcjaVarZzB) {
                    if (zzcizVar.zza == zzchuVar && str.equals(zzcizVar.zzd())) {
                        zzcizVarZzb = zzcizVar;
                        break;
                    }
                }
            } else {
                zzcizVarZzb = zzcjaVarZzB.zzb(zzchuVar);
            }
            if (zzcizVarZzb != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache task is already running.");
                return;
            }
            if (zzchuVar.zzk() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = Integer.valueOf(i);
            }
            if (numZzb != null) {
                zzchuVar.zzo(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzchuVar.zzA(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzchuVar.zzB(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzcir zzcirVar = zzchuVar.zzk().zzb;
            if (iIntValue > 0) {
                int i3 = zzchtVar.zzg;
                int iZzQ = zzchl.zzQ();
                if (iZzQ < i3) {
                    zzcjkVar = new zzcjq(zzchuVar, zzchtVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzs)).booleanValue()) {
                        iZzQ = zzcjn.zzr();
                    }
                    zzcjkVar = iZzQ < zzchtVar.zzb ? new zzcjn(zzchuVar, zzchtVar) : new zzcjl(zzchuVar);
                }
            } else {
                zzcjkVar = new zzcjk(zzchuVar);
            }
            new zzciz(zzchuVar, zzcjkVar, str, strArr).zzb();
        } else {
            zzciz zzcizVarZzb2 = zzcjaVarZzB.zzb(zzchuVar);
            if (zzcizVarZzb2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Precache must specify a source.");
                return;
            }
            zzcjkVar = zzcizVarZzb2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcjkVar.zzi(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcjkVar.zzh(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcjkVar.zzj(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcjkVar.zzk(numZzb8.intValue());
        }
    }
}
