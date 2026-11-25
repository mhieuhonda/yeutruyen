package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcta implements zzcsa {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzcta(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        int iIntValue;
        String str = (String) map.get("total_inflight_ad_limit");
        if (str == null || (iIntValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.zza.zzS(iIntValue);
    }
}
