package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzguu extends zzgxw {
    final /* synthetic */ zzguw zza;

    zzguu(zzguw zzguwVar) {
        Objects.requireNonNull(zzguwVar);
        this.zza = zzguwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgvr.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzguv(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxw, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) Objects.requireNonNull((Map.Entry) obj);
        zzguw zzguwVar = this.zza;
        zzguwVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxw
    final Map zza() {
        return this.zza;
    }
}
