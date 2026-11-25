package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalw implements zzaga {
    private static final byte[] zza;
    private static final zzv zzb;
    private long zzA;
    private long zzB;
    private zzalv zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzagd zzI;
    private zzahm[] zzJ;
    private zzahm[] zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private long zzO;
    private final zzanq zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzeu zzg;
    private final zzeu zzh;
    private final zzeu zzi;
    private final byte[] zzj;
    private final zzeu zzk;
    private final zzajf zzl;
    private final zzeu zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzhb zzp;
    private final zzafp zzq;
    private zzgwt zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzeu zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = zzalr.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        zzt zztVar = new zzt();
        zztVar.zzo("application/x-emsg");
        zzb = zztVar.zzP();
    }

    @Deprecated
    public zzalw() {
        this(zzanq.zza, 32, null, null, zzgwt.zzi(), null);
    }

    private final void zzi() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0437  */
    /* JADX WARN: Code duplicated, block: B:155:0x044c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x044e  */
    /* JADX WARN: Code duplicated, block: B:157:0x0457  */
    /* JADX WARN: Code duplicated, block: B:160:0x0460  */
    /* JADX WARN: Code duplicated, block: B:161:0x046b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0474  */
    /* JADX WARN: Code duplicated, block: B:165:0x0479  */
    /* JADX WARN: Code duplicated, block: B:166:0x047b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x047d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0482  */
    /* JADX WARN: Code duplicated, block: B:169:0x0484 A[PHI: r32
      0x0484: PHI (r32v4 int) = (r5v60 int), (r32v5 int) binds: [B:165:0x0479, B:168:0x0482] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:171:0x0488  */
    /* JADX WARN: Code duplicated, block: B:172:0x0491  */
    /* JADX WARN: Code duplicated, block: B:175:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:176:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:179:0x04c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x04c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:182:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:183:0x04d2  */
    private final void zzj(long j) throws zzat {
        zzap zzapVar;
        zzap zzapVar2;
        char c;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        boolean z;
        int i4;
        zzalv zzalvVar;
        int i5;
        zzalv zzalvVar2;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        boolean z2;
        int i6;
        int i7;
        long j2;
        long j3;
        int i8;
        int iZzB;
        int iZzB2;
        int iZzB3;
        int iZzB4;
        long jZzw;
        zzalv zzalvVar3;
        long[] jArr2;
        boolean z3;
        zzhao zzhaoVar;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzfz) arrayDeque.peek()).zza != j) {
                break;
            }
            zzfz zzfzVar = (zzfz) arrayDeque.pop();
            int i9 = zzfzVar.zzd;
            int i10 = 12;
            int i11 = 8;
            char c2 = 1;
            if (i9 == 1836019574) {
                zzq zzqVarZzn = zzn(zzfzVar.zzb);
                zzfz zzfzVarZzd = zzfzVar.zzd(1836475768);
                zzfzVarZzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list = zzfzVarZzd.zzb;
                int size = list.size();
                int i12 = 0;
                long jZzz = -9223372036854775807L;
                while (i12 < size) {
                    zzga zzgaVar = (zzga) list.get(i12);
                    int i13 = zzgaVar.zzd;
                    if (i13 == 1953654136) {
                        zzeu zzeuVar = zzgaVar.zza;
                        zzeuVar.zzh(i10);
                        Pair pairCreate = Pair.create(Integer.valueOf(zzeuVar.zzB()), new zzalp(zzeuVar.zzB() - 1, zzeuVar.zzB(), zzeuVar.zzB(), zzeuVar.zzB()));
                        sparseArray.put(((Integer) pairCreate.first).intValue(), (zzalp) pairCreate.second);
                    } else if (i13 == 1835362404) {
                        zzeu zzeuVar2 = zzgaVar.zza;
                        zzeuVar2.zzh(8);
                        jZzz = zzalo.zza(zzeuVar2.zzB()) == 0 ? zzeuVar2.zzz() : zzeuVar2.zzJ();
                    }
                    i12++;
                    i10 = 12;
                }
                zzfz zzfzVarZzd2 = zzfzVar.zzd(1835365473);
                zzap zzapVarZze = zzfzVarZzd2 != null ? zzalo.zze(zzfzVarZzd2) : null;
                zzagt zzagtVar = new zzagt();
                zzga zzgaVarZzc = zzfzVar.zzc(1969517665);
                if (zzgaVarZzc != null) {
                    zzap zzapVarZzc = zzalo.zzc(zzgaVarZzc);
                    zzagtVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzga zzgaVarZzc2 = zzfzVar.zzc(1836476516);
                zzgaVarZzc2.getClass();
                zzap zzapVar3 = new zzap(-9223372036854775807L, zzalo.zzd(zzgaVarZzc2.zza));
                List listZzb = zzalo.zzb(zzfzVar, zzagtVar, jZzz, zzqVarZzn, (this.zzd & 16) != 0, false, new zzgti(this) { // from class: com.google.android.gms.internal.ads.zzalq
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzamp) obj;
                    }
                }, false);
                int size2 = listZzb.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String strZza = zzalz.zza(listZzb);
                    int i14 = 0;
                    while (i14 < size2) {
                        zzams zzamsVar = (zzams) listZzb.get(i14);
                        zzamp zzampVar = zzamsVar.zza;
                        if (zzampVar.zzm) {
                            zzagd zzagdVar = this.zzI;
                            int i15 = zzampVar.zzb;
                            zzahm zzahmVarZzs = zzagdVar.zzs(i14, i15);
                            c = c2;
                            long j4 = zzampVar.zze;
                            zzahmVarZzs.zzP(j4);
                            zzv zzvVar = zzampVar.zzg;
                            zzapVar2 = zzapVar3;
                            zzt zztVarZza = zzvVar.zza();
                            zztVarZza.zzn(strZza);
                            zzaly.zzb(i15, zzagtVar, zztVarZza);
                            zzap[] zzapVarArr = new zzap[2];
                            zzapVarArr[0] = zzapVar;
                            zzapVarArr[c] = zzapVar2;
                            zzaly.zza(i15, zzapVarZze, zztVarZza, zzvVar.zzl, zzapVarArr);
                            int i16 = zzampVar.zza;
                            sparseArray2.put(i16, new zzalv(zzahmVarZzs, zzamsVar, zzp(sparseArray, i16), zztVarZza.zzP()));
                            this.zzA = Math.max(this.zzA, j4);
                        } else {
                            zzapVar2 = zzapVar3;
                            c = c2;
                        }
                        i14++;
                        c2 = c;
                        zzagtVar = zzagtVar;
                        zzapVar3 = zzapVar2;
                        strZza = strZza;
                    }
                    this.zzI.zzv();
                } else {
                    int i17 = 0;
                    for (int i18 = 0; i18 < size2; i18++) {
                        if (((zzams) listZzb.get(i18)).zza.zzm) {
                            i17++;
                        }
                    }
                    zzgtr.zzi(sparseArray2.size() == i17);
                    for (int i19 = 0; i19 < size2; i19++) {
                        zzams zzamsVar2 = (zzams) listZzb.get(i19);
                        zzamp zzampVar2 = zzamsVar2.zza;
                        if (zzampVar2.zzm) {
                            int i20 = zzampVar2.zza;
                            ((zzalv) sparseArray2.get(i20)).zza(zzamsVar2, zzp(sparseArray, i20));
                        }
                    }
                }
            } else {
                boolean z4 = true;
                int i21 = 16;
                int i22 = 0;
                if (i9 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i23 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list2 = zzfzVar.zzc;
                    int size3 = list2.size();
                    int i24 = 0;
                    while (i24 < size3) {
                        zzfz zzfzVar2 = (zzfz) list2.get(i24);
                        if (zzfzVar2.zzd == 1953653094) {
                            zzga zzgaVarZzc3 = zzfzVar2.zzc(1952868452);
                            zzgaVarZzc3.getClass();
                            zzeu zzeuVar3 = zzgaVarZzc3.zza;
                            zzeuVar3.zzh(i11);
                            int iZzB5 = zzeuVar3.zzB();
                            int i25 = zzalo.zza;
                            zzalv zzalvVar4 = (zzalv) sparseArray3.get(zzeuVar3.zzB());
                            if (zzalvVar4 == null) {
                                zzalvVar4 = null;
                            } else {
                                if ((iZzB5 & 1) != 0) {
                                    long jZzJ = zzeuVar3.zzJ();
                                    zzamr zzamrVar = zzalvVar4.zzb;
                                    zzamrVar.zzb = jZzJ;
                                    zzamrVar.zzc = jZzJ;
                                }
                                zzalp zzalpVar = zzalvVar4.zze;
                                zzalvVar4.zzb.zza = new zzalp((iZzB5 & 2) != 0 ? zzeuVar3.zzB() - 1 : zzalpVar.zza, (iZzB5 & 8) != 0 ? zzeuVar3.zzB() : zzalpVar.zzb, (iZzB5 & 16) != 0 ? zzeuVar3.zzB() : zzalpVar.zzc, (iZzB5 & 32) != 0 ? zzeuVar3.zzB() : zzalpVar.zzd);
                            }
                            if (zzalvVar4 == null) {
                                i = 8;
                            } else {
                                zzamr zzamrVar2 = zzalvVar4.zzb;
                                long j5 = zzamrVar2.zzp;
                                boolean z5 = zzamrVar2.zzq;
                                zzalvVar4.zzc();
                                boolean z6 = z4;
                                zzalvVar4.zzl(z6);
                                zzga zzgaVarZzc4 = zzfzVar2.zzc(1952867444);
                                if (zzgaVarZzc4 == null || (i23 & 2) != 0) {
                                    zzamrVar2.zzp = j5;
                                    zzamrVar2.zzq = z5;
                                } else {
                                    zzeu zzeuVar4 = zzgaVarZzc4.zza;
                                    zzeuVar4.zzh(8);
                                    zzamrVar2.zzp = zzalo.zza(zzeuVar4.zzB()) == z6 ? zzeuVar4.zzJ() : zzeuVar4.zzz();
                                    zzamrVar2.zzq = z6;
                                }
                                List list3 = zzfzVar2.zzb;
                                int size4 = list3.size();
                                i23 = i23;
                                int i26 = i22;
                                int i27 = i26;
                                int i28 = i27;
                                while (true) {
                                    i2 = 1953658222;
                                    if (i26 >= size4) {
                                        break;
                                    }
                                    List list4 = list2;
                                    zzga zzgaVar2 = (zzga) list3.get(i26);
                                    int i29 = size3;
                                    if (zzgaVar2.zzd == 1953658222) {
                                        zzeu zzeuVar5 = zzgaVar2.zza;
                                        zzeuVar5.zzh(12);
                                        int iZzH = zzeuVar5.zzH();
                                        if (iZzH > 0) {
                                            i28 += iZzH;
                                            i27++;
                                        }
                                    }
                                    i26++;
                                    size3 = i29;
                                    list2 = list4;
                                }
                                list2 = list2;
                                size3 = size3;
                                int i30 = i22;
                                zzalvVar4.zzh = i30;
                                zzalvVar4.zzg = i30;
                                zzalvVar4.zzf = i30;
                                zzamrVar2.zzd = i27;
                                zzamrVar2.zze = i28;
                                if (zzamrVar2.zzg.length < i27) {
                                    zzamrVar2.zzf = new long[i27];
                                    zzamrVar2.zzg = new int[i27];
                                }
                                if (zzamrVar2.zzh.length < i28) {
                                    int i31 = (i28 * 125) / 100;
                                    zzamrVar2.zzh = new int[i31];
                                    zzamrVar2.zzi = new long[i31];
                                    zzamrVar2.zzj = new boolean[i31];
                                    zzamrVar2.zzl = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (i32 < size4) {
                                    long jZzc = 0;
                                    zzga zzgaVar3 = (zzga) list3.get(i32);
                                    if (zzgaVar3.zzd == i2) {
                                        int i35 = i33 + 1;
                                        zzeu zzeuVar6 = zzgaVar3.zza;
                                        zzeuVar6.zzh(8);
                                        int iZzB6 = zzeuVar6.zzB();
                                        zzamp zzampVar3 = zzalvVar4.zzd.zza;
                                        int i36 = i33;
                                        zzalp zzalpVar2 = zzamrVar2.zza;
                                        String str = zzfm.zza;
                                        zzamrVar2.zzg[i36] = zzeuVar6.zzH();
                                        long[] jArr3 = zzamrVar2.zzf;
                                        int i37 = i34;
                                        long j6 = zzamrVar2.zzb;
                                        jArr3[i36] = j6;
                                        if ((iZzB6 & 1) != 0) {
                                            jArr3[i36] = j6 + ((long) zzeuVar6.zzB());
                                        }
                                        boolean z7 = (iZzB6 & 4) != 0;
                                        int i38 = zzalpVar2.zzd;
                                        int iZzB7 = z7 ? zzeuVar6.zzB() : i38;
                                        boolean z8 = z7;
                                        int i39 = iZzB6 & 256;
                                        int i40 = iZzB6 & 512;
                                        int i41 = iZzB6 & 1024;
                                        int i42 = iZzB6 & 2048;
                                        zzhao zzhaoVar2 = zzampVar3.zzi;
                                        if (zzhaoVar2 != null) {
                                            i5 = i41;
                                            i4 = size4;
                                            if (zzhaoVar2.zzb() == 1 && (zzhaoVar = zzampVar3.zzj) != null) {
                                                if (zzhaoVar2.zzc(0) == 0) {
                                                    zzalvVar2 = zzalvVar4;
                                                } else {
                                                    zzalvVar2 = zzalvVar4;
                                                    if (zzfm.zzw(zzhaoVar2.zzc(0), 1000000L, zzampVar3.zzd, RoundingMode.DOWN) + zzfm.zzw(zzhaoVar.zzc(0), 1000000L, zzampVar3.zzc, RoundingMode.DOWN) >= zzampVar3.zze) {
                                                    }
                                                }
                                                jZzc = zzhaoVar.zzc(0);
                                            }
                                            iArr = zzamrVar2.zzh;
                                            jArr = zzamrVar2.zzi;
                                            zArr = zzamrVar2.zzj;
                                            if (zzampVar3.zzb == 2 || (i23 & 1) == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                            i6 = i37 + zzamrVar2.zzg[i36];
                                            i7 = iZzB7;
                                            j2 = zzampVar3.zzc;
                                            j3 = zzamrVar2.zzp;
                                            i8 = i37;
                                            while (i8 < i6) {
                                                if (i39 != 0) {
                                                    iZzB = zzeuVar6.zzB();
                                                } else {
                                                    iZzB = zzalpVar2.zzb;
                                                }
                                                zzk(iZzB);
                                                if (i40 != 0) {
                                                    iZzB2 = zzeuVar6.zzB();
                                                } else {
                                                    iZzB2 = zzalpVar2.zzc;
                                                }
                                                zzk(iZzB2);
                                                if (i5 != 0) {
                                                    iZzB3 = zzeuVar6.zzB();
                                                } else if (i8 != 0) {
                                                    iZzB3 = i38;
                                                } else if (z8) {
                                                    iZzB3 = i7;
                                                    i8 = 0;
                                                } else {
                                                    i8 = 0;
                                                    iZzB3 = i38;
                                                }
                                                if (i42 != 0) {
                                                    iZzB4 = zzeuVar6.zzB();
                                                } else {
                                                    iZzB4 = 0;
                                                }
                                                zzalp zzalpVar3 = zzalpVar2;
                                                jZzw = zzfm.zzw((((long) iZzB4) + j3) - jZzc, 1000000L, j2, RoundingMode.DOWN);
                                                jArr[i8] = jZzw;
                                                if (zzamrVar2.zzq) {
                                                    zzalvVar3 = zzalvVar2;
                                                    jArr2 = jArr;
                                                } else {
                                                    zzalvVar3 = zzalvVar2;
                                                    jArr2 = jArr;
                                                    jArr2[i8] = jZzw + zzalvVar3.zzd.zzi;
                                                }
                                                iArr[i8] = iZzB2;
                                                if (((iZzB3 >> 16) & 1) != 0) {
                                                    z3 = false;
                                                } else if (z2) {
                                                    z3 = true;
                                                } else if (i8 == 0) {
                                                    z3 = true;
                                                    i8 = 0;
                                                } else {
                                                    z3 = false;
                                                }
                                                zArr[i8] = z3;
                                                j3 += (long) iZzB;
                                                jArr = jArr2;
                                                zzalpVar2 = zzalpVar3;
                                                zzalvVar2 = zzalvVar3;
                                                i8++;
                                                z2 = z2;
                                            }
                                            zzalvVar = zzalvVar2;
                                            zzamrVar2.zzp = j3;
                                            i34 = i6;
                                            i33 = i35;
                                        } else {
                                            i5 = i41;
                                            i4 = size4;
                                        }
                                        zzalvVar2 = zzalvVar4;
                                        iArr = zzamrVar2.zzh;
                                        jArr = zzamrVar2.zzi;
                                        zArr = zzamrVar2.zzj;
                                        if (zzampVar3.zzb == 2) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        i6 = i37 + zzamrVar2.zzg[i36];
                                        i7 = iZzB7;
                                        j2 = zzampVar3.zzc;
                                        j3 = zzamrVar2.zzp;
                                        i8 = i37;
                                        while (i8 < i6) {
                                            if (i39 != 0) {
                                                iZzB = zzeuVar6.zzB();
                                            } else {
                                                iZzB = zzalpVar2.zzb;
                                            }
                                            zzk(iZzB);
                                            if (i40 != 0) {
                                                iZzB2 = zzeuVar6.zzB();
                                            } else {
                                                iZzB2 = zzalpVar2.zzc;
                                            }
                                            zzk(iZzB2);
                                            if (i5 != 0) {
                                                iZzB3 = zzeuVar6.zzB();
                                            } else if (i8 != 0) {
                                                iZzB3 = i38;
                                            } else if (z8) {
                                                iZzB3 = i7;
                                                i8 = 0;
                                            } else {
                                                i8 = 0;
                                                iZzB3 = i38;
                                            }
                                            if (i42 != 0) {
                                                iZzB4 = zzeuVar6.zzB();
                                            } else {
                                                iZzB4 = 0;
                                            }
                                            zzalp zzalpVar4 = zzalpVar2;
                                            jZzw = zzfm.zzw((((long) iZzB4) + j3) - jZzc, 1000000L, j2, RoundingMode.DOWN);
                                            jArr[i8] = jZzw;
                                            if (zzamrVar2.zzq) {
                                                zzalvVar3 = zzalvVar2;
                                                jArr2 = jArr;
                                                jArr2[i8] = jZzw + zzalvVar3.zzd.zzi;
                                            } else {
                                                zzalvVar3 = zzalvVar2;
                                                jArr2 = jArr;
                                            }
                                            iArr[i8] = iZzB2;
                                            if (((iZzB3 >> 16) & 1) != 0) {
                                                z3 = false;
                                            } else if (z2) {
                                                z3 = true;
                                            } else if (i8 == 0) {
                                                z3 = true;
                                                i8 = 0;
                                            } else {
                                                z3 = false;
                                            }
                                            zArr[i8] = z3;
                                            j3 += (long) iZzB;
                                            jArr = jArr2;
                                            zzalpVar2 = zzalpVar4;
                                            zzalvVar2 = zzalvVar3;
                                            i8++;
                                            z2 = z2;
                                        }
                                        zzalvVar = zzalvVar2;
                                        zzamrVar2.zzp = j3;
                                        i34 = i6;
                                        i33 = i35;
                                    } else {
                                        i4 = size4;
                                        zzalvVar = zzalvVar4;
                                    }
                                    zzalvVar4 = zzalvVar;
                                    i24 = i24;
                                    size4 = i4;
                                    i32++;
                                    i2 = 1953658222;
                                }
                                i24 = i24;
                                zzamp zzampVar4 = zzalvVar4.zzd.zza;
                                zzalp zzalpVar5 = zzamrVar2.zza;
                                zzalpVar5.getClass();
                                zzamq zzamqVarZza = zzampVar4.zza(zzalpVar5.zza);
                                zzga zzgaVarZzc5 = zzfzVar2.zzc(1935763834);
                                if (zzgaVarZzc5 != null) {
                                    zzamqVarZza.getClass();
                                    int i43 = zzamqVarZza.zzd;
                                    zzeu zzeuVar7 = zzgaVarZzc5.zza;
                                    zzeuVar7.zzh(8);
                                    if ((zzeuVar7.zzB() & 1) == 1) {
                                        zzeuVar7.zzk(8);
                                    }
                                    int iZzs = zzeuVar7.zzs();
                                    int iZzH2 = zzeuVar7.zzH();
                                    int i44 = zzamrVar2.zze;
                                    if (iZzH2 > i44) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzH2).length() + 56 + String.valueOf(i44).length());
                                        sb.append("Saiz sample count ");
                                        sb.append(iZzH2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i44);
                                        throw zzat.zzb(sb.toString(), null);
                                    }
                                    if (iZzs == 0) {
                                        boolean[] zArr2 = zzamrVar2.zzl;
                                        i3 = 0;
                                        for (int i45 = 0; i45 < iZzH2; i45++) {
                                            int iZzs2 = zzeuVar7.zzs();
                                            i3 += iZzs2;
                                            zArr2[i45] = iZzs2 > i43;
                                        }
                                        z = false;
                                    } else {
                                        boolean z9 = iZzs > i43;
                                        i3 = iZzs * iZzH2;
                                        z = false;
                                        Arrays.fill(zzamrVar2.zzl, 0, iZzH2, z9);
                                    }
                                    Arrays.fill(zzamrVar2.zzl, iZzH2, zzamrVar2.zze, z);
                                    if (i3 > 0) {
                                        zzamrVar2.zza(i3);
                                    }
                                }
                                zzga zzgaVarZzc6 = zzfzVar2.zzc(1935763823);
                                if (zzgaVarZzc6 != null) {
                                    zzeu zzeuVar8 = zzgaVarZzc6.zza;
                                    zzeuVar8.zzh(8);
                                    int iZzB8 = zzeuVar8.zzB();
                                    if ((iZzB8 & 1) == 1) {
                                        zzeuVar8.zzk(8);
                                    }
                                    int iZzH3 = zzeuVar8.zzH();
                                    if (iZzH3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzH3).length() + 29);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(iZzH3);
                                        throw zzat.zzb(sb2.toString(), null);
                                    }
                                    zzamrVar2.zzc += zzalo.zza(iZzB8) == 0 ? zzeuVar8.zzz() : zzeuVar8.zzJ();
                                }
                                zzga zzgaVarZzc7 = zzfzVar2.zzc(1936027235);
                                if (zzgaVarZzc7 != null) {
                                    zzl(zzgaVarZzc7.zza, 0, zzamrVar2);
                                }
                                String str2 = zzamqVarZza != null ? zzamqVarZza.zzb : null;
                                zzeu zzeuVar9 = null;
                                zzeu zzeuVar10 = null;
                                for (int i46 = 0; i46 < list3.size(); i46++) {
                                    zzga zzgaVar4 = (zzga) list3.get(i46);
                                    zzeu zzeuVar11 = zzgaVar4.zza;
                                    int i47 = zzgaVar4.zzd;
                                    if (i47 == 1935828848) {
                                        zzeuVar11.zzh(12);
                                        if (zzeuVar11.zzB() == 1936025959) {
                                            zzeuVar9 = zzeuVar11;
                                        }
                                    } else if (i47 == 1936158820) {
                                        zzeuVar11.zzh(12);
                                        if (zzeuVar11.zzB() == 1936025959) {
                                            zzeuVar10 = zzeuVar11;
                                        }
                                    }
                                }
                                if (zzeuVar9 == null || zzeuVar10 == null) {
                                    z4 = true;
                                } else {
                                    zzeuVar9.zzh(8);
                                    int iZza = zzalo.zza(zzeuVar9.zzB());
                                    zzeuVar9.zzk(4);
                                    if (iZza == 1) {
                                        zzeuVar9.zzk(4);
                                    }
                                    if (zzeuVar9.zzB() != 1) {
                                        throw zzat.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzeuVar10.zzh(8);
                                    int iZza2 = zzalo.zza(zzeuVar10.zzB());
                                    zzeuVar10.zzk(4);
                                    if (iZza2 == 1) {
                                        if (zzeuVar10.zzz() == 0) {
                                            throw zzat.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iZza2 >= 2) {
                                        zzeuVar10.zzk(4);
                                    }
                                    if (zzeuVar10.zzz() != 1) {
                                        throw zzat.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    z4 = true;
                                    zzeuVar10.zzk(1);
                                    int iZzs3 = zzeuVar10.zzs();
                                    int i48 = (iZzs3 & 240) >> 4;
                                    int i49 = iZzs3 & 15;
                                    if (zzeuVar10.zzs() == 1) {
                                        int iZzs4 = zzeuVar10.zzs();
                                        int i50 = i21;
                                        byte[] bArr3 = new byte[i50];
                                        zzeuVar10.zzm(bArr3, 0, i50);
                                        if (iZzs4 == 0) {
                                            int iZzs5 = zzeuVar10.zzs();
                                            byte[] bArr4 = new byte[iZzs5];
                                            zzeuVar10.zzm(bArr4, 0, iZzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzamrVar2.zzk = true;
                                        zzamrVar2.zzm = new zzamq(true, str2, iZzs4, bArr3, i48, i49, bArr);
                                    }
                                }
                                int size5 = list3.size();
                                for (int i51 = 0; i51 < size5; i51++) {
                                    zzga zzgaVar5 = (zzga) list3.get(i51);
                                    if (zzgaVar5.zzd == 1970628964) {
                                        zzeu zzeuVar12 = zzgaVar5.zza;
                                        zzeuVar12.zzh(8);
                                        zzeuVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzl(zzeuVar12, 16, zzamrVar2);
                                        }
                                    }
                                }
                                i = 8;
                                i22 = 0;
                                i21 = 16;
                            }
                            i24++;
                            i11 = i;
                            i22 = i22;
                            z4 = z4;
                            i21 = i21;
                            i23 = i23;
                            size3 = size3;
                            list2 = list2;
                        } else {
                            i = i11;
                        }
                        i24++;
                        i11 = i;
                        i22 = i22;
                        z4 = z4;
                        i21 = i21;
                        i23 = i23;
                        size3 = size3;
                        list2 = list2;
                    }
                    int i52 = i22;
                    zzq zzqVarZzn2 = zzn(zzfzVar.zzb);
                    if (zzqVarZzn2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i53 = i52; i53 < size6; i53++) {
                            ((zzalv) sparseArray3.valueAt(i53)).zzb(zzqVarZzn2);
                        }
                    }
                    if (this.zzz != -9223372036854775807L) {
                        int size7 = sparseArray3.size();
                        for (int i54 = i52; i54 < size7; i54++) {
                            zzalv zzalvVar5 = (zzalv) sparseArray3.valueAt(i54);
                            long j7 = this.zzz;
                            int i55 = zzalvVar5.zzf;
                            while (true) {
                                zzamr zzamrVar3 = zzalvVar5.zzb;
                                if (i55 >= zzamrVar3.zze || zzamrVar3.zzi[i55] > j7) {
                                    break;
                                }
                                if (zzamrVar3.zzj[i55]) {
                                    zzalvVar5.zzi = i55;
                                }
                                i55++;
                            }
                        }
                        this.zzz = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzfz) arrayDeque.peek()).zzb(zzfzVar);
                }
            }
        }
        zzi();
    }

    private static int zzk(int i) throws zzat {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzat.zzb(sb.toString(), null);
    }

    private static void zzl(zzeu zzeuVar, int i, zzamr zzamrVar) throws zzat {
        zzeuVar.zzh(i + 8);
        int iZzB = zzeuVar.zzB();
        int i2 = zzalo.zza;
        if ((iZzB & 1) != 0) {
            throw zzat.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iZzB & 2) != 0;
        int iZzH = zzeuVar.zzH();
        if (iZzH == 0) {
            Arrays.fill(zzamrVar.zzl, 0, zzamrVar.zze, false);
            return;
        }
        int i3 = zzamrVar.zze;
        if (iZzH != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(iZzH).length() + 58 + String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(iZzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        Arrays.fill(zzamrVar.zzl, 0, iZzH, z);
        zzamrVar.zza(zzeuVar.zzd());
        zzeu zzeuVar2 = zzamrVar.zzn;
        zzeuVar.zzm(zzeuVar2.zzi(), 0, zzeuVar2.zze());
        zzeuVar2.zzh(0);
        zzamrVar.zzo = false;
    }

    private static Pair zzm(zzeu zzeuVar, long j) throws zzat {
        long jZzJ;
        long jZzJ2;
        zzeu zzeuVar2 = zzeuVar;
        zzeuVar2.zzh(8);
        int iZza = zzalo.zza(zzeuVar2.zzB());
        zzeuVar2.zzk(4);
        long jZzz = zzeuVar2.zzz();
        if (iZza == 0) {
            jZzJ = zzeuVar2.zzz();
            jZzJ2 = zzeuVar2.zzz();
        } else {
            jZzJ = zzeuVar2.zzJ();
            jZzJ2 = zzeuVar2.zzJ();
        }
        long j2 = j + jZzJ2;
        long jZzw = zzfm.zzw(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
        zzeuVar2.zzk(2);
        int iZzt = zzeuVar2.zzt();
        int[] iArr = new int[iZzt];
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        long[] jArr3 = new long[iZzt];
        long j3 = j2;
        long j4 = jZzw;
        int i = 0;
        while (i < iZzt) {
            int iZzB = zzeuVar2.zzB();
            if ((Integer.MIN_VALUE & iZzB) != 0) {
                throw zzat.zzb("Unhandled indirect reference", null);
            }
            long jZzz2 = zzeuVar2.zzz();
            iArr[i] = iZzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jZzJ += jZzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jZzw2 = zzfm.zzw(jZzJ, 1000000L, jZzz, RoundingMode.DOWN);
            jArr4[i] = jZzw2 - jArr5[i];
            zzeuVar2.zzk(4);
            j3 += (long) iArr[i];
            i++;
            zzeuVar2 = zzeuVar;
            iZzt = iZzt;
            j4 = jZzw2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jZzw), new zzafo(iArr, jArr, jArr2, jArr3));
    }

    private static zzq zzn(List list) {
        int i;
        UUID[] uuidArr;
        zzamk zzamkVar;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            zzga zzgaVar = (zzga) list.get(i2);
            if (zzgaVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrZzi = zzgaVar.zza.zzi();
                zzeu zzeuVar = new zzeu(bArrZzi);
                if (zzeuVar.zze() < 32) {
                    i = i2;
                    zzamkVar = null;
                } else {
                    zzeuVar.zzh(0);
                    int iZzd = zzeuVar.zzd();
                    int iZzB = zzeuVar.zzB();
                    if (iZzB != iZzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzB).length() + 52 + String.valueOf(iZzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(iZzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(iZzd);
                        zzeh.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int iZzB2 = zzeuVar.zzB();
                        if (iZzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(iZzB2);
                            zzeh.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int iZza = zzalo.zza(zzeuVar.zzB());
                            if (iZza > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(iZza).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(iZza);
                                zzeh.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid = new UUID(zzeuVar.zzD(), zzeuVar.zzD());
                                if (iZza == 1) {
                                    int iZzH = zzeuVar.zzH();
                                    uuidArr = new UUID[iZzH];
                                    int i3 = 0;
                                    while (i3 < iZzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(zzeuVar.zzD(), zzeuVar.zzD());
                                        i3 = i4 + 1;
                                        i2 = i2;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i = i2;
                                int iZzH2 = zzeuVar.zzH();
                                int iZzd2 = zzeuVar.zzd();
                                if (iZzH2 != iZzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzH2).length() + 49 + String.valueOf(iZzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(iZzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(iZzd2);
                                    zzeh.zzc("PsshAtomUtil", sb4.toString());
                                    zzamkVar = null;
                                } else {
                                    byte[] bArr = new byte[iZzH2];
                                    zzeuVar.zzm(bArr, 0, iZzH2);
                                    zzamkVar = new zzamk(uuid, iZza, bArr, uuidArr);
                                }
                            }
                        }
                    }
                    i = i2;
                    zzamkVar = null;
                }
                UUID uuid2 = zzamkVar == null ? null : zzamkVar.zza;
                if (uuid2 == null) {
                    zzeh.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new zzp(uuid2, null, "video/mp4", bArrZzi));
                }
                i2 = i + 1;
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzq(arrayList);
    }

    private final void zzo(zzahd zzahdVar, zzaha zzahaVar) {
        this.zzI.zzw(zzahdVar);
        this.zzL = true;
        zzahaVar.zza = this.zzO;
        zzi();
    }

    private static final zzalp zzp(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzalp) sparseArray.valueAt(0);
        }
        zzalp zzalpVar = (zzalp) sparseArray.get(i);
        zzalpVar.getClass();
        return zzalpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzahh zzahhVarZza = zzamn.zza(zzagbVar);
        this.zzr = zzahhVarZza != null ? zzgwt.zzj(zzahhVarZza) : zzgwt.zzi();
        return zzahhVarZza == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzagdVar = new zzant(zzagdVar, this.zzc);
        }
        this.zzI = zzagdVar;
        zzi();
        zzahm[] zzahmVarArr = new zzahm[2];
        this.zzJ = zzahmVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzahmVarArr[0] = this.zzI.zzs(100, 5);
            i = 1;
            i3 = TypedValues.TYPE_TARGET;
        } else {
            i = 0;
        }
        zzahm[] zzahmVarArr2 = (zzahm[]) zzfm.zzb(this.zzJ, i);
        this.zzJ = zzahmVarArr2;
        for (zzahm zzahmVar : zzahmVarArr2) {
            zzahmVar.zzA(zzb);
        }
        List list = this.zze;
        this.zzK = new zzahm[list.size()];
        while (i4 < this.zzK.length) {
            zzahm zzahmVarZzs = this.zzI.zzs(i3, 3);
            zzahmVarZzs.zzA((zzv) list.get(i4));
            this.zzK[i4] = zzahmVarZzs;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:389:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:391:0x08f7 A[LOOP:1: B:390:0x08f5->B:391:0x08f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:394:0x090d  */
    /* JADX WARN: Code duplicated, block: B:395:0x091a  */
    /* JADX WARN: Code duplicated, block: B:490:0x0a2c  */
    /* JADX WARN: Code duplicated, block: B:492:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:497:0x0a73  */
    /* JADX WARN: Code duplicated, block: B:498:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        boolean z;
        zzalv zzalvVar;
        char c;
        int iZza;
        int iZzc;
        int iZzi;
        int i;
        int i2;
        SparseArray sparseArray;
        long j;
        long jZzz;
        long j2;
        long jZzw;
        long jZzz2;
        String str;
        String str2;
        long j3;
        int i3;
        int i4;
        long j4;
        long j5;
        SparseArray sparseArray2;
        int size;
        int i5;
        while (true) {
            int i6 = this.zzs;
            char c2 = 2;
            int i7 = 8;
            z = false;
            if (i6 == 0) {
                if (this.zzv == 0) {
                    zzeu zzeuVar = this.zzm;
                    if (!zzagbVar.zzb(zzeuVar.zzi(), 0, 8, true)) {
                        long j6 = this.zzN;
                        if (j6 == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzahaVar.zza = j6;
                        this.zzN = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        this.zzM = true;
                        return 1;
                    }
                    this.zzv = 8;
                    zzeuVar.zzh(0);
                    this.zzu = zzeuVar.zzz();
                    this.zzt = zzeuVar.zzB();
                }
                long j7 = this.zzu;
                if (j7 == 1) {
                    zzeu zzeuVar2 = this.zzm;
                    zzagbVar.zzc(zzeuVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzeuVar2.zzJ();
                } else if (j7 == 0) {
                    long jZzo = zzagbVar.zzo();
                    if (jZzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        jZzo = !arrayDeque.isEmpty() ? ((zzfz) arrayDeque.peek()).zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzu = (jZzo - zzagbVar.zzn()) + ((long) this.zzv);
                    }
                }
                long j8 = this.zzu;
                int i8 = this.zzv;
                long j9 = i8;
                if (j8 < j9) {
                    if (this.zzt != 1718773093 || i8 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzu = j9;
                    j8 = j9;
                }
                if (this.zzN != -1) {
                    if (this.zzt == 1936286840) {
                        zzeu zzeuVar3 = this.zzk;
                        zzeuVar3.zza((int) j8);
                        System.arraycopy(this.zzm.zzi(), 0, zzeuVar3.zzi(), 0, 8);
                        zzagbVar.zzc(zzeuVar3.zzi(), 8, (int) (this.zzu - ((long) this.zzv)));
                        this.zzq.zza((zzafo) zzm(new zzga(1936286840, zzeuVar3).zza, zzagbVar.zzm()).second);
                    } else {
                        zzagbVar.zze((int) (j8 - j9), true);
                    }
                    zzi();
                } else {
                    long jZzn = zzagbVar.zzn() - j9;
                    int i9 = this.zzt;
                    if (!(i9 == 1836019558 || i9 == 1835295092) || this.zzL) {
                        if (this.zzt == 1836019558) {
                            sparseArray2 = this.zzf;
                            size = sparseArray2.size();
                            for (i5 = 0; i5 < size; i5++) {
                                zzamr zzamrVar = ((zzalv) sparseArray2.valueAt(i5)).zzb;
                                zzamrVar.zzc = jZzn;
                                zzamrVar.zzb = jZzn;
                            }
                        }
                        i4 = this.zzt;
                        if (i4 == 1835295092) {
                            this.zzC = null;
                            this.zzx = jZzn + this.zzu;
                            this.zzs = 2;
                        } else if (i4 != 1836019574) {
                            long jZzn2 = zzagbVar.zzn();
                            j4 = this.zzu;
                            long j10 = jZzn2 + j4;
                            if (j4 != this.zzv) {
                                zzeu zzeuVar4 = this.zzk;
                                zzeuVar4.zza(8);
                                zzagbVar.zzi(zzeuVar4.zzi(), 0, 8);
                                zzalo.zzf(zzeuVar4);
                                zzagbVar.zzf(zzeuVar4.zzg());
                                zzagbVar.zzl();
                            }
                            j5 = j10 - 8;
                            this.zzn.push(new zzfz(this.zzt, j5));
                            if (this.zzu == this.zzv) {
                                zzj(j5);
                            } else {
                                zzi();
                            }
                        } else {
                            long jZzn3 = zzagbVar.zzn();
                            j4 = this.zzu;
                            long j11 = jZzn3 + j4;
                            if (j4 != this.zzv) {
                                zzeu zzeuVar5 = this.zzk;
                                zzeuVar5.zza(8);
                                zzagbVar.zzi(zzeuVar5.zzi(), 0, 8);
                                zzalo.zzf(zzeuVar5);
                                zzagbVar.zzf(zzeuVar5.zzg());
                                zzagbVar.zzl();
                            }
                            j5 = j11 - 8;
                            this.zzn.push(new zzfz(this.zzt, j5));
                            if (this.zzu == this.zzv) {
                                zzj(j5);
                            } else {
                                zzi();
                            }
                        }
                    } else if (zzagbVar.zzo() == -1 || this.zzO != -1 || (this.zzd & 512) == 0) {
                        this.zzI.zzw(new zzahc(this.zzA, jZzn));
                        this.zzL = true;
                        if (this.zzt == 1836019558) {
                            sparseArray2 = this.zzf;
                            size = sparseArray2.size();
                            while (i5 < size) {
                                zzamr zzamrVar2 = ((zzalv) sparseArray2.valueAt(i5)).zzb;
                                zzamrVar2.zzc = jZzn;
                                zzamrVar2.zzb = jZzn;
                            }
                        }
                        i4 = this.zzt;
                        if (i4 == 1835295092) {
                            this.zzC = null;
                            this.zzx = jZzn + this.zzu;
                            this.zzs = 2;
                        } else if (i4 != 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1836019558 || i4 == 1953653094 || i4 == 1836475768 || i4 == 1701082227 || i4 == 1835365473) {
                            long jZzn4 = zzagbVar.zzn();
                            j4 = this.zzu;
                            long j12 = jZzn4 + j4;
                            if (j4 != this.zzv && i4 == 1835365473) {
                                zzeu zzeuVar6 = this.zzk;
                                zzeuVar6.zza(8);
                                zzagbVar.zzi(zzeuVar6.zzi(), 0, 8);
                                zzalo.zzf(zzeuVar6);
                                zzagbVar.zzf(zzeuVar6.zzg());
                                zzagbVar.zzl();
                            }
                            j5 = j12 - 8;
                            this.zzn.push(new zzfz(this.zzt, j5));
                            if (this.zzu == this.zzv) {
                                zzj(j5);
                            } else {
                                zzi();
                            }
                        } else if (i4 == 1751411826 || i4 == 1835296868 || i4 == 1836476516 || i4 == 1936286840 || i4 == 1937011556 || i4 == 1937011827 || i4 == 1668576371 || i4 == 1937011555 || i4 == 1937011578 || i4 == 1937013298 || i4 == 1937007471 || i4 == 1668232756 || i4 == 1937011571 || i4 == 1952867444 || i4 == 1952868452 || i4 == 1953196132 || i4 == 1953654136 || i4 == 1953658222 || i4 == 1886614376 || i4 == 1935763834 || i4 == 1935763823 || i4 == 1936027235 || i4 == 1970628964 || i4 == 1935828848 || i4 == 1936158820 || i4 == 1701606260 || i4 == 1835362404 || i4 == 1701671783 || i4 == 1969517665 || i4 == 1801812339 || i4 == 1768715124) {
                            if (this.zzv != 8) {
                                throw zzat.zzc("Leaf atom defines extended atom size (unsupported).");
                            }
                            if (this.zzu > 2147483647L) {
                                throw zzat.zzc("Leaf atom with length > 2147483647 (unsupported).");
                            }
                            zzeu zzeuVar7 = new zzeu((int) this.zzu);
                            System.arraycopy(this.zzm.zzi(), 0, zzeuVar7.zzi(), 0, 8);
                            this.zzw = zzeuVar7;
                            this.zzs = 1;
                        } else {
                            if (this.zzu > 2147483647L) {
                                throw zzat.zzc("Skipping atom with length > 2147483647 (unsupported).");
                            }
                            this.zzw = null;
                            this.zzs = 1;
                        }
                    } else {
                        this.zzO = jZzn;
                        zzahaVar.zza = zzagbVar.zzo() - 16;
                        this.zzs = 5;
                    }
                }
                if (this.zzs == 5) {
                    return 1;
                }
            } else if (i6 != 1) {
                long j13 = Long.MAX_VALUE;
                if (i6 == 2) {
                    SparseArray sparseArray3 = this.zzf;
                    int size2 = sparseArray3.size();
                    zzalv zzalvVar2 = null;
                    for (int i10 = 0; i10 < size2; i10++) {
                        zzamr zzamrVar3 = ((zzalv) sparseArray3.valueAt(i10)).zzb;
                        if (zzamrVar3.zzo) {
                            long j14 = zzamrVar3.zzc;
                            if (j14 < j13) {
                                zzalvVar2 = (zzalv) sparseArray3.valueAt(i10);
                                j13 = j14;
                            }
                        }
                    }
                    if (zzalvVar2 == null) {
                        this.zzs = 3;
                    } else {
                        int iZzn = (int) (j13 - zzagbVar.zzn());
                        if (iZzn < 0) {
                            throw zzat.zzb("Offset to encryption data was negative.", null);
                        }
                        zzagbVar.zzf(iZzn);
                        zzamr zzamrVar4 = zzalvVar2.zzb;
                        zzeu zzeuVar8 = zzamrVar4.zzn;
                        zzagbVar.zzc(zzeuVar8.zzi(), 0, zzeuVar8.zze());
                        zzeuVar8.zzh(0);
                        zzamrVar4.zzo = false;
                    }
                } else if (i6 == 5) {
                    zzeu zzeuVar9 = this.zzk;
                    zzeuVar9.zza(16);
                    if (zzagbVar.zzb(zzeuVar9.zzi(), 0, 16, true)) {
                        zzeuVar9.zzh(0);
                        int iZzB = zzeuVar9.zzB();
                        int iZzB2 = zzeuVar9.zzB();
                        if (iZzB == 16 && iZzB2 == 1835430511) {
                            zzeuVar9.zzk(4);
                            long jZzz3 = zzeuVar9.zzz();
                            long jZzo2 = zzagbVar.zzo() - jZzz3;
                            if (jZzz3 <= 0 || jZzz3 > 2147483647L || jZzo2 < 0 || jZzo2 < this.zzO) {
                                zzo(new zzahc(this.zzA, this.zzO), zzahaVar);
                            } else {
                                zzahaVar.zza = jZzo2;
                                this.zzs = 6;
                            }
                        } else {
                            zzo(new zzahc(this.zzA, this.zzO), zzahaVar);
                        }
                    } else {
                        zzo(new zzahc(this.zzA, this.zzO), zzahaVar);
                    }
                    int i11 = this.zzs;
                    if (i11 == 6 || i11 == 0) {
                        return 1;
                    }
                } else if (i6 != 6) {
                    zzalvVar = this.zzC;
                    if (zzalvVar != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray4 = this.zzf;
                    int size3 = sparseArray4.size();
                    zzalv zzalvVar3 = null;
                    int i12 = 0;
                    while (i12 < size3) {
                        char c3 = c2;
                        zzalv zzalvVar4 = (zzalv) sparseArray4.valueAt(i12);
                        if ((zzalvVar4.zzk() || zzalvVar4.zzf != zzalvVar4.zzd.zzb) && (!zzalvVar4.zzk() || zzalvVar4.zzh != zzalvVar4.zzb.zzd)) {
                            long jZze = zzalvVar4.zze();
                            if (jZze < j13) {
                                zzalvVar3 = zzalvVar4;
                                j13 = jZze;
                            }
                        }
                        i12++;
                        c2 = c3;
                    }
                    c = c2;
                    if (zzalvVar3 != null) {
                        int iZze = (int) (zzalvVar3.zze() - zzagbVar.zzn());
                        if (iZze < 0) {
                            zzeh.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            iZze = 0;
                        }
                        zzagbVar.zzf(iZze);
                        this.zzC = zzalvVar3;
                        zzalvVar = zzalvVar3;
                        break;
                    }
                    int iZzn2 = (int) (this.zzx - zzagbVar.zzn());
                    if (iZzn2 < 0) {
                        throw zzat.zzb("Offset to end of mdat was negative.", null);
                    }
                    zzagbVar.zzf(iZzn2);
                    zzi();
                } else {
                    int i13 = 2;
                    long jZzo3 = zzagbVar.zzo() - zzagbVar.zzn();
                    zzeu zzeuVar10 = this.zzk;
                    zzeuVar10.zza(8);
                    if (zzagbVar.zzh(zzeuVar10.zzi(), 0, 8, true)) {
                        zzeuVar10.zzh(0);
                        int iZzB3 = zzeuVar10.zzB();
                        if (zzeuVar10.zzB() != 1835430497) {
                            zzo(new zzahc(this.zzA, this.zzO), zzahaVar);
                        } else {
                            int i14 = (int) jZzo3;
                            zzeu zzeuVar11 = new zzeu(i14);
                            zzagbVar.zzc(zzeuVar11.zzi(), 0, i14);
                            zzeuVar11.zzh(iZzB3 == 1 ? 16 : 8);
                            SparseArray sparseArray5 = new SparseArray();
                            SparseArray sparseArray6 = new SparseArray();
                            while (zzeuVar11.zzd() >= i7) {
                                int iZzg = zzeuVar11.zzg();
                                long jZzz4 = zzeuVar11.zzz();
                                int iZzB4 = zzeuVar11.zzB();
                                if (jZzz4 == 1) {
                                    if (zzeuVar11.zzd() < i7) {
                                        break;
                                    }
                                    jZzz4 = zzeuVar11.zzD();
                                } else if (jZzz4 == 0) {
                                    jZzz4 = ((long) zzeuVar11.zze()) - ((long) iZzg);
                                }
                                int i15 = jZzz4 == 1 ? 16 : i7;
                                if (jZzz4 < i15) {
                                    break;
                                }
                                long j15 = iZzg;
                                int i16 = i15;
                                if (jZzz4 > ((long) zzeuVar11.zze()) - j15) {
                                    break;
                                }
                                if (iZzB4 != 1952871009) {
                                    sparseArray = sparseArray6;
                                    j = jZzz4;
                                } else if (jZzz4 < i16 + 16) {
                                    zzeuVar11.zzh((int) (j15 + jZzz4));
                                } else {
                                    int iZza2 = zzalo.zza(zzeuVar11.zzB());
                                    int iZzB5 = zzeuVar11.zzB();
                                    zzalv zzalvVar5 = (zzalv) this.zzf.get(iZzB5);
                                    if (zzalvVar5 == null) {
                                        zzeuVar11.zzh((int) (j15 + jZzz4));
                                    } else {
                                        long j16 = zzalvVar5.zzd.zza.zzc;
                                        int iZzB6 = zzeuVar11.zzB();
                                        int i17 = iZzB6 >> 4;
                                        int i18 = iZzB6 >> 2;
                                        int i19 = iZzB6 & 3;
                                        SparseArray sparseArray7 = sparseArray6;
                                        long jZzz5 = zzeuVar11.zzz();
                                        int i20 = (i17 & 3) + 1;
                                        j = jZzz4;
                                        int i21 = (i18 & 3) + 1;
                                        int i22 = i19 + 1;
                                        if (((iZza2 == 1 ? 16L : 8L) + ((long) i20) + ((long) i21) + ((long) i22)) * jZzz5 > zzeuVar11.zzd()) {
                                            zzeuVar11.zzh((int) (j15 + j));
                                            sparseArray6 = sparseArray7;
                                        } else {
                                            int i23 = (int) jZzz5;
                                            long[] jArr = new long[i23];
                                            long[] jArr2 = new long[i23];
                                            int i24 = 0;
                                            while (i24 < i23) {
                                                int i25 = i23;
                                                if (iZza2 == 1) {
                                                    jZzz = zzeuVar11.zzJ();
                                                    iZza2 = 1;
                                                } else {
                                                    jZzz = zzeuVar11.zzz();
                                                }
                                                long jZzJ = iZza2 == 1 ? zzeuVar11.zzJ() : zzeuVar11.zzz();
                                                zzeuVar11.zzk(i20 + i21 + i22);
                                                jArr[i24] = zzfm.zzw(jZzz, 1000000L, j16, RoundingMode.DOWN);
                                                jArr2[i24] = jZzJ;
                                                i24++;
                                                i23 = i25;
                                                iZza2 = iZza2;
                                            }
                                            sparseArray5.put(iZzB5, jArr);
                                            sparseArray = sparseArray7;
                                            sparseArray.put(iZzB5, jArr2);
                                        }
                                        i7 = 8;
                                    }
                                }
                                zzeuVar11.zzh((int) (j15 + j));
                                sparseArray6 = sparseArray;
                                i7 = 8;
                            }
                            SparseArray sparseArray8 = sparseArray6;
                            if (sparseArray5.size() == 0) {
                                zzo(new zzahc(this.zzA, this.zzO), zzahaVar);
                            } else {
                                int iKeyAt = -1;
                                int i26 = -1;
                                int i27 = 0;
                                while (i27 < sparseArray5.size()) {
                                    int iKeyAt2 = sparseArray5.keyAt(i27);
                                    zzalv zzalvVar6 = (zzalv) this.zzf.get(iKeyAt2);
                                    if (zzalvVar6 != null) {
                                        int i28 = zzalvVar6.zzd.zza.zzb;
                                        if (iKeyAt != -1) {
                                            i2 = iKeyAt;
                                        } else if (i28 == i13) {
                                            iKeyAt = iKeyAt2;
                                        } else {
                                            i2 = -1;
                                        }
                                        if (i26 == -1) {
                                            i26 = i28 == 1 ? iKeyAt2 : -1;
                                        }
                                        iKeyAt = i2;
                                    }
                                    i27++;
                                    i13 = 2;
                                }
                                if (iKeyAt != -1) {
                                    i = iKeyAt;
                                } else if (i26 != -1) {
                                    i = i26;
                                } else {
                                    iKeyAt = sparseArray5.keyAt(0);
                                    i = iKeyAt;
                                }
                                zzo(new zzalu(sparseArray5, sparseArray8, this.zzA, this.zzO, i, null), zzahaVar);
                            }
                        }
                    } else {
                        zzo(new zzahc(this.zzA, this.zzO), zzahaVar);
                    }
                    if (this.zzs == 0) {
                        return 1;
                    }
                }
            } else {
                long j17 = this.zzu - ((long) this.zzv);
                zzeu zzeuVar12 = this.zzw;
                int i29 = (int) j17;
                if (zzeuVar12 != null) {
                    zzagbVar.zzc(zzeuVar12.zzi(), 8, i29);
                    zzga zzgaVar = new zzga(this.zzt, zzeuVar12);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i30 = zzgaVar.zzd;
                        if (i30 == 1936286840) {
                            Pair pairZzm = zzm(zzgaVar.zza, zzagbVar.zzn());
                            zzafp zzafpVar = this.zzq;
                            zzafpVar.zza((zzafo) pairZzm.second);
                            this.zzB = ((Long) pairZzm.first).longValue();
                            if (this.zzM) {
                                i3 = 1;
                            } else {
                                i3 = 1;
                                this.zzI.zzw(zzafpVar.zzc() == 1 ? (zzahd) pairZzm.second : zzafpVar.zzb());
                                this.zzL = true;
                            }
                            if ((this.zzd & 256) != 0 && !this.zzM && zzafpVar.zzc() > i3) {
                                this.zzN = zzagbVar.zzn();
                            }
                        } else if (i30 == 1701671783) {
                            zzeu zzeuVar13 = zzgaVar.zza;
                            if (this.zzJ.length != 0) {
                                zzeuVar13.zzh(8);
                                int iZza3 = zzalo.zza(zzeuVar13.zzB());
                                if (iZza3 == 0) {
                                    String strZzM = zzeuVar13.zzM((char) 0);
                                    strZzM.getClass();
                                    String strZzM2 = zzeuVar13.zzM((char) 0);
                                    strZzM2.getClass();
                                    long jZzz6 = zzeuVar13.zzz();
                                    long jZzw2 = zzfm.zzw(zzeuVar13.zzz(), 1000000L, jZzz6, RoundingMode.DOWN);
                                    long j18 = this.zzB;
                                    long j19 = j18 != -9223372036854775807L ? j18 + jZzw2 : -9223372036854775807L;
                                    long jZzw3 = zzfm.zzw(zzeuVar13.zzz(), 1000L, jZzz6, RoundingMode.DOWN);
                                    long j20 = j19;
                                    j2 = jZzw2;
                                    jZzw = j20;
                                    jZzz2 = zzeuVar13.zzz();
                                    str = strZzM;
                                    str2 = strZzM2;
                                    j3 = jZzw3;
                                } else if (iZza3 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(iZza3).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(iZza3);
                                    zzeh.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long jZzz7 = zzeuVar13.zzz();
                                    jZzw = zzfm.zzw(zzeuVar13.zzJ(), 1000000L, jZzz7, RoundingMode.DOWN);
                                    long jZzw4 = zzfm.zzw(zzeuVar13.zzz(), 1000L, jZzz7, RoundingMode.DOWN);
                                    long jZzz8 = zzeuVar13.zzz();
                                    String strZzM3 = zzeuVar13.zzM((char) 0);
                                    strZzM3.getClass();
                                    String strZzM4 = zzeuVar13.zzM((char) 0);
                                    strZzM4.getClass();
                                    jZzz2 = jZzz8;
                                    str = strZzM3;
                                    str2 = strZzM4;
                                    j3 = jZzw4;
                                    j2 = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzeuVar13.zzd()];
                                zzeuVar13.zzm(bArr, 0, zzeuVar13.zzd());
                                zzeu zzeuVar14 = new zzeu(this.zzl.zza(new zzaje(str, str2, j3, jZzz2, bArr)));
                                int iZzd = zzeuVar14.zzd();
                                for (zzahm zzahmVar : this.zzJ) {
                                    zzeuVar14.zzh(0);
                                    zzahmVar.zzc(zzeuVar14, iZzd);
                                }
                                ArrayDeque arrayDeque3 = this.zzo;
                                if (jZzw == -9223372036854775807L) {
                                    arrayDeque3.addLast(new zzalt(j2, true, iZzd));
                                    this.zzy += iZzd;
                                } else if (arrayDeque3.isEmpty()) {
                                    for (zzahm zzahmVar2 : this.zzJ) {
                                        zzahmVar2.zze(jZzw, 1, iZzd, 0, null);
                                    }
                                } else {
                                    arrayDeque3.addLast(new zzalt(jZzw, false, iZzd));
                                    this.zzy += iZzd;
                                }
                            }
                        }
                    } else {
                        ((zzfz) arrayDeque2.peek()).zza(zzgaVar);
                    }
                } else {
                    zzagbVar.zzf(i29);
                }
                zzj(zzagbVar.zzn());
            }
        }
        if (this.zzs == 3) {
            this.zzD = zzalvVar.zzf();
            String str3 = zzalvVar.zzd.zza.zzg.zzp;
            this.zzG = !(!Objects.equals(str3, "video/avc") ? !Objects.equals(str3, "video/hevc") || (this.zzd & 128) == 0 : (this.zzd & 64) == 0);
            if (zzalvVar.zzf < zzalvVar.zzi) {
                zzagbVar.zzf(this.zzD);
                zzamq zzamqVarZzj = zzalvVar.zzj();
                if (zzamqVarZzj != null) {
                    zzamr zzamrVar5 = zzalvVar.zzb;
                    zzeu zzeuVar15 = zzamrVar5.zzn;
                    int i31 = zzamqVarZzj.zzd;
                    if (i31 != 0) {
                        zzeuVar15.zzk(i31);
                    }
                    if (zzamrVar5.zzb(zzalvVar.zzf)) {
                        zzeuVar15.zzk(zzeuVar15.zzt() * 6);
                    }
                }
                if (!zzalvVar.zzh()) {
                    this.zzC = null;
                }
                this.zzs = 3;
                return 0;
            }
            if (zzalvVar.zzd.zza.zzh == 1) {
                this.zzD -= 8;
                zzagbVar.zzf(8);
            }
            boolean zEquals = "audio/ac4".equals(zzalvVar.zzd.zza.zzg.zzp);
            int i32 = this.zzD;
            if (zEquals) {
                this.zzE = zzalvVar.zzi(i32, 7);
                int i33 = this.zzD;
                zzeu zzeuVar16 = this.zzk;
                zzafd.zzc(i33, zzeuVar16);
                zzalvVar.zza.zzc(zzeuVar16, 7);
                iZzi = this.zzE + 7;
                this.zzE = iZzi;
            } else {
                iZzi = zzalvVar.zzi(i32, 0);
                this.zzE = iZzi;
            }
            this.zzD += iZzi;
            this.zzs = 4;
            this.zzF = 0;
        }
        zzamp zzampVar = zzalvVar.zzd.zza;
        zzahm zzahmVar3 = zzalvVar.zza;
        long jZzd = zzalvVar.zzd();
        int i34 = zzampVar.zzk;
        if (i34 == 0) {
            while (true) {
                int i35 = this.zzE;
                int i36 = this.zzD;
                if (i35 >= i36) {
                    break;
                }
                this.zzE += zzahmVar3.zza(zzagbVar, i36 - i35, false);
            }
        } else {
            zzeu zzeuVar17 = this.zzh;
            byte[] bArrZzi = zzeuVar17.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[c] = 0;
            int i37 = 4 - i34;
            while (this.zzE < this.zzD) {
                int i38 = this.zzF;
                if (i38 == 0) {
                    if (this.zzK.length > 0 || !this.zzG) {
                        iZzc = zzgr.zzc(zzampVar.zzg);
                        if (i34 + iZzc > this.zzD - this.zzE) {
                            iZzc = z ? 1 : 0;
                        }
                    } else {
                        iZzc = z ? 1 : 0;
                    }
                    zzagbVar.zzc(bArrZzi, i37, i34 + iZzc);
                    zzeuVar17.zzh(z ? 1 : 0);
                    int iZzB7 = zzeuVar17.zzB();
                    if (iZzB7 < 0) {
                        throw zzat.zzb("Invalid NAL length", null);
                    }
                    this.zzF = iZzB7 - iZzc;
                    zzeu zzeuVar18 = this.zzg;
                    zzeuVar18.zzh(z ? 1 : 0);
                    zzahmVar3.zzc(zzeuVar18, 4);
                    this.zzE += 4;
                    this.zzD += i37;
                    this.zzH = (this.zzK.length <= 0 || iZzc <= 0 || !zzgr.zzb(zzampVar.zzg, bArrZzi, 4)) ? z ? 1 : 0 : true;
                    zzahmVar3.zzc(zzeuVar17, iZzc);
                    this.zzE += iZzc;
                    if (iZzc > 0 && !this.zzG && zzgr.zzd(bArrZzi, 4, iZzc, zzampVar.zzg)) {
                        this.zzG = true;
                    }
                } else {
                    if (this.zzH) {
                        zzeu zzeuVar19 = this.zzi;
                        zzeuVar19.zza(i38);
                        zzagbVar.zzc(zzeuVar19.zzi(), z ? 1 : 0, this.zzF);
                        zzahmVar3.zzc(zzeuVar19, this.zzF);
                        iZza = this.zzF;
                        int iZza4 = zzgr.zza(zzeuVar19.zzi(), zzeuVar19.zze());
                        zzeuVar19.zzh(z ? 1 : 0);
                        zzeuVar19.zzf(iZza4);
                        int i39 = zzampVar.zzg.zzr;
                        zzhb zzhbVar = this.zzp;
                        if (i39 == -1) {
                            if (zzhbVar.zzb() != 0) {
                                zzhbVar.zza(0);
                            }
                        } else if (zzhbVar.zzb() != i39) {
                            zzhbVar.zza(i39);
                        }
                        zzhb zzhbVar2 = this.zzp;
                        zzhbVar2.zzc(jZzd, zzeuVar19);
                        if ((zzalvVar.zzg() & 4) != 0) {
                            zzhbVar2.zze();
                        }
                    } else {
                        iZza = zzahmVar3.zza(zzagbVar, i38, z);
                    }
                    this.zzE += iZza;
                    this.zzF -= iZza;
                    z = false;
                }
            }
        }
        int iZzg2 = zzalvVar.zzg();
        if (!this.zzG) {
            iZzg2 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        int i40 = iZzg2;
        zzamq zzamqVarZzj2 = zzalvVar.zzj();
        zzahmVar3.zze(jZzd, i40, this.zzD, 0, zzamqVarZzj2 != null ? zzamqVarZzj2.zzc : null);
        while (true) {
            ArrayDeque arrayDeque4 = this.zzo;
            if (arrayDeque4.isEmpty()) {
                break;
            }
            zzalt zzaltVar = (zzalt) arrayDeque4.removeFirst();
            int i41 = this.zzy;
            int i42 = zzaltVar.zzc;
            this.zzy = i41 - i42;
            long j21 = zzaltVar.zza;
            if (zzaltVar.zzb) {
                j21 += jZzd;
            }
            long j22 = j21;
            for (zzahm zzahmVar4 : this.zzJ) {
                zzahmVar4.zze(j22, 1, i42, this.zzy, null);
            }
        }
        if (!zzalvVar.zzh()) {
            this.zzC = null;
        }
        this.zzs = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzalv) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        this.zzO = -1L;
        zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    final /* synthetic */ void zzh(long j, zzeu zzeuVar) {
        zzafn.zza(j, zzeuVar, this.zzK);
    }

    public zzalw(zzanq zzanqVar, int i, zzfj zzfjVar, zzamp zzampVar, List list, zzahm zzahmVar) {
        this.zzc = zzanqVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzajf();
        this.zzm = new zzeu(16);
        this.zzg = new zzeu(zzgr.zza);
        this.zzh = new zzeu(6);
        this.zzi = new zzeu();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzeu(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgwt.zzi();
        this.zzA = -9223372036854775807L;
        this.zzz = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzI = zzagd.zza;
        this.zzJ = new zzahm[0];
        this.zzK = new zzahm[0];
        this.zzp = new zzhb(new zzha() { // from class: com.google.android.gms.internal.ads.zzals
            @Override // com.google.android.gms.internal.ads.zzha
            public final /* synthetic */ void zza(long j, zzeu zzeuVar) {
                this.zza.zzh(j, zzeuVar);
            }
        });
        this.zzq = new zzafp();
        this.zzN = -1L;
        this.zzO = -1L;
    }
}
