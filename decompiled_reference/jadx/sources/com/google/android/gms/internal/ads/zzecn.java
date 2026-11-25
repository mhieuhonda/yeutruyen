package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.tekartik.sqflite.Constant;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzecn implements zzddc, zzdgf, zzder {
    private final zzecz zza;
    private final String zzb;
    private final String zzc;
    private zzdcs zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzecm zze = zzecm.AD_REQUESTED;

    zzecn(zzecz zzeczVar, zzflg zzflgVar, String str) {
        this.zza = zzeczVar;
        this.zzc = str;
        this.zzb = zzflgVar.zzg;
    }

    private final JSONObject zzh(zzdcs zzdcsVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdcsVar.zze());
        jSONObject.put("responseSecsSinceEpoch", zzdcsVar.zzc());
        jSONObject.put("responseId", zzdcsVar.zzf());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkM)).booleanValue()) {
            String strZzd = zzdcsVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                String.valueOf(strZzd);
                String strValueOf = String.valueOf(strZzd);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkP)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzdcsVar.zzg()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkN)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzvVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.zzc;
            jSONObject2.put(Constant.PARAM_ERROR, zzeVar == null ? null : zzi(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzi(zzeVar2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzder
    public final void zza(zzcya zzcyaVar) {
        zzecz zzeczVar = this.zza;
        if (zzeczVar.zzs()) {
            this.zzf = zzcyaVar.zzn();
            this.zze = zzecm.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkT)).booleanValue()) {
                zzeczVar.zzk(this.zzb, this);
            }
        }
    }

    public final boolean zzc() {
        return this.zze != zzecm.AD_REQUESTED;
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzecz zzeczVar = this.zza;
        if (zzeczVar.zzs()) {
            this.zze = zzecm.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkT)).booleanValue()) {
                zzeczVar.zzk(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkT)).booleanValue()) {
            return;
        }
        zzecz zzeczVar = this.zza;
        if (zzeczVar.zzs()) {
            zzeczVar.zzk(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) {
        zzecz zzeczVar = this.zza;
        if (zzeczVar.zzs()) {
            zzfkx zzfkxVar = zzfkyVar.zzb;
            List list = zzfkxVar.zza;
            if (!list.isEmpty()) {
                this.zzd = ((zzfkn) list.get(0)).zzb;
            }
            zzfkq zzfkqVar = zzfkxVar.zzb;
            String str = zzfkqVar.zzl;
            if (!TextUtils.isEmpty(str)) {
                this.zzh = str;
            }
            String str2 = zzfkqVar.zzm;
            if (!TextUtils.isEmpty(str2)) {
                this.zzi = str2;
            }
            JSONObject jSONObject = zzfkqVar.zzp;
            if (jSONObject.length() > 0) {
                this.zzl = jSONObject;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkP)).booleanValue()) {
                if (!zzeczVar.zzm()) {
                    this.zzo = true;
                    return;
                }
                String str3 = zzfkqVar.zzn;
                if (!TextUtils.isEmpty(str3)) {
                    this.zzj = str3;
                }
                JSONObject jSONObject2 = zzfkqVar.zzo;
                if (jSONObject2.length() > 0) {
                    this.zzk = jSONObject2;
                }
                JSONObject jSONObject3 = this.zzk;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzeczVar.zzl(length);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final JSONObject zzg() throws JSONException {
        JSONObject jSONObjectZzh;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfkn.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkT)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzdcs zzdcsVar = this.zzf;
        if (zzdcsVar != null) {
            jSONObjectZzh = zzh(zzdcsVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObjectZzh2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzdcs zzdcsVar2 = (zzdcs) iBinder;
                jSONObjectZzh2 = zzh(zzdcsVar2);
                if (zzdcsVar2.zzg().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzi(this.zzg));
                    jSONObjectZzh2.put("errors", jSONArray);
                }
            }
            jSONObjectZzh = jSONObjectZzh2;
        }
        jSONObject.put("responseInfo", jSONObjectZzh);
        return jSONObject;
    }
}
