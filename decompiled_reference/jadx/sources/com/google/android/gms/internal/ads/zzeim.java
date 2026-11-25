package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzeim implements zzbui {
    zzeim() {
    }

    @Override // com.google.android.gms.internal.ads.zzbui
    public final /* bridge */ /* synthetic */ JSONObject zzb(Object obj) throws JSONException {
        zzein zzeinVar = (zzein) obj;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkO)).booleanValue()) {
            zzcbm zzcbmVar = zzeinVar.zzc;
            jSONObject2.put("ad_request_url", zzcbmVar.zze());
            jSONObject2.put("ad_request_post_body", zzcbmVar.zzd());
        }
        zzcbm zzcbmVar2 = zzeinVar.zzc;
        jSONObject2.put("base_url", zzcbmVar2.zzc());
        jSONObject2.put("signals", zzeinVar.zzb);
        zzeit zzeitVar = zzeinVar.zza;
        jSONObject3.put("body", zzeitVar.zzc);
        jSONObject3.put("headers", com.google.android.gms.ads.internal.client.zzay.zza().zzm(zzeitVar.zzb));
        jSONObject3.put("response_code", zzeitVar.zza);
        jSONObject3.put("latency", zzeitVar.zzd);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", zzcbmVar2.zzh());
        return jSONObject;
    }
}
