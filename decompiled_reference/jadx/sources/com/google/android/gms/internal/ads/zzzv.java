package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzv extends zzzx {
    protected zzzv(zzbg zzbgVar, int[] iArr, int i, zzabr zzabrVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdp zzdpVar) {
        super(zzbgVar, iArr, 0);
        zzgwt.zzq(list);
    }

    static /* synthetic */ zzgwt zzd(zzaba[] zzabaVarArr) {
        int i;
        int i2;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                break;
            }
            zzaba zzabaVar = zzabaVarArr[i4];
            if (zzabaVar == null || zzabaVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i5 = zzgwt.zzd;
                zzgwq zzgwqVar = new zzgwq();
                zzgwqVar.zzf(new zzzt(0L, 0L));
                arrayList.add(zzgwqVar);
            }
            i4++;
        }
        long[][] jArr2 = new long[2][];
        for (int i6 = 0; i6 < 2; i6++) {
            zzaba zzabaVar2 = zzabaVarArr[i6];
            if (zzabaVar2 == null) {
                jArr2[i6] = new long[0];
            } else {
                int[] iArr = zzabaVar2.zzb;
                jArr2[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j = zzabaVar2.zza.zza(iArr[i7]).zzj;
                    long[] jArr3 = jArr2[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i7] = j;
                }
                Arrays.sort(jArr2[i6]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i8 = 0; i8 < 2; i8++) {
            long[] jArr5 = jArr2[i8];
            jArr4[i8] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzgxo zzgxoVarZza = zzgyi.zzc(zzgyn.zzb()).zzb(2).zza();
        int i9 = 0;
        while (i9 < 2) {
            int length = jArr2[i9].length;
            if (length <= i) {
                i2 = i3;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i10 = i3;
                while (true) {
                    long[] jArr6 = jArr2[i9];
                    double dLog = 0.0d;
                    if (i10 >= jArr6.length) {
                        break;
                    }
                    int i11 = i3;
                    long[][] jArr7 = jArr2;
                    long j2 = jArr6[i10];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i10] = dLog;
                    i10++;
                    i3 = i11;
                    jArr2 = jArr7;
                }
                i2 = i3;
                jArr = jArr2;
                int i12 = length - 1;
                double d = dArr[i12] - dArr[i2];
                int i13 = i2;
                while (i13 < i12) {
                    double d2 = dArr[i13];
                    i13++;
                    zzgxoVarZza.zze(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i13]) * 0.5d) - dArr[i2]) / d), Integer.valueOf(i9));
                    i = i;
                }
            }
            i9++;
            i3 = i2;
            jArr2 = jArr;
            i = i;
        }
        int i14 = i3;
        long[][] jArr8 = jArr2;
        zzgwt zzgwtVarZzq = zzgwt.zzq(zzgxoVarZza.zzt());
        for (int i15 = i14; i15 < zzgwtVarZzq.size(); i15++) {
            int iIntValue = ((Integer) zzgwtVarZzq.get(i15)).intValue();
            int i16 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i16;
            jArr4[iIntValue] = jArr8[iIntValue][i16];
            zzi(arrayList, jArr4);
        }
        for (int i17 = i14; i17 < 2; i17++) {
            if (arrayList.get(i17) != null) {
                long j3 = jArr4[i17];
                jArr4[i17] = j3 + j3;
            }
        }
        zzi(arrayList, jArr4);
        zzgwq zzgwqVar2 = new zzgwq();
        while (i14 < arrayList.size()) {
            zzgwq zzgwqVar3 = (zzgwq) arrayList.get(i14);
            zzgwqVar2.zzf(zzgwqVar3 == null ? zzgwt.zzi() : zzgwqVar3.zzi());
            i14++;
        }
        return zzgwqVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgwq zzgwqVar = (zzgwq) list.get(i2);
            if (zzgwqVar != null) {
                zzgwqVar.zzf(new zzzt(j, jArr[i2]));
            }
        }
    }
}
