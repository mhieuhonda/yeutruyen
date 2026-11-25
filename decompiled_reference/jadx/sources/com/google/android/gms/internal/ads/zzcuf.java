package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcuf implements zzbpx {
    final /* synthetic */ zzcui zza;

    zzcuf(zzcui zzcuiVar) {
        Objects.requireNonNull(zzcuiVar);
        this.zza = zzcuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzcui zzcuiVar = this.zza;
        if (zzcuiVar.zze(map)) {
            zzcuiVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcue
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzl();
                }
            });
        }
    }
}
