package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyj extends zzgus {
    final transient zzguj zza;

    zzgyj(Map map, zzguj zzgujVar) {
        super(map);
        this.zza = zzgujVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgus, com.google.android.gms.internal.ads.zzgvj
    protected final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, com.google.android.gms.internal.ads.zzgvm
    final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvj, com.google.android.gms.internal.ads.zzgvm
    final Map zzl() {
        return zzm();
    }
}
