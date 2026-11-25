package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgwj extends zzgwk implements Map {
    protected zzgwj() {
    }

    @Override // java.util.Map
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return zza().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return zza().containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        return zza().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || zza().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return zza().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return zza().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return zza().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zza().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zza().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zza().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return zza().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zza().values();
    }

    protected abstract Map zza();

    @Override // com.google.android.gms.internal.ads.zzgwk
    protected /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    protected final boolean zzc(Object obj) {
        zzgxv zzgxvVar = new zzgxv(entrySet().iterator());
        if (obj == null) {
            while (zzgxvVar.hasNext()) {
                if (zzgxvVar.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (zzgxvVar.hasNext()) {
            if (obj.equals(zzgxvVar.next())) {
                return true;
            }
        }
        return false;
    }

    protected final boolean zzd(Object obj) {
        return zzgya.zzb(this, obj);
    }

    protected final int zze() {
        return zzgzd.zzc(entrySet());
    }
}
