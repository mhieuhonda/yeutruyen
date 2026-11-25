package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaow implements zzann {
    private final zzaop zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzaow(zzaop zzaopVar, Map map, Map map2, Map map3) {
        this.zza = zzaopVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzaopVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final int zza() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final long zzb(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzann
    public final List zzc(long j) {
        return this.zza.zzh(j, this.zzc, this.zzd, this.zze);
    }
}
