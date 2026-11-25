package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgvv extends AbstractSet {
    final /* synthetic */ zzgwa zza;

    /* synthetic */ zzgvv(zzgwa zzgwaVar, byte[] bArr) {
        Objects.requireNonNull(zzgwaVar);
        this.zza = zzgwaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzi = zzgwaVar.zzi(entry.getKey());
            if (iZzi != -1 && Objects.equals(zzgwaVar.zzp(iZzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        return mapZzc != null ? mapZzc.entrySet().iterator() : new zzgvt(zzgwaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iZzh;
        int iZze;
        zzgwa zzgwaVar = this.zza;
        Map mapZzc = zzgwaVar.zzc();
        if (mapZzc != null) {
            return mapZzc.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (zzgwaVar.zzb() || (iZze = zzgwb.zze(entry.getKey(), entry.getValue(), (iZzh = zzgwaVar.zzh()), zzgwaVar.zzk(), zzgwaVar.zzl(), zzgwaVar.zzm(), zzgwaVar.zzn())) == -1) {
            return false;
        }
        zzgwaVar.zze(iZze, iZzh);
        zzgwaVar.zzu(zzgwaVar.zzt() - 1);
        zzgwaVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
