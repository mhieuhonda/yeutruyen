package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbsx implements zzbpx {
    final /* synthetic */ zzbte zza;
    private final zzbpx zzb;

    public zzbsx(zzbte zzbteVar, zzbpx zzbpxVar) {
        Objects.requireNonNull(zzbteVar);
        this.zza = zzbteVar;
        this.zzb = zzbpxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        this.zzb.zza(this.zza, map);
    }

    final /* synthetic */ zzbpx zzb() {
        return this.zzb;
    }
}
