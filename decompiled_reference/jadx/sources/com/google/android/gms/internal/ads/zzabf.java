package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzabf extends zzabi {
    protected abstract Pair zzh(zzabe zzabeVar, int[][][] iArr, int[] iArr2, zzxl zzxlVar, zzbf zzbfVar) throws zzjm;

    @Override // com.google.android.gms.internal.ads.zzabi
    public final void zzq(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzabi
    public final zzabj zzr(zzne[] zzneVarArr, zzzo zzzoVar, zzxl zzxlVar, zzbf zzbfVar) throws zzjm {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzbg[][] zzbgVarArr = new zzbg[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzzoVar.zzb;
            zzbgVarArr[i] = new zzbg[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzneVarArr[i4].zzu();
        }
        int i5 = 0;
        while (i5 < zzzoVar.zzb) {
            zzbg zzbgVarZza = zzzoVar.zza(i5);
            int i6 = zzbgVarZza.zzc;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z = true;
            while (i8 < i3) {
                zzne zzneVar = zzneVarArr[i8];
                int iMax = 0;
                for (int i10 = 0; i10 < zzbgVarZza.zza; i10++) {
                    iMax = Math.max(iMax, zzneVar.zzae(zzbgVarZza.zza(i10)) & 7);
                }
                boolean z2 = iArr2[i8] == 0;
                if (iMax > i9) {
                    z = z2;
                    i7 = i8;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z && z2) {
                    i7 = i8;
                    i9 = iMax;
                    z = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                iArr = new int[zzbgVarZza.zza];
            } else {
                zzne zzneVar2 = zzneVarArr[i7];
                int i11 = zzbgVarZza.zza;
                int[] iArr5 = new int[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    iArr5[i12] = zzneVar2.zzae(zzbgVarZza.zza(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i7];
            zzbgVarArr[i7][i13] = zzbgVarZza;
            iArr3[i7][i13] = iArr;
            iArr2[i7] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzzo[] zzzoVarArr = new zzzo[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zzzoVarArr[i14] = new zzzo((zzbg[]) zzfm.zzb(zzbgVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzfm.zzb(iArr3[i14], i15);
            strArr[i14] = zzneVarArr[i14].zzV();
            iArr6[i14] = zzneVarArr[i14].zza();
            i14++;
            i3 = 2;
        }
        int i16 = i3;
        zzabe zzabeVar = new zzabe(strArr, iArr6, zzzoVarArr, iArr4, iArr3, new zzzo((zzbg[]) zzfm.zzb(zzbgVarArr[i16], iArr2[i16])));
        Pair pairZzh = zzh(zzabeVar, iArr3, iArr4, zzxlVar, zzbfVar);
        zzabg[] zzabgVarArr = (zzabg[]) pairZzh.second;
        int length = zzabgVarArr.length;
        List[] listArr = new List[length];
        for (int i17 = 0; i17 < zzabgVarArr.length; i17++) {
            zzabg zzabgVar = zzabgVarArr[i17];
            listArr[i17] = zzabgVar != null ? zzgwt.zzj(zzabgVar) : zzgwt.zzi();
        }
        zzgwq zzgwqVar = new zzgwq();
        for (int i18 = 0; i18 < 2; i18++) {
            zzzo zzzoVarZzb = zzabeVar.zzb(i18);
            int i19 = 0;
            while (i19 < zzzoVarZzb.zzb) {
                zzbg zzbgVarZza2 = zzzoVarZzb.zza(i19);
                boolean z3 = zzabeVar.zzd(i18, i19, false) != 0;
                int i20 = zzbgVarZza2.zza;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < i20; i21++) {
                    iArr7[i21] = zzabeVar.zzc(i18, i19, i21) & 7;
                    int i22 = 0;
                    boolean z4 = false;
                    while (i22 < length) {
                        List list = listArr[i22];
                        int i23 = length;
                        List[] listArr2 = listArr;
                        int i24 = 0;
                        while (i24 < list.size()) {
                            zzabg zzabgVar2 = (zzabg) list.get(i24);
                            int i25 = i24;
                            if (zzabgVar2.zza().equals(zzbgVarZza2) && zzabgVar2.zzg(i21) != -1) {
                                z4 = true;
                                break;
                            }
                            i24 = i25 + 1;
                        }
                        i22++;
                        length = i23;
                        listArr = listArr2;
                    }
                    zArr[i21] = z4;
                }
                zzgwqVar.zzf(new zzbm(zzbgVarZza2, z3, iArr7, zArr));
                i19++;
                length = length;
            }
        }
        zzzo zzzoVarZze = zzabeVar.zze();
        for (int i26 = 0; i26 < zzzoVarZze.zzb; i26++) {
            zzbg zzbgVarZza3 = zzzoVarZze.zza(i26);
            int i27 = zzbgVarZza3.zza;
            int[] iArr8 = new int[i27];
            Arrays.fill(iArr8, 0);
            zzgwqVar.zzf(new zzbm(zzbgVarZza3, false, iArr8, new boolean[i27]));
        }
        return new zzabj((zznf[]) pairZzh.first, (zzabb[]) pairZzh.second, new zzbn(zzgwqVar.zzi()), zzabeVar);
    }
}
