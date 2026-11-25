package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdql {
    public static final zzdql zza = new zzdql(new zzdqk());
    private final zzbnj zzb;
    private final zzbng zzc;
    private final zzbnw zzd;
    private final zzbnt zze;
    private final zzbsr zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdql(zzdqk zzdqkVar) {
        this.zzb = zzdqkVar.zza;
        this.zzc = zzdqkVar.zzb;
        this.zzd = zzdqkVar.zzc;
        this.zzg = new SimpleArrayMap(zzdqkVar.zzf);
        this.zzh = new SimpleArrayMap(zzdqkVar.zzg);
        this.zze = zzdqkVar.zzd;
        this.zzf = zzdqkVar.zze;
    }

    /* synthetic */ zzdql(zzdqk zzdqkVar, byte[] bArr) {
        this(zzdqkVar);
    }

    public final zzbnj zza() {
        return this.zzb;
    }

    public final zzbng zzb() {
        return this.zzc;
    }

    public final zzbnw zzc() {
        return this.zzd;
    }

    public final zzbnt zzd() {
        return this.zze;
    }

    public final zzbsr zze() {
        return this.zzf;
    }

    public final zzbnp zzf(String str) {
        if (str == null) {
            return null;
        }
        return (zzbnp) this.zzg.get(str);
    }

    public final zzbnm zzg(String str) {
        return (zzbnm) this.zzh.get(str);
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        SimpleArrayMap simpleArrayMap = this.zzg;
        ArrayList arrayList = new ArrayList(simpleArrayMap.getSize());
        for (int i = 0; i < simpleArrayMap.getSize(); i++) {
            arrayList.add((String) simpleArrayMap.keyAt(i));
        }
        return arrayList;
    }
}
