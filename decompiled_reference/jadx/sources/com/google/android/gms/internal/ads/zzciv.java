package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.tekartik.sqflite.Constant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzciv implements zzbpx {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zza();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzE(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                String string = sb.toString();
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length + 30 + String.valueOf(str2).length() + 6 + String.valueOf(i).length() + 1);
            sb2.append("Parse pixels for ");
            sb2.append(str);
            sb2.append(", got string ");
            sb2.append(str2);
            sb2.append(", int ");
            sb2.append(i);
            sb2.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        return i;
    }

    private static void zzc(zzchi zzchiVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzchiVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String str6 = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(str6);
                return;
            }
        }
        if (str2 != null) {
            zzchiVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzchiVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzchiVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzchiVar.zzB(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        Integer numValueOf;
        int i;
        zzchu zzchuVar = (zzchu) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZza = zzchuVar.zzdm() != null ? zzchuVar.zzdm().zza() : null;
        if (numValueOf2 != null && numZza != null && !numValueOf2.equals(numZza) && !str.equals("load")) {
            String str2 = String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", numValueOf2, numZza);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh(str2);
            return;
        }
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String string = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(string).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(string);
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb.toString());
        }
        if (str.equals("background")) {
            String str3 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchuVar.setBackgroundColor(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str4 = (String) map.get(TypedValues.Custom.S_COLOR);
            if (TextUtils.isEmpty(str4)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchuVar.zzv(Color.parseColor(str4));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i4 = 0;
        if (str.equals("decoderProps")) {
            String str5 = (String) map.get("mimeTypes");
            if (str5 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put(Constant.PARAM_ERROR, "missingMimeTypes");
                zzchuVar.zze("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str5.split(",");
            int length = strArrSplit.length;
            while (i4 < length) {
                String str6 = strArrSplit[i4];
                map3.put(str6, com.google.android.gms.ads.internal.util.zzch.zza(str6.trim()));
                i4++;
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            zzchuVar.zze("onVideoEvent", map4);
            return;
        }
        zzchj zzchjVarZzdm = zzchuVar.zzdm();
        if (zzchjVarZzdm == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzchuVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbio zzbioVar = zzbix.zzeT;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzchuVar.zzy() : Math.min(iZzb3, zzchuVar.zzy());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzy = zzchuVar.zzy();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb3).length() + 72 + String.valueOf(iZzy).length() + 4 + String.valueOf(iZzb).length() + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(iZzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(iZzy);
                    sb2.append(", x ");
                    sb2.append(iZzb);
                    sb2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                }
                iMin = Math.min(iZzb3, zzchuVar.zzy() - iZzb);
            }
            int i5 = iMin;
            int iZzb4 = zzb(context, map, "h", -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzchuVar.zzx() : Math.min(iZzb4, zzchuVar.zzx());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    int iZzx = zzchuVar.zzx();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(iZzb4).length() + 75 + String.valueOf(iZzx).length() + 4 + String.valueOf(iZzb2).length() + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(iZzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(iZzx);
                    sb3.append(", y ");
                    sb3.append(iZzb2);
                    sb3.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                }
                iMin2 = Math.min(iZzb4, zzchuVar.zzx() - iZzb2);
            }
            int i6 = iMin2;
            try {
                i4 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i7 = i4;
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzchjVarZzdm.zzd() != null) {
                zzchjVarZzdm.zzb(iZzb, iZzb2, i5, i6);
                return;
            }
            zzchjVarZzdm.zzc(iZzb, iZzb2, i5, i6, i7, z, new zzcht((String) map.get("flags")));
            zzchi zzchiVarZzd = zzchjVarZzdm.zzd();
            if (zzchiVarZzd != null) {
                zzc(zzchiVarZzd, map);
                return;
            }
            return;
        }
        zzcmh zzcmhVarZzh = zzchuVar.zzh();
        if (zzcmhVarZzh != null) {
            if (str.equals("timeupdate")) {
                String str7 = (String) map.get("currentTime");
                if (str7 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcmhVarZzh.zzd(Float.parseFloat(str7));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str7));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcmhVarZzh.zzr();
                return;
            }
        }
        zzchi zzchiVarZzd2 = zzchjVarZzdm.zzd();
        if (zzchiVarZzd2 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzchuVar.zze("onVideoEvent", map5);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzchuVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzchiVarZzd2.zzC(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str8 = (String) map.get("time");
            if (str8 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzchiVarZzd2.zzt((int) (Float.parseFloat(str8) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse time parameter from currentTime video GMSG: ".concat(str8));
                return;
            }
        }
        if (str.equals("hide")) {
            zzchiVarZzd2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzchiVarZzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzchiVarZzd2.zzq(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzchiVarZzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzchiVarZzd2.zzu();
                return;
            } else {
                zzchiVarZzd2.zzv();
                return;
            }
        }
        if (str.equals("pause")) {
            zzchiVarZzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzchiVarZzd2.zzs();
            return;
        }
        if (str.equals("show")) {
            zzchiVarZzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzchuVar.getContext();
                zzchiVarZzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzchuVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzchiVarZzd2.zzD();
                    return;
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str9 = (String) map.get("volume");
            if (str9 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzchiVarZzd2.zzw(Float.parseFloat(str9));
                return;
            } catch (NumberFormatException unused6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse volume parameter from volume video GMSG: ".concat(str9));
                return;
            }
        }
        String str10 = (String) map.get("src");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcR)).booleanValue() && TextUtils.isEmpty(str10)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i = 1;
            } catch (NumberFormatException unused7) {
                String str11 = (String) map.get("periodicReportIntervalMs");
                String.valueOf(str11);
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf(str11)));
                i = 1;
                numValueOf = null;
            }
        } else {
            i = 1;
            numValueOf = null;
        }
        String[] strArr = new String[i];
        strArr[0] = str10;
        String str12 = (String) map.get("demuxed");
        if (str12 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str12);
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                    String string2 = jSONArray.getString(i8);
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcR)).booleanValue() || !TextUtils.isEmpty(string2)) {
                        arrayList.add(string2);
                    }
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcR)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str12.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str12);
                    com.google.android.gms.ads.internal.util.client.zzo.zzi(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Malformed demuxed URL list for playback: ".concat(str12));
                strArr = new String[]{str10};
            }
        }
        if (numValueOf != null) {
            zzchuVar.zzo(numValueOf.intValue());
        }
        zzchiVarZzd2.zzo(str10, strArr);
    }
}
