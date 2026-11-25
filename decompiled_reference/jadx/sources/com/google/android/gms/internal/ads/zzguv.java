package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzguv implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzguw zzc;

    zzguv(zzguw zzguwVar) {
        Objects.requireNonNull(zzguwVar);
        this.zzc = zzguwVar;
        this.zza = zzguwVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgtr.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        zzgvj zzgvjVar = this.zzc.zzb;
        zzgvjVar.zzq(zzgvjVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }
}
