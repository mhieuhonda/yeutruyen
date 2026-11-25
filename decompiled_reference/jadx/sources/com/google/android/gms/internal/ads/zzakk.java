package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakk implements zzahd {
    private final zzafo zza;
    private final SparseArray zzb;
    private final long zzc;
    private final int zzd;

    public zzakk(SparseArray sparseArray, long j, int i, long j2, long j3) {
        int i2;
        this.zzb = sparseArray;
        this.zzc = j;
        this.zzd = i;
        List list = (List) sparseArray.get(i);
        zzafo zzafoVar = null;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                zzakj zzakjVar = (zzakj) list.get(i4);
                jArrCopyOf3[i4] = zzakjVar.zza();
                jArrCopyOf[i4] = zzakjVar.zzb();
            }
            while (true) {
                i2 = size - 1;
                if (i3 >= i2) {
                    break;
                }
                int i5 = i3 + 1;
                iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
                jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
                i3 = i5;
            }
            int i6 = i2;
            while (i6 > 0 && jArrCopyOf3[i6] >= j) {
                i6--;
            }
            iArrCopyOf[i6] = (int) ((j2 + j3) - jArrCopyOf[i6]);
            jArrCopyOf2[i6] = j - jArrCopyOf3[i6];
            if (i6 < i2) {
                zzeh.zzc("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i7 = i6 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i7);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i7);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i7);
            }
            zzafoVar = new zzafo(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        this.zza = zzafoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        List list = (List) this.zzb.get(this.zzd);
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        zzafo zzafoVar = this.zza;
        if (zzafoVar != null) {
            return zzafoVar.zzc(j);
        }
        zzahe zzaheVar = zzahe.zza;
        return new zzahb(zzaheVar, zzaheVar);
    }
}
