package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgqn implements zzhcc {
    final /* synthetic */ zzgqm zza;

    zzgqn(zzgqo zzgqoVar, zzgqm zzgqmVar) {
        this.zza = zzgqmVar;
        Objects.requireNonNull(zzgqoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzgqm zzgqmVar = this.zza;
        zzgqmVar.zzb(th);
        zzgqmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zza.zzc();
    }
}
