package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgve extends zzguz implements SortedSet {
    final /* synthetic */ zzgvj zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgve(zzgvj zzgvjVar, SortedMap sortedMap) {
        super(zzgvjVar, sortedMap);
        Objects.requireNonNull(zzgvjVar);
        this.zzc = zzgvjVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzgve(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzgve(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzgve(this.zzc, zza().tailMap(obj));
    }

    SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
