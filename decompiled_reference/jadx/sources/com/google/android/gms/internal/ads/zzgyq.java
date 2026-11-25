package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyq extends zzgxd {
    private final transient zzgww zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzgyq(zzgww zzgwwVar, Object[] objArr, int i, int i2) {
        this.zza = zzgwwVar;
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: zza */
    public final zzgzh iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final int zzg(Object[] objArr, int i) {
        return zze().zzg(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgxd
    final zzgwt zzs() {
        return new zzgyp(this);
    }

    final /* synthetic */ Object[] zzw() {
        return this.zzb;
    }

    final /* synthetic */ int zzx() {
        return this.zzc;
    }
}
