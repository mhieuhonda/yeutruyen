package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgwy extends zzgzh {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgxb zzc;

    zzgwy(zzgxb zzgxbVar) {
        Objects.requireNonNull(zzgxbVar);
        this.zzc = zzgxbVar;
        this.zza = ((zzgwt) zzgxbVar.map.values()).listIterator(0);
        this.zzb = zzgxj.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgwp) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
