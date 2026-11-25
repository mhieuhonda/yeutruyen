package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgww<K, V> implements Map<K, V>, Serializable {
    private transient zzgxd zza;
    private transient zzgxd zzb;
    private transient zzgwp zzc;

    zzgww() {
    }

    public static zzgww zza() {
        return zzgyt.zza;
    }

    public static zzgww zzb(Object obj, Object obj2) {
        zzgvp.zza("dialog_not_shown_reason", obj2);
        return zzgyt.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgww zzc(Map map) {
        if ((map instanceof zzgww) && !(map instanceof SortedMap)) {
            zzgww zzgwwVar = (zzgww) map;
            zzgwwVar.zzj();
            return zzgwwVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzgwv zzgwvVar = new zzgwv(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgwvVar.zzb(setEntrySet);
        return zzgwvVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgya.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgzd.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzgvp.zzb(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgxd entrySet() {
        zzgxd zzgxdVar = this.zza;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxd zzgxdVarZze = zze();
        this.zza = zzgxdVarZze;
        return zzgxdVarZze;
    }

    abstract zzgxd zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgxd keySet() {
        zzgxd zzgxdVar = this.zzb;
        if (zzgxdVar != null) {
            return zzgxdVar;
        }
        zzgxd zzgxdVarZzg = zzg();
        this.zzb = zzgxdVarZzg;
        return zzgxdVarZzg;
    }

    abstract zzgxd zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgwp values() {
        zzgwp zzgwpVar = this.zzc;
        if (zzgwpVar != null) {
            return zzgwpVar;
        }
        zzgwp zzgwpVarZzi = zzi();
        this.zzc = zzgwpVarZzi;
        return zzgwpVarZzi;
    }

    abstract zzgwp zzi();

    abstract boolean zzj();
}
