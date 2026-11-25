package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalu implements zzahd {
    private final SparseArray zza;
    private final SparseArray zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    /* synthetic */ zzalu(SparseArray sparseArray, SparseArray sparseArray2, long j, long j2, int i, byte[] bArr) {
        this.zza = sparseArray;
        this.zzb = sparseArray2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        SparseArray sparseArray = this.zza;
        int i = this.zze;
        long[] jArr = (long[]) sparseArray.get(i);
        SparseArray sparseArray2 = this.zzb;
        long[] jArr2 = (long[]) sparseArray2.get(i);
        if (jArr == null || jArr2 == null) {
            jArr = (long[]) sparseArray.get(i);
            jArr2 = (long[]) sparseArray2.get(i);
            if (jArr == null || jArr2 == null) {
                jArr = (long[]) sparseArray.valueAt(0);
                jArr2 = (long[]) sparseArray2.valueAt(0);
            }
        }
        if (jArr.length == 0 || j < jArr[0]) {
            zzahe zzaheVar = new zzahe(0L, this.zzd);
            return new zzahb(zzaheVar, zzaheVar);
        }
        int iZzo = zzfm.zzo(jArr, j, true, true);
        zzahe zzaheVar2 = new zzahe(jArr[iZzo], jArr2[iZzo]);
        return new zzahb(zzaheVar2, zzaheVar2);
    }
}
