package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsw implements zzcsa {
    private final zzfkm zza;

    public zzcsw(zzfkm zzfkmVar) {
        this.zza = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.zza.zza(Boolean.parseBoolean(str));
        } catch (Exception e) {
            throw new IllegalStateException("Invalid render_in_browser state", e);
        }
    }
}
