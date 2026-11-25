package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgxa extends zzgwp {
    private final transient zzgxb zza;

    zzgxa(zzgxb zzgxbVar) {
        this.zza = zzgxbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwy(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: zza */
    public final zzgzh iterator() {
        return new zzgwy(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgwp
    final int zzg(Object[] objArr, int i) {
        zzgzi zzgziVarListIterator = ((zzgwt) this.zza.map.values()).listIterator(0);
        while (zzgziVarListIterator.hasNext()) {
            i = ((zzgwp) zzgziVarListIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}
