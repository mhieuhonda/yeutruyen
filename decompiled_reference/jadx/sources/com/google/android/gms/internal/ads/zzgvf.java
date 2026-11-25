package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgvf implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgvg zzc;

    zzgvf(zzgvg zzgvgVar) {
        Objects.requireNonNull(zzgvgVar);
        this.zzc = zzgvgVar;
        this.zzb = zzgvgVar.zzb;
        Collection collection = zzgvgVar.zzb;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgvg zzgvgVar = this.zzc;
        zzgvj zzgvjVar = zzgvgVar.zze;
        zzgvjVar.zzq(zzgvjVar.zzp() - 1);
        zzgvgVar.zzb();
    }

    final void zza() {
        zzgvg zzgvgVar = this.zzc;
        zzgvgVar.zza();
        if (zzgvgVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    zzgvf(zzgvg zzgvgVar, Iterator it) {
        Objects.requireNonNull(zzgvgVar);
        this.zzc = zzgvgVar;
        this.zzb = zzgvgVar.zzb;
        this.zza = it;
    }
}
