package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgxr extends zzgzg {
    final /* synthetic */ zzgxs zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgxr(zzgxs zzgxsVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgxsVar);
        this.zza = zzgxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzf
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
