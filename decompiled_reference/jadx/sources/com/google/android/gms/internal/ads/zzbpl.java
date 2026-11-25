package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpl implements zzbpx {
    zzbpl() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        if (map.containsKey("start")) {
            zzclbVar.zzas(true);
        }
        if (map.containsKey("stop")) {
            zzclbVar.zzas(false);
        }
    }
}
