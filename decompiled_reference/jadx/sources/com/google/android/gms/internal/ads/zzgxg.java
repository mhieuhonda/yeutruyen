package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzgxg<K, V> extends zzgxb<K, V> implements zzgyb<K, V> {
    private final transient zzgxd<V> emptySet;
    private transient zzgxd zza;

    zzgxg(zzgww zzgwwVar, int i, Comparator comparator) {
        super(zzgwwVar, i);
        this.emptySet = zzgyu.zza;
    }

    public final zzgxd zza() {
        zzgxd zzgxdVar = this.zza;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxf zzgxfVar = new zzgxf(this);
        this.zza = zzgxfVar;
        return zzgxfVar;
    }
}
