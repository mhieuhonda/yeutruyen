package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamg implements zzahd {
    private final long zza;
    private final zzamh[] zzb;
    private final int zzc;

    public zzamg(long j, zzamh[] zzamhVarArr, int i) {
        this.zza = j;
        this.zzb = zzamhVarArr;
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0087  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0075 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        long jZzh;
        long jZzh2;
        zzams zzamsVar;
        int iZzb;
        zzamh[] zzamhVarArr = this.zzb;
        if (zzamhVarArr.length == 0) {
            zzahe zzaheVar = zzahe.zza;
            return new zzahb(zzaheVar, zzaheVar);
        }
        int i2 = this.zzc;
        if (i2 != -1) {
            zzams zzamsVar2 = zzamhVarArr[i2].zzb;
            int iZzl = zzami.zzl(zzamsVar2, j);
            if (iZzl == -1) {
                zzahe zzaheVar2 = zzahe.zza;
                return new zzahb(zzaheVar2, zzaheVar2);
            }
            long[] jArr = zzamsVar2.zzf;
            j3 = jArr[iZzl];
            long[] jArr2 = zzamsVar2.zzc;
            j2 = jArr2[iZzl];
            if (j3 < j && iZzl < zzamsVar2.zzb - 1 && (iZzb = zzamsVar2.zzb(j)) != -1 && iZzb != iZzl) {
                j4 = jArr[iZzb];
                j5 = jArr2[iZzb];
            }
            jZzh = j2;
            jZzh2 = j5;
            for (i = 0; i < zzamhVarArr.length; i++) {
                if (i != i2) {
                    zzamsVar = zzamhVarArr[i].zzb;
                    jZzh = zzami.zzh(zzamsVar, j3, jZzh);
                    if (j4 != -9223372036854775807L) {
                        jZzh2 = zzami.zzh(zzamsVar, j4, jZzh2);
                    }
                }
            }
            zzahe zzaheVar3 = new zzahe(j3, jZzh);
            return j4 == -9223372036854775807L ? new zzahb(zzaheVar3, zzaheVar3) : new zzahb(zzaheVar3, new zzahe(j4, jZzh2));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        j4 = -9223372036854775807L;
        j5 = -1;
        jZzh = j2;
        jZzh2 = j5;
        while (i < zzamhVarArr.length) {
            if (i != i2) {
                zzamsVar = zzamhVarArr[i].zzb;
                jZzh = zzami.zzh(zzamsVar, j3, jZzh);
                if (j4 != -9223372036854775807L) {
                    jZzh2 = zzami.zzh(zzamsVar, j4, jZzh2);
                }
            }
        }
        zzahe zzaheVar4 = new zzahe(j3, jZzh);
        if (j4 == -9223372036854775807L) {
        }
    }
}
