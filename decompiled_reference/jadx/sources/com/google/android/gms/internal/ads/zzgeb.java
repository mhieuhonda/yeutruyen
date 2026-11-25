package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgeb implements zzini {
    final /* synthetic */ zzgec zza;

    zzgeb(zzgec zzgecVar) {
        Objects.requireNonNull(zzgecVar);
        this.zza = zzgecVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgec zzgecVar = this.zza;
        return new zzgef(zzgecVar.zzb(), zzgecVar.zzc(), null);
    }
}
