package com.google.android.gms.internal.ads;

import com.tekartik.sqflite.Constant;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpk implements zzbpx {
    zzbpk() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (map.containsKey("start")) {
            zzclbVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzclbVar.zzP().zzs();
        } else if (map.containsKey(Constant.PARAM_CANCEL)) {
            zzclbVar.zzP().zzt();
        }
    }
}
