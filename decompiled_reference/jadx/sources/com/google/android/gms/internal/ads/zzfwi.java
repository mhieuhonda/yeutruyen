package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzfwi {
    private final String zza;
    private zzfxk zzb;
    private long zzc;
    private int zzd;

    public zzfwi(String str) {
        zzp();
        this.zza = str;
        this.zzb = new zzfxk(null);
    }

    public void zza() {
    }

    public void zzb() {
        this.zzb.clear();
    }

    final void zzc(WebView webView) {
        this.zzb = new zzfxk(webView);
    }

    public final WebView zzd() {
        return (WebView) this.zzb.get();
    }

    public final boolean zze() {
        return this.zzb.get() != null;
    }

    public final void zzf(boolean z) {
        if (zze()) {
            zzfvz.zza().zzf(zzd(), this.zza, true != z ? "backgrounded" : "foregrounded");
        }
    }

    public final void zzg(boolean z) {
        if (zze()) {
            zzfvz.zza().zzg(zzd(), this.zza, true != z ? "unlocked" : "locked");
        }
    }

    public final void zzh(String str, long j) {
        if (j >= this.zzc) {
            this.zzd = 2;
            zzfvz.zza().zze(zzd(), this.zza, str);
        }
    }

    public final void zzi(String str, long j) {
        if (j < this.zzc || this.zzd == 3) {
            return;
        }
        this.zzd = 3;
        zzfvz.zza().zze(zzd(), this.zza, str);
    }

    public final void zzj(zzfuv zzfuvVar) {
        zzfvz.zza().zzb(zzd(), this.zza, zzfuvVar.zzb());
    }

    public void zzk(zzfuy zzfuyVar, zzfuw zzfuwVar) {
        zzl(zzfuyVar, zzfuwVar, null);
    }

    protected final void zzl(zzfuy zzfuyVar, zzfuw zzfuwVar, JSONObject jSONObject) {
        String strZzh = zzfuyVar.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfwo.zzc(jSONObject2, "environment", "app");
        zzfwo.zzc(jSONObject2, "adSessionType", zzfuwVar.zzi());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        zzfwo.zzc(jSONObject3, "deviceType", sb.toString());
        zzfwo.zzc(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfwo.zzc(jSONObject3, "os", "Android");
        zzfwo.zzc(jSONObject2, "deviceInfo", jSONObject3);
        zzfwo.zzc(jSONObject2, "deviceCategory", zzfwn.zzb().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfwo.zzc(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfwo.zzc(jSONObject4, "partnerName", zzfuwVar.zzc().zzb());
        zzfwo.zzc(jSONObject4, "partnerVersion", zzfuwVar.zzc().zzc());
        zzfwo.zzc(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfwo.zzc(jSONObject5, "libraryVersion", "1.5.2-google_20241009");
        zzfwo.zzc(jSONObject5, "appId", zzfvx.zza().zzb().getApplicationContext().getPackageName());
        zzfwo.zzc(jSONObject2, "app", jSONObject5);
        if (zzfuwVar.zzg() != null) {
            zzfwo.zzc(jSONObject2, "contentUrl", zzfuwVar.zzg());
        }
        if (zzfuwVar.zzh() != null) {
            zzfwo.zzc(jSONObject2, "customReferenceData", zzfuwVar.zzh());
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfuwVar.zzd().iterator();
        if (it.hasNext()) {
            throw null;
        }
        zzfvz.zza().zzc(zzd(), strZzh, jSONObject2, jSONObject6, jSONObject);
    }

    public final void zzm() {
        zzfvz.zza().zzd(zzd(), this.zza);
    }

    public final void zzn(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        zzfwo.zzc(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        zzfvz.zza().zzi(zzd(), jSONObject);
    }

    public final void zzo(float f) {
        zzfvz.zza().zzh(zzd(), this.zza, f);
    }

    public final void zzp() {
        this.zzc = System.nanoTime();
        this.zzd = 1;
    }
}
