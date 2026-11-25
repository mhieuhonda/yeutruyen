package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbpa implements zzbpx {
    zzbpa() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            String str = (String) map.get("enabled");
            zzbpx zzbpxVar = zzbpw.zza;
            if (!zzgsz.zze("true", str) && !zzgsz.zze("false", str)) {
                return;
            }
            zzgcs.zza(zzclbVar.getContext()).zzd(Boolean.parseBoolean(str));
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled");
        }
    }
}
