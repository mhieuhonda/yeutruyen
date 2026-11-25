package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgzd {
    public static zzgzc zza(Set set, Set set2) {
        zzgtr.zzk(set, "set1");
        zzgtr.zzk(set2, "set2");
        return new zzgyy(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzgts zzgtsVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgyz)) {
                set.getClass();
                return new zzgyz(set, zzgtsVar);
            }
            zzgyz zzgyzVar = (zzgyz) set;
            return new zzgyz((Set) zzgyzVar.zza, zzgtv.zzb(zzgyzVar.zzb, zzgtsVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgyz)) {
            sortedSet.getClass();
            return new zzgza(sortedSet, zzgtsVar);
        }
        zzgyz zzgyzVar2 = (zzgyz) sortedSet;
        return new zzgza((SortedSet) zzgyzVar2.zza, zzgtv.zzb(zzgyzVar2.zzb, zzgtsVar));
    }

    static int zzc(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzgyk) {
            collection = ((zzgyk) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
