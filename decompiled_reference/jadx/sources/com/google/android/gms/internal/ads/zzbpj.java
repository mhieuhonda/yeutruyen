package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpj implements zzbpx {
    zzbpj() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzclbVar.zzdk();
        } else if ("resume".equals(str)) {
            zzclbVar.zzdl();
        }
    }
}
