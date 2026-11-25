package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbot implements zzbpx {
    zzbot() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject jSONObjectZzd;
        zzclb zzclbVar = (zzclb) obj;
        zzbly zzblyVarZzar = zzclbVar.zzar();
        if (zzblyVarZzar == null || (jSONObjectZzd = zzblyVarZzar.zzd()) == null) {
            zzclbVar.zzd("nativeClickMetaReady", new JSONObject());
        } else {
            zzclbVar.zzd("nativeClickMetaReady", jSONObjectZzd);
        }
    }
}
