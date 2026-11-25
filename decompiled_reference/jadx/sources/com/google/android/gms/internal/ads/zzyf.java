package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyf extends zzagp {
    final /* synthetic */ zzyr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzyf(zzyr zzyrVar, zzahd zzahdVar) {
        super(zzahdVar);
        Objects.requireNonNull(zzyrVar);
        this.zza = zzyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzagp, com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zza.zzQ();
    }
}
