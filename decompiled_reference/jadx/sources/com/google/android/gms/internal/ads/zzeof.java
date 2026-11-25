package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeof implements zzemc {
    private final zzdxk zza;

    public zzeof(zzdxk zzdxkVar) {
        this.zza = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    public final zzemd zza(String str, JSONObject jSONObject) throws zzfln {
        return new zzemd(this.zza.zza(str, jSONObject), new zzenp(), str);
    }
}
