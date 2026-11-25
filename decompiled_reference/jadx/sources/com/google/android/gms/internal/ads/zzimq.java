package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzimq extends AbstractList {
    private static final zzimr zzc = zzimr.zzb(zzimq.class);
    final List zza;
    final Iterator zzb;

    public zzimq(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.zza;
        if (list.size() > i) {
            return list.get(i);
        }
        Iterator it = this.zzb;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzimp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzimr zzimrVar = zzc;
        zzimrVar.zza("potentially expensive size() call");
        zzimrVar.zza("blowup running");
        while (true) {
            Iterator it = this.zzb;
            boolean zHasNext = it.hasNext();
            List list = this.zza;
            if (!zHasNext) {
                return list.size();
            }
            list.add(it.next());
        }
    }
}
