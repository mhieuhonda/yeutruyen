package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtk {
    private final Context zza;
    private final zzdsq zzb;
    private final zzbaw zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbhw zzf;
    private final Executor zzg;
    private final zzbma zzh;
    private final zzduc zzi;
    private final zzdwq zzj;
    private final ScheduledExecutorService zzk;
    private final zzdvl zzl;
    private final zzdzt zzm;
    private final zzfsm zzn;
    private final zzeko zzo;
    private final zzekz zzp;
    private final zzflk zzq;
    private final zzdzo zzr;
    private final zzeaw zzs;

    public zzdtk(Context context, zzdsq zzdsqVar, zzbaw zzbawVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbhw zzbhwVar, Executor executor, zzflg zzflgVar, zzduc zzducVar, zzdwq zzdwqVar, ScheduledExecutorService scheduledExecutorService, zzdzt zzdztVar, zzfsm zzfsmVar, zzeko zzekoVar, zzdvl zzdvlVar, zzekz zzekzVar, zzflk zzflkVar, zzdzo zzdzoVar, zzeaw zzeawVar) {
        this.zza = context;
        this.zzb = zzdsqVar;
        this.zzc = zzbawVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbhwVar;
        this.zzg = executor;
        this.zzh = zzflgVar.zzj;
        this.zzi = zzducVar;
        this.zzj = zzdwqVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdztVar;
        this.zzn = zzfsmVar;
        this.zzo = zzekoVar;
        this.zzl = zzdvlVar;
        this.zzp = zzekzVar;
        this.zzq = zzflkVar;
        this.zzr = zzdzoVar;
        this.zzs = zzeawVar;
    }

    public static final com.google.android.gms.ads.internal.client.zzew zzk(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzs(jSONObjectOptJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mute");
        if (jSONObjectOptJSONObject == null) {
            return zzgwt.zzi();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgwt.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzew zzewVarZzs = zzs(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzewVarZzs != null) {
                arrayList.add(zzewVarZzs);
            }
        }
        return zzgwt.zzq(arrayList);
    }

    private final ListenableFuture zzm(JSONArray jSONArray, boolean z, boolean z2, zzdzc zzdzcVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzhcf.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzcVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzhcf.zzk(zzhcf.zzm(arrayList), zzdtj.zza, this.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    private final ListenableFuture zzn(JSONObject jSONObject, boolean z, zzdzc zzdzcVar) {
        HashMap map;
        if (jSONObject == null) {
            return zzhcf.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeX)).booleanValue()) {
            if (jSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeY))) {
                HashMap map2 = new HashMap();
                for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeZ)).split(",")) {
                    try {
                        map2.put(str, jSONObject.getString(str));
                    } catch (JSONException unused) {
                    }
                }
                map = map2;
            } else {
                map = null;
            }
        } else {
            map = null;
        }
        final String strOptString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(strOptString) && map == null) {
            return zzhcf.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue() && zzdzcVar != null) {
            this.zzr.zzf(zzdzcVar.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z || map != null) {
            return zzhcf.zza(new zzblw(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, map));
        }
        return zzq("NativeAssetsLoader.loadImage", jSONObject.optBoolean("require"), zzhcf.zzk(this.zzb.zza(strOptString, dOptDouble, zOptBoolean), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdsz
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new zzblw(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2, null);
            }
        }, this.zzg), null);
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfkn zzfknVar, zzfkq zzfkqVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar) {
        final ListenableFuture listenableFutureZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfknVar, zzfkqVar, zzr(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), zzbVar, zzcduVar);
        return zzhcf.zzj(listenableFutureZzb, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdte
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzepp {
                zzclb zzclbVar = (zzclb) obj;
                if (zzclbVar == null || zzclbVar.zzh() == null) {
                    throw new zzepp(1, "Retrieve video view in html5 ad response failed.");
                }
                return listenableFutureZzb;
            }
        }, zzcfy.zzh);
    }

    private final ListenableFuture zzq(String str, boolean z, final ListenableFuture listenableFuture, Object obj) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzda)).booleanValue()) {
            zzcgb.zza(listenableFuture, str, this.zzg);
        }
        if (z) {
            return zzhcf.zzj(listenableFuture, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtg
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ ListenableFuture zza(Object obj2) {
                    return obj2 != null ? listenableFuture : zzhcf.zzc(new zzepp(1, "Retrieve required value in native ad response failed."));
                }
            }, zzcfy.zzh);
        }
        final Object obj2 = null;
        return zzhcf.zzh(listenableFuture, Exception.class, new zzhbn(obj2) { // from class: com.google.android.gms.internal.ads.zzdtf
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzhcf.zza(null);
            }
        }, zzcfy.zzh);
    }

    private static final com.google.android.gms.ads.internal.client.zzew zzs(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzew(strOptString, strOptString2);
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str, zzdzc zzdzcVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdzcVar);
    }

    public final ListenableFuture zzb(JSONObject jSONObject, String str, zzdzc zzdzcVar) {
        zzbma zzbmaVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbmaVar.zzb, zzbmaVar.zzd, zzdzcVar);
    }

    public final ListenableFuture zzc(JSONObject jSONObject, String str, final zzfkn zzfknVar, final zzfkq zzfkqVar, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdu zzcduVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlG)).booleanValue()) {
            return zzhcf.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzhcf.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzhcf.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeX)).booleanValue()) {
            if (jSONObjectOptJSONObject.has((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeY))) {
                return zzhcf.zza(null);
            }
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzr zzrVarZzr = zzr(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzhcf.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzc.NATIVE_ASSETS_LOADING_IMAGE_COMPOSITION_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        final ListenableFuture listenableFutureZzj = zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdta
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzh(zzrVarZzr, zzfknVar, zzfkqVar, zzbVar, zzcduVar, strOptString, strOptString2, obj);
            }
        }, zzcfy.zzf);
        ListenableFuture listenableFutureZzj2 = zzhcf.zzj(listenableFutureZzj, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtb
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) throws zzepp {
                if (((zzclb) obj) != null) {
                    return listenableFutureZzj;
                }
                throw new zzepp(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzcfy.zzh);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzda)).booleanValue()) {
            zzcgb.zza(listenableFutureZzj2, "NativeAssetsLoader.loadImageHtml", this.zzg);
        }
        return listenableFutureZzj2;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str, zzdzc zzdzcVar) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzhcf.zza(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzq("NativeAssetsLoader.loadAttributionInfo", jSONObjectOptJSONObject.optBoolean("require"), zzhcf.zzk(zzm(jSONArrayOptJSONArray, false, true, zzdzcVar), new zzgti() { // from class: com.google.android.gms.internal.ads.zzdtc
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzi(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, final com.google.android.gms.ads.internal.zzb zzbVar, final zzcdu zzcduVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzhcf.zza(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        if (jSONObjectOptJSONObject == null) {
            return zzhcf.zza(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(strOptString)) {
            return zzhcf.zza(null);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzc.NATIVE_ASSETS_LOADING_OMID_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        ListenableFuture listenableFutureZzj = zzhcf.zzj(zzhcf.zza(null), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzdtd
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(strOptString, zzcduVar, zzbVar, obj);
            }
        }, zzcfy.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzda)).booleanValue()) {
            zzcgb.zza(listenableFutureZzj, "NativeAssetsLoader.omidWebView", this.zzg);
        }
        return listenableFutureZzj;
    }

    public final ListenableFuture zzf(ListenableFuture listenableFuture) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzcZ)).booleanValue()) {
            this.zzr.zzf(zzdzc.NATIVE_ASSETS_LOADING_MEDIA_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        zzcgd zzcgdVar = new zzcgd();
        zzhcf.zzr(listenableFuture, new zzdsy(this, zzcgdVar), zzcfy.zzf);
        return zzcgdVar;
    }

    public final ListenableFuture zzg(JSONObject jSONObject, zzfkn zzfknVar, zzfkq zzfkqVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar) {
        zzdtk zzdtkVar;
        ListenableFuture listenableFutureZza;
        JSONObject jSONObjectZzi = com.google.android.gms.ads.internal.util.zzbp.zzi(jSONObject, "html_containers", "instream");
        if (jSONObjectZzi != null) {
            return zzp(jSONObjectZzi, zzfknVar, zzfkqVar, zzbVar, zzcduVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzhcf.zza(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzlF)).booleanValue() && jSONObjectOptJSONObject.has("html");
        if (TextUtils.isEmpty(strOptString) && !z) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Required field 'vast_xml' or 'html' is missing");
            return zzhcf.zza(null);
        }
        if (z) {
            zzdtkVar = this;
            listenableFutureZza = zzdtkVar.zzp(jSONObjectOptJSONObject, zzfknVar, zzfkqVar, zzbVar, zzcduVar);
        } else {
            zzdtkVar = this;
            listenableFutureZza = zzdtkVar.zzi.zza(jSONObjectOptJSONObject, zzbVar, zzcduVar);
        }
        return zzq(true != z ? "NativeAssetsLoader.loadVideoView" : "NativeAssetsLoader.loadVideoHtml", false, zzhcf.zzi(listenableFutureZza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzeP)).intValue(), TimeUnit.SECONDS, zzdtkVar.zzk), null);
    }

    final /* synthetic */ ListenableFuture zzh(com.google.android.gms.ads.internal.client.zzr zzrVar, zzfkn zzfknVar, zzfkq zzfkqVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdu zzcduVar, String str, String str2, Object obj) throws zzclq {
        zzeaw zzeawVar;
        zzclb zzclbVarZza = this.zzj.zza(zzrVar, zzfknVar, zzfkqVar);
        final zzcgc zzcgcVarZza = zzcgc.zza(zzclbVarZza);
        zzdvi zzdviVarZza = this.zzl.zza();
        zzcmz zzcmzVarZzP = zzclbVarZza.zzP();
        zzbio zzbioVar = zzbix.zzpr;
        zzcmzVarZzP.zzab(zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, zzdviVarZza, false, null, !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() ? new com.google.android.gms.ads.internal.zzb(this.zza, null, null) : zzbVar, null, true != ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbioVar)).booleanValue() ? null : zzcduVar, this.zzo, this.zzn, this.zzm, null, zzdviVarZza, null, null, null, null, null, null, null);
        zzclbVarZza.zzab("/getNativeAdViewSignals", zzbpw.zzs);
        zzclbVarZza.zzab("/getNativeClickMeta", zzbpw.zzt);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziQ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziS)).booleanValue() && (zzeawVar = this.zzs) != null) {
                zzclbVarZza.zzab("/onDeviceStorageEvent", new zzbqf(zzeawVar));
            }
        }
        zzclbVarZza.zzP().zzS(true);
        zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdti
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzcgc zzcgcVar = zzcgcVarZza;
                if (z) {
                    zzcgcVar.zzb();
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                sb.append("Image Web View failed to load. Error code: ");
                sb.append(i);
                sb.append(", Description: ");
                sb.append(str3);
                sb.append(", Failing URL: ");
                sb.append(str4);
                zzcgcVar.zzd(new zzepp(1, sb.toString()));
            }
        });
        zzclbVarZza.zzau(str, str2, null);
        return zzcgcVarZza;
    }

    final /* synthetic */ zzblt zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString("text");
        Integer numZzo = zzo(jSONObject, "bg_color");
        Integer numZzo2 = zzo(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzblt(strOptString, list, numZzo, numZzo2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    final /* synthetic */ ListenableFuture zzj(String str, zzcdu zzcduVar, com.google.android.gms.ads.internal.zzb zzbVar, Object obj) throws zzclq {
        com.google.android.gms.ads.internal.zzt.zzd();
        Context context = this.zza;
        zzekz zzekzVar = this.zzp;
        zzclb zzclbVarZza = zzclr.zza(context, zzcnl.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzekzVar, this.zzq, this.zzm);
        final zzcgc zzcgcVarZza = zzcgc.zza(zzclbVarZza);
        zzclbVarZza.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdth
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z, int i, String str2, String str3) {
                zzcgcVarZza.zzb();
            }
        });
        zzclbVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzpr)).booleanValue()) {
            if (zzcduVar != null) {
                zzclbVarZza.zzP().zzj(zzcduVar);
            }
            zzclbVarZza.zzP().zzi(zzbVar);
        }
        return zzcgcVarZza;
    }

    private final com.google.android.gms.ads.internal.client.zzr zzr(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzr.zzb();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzr(this.zza, new AdSize(i, i2));
    }
}
