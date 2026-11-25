package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgvz extends AbstractCollection {
    final /* synthetic */ zzgwa zza;

    /* synthetic */ zzgvz(zzgwa zzgwaVar, byte[] bArr) {
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        return mapZzc != null ? mapZzc.values().iterator() : new zzgvu(zzgwaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
