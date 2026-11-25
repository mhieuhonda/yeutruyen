package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgdt implements zzini {
    final /* synthetic */ zzgdw zza;

    zzgdt(zzgdw zzgdwVar) {
        Objects.requireNonNull(zzgdwVar);
        this.zza = zzgdwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgea(this.zza.zza(), null);
    }
}
