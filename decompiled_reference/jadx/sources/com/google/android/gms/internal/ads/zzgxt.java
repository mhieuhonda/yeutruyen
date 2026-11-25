package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgxt {
    public static ArrayList zza(Iterator it) {
        ArrayList arrayList = new ArrayList();
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static ArrayList zzb(int i) {
        zzgvp.zzb(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List zzc(List list, zzgti zzgtiVar) {
        return list instanceof RandomAccess ? new zzgxq(list, zzgtiVar) : new zzgxs(list, zzgtiVar);
    }
}
