package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzimp implements Iterator {
    int zza = 0;
    final /* synthetic */ zzimq zzb;

    zzimp(zzimq zzimqVar) {
        this.zzb = zzimqVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zza;
        zzimq zzimqVar = this.zzb;
        return i < zzimqVar.zza.size() || zzimqVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.zza;
        zzimq zzimqVar = this.zzb;
        List list = zzimqVar.zza;
        if (i >= list.size()) {
            list.add(zzimqVar.zzb.next());
            return next();
        }
        int i2 = this.zza;
        this.zza = i2 + 1;
        return list.get(i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
