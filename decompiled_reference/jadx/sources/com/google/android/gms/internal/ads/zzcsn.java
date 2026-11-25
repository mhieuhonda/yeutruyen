package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcsn implements zzcsa {
    zzcsn() {
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzma)).booleanValue() || map.isEmpty()) {
            return;
        }
        String str = (String) map.get("is_topics_ad_personalization_allowed");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzp().zzy(Boolean.parseBoolean(str));
    }
}
