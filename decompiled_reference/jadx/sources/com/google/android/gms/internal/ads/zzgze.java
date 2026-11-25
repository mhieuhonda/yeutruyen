package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgze extends zzgxd {
    final transient Object zza;

    zzgze(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgxl(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append("[");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: zza */
    public final zzgzh iterator() {
        return new zzgxl(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    public final zzgwt zze() {
        return zzgwt.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final int zzg(Object[] objArr, int i) {
        objArr[i] = this.zza;
        return i + 1;
    }
}
