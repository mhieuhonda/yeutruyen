package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgvx extends AbstractSet {
    final /* synthetic */ zzgwa zza;

    /* synthetic */ zzgvx(zzgwa zzgwaVar, byte[] bArr) {
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        return mapZzc != null ? mapZzc.keySet().iterator() : new zzgvs(zzgwaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        if (mapZzc != null) {
            return mapZzc.keySet().remove(obj);
        }
        return zzgwaVar.zzj(obj) != zzgwa.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
