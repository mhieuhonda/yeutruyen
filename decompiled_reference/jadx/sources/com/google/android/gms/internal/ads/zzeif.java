package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzeif implements zzfos {
    static final /* synthetic */ zzeif zza = new zzeif();

    private /* synthetic */ zzeif() {
    }

    @Override // com.google.android.gms.internal.ads.zzfos
    public final /* synthetic */ Object zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
        com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
        return jSONObject;
    }
}
