package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfds implements zzfcq {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzgcr zzc;

    public zzfds(AdvertisingIdClient.Info info, String str, zzgcr zzgcrVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzgcrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        try {
            JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbp.zzh((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectZzh.put("pdid", str);
                    jSONObjectZzh.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectZzh.put("rdid", info.getId());
            jSONObjectZzh.put("is_lat", info.isLimitAdTrackingEnabled());
            jSONObjectZzh.put("idtype", "adid");
            zzgcr zzgcrVar = this.zzc;
            if (zzgcrVar.zzc()) {
                jSONObjectZzh.put("paidv1_id_android_3p", zzgcrVar.zza());
                jSONObjectZzh.put("paidv1_creation_time_android_3p", zzgcrVar.zzb());
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed putting Ad ID.", e);
        }
    }
}
