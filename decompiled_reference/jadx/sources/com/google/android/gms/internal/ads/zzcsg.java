package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcsg implements zzcsa {
    private final zzecz zza;

    zzcsg(zzecz zzeczVar) {
        this.zza = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    public final void zza(Map map) {
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                this.zza.zze(zzecv.SHAKE);
                return;
            }
        } else if (str.equals("flick")) {
            this.zza.zze(zzecv.FLICK);
            return;
        }
        this.zza.zze(zzecv.NONE);
    }
}
