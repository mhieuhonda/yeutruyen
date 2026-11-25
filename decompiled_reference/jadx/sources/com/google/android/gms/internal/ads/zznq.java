package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznq {
    private final zzs zza;
    private final SparseArray zzb;

    public zznq(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i = 0; i < zzsVar.zzb(); i++) {
            int iZzc = zzsVar.zzc(i);
            zznp zznpVar = (zznp) sparseArray.get(iZzc);
            zznpVar.getClass();
            sparseArray2.append(iZzc, zznpVar);
        }
        this.zzb = sparseArray2;
    }

    public final zznp zza(int i) {
        zznp zznpVar = (zznp) this.zzb.get(i);
        zznpVar.getClass();
        return zznpVar;
    }

    public final boolean zzb(int i) {
        return this.zza.zza(i);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i) {
        return this.zza.zzc(i);
    }
}
