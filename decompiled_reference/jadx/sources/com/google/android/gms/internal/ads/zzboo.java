package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzboo implements zzbpx {
    private final zzbop zza;

    public zzboo(zzbop zzbopVar) {
        this.zza = zzbopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (str != null) {
            this.zza.zzb(str, (String) map.get("info"));
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("App event with no name parameter.");
        }
    }
}
