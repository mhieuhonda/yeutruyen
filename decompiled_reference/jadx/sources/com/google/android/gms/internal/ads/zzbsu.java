package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbsu extends zzbtf, zzbst {
    @Override // com.google.android.gms.internal.ads.zzbtf
    void zza(String str);

    @Override // com.google.android.gms.internal.ads.zzbtf
    default void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    default void zzc(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length() + 2);
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    default void zzd(String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String string2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string2));
        zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    default void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzay.zza().zzm(map));
        } catch (JSONException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not convert parameters to JSON.");
        }
    }
}
