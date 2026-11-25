package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
class zzgvi extends zzgvg implements List {
    final /* synthetic */ zzgvj zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgvi(zzgvj zzgvjVar, Object obj, List list, zzgvg zzgvgVar) {
        super(zzgvjVar, obj, list, zzgvgVar);
        Objects.requireNonNull(zzgvjVar);
        this.zzf = zzgvjVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzgvj zzgvjVar = this.zzf;
        zzgvjVar.zzq(zzgvjVar.zzp() + 1);
        if (zIsEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.zzb).addAll(i, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgvj zzgvjVar = this.zzf;
        zzgvjVar.zzq(zzgvjVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzgvh(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zza();
        Object objRemove = ((List) this.zzb).remove(i);
        zzgvj zzgvjVar = this.zzf;
        zzgvjVar.zzq(zzgvjVar.zzp() - 1);
        zzb();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zza();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zza();
        List listSubList = ((List) this.zzb).subList(i, i2);
        zzgvg zzgvgVar = this.zzc;
        if (zzgvgVar == null) {
            zzgvgVar = this;
        }
        return this.zzf.zzg(this.zza, listSubList, zzgvgVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zza();
        return new zzgvh(this, i);
    }
}
