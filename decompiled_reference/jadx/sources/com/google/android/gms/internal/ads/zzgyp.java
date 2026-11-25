package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyp extends zzgwt {
    final /* synthetic */ zzgyq zza;

    zzgyp(zzgyq zzgyqVar) {
        Objects.requireNonNull(zzgyqVar);
        this.zza = zzgyqVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzgyq zzgyqVar = this.zza;
        zzgtr.zzm(i, zzgyqVar.zzx(), "index");
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(zzgyqVar.zzw()[i2]), Objects.requireNonNull(zzgyqVar.zzw()[i2 + 1]));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    public final boolean zzf() {
        return true;
    }
}
