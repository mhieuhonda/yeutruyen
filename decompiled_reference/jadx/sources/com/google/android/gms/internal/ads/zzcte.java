package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcte implements zzcsa {
    private final zzecz zza;

    zzcte(zzecz zzeczVar) {
        this.zza = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.zza.zzc(str.equals("true"));
    }
}
