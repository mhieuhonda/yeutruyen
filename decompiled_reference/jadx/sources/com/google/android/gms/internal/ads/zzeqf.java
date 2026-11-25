package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeqf implements zzemc {
    private final Map zza = new HashMap();
    private final zzdxk zzb;

    public zzeqf(zzdxk zzdxkVar) {
        this.zzb = zzdxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemc
    public final zzemd zza(String str, JSONObject jSONObject) throws zzfln {
        zzemd zzemdVar;
        synchronized (this) {
            Map map = this.zza;
            zzemdVar = (zzemd) map.get(str);
            if (zzemdVar == null) {
                zzemdVar = new zzemd(this.zzb.zza(str, jSONObject), new zzenq(), str);
                map.put(str, zzemdVar);
            }
        }
        return zzemdVar;
    }
}
