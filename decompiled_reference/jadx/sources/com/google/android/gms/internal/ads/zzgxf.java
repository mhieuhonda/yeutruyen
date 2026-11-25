package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgxf extends zzgxd {
    private final transient zzgxg zza;

    zzgxf(zzgxg zzgxgVar) {
        this.zza = zzgxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzgxg zzgxgVar = this.zza;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) zzgxgVar.zzu().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwx(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgxd, com.google.android.gms.internal.ads.zzgwp
    /* JADX INFO: renamed from: zza */
    public final zzgzh iterator() {
        return new zzgwx(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwp
    final boolean zzf() {
        return false;
    }
}
