package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgxb<K, V> extends zzgvn<K, V> implements Serializable {
    final transient zzgww<K, ? extends zzgwp<V>> map;
    final transient int size;

    zzgxb(zzgww zzgwwVar, int i) {
        this.map = zzgwwVar;
        this.size = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgyb
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm, com.google.android.gms.internal.ads.zzgyb
    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyb
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    final Set zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    final /* synthetic */ Collection zzj() {
        return new zzgxa(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    final Map zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgvm
    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvm, com.google.android.gms.internal.ads.zzgyb
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvm, com.google.android.gms.internal.ads.zzgyb
    public /* synthetic */ Map zzu() {
        return this.map;
    }
}
