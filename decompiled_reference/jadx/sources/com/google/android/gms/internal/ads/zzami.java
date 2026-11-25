package com.google.android.gms.internal.ads;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzami implements zzaga {
    public static final /* synthetic */ int zza = 0;
    private boolean zzA;
    private int zzB;
    private int zzC;
    private long zzD;
    private zzagd zzE;
    private zzamh[] zzF;
    private long[][] zzG;
    private int zzH;
    private final zzanq zzb;
    private final int zzc;
    private final zzeu zzd;
    private final zzeu zze;
    private final zzeu zzf;
    private final zzeu zzg;
    private final ArrayDeque zzh;
    private final zzamm zzi;
    private final List zzj;
    private final List zzk;
    private final List zzl;
    private zzgwt zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private zzeu zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private long zzz;

    static {
        int i = zzame.zza;
    }

    @Deprecated
    public zzami() {
        this(zzanq.zza, 16);
    }

    static /* synthetic */ long zzh(zzams zzamsVar, long j, long j2) {
        int iZzl = zzl(zzamsVar, j);
        return iZzl == -1 ? j2 : Math.min(zzamsVar.zzc[iZzl], j2);
    }

    private final void zzj() {
        this.zzn = 0;
        this.zzq = 0;
    }

    /* JADX WARN: Code duplicated, block: B:192:0x0448  */
    /* JADX WARN: Code duplicated, block: B:193:0x044a  */
    /* JADX WARN: Code duplicated, block: B:207:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01f4  */
    private final void zzk(long j) throws zzat {
        zzap zzapVarZze;
        ArrayDeque arrayDeque;
        int i;
        zzap zzapVar;
        int i2;
        List list;
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i4;
        String str;
        int i5;
        long j2;
        ArrayList arrayList3;
        zzamp zzampVar;
        String str2;
        long j3;
        int i6;
        zzap zzapVar2;
        boolean z;
        zzfx zzfxVar;
        int i7;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzfz) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzfz zzfzVar = (zzfz) arrayDeque2.pop();
            if (zzfzVar.zzd == 1836019574) {
                zzfz zzfzVarZzd = zzfzVar.zzd(1835365473);
                ArrayList arrayList4 = new ArrayList();
                if (zzfzVarZzd != null) {
                    zzapVarZze = zzalo.zze(zzfzVarZzd);
                    if (this.zzA) {
                        zzapVarZze.getClass();
                        zzfx zzfxVar2 = (zzfx) zzapVarZze.zzc(zzfx.class, zzamb.zza);
                        if (zzfxVar2 != null && zzfxVar2.zzb[0] == 0) {
                            this.zzD = this.zzz + 16;
                        }
                        zzfx zzfxVar3 = (zzfx) zzapVarZze.zzc(zzfx.class, zzamc.zza);
                        zzfxVar3.getClass();
                        List listZzb = zzfxVar3.zzb();
                        ArrayList arrayList5 = new ArrayList(listZzb.size());
                        for (int i8 = 0; i8 < listZzb.size(); i8++) {
                            int iIntValue = ((Integer) listZzb.get(i8)).intValue();
                            if (iIntValue == 0) {
                                i7 = 1;
                            } else if (iIntValue == 1) {
                                i7 = 2;
                            } else if (iIntValue != 2) {
                                i7 = iIntValue != 3 ? 0 : 4;
                            } else {
                                i7 = 3;
                            }
                            arrayList5.add(Integer.valueOf(i7));
                        }
                        arrayList4 = arrayList5;
                    } else {
                        if (zzapVarZze != null && (this.zzc & 64) != 0 && (zzfxVar = (zzfx) zzapVarZze.zzc(zzfx.class, zzama.zza)) != null) {
                            long jZzJ = new zzeu(zzfxVar.zzb).zzJ();
                            if (jZzJ > 0) {
                                this.zzz = jZzJ;
                                this.zzy = true;
                                arrayDeque = arrayDeque2;
                            }
                        }
                        arrayDeque.clear();
                        if (this.zzy) {
                            if (true != this.zzk.isEmpty()) {
                                i = 4;
                            } else {
                                i = 2;
                            }
                            this.zzn = i;
                        }
                    }
                } else {
                    zzapVarZze = null;
                }
                ArrayList arrayList6 = new ArrayList();
                int i9 = this.zzH;
                ArrayList arrayList7 = arrayList4;
                zzagt zzagtVar = new zzagt();
                zzga zzgaVarZzc = zzfzVar.zzc(1969517665);
                if (zzgaVarZzc != null) {
                    zzap zzapVarZzc = zzalo.zzc(zzgaVarZzc);
                    zzagtVar.zza(zzapVarZzc);
                    zzapVar = zzapVarZzc;
                } else {
                    zzapVar = null;
                }
                zzao[] zzaoVarArr = new zzao[1];
                zzga zzgaVarZzc2 = zzfzVar.zzc(1836476516);
                zzgaVarZzc2.getClass();
                boolean z2 = 1 == i9;
                zzaoVarArr[0] = zzalo.zzd(zzgaVarZzc2.zza);
                zzap zzapVar3 = new zzap(-9223372036854775807L, zzaoVarArr);
                int i10 = this.zzc;
                ArrayList arrayList8 = arrayList7;
                ArrayList arrayList9 = arrayList6;
                List<zzams> listZzb2 = zzalo.zzb(zzfzVar, zzagtVar, -9223372036854775807L, null, 1 == (i10 & 1), z2, zzamf.zza, false);
                if (this.zzA) {
                    zzgtr.zzj(arrayList8.size() == listZzb2.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(arrayList8.size()), Integer.valueOf(listZzb2.size())));
                }
                ArrayList arrayList10 = new ArrayList();
                Iterator it = listZzb2.iterator();
                while (true) {
                    i2 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    int i11 = ((zzams) it.next()).zza.zzl;
                    if (i11 != -1) {
                        Integer numValueOf = Integer.valueOf(i11);
                        if (!arrayList10.contains(numValueOf)) {
                            arrayList10.add(numValueOf);
                        }
                    }
                }
                List list2 = this.zzk;
                list2.clear();
                for (zzams zzamsVar : listZzb2) {
                    if (arrayList10.contains(Integer.valueOf(zzamsVar.zza.zza))) {
                        list2.add(zzamsVar);
                    }
                }
                String strZza = zzalz.zza(listZzb2);
                long j4 = -9223372036854775807L;
                long j5 = -9223372036854775807L;
                int i12 = 0;
                int i13 = 0;
                int size = -1;
                while (i12 < listZzb2.size()) {
                    zzams zzamsVar2 = (zzams) listZzb2.get(i12);
                    int i14 = zzamsVar2.zzb;
                    if (i14 == 0) {
                        list = list2;
                        i3 = i13;
                        arrayList = arrayList8;
                        arrayList2 = arrayList9;
                        i4 = -1;
                        str = strZza;
                        i5 = i12;
                        j2 = j5;
                    } else {
                        zzamp zzampVar2 = zzamsVar2.zza;
                        if (zzampVar2.zzm) {
                            zzagd zzagdVar = this.zzE;
                            i3 = i13 + 1;
                            int i15 = zzampVar2.zzb;
                            zzamh zzamhVar = new zzamh(zzampVar2, zzamsVar2, zzagdVar.zzs(i13, i15));
                            String str3 = strZza;
                            List list3 = list2;
                            long j6 = zzampVar2.zze;
                            if (j6 == j5) {
                                j6 = zzamsVar2.zzi;
                            }
                            list = list3;
                            zzahm zzahmVar = zzamhVar.zzc;
                            zzahmVar.zzP(j6);
                            long jMax = Math.max(j4, j6);
                            zzv zzvVar = zzampVar2.zzg;
                            String str4 = zzvVar.zzp;
                            int i16 = "audio/true-hd".equals(str4) ? zzamsVar2.zze * 16 : zzamsVar2.zze + 30;
                            zzt zztVarZza = zzvVar.zza();
                            zztVarZza.zzp(i16);
                            if (i15 == 2) {
                                int i17 = zzvVar.zzf;
                                if ((i10 & 8) != 0) {
                                    i17 |= size == -1 ? 1 : 2;
                                }
                                if (this.zzA) {
                                    arrayList3 = arrayList8;
                                    zztVarZza.zzh(((Integer) arrayList3.get(i12)).intValue());
                                    i17 |= 32768;
                                } else {
                                    arrayList3 = arrayList8;
                                }
                                zztVarZza.zzg(i17);
                                i15 = 2;
                            } else {
                                arrayList3 = arrayList8;
                            }
                            if (zzas.zzb(str4)) {
                                i5 = i12;
                                boolean z3 = zzamsVar2.zzj;
                                arrayList = arrayList3;
                                int iMin = Math.min(!z3 ? zzamsVar2.zzh.length : i14, 20);
                                zzgtr.zzi(j6 != j5);
                                zzampVar = zzampVar2;
                                str2 = str4;
                                long jMin = Math.min(j6, 10000000L);
                                int i18 = 0;
                                int i19 = -1;
                                for (int i20 = 0; i20 < iMin; i20++) {
                                    int i21 = z3 ? i20 : zzamsVar2.zzh[i20];
                                    long j7 = zzamsVar2.zzf[i21];
                                    if (j7 > jMin) {
                                        break;
                                    }
                                    if (j7 >= 0 && (i6 = zzamsVar2.zzd[i21]) > i18) {
                                        i18 = i6;
                                        i19 = i21;
                                    }
                                }
                                j3 = i19 == -1 ? j5 : zzamsVar2.zzf[i19];
                            } else {
                                i5 = i12;
                                zzampVar = zzampVar2;
                                arrayList = arrayList3;
                                j3 = j5;
                                str2 = str4;
                            }
                            if (j3 != j5) {
                                zzao[] zzaoVarArr2 = {new zzajd(j3)};
                                j2 = j5;
                                zzapVar2 = new zzap(j2, zzaoVarArr2);
                            } else {
                                j2 = j5;
                                zzapVar2 = null;
                            }
                            zzaly.zzb(i15, zzagtVar, zztVarZza);
                            zzap zzapVar4 = zzvVar.zzl;
                            zzap[] zzapVarArr = new zzap[4];
                            List list4 = this.zzj;
                            zzapVarArr[0] = list4.isEmpty() ? null : new zzap(list4);
                            zzapVarArr[1] = zzapVar;
                            zzapVarArr[2] = zzapVar3;
                            zzapVarArr[3] = zzapVar2;
                            zzaly.zza(i15, zzapVarZze, zztVarZza, zzapVar4, zzapVarArr);
                            str = str3;
                            zztVarZza.zzn(str);
                            zzv zzvVarZzP = zztVarZza.zzP();
                            boolean zEquals = Objects.equals(str2, "audio/mpeg");
                            int i22 = zzampVar.zzl;
                            if (i22 == -1) {
                                z = false;
                                break;
                            }
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((zzams) it2.next()).zza.zza == i22) {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    z = false;
                                    break;
                                }
                            }
                            if (zEquals || z) {
                                zzamhVar.zzf = zzvVarZzP;
                            } else {
                                zzahmVar.zzA(zzvVarZzP);
                            }
                            i4 = -1;
                            if (i15 == 2 && size == -1) {
                                size = arrayList9.size();
                            }
                            arrayList2 = arrayList9;
                            arrayList2.add(zzamhVar);
                            j4 = jMax;
                        } else {
                            list = list2;
                            i3 = i13;
                            arrayList = arrayList8;
                            arrayList2 = arrayList9;
                            i4 = -1;
                            str = strZza;
                            i5 = i12;
                            j2 = j5;
                        }
                    }
                    i12 = i5 + 1;
                    i2 = i4;
                    arrayList9 = arrayList2;
                    j5 = j2;
                    strZza = str;
                    arrayDeque2 = arrayDeque2;
                    i13 = i3;
                    list2 = list;
                    listZzb2 = listZzb2;
                    arrayList8 = arrayList;
                }
                arrayDeque = arrayDeque2;
                int i23 = i2;
                zzamh[] zzamhVarArr = (zzamh[]) arrayList9.toArray(new zzamh[0]);
                this.zzF = zzamhVarArr;
                int length = zzamhVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i24 = 0; i24 < zzamhVarArr.length; i24++) {
                    jArr[i24] = new long[zzamhVarArr[i24].zzb.zzb];
                    jArr2[i24] = zzamhVarArr[i24].zzb.zzf[0];
                }
                int i25 = 0;
                long j8 = 0;
                while (i25 < zzamhVarArr.length) {
                    int i26 = i23;
                    long j9 = Long.MAX_VALUE;
                    for (int i27 = 0; i27 < zzamhVarArr.length; i27++) {
                        if (!zArr[i27]) {
                            long j10 = jArr2[i27];
                            if (j10 <= j9) {
                                i26 = i27;
                                j9 = j10;
                            }
                        }
                    }
                    int i28 = iArr[i26];
                    long[] jArr3 = jArr[i26];
                    jArr3[i28] = j8;
                    zzams zzamsVar3 = zzamhVarArr[i26].zzb;
                    zzamh[] zzamhVarArr2 = zzamhVarArr;
                    j8 += (long) zzamsVar3.zzd[i28];
                    int i29 = i28 + 1;
                    iArr[i26] = i29;
                    if (i29 < jArr3.length) {
                        jArr2[i26] = zzamsVar3.zzf[i29];
                    } else {
                        zArr[i26] = true;
                        i25++;
                    }
                    zzamhVarArr = zzamhVarArr2;
                    i23 = -1;
                }
                this.zzG = jArr;
                this.zzE.zzv();
                this.zzE.zzw(new zzamg(j4, this.zzF, size));
                arrayDeque.clear();
                if (this.zzy) {
                    if (true != this.zzk.isEmpty()) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    this.zzn = i;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((zzfz) arrayDeque2.peek()).zzb(zzfzVar);
            }
        }
        int i30 = this.zzn;
        if (i30 == 4 || i30 == 2) {
            return;
        }
        zzj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(zzams zzamsVar, long j) {
        int iZza = zzamsVar.zza(j);
        return iZza == -1 ? zzamsVar.zzb(j) : iZza;
    }

    private static int zzm(int i) {
        return i != 1903435808 ? 0 : 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzahh zzahhVarZzb = zzamn.zzb(zzagbVar);
        this.zzm = zzahhVarZzb != null ? zzgwt.zzj(zzahhVarZzb) : zzgwt.zzi();
        return zzahhVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final /* synthetic */ List zzb() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        if ((this.zzc & 16) == 0) {
            zzagdVar = new zzant(zzagdVar, this.zzb);
        }
        this.zzE = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzh.clear();
        this.zzq = 0;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
        this.zzw = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzk.clear();
        this.zzl.clear();
        if (j == 0) {
            if (this.zzn != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzamh zzamhVar : this.zzF) {
            zzams zzamsVar = zzamhVar.zzb;
            int iZza = zzamsVar.zza(j2);
            if (iZza == -1) {
                iZza = zzamsVar.zzb(j2);
            }
            zzamhVar.zze = iZza;
            zzahn zzahnVar = zzamhVar.zzd;
            if (zzahnVar != null) {
                zzahnVar.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    public zzami(zzanq zzanqVar, int i) {
        this.zzb = zzanqVar;
        this.zzc = i;
        this.zzm = zzgwt.zzi();
        this.zzn = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzamm();
        this.zzj = new ArrayList();
        this.zzg = new zzeu(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzeu(zzgr.zza);
        this.zze = new zzeu(6);
        this.zzf = new zzeu();
        this.zzs = -1;
        this.zzE = zzagd.zza;
        this.zzF = new zzamh[0];
        this.zzk = new ArrayList();
        this.zzl = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:199:0x0451 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:310:0x045b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0455 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0191  */
    /* JADX WARN: Code duplicated, block: B:72:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        long j;
        char c;
        long j2;
        char c2;
        int i;
        int i2;
        int iZzc;
        boolean z;
        boolean z2;
        int i3;
        while (true) {
            int i4 = this.zzn;
            boolean z3 = true;
            if (i4 != 0) {
                char c3 = 2;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            this.zzi.zzb(zzagbVar, zzahaVar, this.zzj);
                            if (zzahaVar.zza != 0) {
                                return 1;
                            }
                            zzj();
                            return 1;
                        }
                        List list = this.zzk;
                        zzams zzamsVar = (zzams) list.get(this.zzB);
                        int i5 = this.zzC;
                        int i6 = zzamsVar.zzb;
                        if (i5 < i6) {
                            long j3 = zzamsVar.zzc[i5];
                            if (zzagbVar.zzn() != j3) {
                                zzahaVar.zza = j3;
                                return 1;
                            }
                            int i7 = zzamsVar.zzd[this.zzC];
                            zzeu zzeuVar = this.zzf;
                            zzeuVar.zza(i7);
                            zzagbVar.zzc(zzeuVar.zzi(), 0, i7);
                            String strZzK = zzeuVar.zzK(Math.min(zzeuVar.zzt(), zzeuVar.zzd()), StandardCharsets.UTF_8);
                            long[] jArr = zzamsVar.zzf;
                            long jZzs = zzfm.zzs(jArr[this.zzC]);
                            int i8 = this.zzC + 1;
                            long jZzs2 = i8 < i6 ? zzfm.zzs(jArr[i8]) : zzfm.zzs(zzamsVar.zzi);
                            List list2 = this.zzl;
                            zzaiy zzaiyVar = new zzaiy();
                            zzaiyVar.zza(jZzs);
                            zzaiyVar.zzb(jZzs2);
                            zzaiyVar.zzd(new zzx(null, strZzK));
                            list2.add(zzaiyVar.zze());
                            this.zzC++;
                            return 0;
                        }
                        zzamh[] zzamhVarArr = this.zzF;
                        int length = zzamhVarArr.length;
                        int i9 = 0;
                        while (i9 < length) {
                            zzamh zzamhVar = zzamhVarArr[i9];
                            if (zzamhVar.zza.zzl == zzamsVar.zza.zza) {
                                zzv zzvVar = zzamhVar.zzf;
                                zzvVar.getClass();
                                zzap zzapVar = zzvVar.zzl;
                                ArrayList arrayList = new ArrayList();
                                if (zzapVar != null) {
                                    arrayList.addAll(zzapVar.zze(zzao.class, zzamd.zza));
                                }
                                arrayList.addAll(this.zzl);
                                zzt zztVarZza = zzvVar.zza();
                                zztVarZza.zzl(new zzap(arrayList));
                                zzv zzvVarZzP = zztVarZza.zzP();
                                if (Objects.equals(zzvVarZzP.zzp, "audio/mpeg")) {
                                    zzamhVar.zzf = zzvVarZzP;
                                } else {
                                    zzamhVar.zzc.zzA(zzvVarZzP);
                                    zzamhVar.zzf = null;
                                }
                            } else {
                                z3 = z3;
                            }
                            i9++;
                            z3 = z3;
                        }
                        this.zzB++;
                        this.zzC = 0;
                        this.zzl.clear();
                        if (this.zzB != list.size()) {
                            return 0;
                        }
                        this.zzn = 2;
                        return 0;
                    }
                    long jZzn = zzagbVar.zzn();
                    int i10 = this.zzs;
                    if (i10 == -1) {
                        j = 0;
                        int i11 = -1;
                        int i12 = -1;
                        int i13 = 0;
                        boolean z4 = true;
                        boolean z5 = true;
                        long j4 = Long.MAX_VALUE;
                        long j5 = Long.MAX_VALUE;
                        long j6 = Long.MAX_VALUE;
                        j2 = 262144;
                        while (true) {
                            zzamh[] zzamhVarArr2 = this.zzF;
                            if (i13 >= zzamhVarArr2.length) {
                                break;
                            }
                            zzamh zzamhVar2 = zzamhVarArr2[i13];
                            int i14 = zzamhVar2.zze;
                            zzams zzamsVar2 = zzamhVar2.zzb;
                            char c4 = c3;
                            if (i14 != zzamsVar2.zzb) {
                                long j7 = zzamsVar2.zzc[i14];
                                long[][] jArr2 = this.zzG;
                                jArr2.getClass();
                                long j8 = jArr2[i13][i14];
                                long j9 = j7 - jZzn;
                                boolean z6 = j9 < 0 || j9 >= 262144;
                                if (z6) {
                                    z = z5;
                                } else {
                                    if (z5) {
                                        i12 = i13;
                                        z = z6;
                                        j5 = j8;
                                        j6 = j9;
                                    } else {
                                        z = false;
                                    }
                                    if (j8 < j4) {
                                        i11 = i13;
                                        z5 = z;
                                        z4 = z6;
                                        j4 = j8;
                                    } else {
                                        z5 = z;
                                    }
                                }
                                if (z6 == z && j9 < j6) {
                                    i12 = i13;
                                    z = z6;
                                    j5 = j8;
                                    j6 = j9;
                                }
                                if (j8 < j4) {
                                    i11 = i13;
                                    z5 = z;
                                    z4 = z6;
                                    j4 = j8;
                                } else {
                                    z5 = z;
                                }
                            }
                            i13++;
                            c3 = c4;
                        }
                        c = c3;
                        i10 = (j4 == Long.MAX_VALUE || !z4 || j5 < j4 + 10485760) ? i12 : i11;
                        this.zzs = i10;
                        if (i10 == -1) {
                            return -1;
                        }
                    } else {
                        j = 0;
                        c = 2;
                        j2 = 262144;
                    }
                    zzamh zzamhVar3 = this.zzF[i10];
                    zzahm zzahmVar = zzamhVar3.zzc;
                    int i15 = zzamhVar3.zze;
                    zzams zzamsVar3 = zzamhVar3.zzb;
                    long j10 = zzamsVar3.zzc[i15] + this.zzD;
                    int[] iArr = zzamsVar3.zzd;
                    int i16 = iArr[i15];
                    zzahn zzahnVar = zzamhVar3.zzd;
                    int i17 = 0;
                    long j11 = (j10 - jZzn) + ((long) this.zzt);
                    if (j11 < j || j11 >= j2) {
                        zzahaVar.zza = j10;
                        return 1;
                    }
                    zzamp zzampVar = zzamhVar3.zza;
                    if (zzampVar.zzh == 1) {
                        j11 += 8;
                        i16 -= 8;
                    }
                    zzagbVar.zzf((int) j11);
                    zzv zzvVar2 = zzampVar.zzg;
                    String str = zzvVar2.zzp;
                    if (!Objects.equals(str, "video/avc") ? !(!Objects.equals(str, "video/hevc") ? !Objects.equals(str, "video/apv") : (this.zzc & 128) == 0) : (this.zzc & 32) == 0) {
                        c2 = 1;
                    } else {
                        c2 = 1;
                        this.zzw = true;
                    }
                    int i18 = zzampVar.zzk;
                    if (i18 == 0) {
                        if ("audio/ac4".equals(str)) {
                            if (this.zzu == 0) {
                                zzeu zzeuVar2 = this.zzf;
                                zzafd.zzc(i16, zzeuVar2);
                                zzahmVar.zzc(zzeuVar2, 7);
                                this.zzu += 7;
                            }
                            i16 += 7;
                        } else if (zzamhVar3.zzf != null && Objects.equals(str, "audio/mpeg")) {
                            zzv zzvVarZzP2 = zzamhVar3.zzf;
                            zzeu zzeuVar3 = this.zzf;
                            zzeuVar3.zza(4);
                            zzagbVar.zzi(zzeuVar3.zzi(), 0, 4);
                            zzagbVar.zzl();
                            zzagx zzagxVar = new zzagx();
                            if (zzagxVar.zza(zzeuVar3.zzB()) && !Objects.equals(zzvVarZzP2.zzp, zzagxVar.zzb)) {
                                zzt zztVarZza2 = zzvVarZzP2.zza();
                                String str2 = zzagxVar.zzb;
                                str2.getClass();
                                zztVarZza2.zzo(str2);
                                zzvVarZzP2 = zztVarZza2.zzP();
                            }
                            zzahmVar.zzA(zzvVarZzP2);
                            zzamhVar3.zzf = null;
                        } else if (zzahnVar != null) {
                            zzahnVar.zzb(zzagbVar);
                        }
                        while (true) {
                            int i19 = this.zzu;
                            if (i19 >= i16) {
                                break;
                            }
                            int iZza = zzahmVar.zza(zzagbVar, i16 - i19, false);
                            this.zzt += iZza;
                            this.zzu += iZza;
                            this.zzv -= iZza;
                        }
                    } else {
                        zzeu zzeuVar4 = this.zze;
                        byte[] bArrZzi = zzeuVar4.zzi();
                        bArrZzi[0] = 0;
                        bArrZzi[c2] = 0;
                        bArrZzi[c] = 0;
                        int i20 = 4 - i18;
                        i16 += i20;
                        while (this.zzu < i16) {
                            int i21 = this.zzv;
                            if (i21 == 0) {
                                if (this.zzw || zzgr.zzc(zzvVar2) + i18 > iArr[i15] - this.zzt) {
                                    i2 = i18;
                                    iZzc = i17;
                                } else {
                                    iZzc = zzgr.zzc(zzvVar2);
                                    i2 = i18 + iZzc;
                                }
                                zzagbVar.zzc(bArrZzi, i20, i2);
                                i = i18;
                                this.zzt += i2;
                                int i22 = i17;
                                zzeuVar4.zzh(i22);
                                int iZzB = zzeuVar4.zzB();
                                if (iZzB < 0) {
                                    throw zzat.zzb("Invalid NAL length", null);
                                }
                                this.zzv = iZzB - iZzc;
                                zzeu zzeuVar5 = this.zzd;
                                zzeuVar5.zzh(i22);
                                zzahmVar.zzc(zzeuVar5, 4);
                                this.zzu += 4;
                                if (iZzc > 0) {
                                    zzahmVar.zzc(zzeuVar4, iZzc);
                                    this.zzu += iZzc;
                                    if (zzgr.zzd(bArrZzi, 4, iZzc, zzvVar2)) {
                                        this.zzw = true;
                                    }
                                }
                            } else {
                                i = i18;
                                int iZza2 = zzahmVar.zza(zzagbVar, i21, i17);
                                this.zzt += iZza2;
                                this.zzu += iZza2;
                                this.zzv -= iZza2;
                            }
                            i18 = i;
                            i17 = 0;
                        }
                    }
                    int i23 = i16;
                    long j12 = zzamsVar3.zzf[i15];
                    int i24 = zzamsVar3.zzg[i15];
                    if (!this.zzw) {
                        i24 |= AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    int i25 = i24;
                    if (zzahnVar != null) {
                        zzahnVar.zzc(zzahmVar, j12, i25, i23, 0, null);
                        if (i15 + 1 == zzamsVar3.zzb) {
                            zzahnVar.zzd(zzahmVar, null);
                        }
                    } else {
                        zzahmVar.zze(j12, i25, i23, 0, null);
                    }
                    zzamhVar3.zze++;
                    this.zzs = -1;
                    this.zzt = 0;
                    this.zzu = 0;
                    this.zzv = 0;
                    this.zzw = false;
                    return 0;
                }
                long j13 = this.zzp - ((long) this.zzq);
                long jZzn2 = zzagbVar.zzn() + j13;
                zzeu zzeuVar6 = this.zzr;
                if (zzeuVar6 != null) {
                    zzagbVar.zzc(zzeuVar6.zzi(), this.zzq, (int) j13);
                    if (this.zzo == 1718909296) {
                        this.zzx = true;
                        zzeuVar6.zzh(8);
                        if (zzm(zzeuVar6.zzB()) == 0) {
                            zzeuVar6.zzk(4);
                            while (true) {
                                if (zzeuVar6.zzd() <= 0) {
                                    i3 = 0;
                                    break;
                                }
                                if (zzm(zzeuVar6.zzB()) != 0) {
                                    i3 = 1;
                                    break;
                                }
                            }
                        } else {
                            i3 = 1;
                            break;
                        }
                        this.zzH = i3;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzfz) arrayDeque.peek()).zza(new zzga(this.zzo, zzeuVar6));
                        }
                    }
                } else {
                    if (!this.zzx && this.zzo == 1835295092) {
                        this.zzH = 1;
                    }
                    if (j13 < 262144) {
                        zzagbVar.zzf((int) j13);
                    } else {
                        zzahaVar.zza = zzagbVar.zzn() + j13;
                        z2 = true;
                    }
                    zzk(jZzn2);
                    if (this.zzy) {
                        this.zzA = true;
                        zzahaVar.zza = this.zzz;
                        this.zzy = false;
                    } else if (!z2) {
                        continue;
                    }
                    if (this.zzn != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzk(jZzn2);
                if (this.zzy) {
                    this.zzA = true;
                    zzahaVar.zza = this.zzz;
                    this.zzy = false;
                } else if (!z2) {
                    continue;
                }
                if (this.zzn != 2) {
                    return 1;
                }
            } else {
                if (this.zzq == 0) {
                    zzeu zzeuVar7 = this.zzg;
                    if (!zzagbVar.zzb(zzeuVar7.zzi(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzq = 8;
                    zzeuVar7.zzh(0);
                    this.zzp = zzeuVar7.zzz();
                    this.zzo = zzeuVar7.zzB();
                }
                long j14 = this.zzp;
                if (j14 == 1) {
                    zzeu zzeuVar8 = this.zzg;
                    zzagbVar.zzc(zzeuVar8.zzi(), 8, 8);
                    this.zzq += 8;
                    this.zzp = zzeuVar8.zzJ();
                } else if (j14 == 0) {
                    long jZzo = zzagbVar.zzo();
                    if (jZzo == -1) {
                        zzfz zzfzVar = (zzfz) this.zzh.peek();
                        jZzo = zzfzVar != null ? zzfzVar.zza : -1L;
                    }
                    if (jZzo != -1) {
                        this.zzp = (jZzo - zzagbVar.zzn()) + ((long) this.zzq);
                    }
                }
                long j15 = this.zzp;
                int i26 = this.zzq;
                long j16 = i26;
                if (j15 < j16) {
                    if (this.zzo != 1718773093 || i26 != 8) {
                        throw zzat.zzc("Atom size less than header length (unsupported).");
                    }
                    this.zzp = j16;
                    i26 = 8;
                }
                int i27 = this.zzo;
                if (i27 == 1836019574 || i27 == 1953653099 || i27 == 1835297121 || i27 == 1835626086 || i27 == 1937007212 || i27 == 1701082227 || i27 == 1835365473 || i27 == 1635284069 || i27 == 1953654118) {
                    long jZzn3 = zzagbVar.zzn();
                    long j17 = this.zzp;
                    long j18 = jZzn3 + j17;
                    long j19 = this.zzq;
                    if (j17 != j19 && this.zzo == 1835365473) {
                        zzeu zzeuVar9 = this.zzf;
                        zzeuVar9.zza(8);
                        zzagbVar.zzi(zzeuVar9.zzi(), 0, 8);
                        zzalo.zzf(zzeuVar9);
                        zzagbVar.zzf(zzeuVar9.zzg());
                        zzagbVar.zzl();
                    }
                    long j20 = j18 - j19;
                    this.zzh.push(new zzfz(this.zzo, j20));
                    if (this.zzp == this.zzq) {
                        zzk(j20);
                    } else {
                        zzj();
                    }
                } else {
                    if (i27 == 1835296868 || i27 == 1836476516 || i27 == 1751411826 || i27 == 1937011556 || i27 == 1937011827 || i27 == 1937011571 || i27 == 1668576371 || i27 == 1701606260 || i27 == 1937011555 || i27 == 1937011578 || i27 == 1937013298 || i27 == 1937007471 || i27 == 1668232756 || i27 == 1953196132 || i27 == 1718909296 || i27 == 1969517665 || i27 == 1801812339 || i27 == 1768715124 || i27 == 1667785072) {
                        zzgtr.zzi(i26 == 8);
                        zzgtr.zzi(this.zzp <= 2147483647L);
                        zzeu zzeuVar10 = new zzeu((int) this.zzp);
                        System.arraycopy(this.zzg.zzi(), 0, zzeuVar10.zzi(), 0, 8);
                        this.zzr = zzeuVar10;
                    } else {
                        this.zzr = null;
                    }
                    this.zzn = 1;
                }
            }
        }
    }
}
