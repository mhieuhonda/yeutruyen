package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzega {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcnq zzb;
    private final Context zzc;
    private final VersionInfoParcel zzd;
    private final zzflg zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfqq zzi;
    private final zzdzo zzj;
    private final zzfsm zzk;
    private final zzdgd zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzcbs zzq;

    zzega(zzcnq zzcnqVar, Context context, VersionInfoParcel versionInfoParcel, zzflg zzflgVar, Executor executor, String str, zzfqq zzfqqVar, zzdzo zzdzoVar, zzcbs zzcbsVar, zzeiv zzeivVar, ScheduledExecutorService scheduledExecutorService, zzfsm zzfsmVar, zzdgd zzdgdVar) {
        this.zzb = zzcnqVar;
        this.zzc = context;
        this.zzd = versionInfoParcel;
        this.zze = zzflgVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfqqVar;
        zzcnqVar.zzB();
        this.zzj = zzdzoVar;
        this.zzq = zzcbsVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfsmVar;
        this.zzl = zzdgdVar;
    }

    private final ListenableFuture zzg(String str, final String str2) {
        ListenableFuture listenableFutureZza;
        String str3;
        String str4 = "";
        if (TextUtils.isEmpty(str)) {
            return zzhcf.zzc(new zzepp(15, "Invalid ad string."));
        }
        Context context = this.zzc;
        zzfqg zzfqgVarZzn = zzfqg.zzn(context, 11);
        zzfqgVarZzn.zza();
        zzbup zzbupVarZzb = com.google.android.gms.ads.internal.zzt.zzr().zzb(context, this.zzd, this.zzb.zzx());
        zzbuj zzbujVar = zzbum.zza;
        final zzbuf zzbufVarZza = zzbupVarZzb.zza("google.afma.response.normalize", zzbujVar, zzbujVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzii)).booleanValue()) {
            try {
                str3 = str;
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    this.zzn = jSONObject.optString("fetch_url", "");
                    this.zzo = com.google.android.gms.ads.internal.util.zzbp.zza(new JSONObject(jSONObject.optString("settings", "")).getJSONArray("nofill_urls"), null);
                } catch (JSONException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Invalid ad response.");
                }
            } catch (JSONException unused2) {
                str3 = str;
            }
            String string = this.zzn;
            final List list = this.zzo;
            if (TextUtils.isEmpty(string)) {
                listenableFutureZza = zzhcf.zza(str3);
                this.zzj.zzd("sst", "1");
            } else {
                this.zzj.zzd("sst", ExifInterface.GPS_MEASUREMENT_2D);
                String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzik);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzij)).booleanValue()) {
                    List listZzg = zzgug.zzb(zza).zzg(string);
                    if (listZzg.size() < 2) {
                        listenableFutureZza = zzhcf.zzc(new zzepp(1, "Invalid fetch URL."));
                    } else {
                        str4 = (String) listZzg.get(1);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        string = Uri.parse(string).buildUpon().query(null).build().toString();
                        final zzeis zzeisVar = new zzeis(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                        listenableFutureZza = (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzi(zzhbx.zzw(zzcfy.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefx
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzd(zzeisVar);
                            }
                        })), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzil)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefy
                            @Override // com.google.android.gms.internal.ads.zzhbn
                            public final /* synthetic */ ListenableFuture zza(Object obj) {
                                return this.zza.zze(list, (Exception) obj);
                            }
                        }, this.zzf);
                    }
                } else {
                    final zzeis zzeisVar2 = new zzeis(string, 60000, new HashMap(), str4.getBytes(StandardCharsets.UTF_8), str5, false);
                    listenableFutureZza = (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzi(zzhbx.zzw(zzcfy.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzefx
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzd(zzeisVar2);
                        }
                    })), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzil)).intValue(), TimeUnit.MILLISECONDS, this.zzg), Exception.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefy
                        @Override // com.google.android.gms.internal.ads.zzhbn
                        public final /* synthetic */ ListenableFuture zza(Object obj) {
                            return this.zza.zze(list, (Exception) obj);
                        }
                    }, this.zzf);
                }
            }
        } else {
            listenableFutureZza = zzhcf.zza(str);
            this.zzj.zzd("sst", "1");
        }
        zzhbn zzhbnVar = new zzhbn(this) { // from class: com.google.android.gms.internal.ads.zzefz
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) throws JSONException {
                String str6 = (String) obj;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                String str7 = str2;
                try {
                    jSONObject4.put("headers", new JSONObject());
                    jSONObject4.put("body", str6);
                    jSONObject3.put("base_url", "");
                    jSONObject3.put("signals", new JSONObject(str7));
                    jSONObject2.put("request", jSONObject3);
                    jSONObject2.put("response", jSONObject4);
                    jSONObject2.put("flags", new JSONObject());
                    return zzhcf.zza(jSONObject2);
                } catch (JSONException e) {
                    String strValueOf = String.valueOf(e.getCause());
                    String.valueOf(strValueOf);
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(strValueOf)));
                }
            }
        };
        Executor executor = this.zzf;
        ListenableFuture listenableFutureZzj = zzhcf.zzj(zzhcf.zzj(zzhcf.zzj(listenableFutureZza, zzhbnVar, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefv
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbufVarZza, (JSONObject) obj);
            }
        }, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((JSONObject) obj);
            }
        }, executor);
        zzfqp.zzd(listenableFutureZzj, this.zzi, zzfqgVarZzn);
        zzhcf.zzr(listenableFutureZzj, new zzefu(this), zzcfy.zzh);
        return listenableFutureZzj;
    }

    private final void zzh(zzdzc zzdzcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzin)).booleanValue()) {
            this.zzj.zzf(zzdzcVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && EnvironmentCompat.MEDIA_UNKNOWN.equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String strConcat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x022f A[Catch: all -> 0x0242, TryCatch #2 {, blocks: (B:21:0x007c, B:23:0x009a, B:25:0x00a2, B:27:0x00af, B:29:0x00c9, B:31:0x00f6, B:34:0x0101, B:36:0x0109, B:38:0x010f, B:42:0x0118, B:49:0x014e, B:45:0x012c, B:48:0x0139, B:52:0x0154, B:30:0x00e0, B:53:0x0168, B:60:0x0185, B:63:0x018d, B:67:0x01b2, B:69:0x01c7, B:73:0x01eb, B:75:0x0200, B:78:0x0214, B:80:0x021a, B:81:0x0227, B:83:0x0229, B:86:0x0232, B:85:0x022f, B:74:0x01f5, B:70:0x01da, B:66:0x019b, B:57:0x0175, B:58:0x017a), top: B:114:0x007c, inners: #0, #5 }] */
    public final ListenableFuture zza() {
        String strOptString;
        int i;
        List listAsList;
        String string;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            this.zzp = this.zze.zzt;
            this.zzj.zzf(zzdzc.SCAR_PRELOADER_READY.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        String strZzb = this.zze.zzd.zzx;
        if (!TextUtils.isEmpty(strZzb)) {
            String strZzj = zzj(strZzb);
            zzbio zzbioVar = zzbix.zzie;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() && strZzj.isEmpty()) {
                int iLastIndexOf = strZzb.lastIndexOf("&request_id=");
                strZzj = iLastIndexOf != -1 ? strZzb.substring(iLastIndexOf + 12) : "";
            }
            if (TextUtils.isEmpty(strZzj)) {
                return zzhcf.zzc(new zzepp(15, "Invalid ad string."));
            }
            synchronized (this.zzm) {
                com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVarZzt = this.zzb.zzt();
                zzdzo zzdzoVar = this.zzj;
                String strZzb2 = zzqVarZzt.zzb(strZzj, zzdzoVar);
                String str = null;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() && !TextUtils.isEmpty(strZzb2)) {
                    try {
                        JSONObject jSONObjectOptJSONObject = new JSONObject(strZzb2).optJSONObject("extras");
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString2 = jSONObjectOptJSONObject.optString("query_info_type", "");
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzig)).booleanValue()) {
                                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzih)).split(","));
                            } else {
                                listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzif)).split(","));
                            }
                            if (listAsList.contains(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(strOptString2))) {
                                int iLastIndexOf2 = strZzb.lastIndexOf("&");
                                String strSubstring = iLastIndexOf2 != -1 ? strZzb.substring(0, iLastIndexOf2) : null;
                                if (!TextUtils.isEmpty(strSubstring)) {
                                    try {
                                        byte[] bArrDecode = Base64.decode(strSubstring, 11);
                                        byte[] bytes = strZzj.getBytes(StandardCharsets.UTF_8);
                                        if (TextUtils.isEmpty(strZzb2)) {
                                            string = null;
                                        } else {
                                            try {
                                                string = new JSONObject(strZzb2).getString("arek");
                                            } catch (JSONException e) {
                                                com.google.android.gms.ads.internal.util.zze.zza("Failed to get key from QueryJSONMap".concat(e.toString()));
                                                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CryptoUtils.getKeyFromQueryJsonMap");
                                                string = null;
                                            }
                                        }
                                        strZzb = zzflw.zzb(bArrDecode, bytes, string, zzdzoVar);
                                    } catch (IllegalArgumentException e2) {
                                        com.google.android.gms.ads.internal.util.zze.zza("Failed to decode the adResponse. ".concat(e2.toString()));
                                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "PreloadedLoader.decryptAdResponseIfNecessary");
                                    }
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
                if (TextUtils.isEmpty(strZzb)) {
                    strOptString = "";
                } else {
                    try {
                        strOptString = new JSONObject(strZzb).optString("render_id", "");
                    } catch (JSONException unused2) {
                        strOptString = "";
                    }
                }
                if (TextUtils.isEmpty(strOptString)) {
                    i = 0;
                } else {
                    String str2 = "";
                    try {
                        str2 = new String(Base64.decode(strOptString, 0), StandardCharsets.UTF_8);
                    } catch (IllegalArgumentException e3) {
                        String.valueOf(strOptString);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but not base64 encoded: ".concat(String.valueOf(strOptString)));
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "PreloadedLoader.decodeRenderId");
                    }
                    List listZzg = zzgug.zza(zzgtf.zzd(':')).zzg(str2);
                    if (listZzg.size() == 2) {
                        str = (String) listZzg.get(0);
                        i = Integer.parseInt((String) listZzg.get(1));
                    } else {
                        String.valueOf(strOptString);
                        com.google.android.gms.ads.internal.util.zze.zza("Ad grouping: Has render_id, but invalid format: ".concat(String.valueOf(strOptString)));
                        i = 0;
                    }
                }
                Pair pair = str != null ? new Pair(str, Integer.valueOf(i)) : new Pair("", 0);
                String str3 = (String) pair.first;
                int iIntValue = ((Integer) pair.second).intValue();
                if (TextUtils.isEmpty(str3) || iIntValue <= 0) {
                    zzqVarZzt.zzc(strZzj);
                } else {
                    if (zzqVarZzt.zzd(strZzj, str3)) {
                        return zzhcf.zzc(new zzepp(10, "The ad has already been shown."));
                    }
                    if (!zzqVarZzt.zze(strZzj, str3, iIntValue)) {
                        zzqVarZzt.zzc(strZzj);
                    }
                }
                if (!TextUtils.isEmpty(strZzb2)) {
                    return zzg(strZzb, zzi(strZzb2));
                }
            }
        }
        com.google.android.gms.ads.internal.client.zzc zzcVar = this.zze.zzd.zzs;
        if (zzcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhW)).booleanValue()) {
                String str4 = zzcVar.zza;
                String str5 = zzcVar.zzb;
                String strZzj2 = zzj(str4);
                String strZzj3 = zzj(str5);
                if (TextUtils.isEmpty(strZzj3) || !strZzj2.equals(strZzj3)) {
                    this.zzj.zzc().put("ridmm", "true");
                } else {
                    this.zzb.zzt().zzc(strZzj2);
                    this.zzj.zzc().put("request_id", strZzj2);
                }
            }
            return zzg(zzcVar.zza, zzi(zzcVar.zzb));
        }
        return zzhcf.zzc(new zzepp(14, "Mismatch request IDs."));
    }

    final /* synthetic */ ListenableFuture zzb(zzbuf zzbufVar, JSONObject jSONObject) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcU)).booleanValue()) {
            this.zzj.zzf(zzdzc.SCAR_PRELOADER_PROCESSING_DONE.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        return zzbufVar.zzb(jSONObject);
    }

    final /* synthetic */ ListenableFuture zzc(JSONObject jSONObject) {
        zzfkv zzfkvVar = new zzfkv(this.zze);
        String string = jSONObject.toString();
        return zzhcf.zza(new zzfky(zzfkvVar, zzfkx.zza(new StringReader(string), this.zzp)));
    }

    final /* synthetic */ String zzd(zzeis zzeisVar) throws zzepp {
        zzh(zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzim)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i2);
                    throw new zzepp(1, sb.toString());
                }
                zzeit zzeitVarZzb = new zzeiu(this.zzc, this.zzd.afmaVersion, this.zzq, Binder.getCallingUid(), null).zza(zzeisVar);
                zzeit zzeitVar = zzeitVarZzb;
                int i3 = zzeitVarZzb.zza;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzin)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i));
                }
                if (i3 == 200) {
                    zzh(zzdzc.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzeitVarZzb.zzc;
                }
                i++;
                i2 = i3;
            } catch (Exception e) {
                throw new zzepp(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    final /* synthetic */ ListenableFuture zze(List list, Exception exc) {
        zzepp zzeppVar;
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzeppVar = new zzepp(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzepp) {
            zzeppVar = (zzepp) exc;
        } else {
            zzeppVar = new zzepp(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzeppVar.getMessage() == null ? "" : zzeppVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List listZzg = zzgug.zza(zzgtf.zzd(':')).zzg(message);
                    if (listZzg.size() == 2) {
                        message = (String) listZzg.get(1);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfsi.zzd(zzfsi.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzhcf.zzc(zzeppVar);
    }

    final /* synthetic */ zzdgd zzf() {
        return this.zzl;
    }
}
