package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzicc extends AbstractSet {
    final /* synthetic */ zzich zza;

    zzicc(zzich zzichVar) {
        Objects.requireNonNull(zzichVar);
        this.zza = zzichVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.zza.zzc((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzicb(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzich zzichVar;
        zzicg zzicgVarZzc;
        if (!(obj instanceof Map.Entry) || (zzicgVarZzc = (zzichVar = this.zza).zzc((Map.Entry) obj)) == null) {
            return false;
        }
        zzichVar.zzd(zzicgVarZzc, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzb;
    }
}
