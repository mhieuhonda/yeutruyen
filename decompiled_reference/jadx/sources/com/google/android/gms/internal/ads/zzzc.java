package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzc implements zzahm {
    private zzv zzC;
    private boolean zzE;
    private final zzyx zza;
    private final zzuq zzd;
    private final zzul zze;
    private zzzb zzf;
    private zzv zzg;
    private zzuj zzh;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private boolean zzz;
    private final zzyy zzb = new zzyy();
    private int zzi = 1000;
    private long[] zzj = new long[1000];
    private long[] zzk = new long[1000];
    private long[] zzn = new long[1000];
    private int[] zzm = new int[1000];
    private int[] zzl = new int[1000];
    private zzahl[] zzo = new zzahl[1000];
    private final zzzj zzc = new zzzj(zzyz.zza);
    private long zzt = Long.MIN_VALUE;
    private long zzv = Long.MIN_VALUE;
    private long zzw = Long.MIN_VALUE;
    private boolean zzB = true;
    private boolean zzA = true;
    private boolean zzD = true;
    private long zzu = Long.MIN_VALUE;
    private int zzx = -1;
    private int zzy = -1;

    protected zzzc(zzabm zzabmVar, zzuq zzuqVar, zzul zzulVar) {
        this.zzd = zzuqVar;
        this.zze = zzulVar;
        this.zza = new zzyx(zzabmVar);
    }

    private final synchronized void zzB() {
        this.zzs = 0;
        this.zza.zzb();
    }

    private final synchronized boolean zzD(zzv zzvVar) {
        this.zzB = false;
        if (Objects.equals(zzvVar, this.zzC)) {
            return false;
        }
        zzzj zzzjVar = this.zzc;
        if (zzzjVar.zzf() || !((zzza) zzzjVar.zzc()).zza.equals(zzvVar)) {
            this.zzC = zzvVar;
        } else {
            this.zzC = ((zzza) zzzjVar.zzc()).zza;
        }
        boolean z = this.zzD;
        zzv zzvVar2 = this.zzC;
        String str = zzvVar2.zzp;
        this.zzD = z & (zzas.zzf(str) == 1 && zzas.zzd(str, zzvVar2.zzk));
        this.zzE = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    private final synchronized long zzE(long j, boolean z, boolean z2) throws Throwable {
        Throwable th;
        try {
            try {
                int i = this.zzp;
                if (i != 0) {
                    long[] jArr = this.zzn;
                    int i2 = this.zzr;
                    if (j >= jArr[i2]) {
                        if (z2) {
                            try {
                                int i3 = this.zzs;
                                if (i3 != i) {
                                    i = i3 + 1;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        int iZzM = zzM(i2, i, j, false);
                        if (iZzM != -1) {
                            return zzN(iZzM);
                        }
                    }
                }
                return -1L;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final synchronized long zzF() {
        int i = this.zzp;
        if (i == 0) {
            return -1L;
        }
        return zzN(i);
    }

    private final void zzG() {
        if (this.zzh != null) {
            this.zzh = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzH(long j, int i, long j2, int i2, zzahl zzahlVar) {
        int i3;
        int i4 = this.zzp;
        if (i4 > 0) {
            int iZzO = zzO(i4 - 1);
            zzgtr.zza(this.zzk[iZzO] + ((long) this.zzl[iZzO]) <= j2);
        }
        int i5 = 536870912 & i;
        this.zzz = i5 != 0;
        this.zzw = Math.max(this.zzw, j);
        int i6 = this.zzq;
        int i7 = this.zzp;
        int i8 = i6 + i7;
        long j3 = this.zzu;
        if (j3 != Long.MIN_VALUE && this.zzx == -1) {
            if (j >= j3) {
                int i9 = this.zzy;
                if (i9 == -1) {
                    this.zzy = i8;
                    i9 = i8;
                }
                int i10 = (i8 - i9) + 1;
                int i11 = i & 1;
                zzv zzvVar = this.zzC;
                int i12 = 16;
                if (zzvVar != null && (i3 = zzvVar.zzr) != -1) {
                    i12 = i3;
                }
                if (i10 >= i12 + 1 || i11 != 0 || i5 != 0) {
                    this.zzx = i9;
                    this.zzy = -1;
                }
            } else {
                this.zzy = -1;
            }
        }
        int iZzO2 = zzO(i7);
        this.zzn[iZzO2] = j;
        this.zzk[iZzO2] = j2;
        this.zzl[iZzO2] = i2;
        this.zzm[iZzO2] = i;
        this.zzo[iZzO2] = zzahlVar;
        this.zzj[iZzO2] = 0;
        zzzj zzzjVar = this.zzc;
        if (zzzjVar.zzf() || !((zzza) zzzjVar.zzc()).zza.equals(this.zzC)) {
            zzv zzvVar2 = this.zzC;
            if (zzvVar2 == null) {
                throw null;
            }
            zzzjVar.zzb(this.zzq + this.zzp, new zzza(zzvVar2, zzup.zzb, null));
        }
        int i13 = this.zzp + 1;
        this.zzp = i13;
        int i14 = this.zzi;
        if (i13 == i14) {
            int i15 = i14 + 1000;
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            long[] jArr3 = new long[i15];
            int[] iArr = new int[i15];
            int[] iArr2 = new int[i15];
            zzahl[] zzahlVarArr = new zzahl[i15];
            int i16 = this.zzr;
            int i17 = i14 - i16;
            System.arraycopy(this.zzk, i16, jArr2, 0, i17);
            System.arraycopy(this.zzn, this.zzr, jArr3, 0, i17);
            System.arraycopy(this.zzm, this.zzr, iArr, 0, i17);
            System.arraycopy(this.zzl, this.zzr, iArr2, 0, i17);
            System.arraycopy(this.zzo, this.zzr, zzahlVarArr, 0, i17);
            System.arraycopy(this.zzj, this.zzr, jArr, 0, i17);
            int i18 = this.zzr;
            System.arraycopy(this.zzk, 0, jArr2, i17, i18);
            System.arraycopy(this.zzn, 0, jArr3, i17, i18);
            System.arraycopy(this.zzm, 0, iArr, i17, i18);
            System.arraycopy(this.zzl, 0, iArr2, i17, i18);
            System.arraycopy(this.zzo, 0, zzahlVarArr, i17, i18);
            System.arraycopy(this.zzj, 0, jArr, i17, i18);
            this.zzk = jArr2;
            this.zzn = jArr3;
            this.zzm = iArr;
            this.zzl = iArr2;
            this.zzo = zzahlVarArr;
            this.zzj = jArr;
            this.zzr = 0;
            this.zzi = i15;
        }
    }

    private final boolean zzI() {
        return this.zzs != this.zzp;
    }

    private final boolean zzJ() {
        int i;
        return this.zzx == -1 && (i = this.zzy) != -1 && this.zzq + this.zzs >= i;
    }

    private final void zzK(zzv zzvVar, zzly zzlyVar) {
        zzv zzvVar2 = this.zzg;
        zzq zzqVar = zzvVar2 == null ? null : zzvVar2.zzt;
        this.zzg = zzvVar;
        zzq zzqVar2 = zzvVar.zzt;
        zzuq zzuqVar = this.zzd;
        zzlyVar.zzb = zzvVar.zzb(zzuqVar.zzb(zzvVar));
        zzlyVar.zza = this.zzh;
        if (zzvVar2 == null || !Objects.equals(zzqVar, zzqVar2)) {
            zzuj zzujVarZza = zzuqVar.zza(this.zze, zzvVar);
            this.zzh = zzujVarZza;
            zzlyVar.zza = zzujVarZza;
        }
    }

    private final boolean zzL(int i) {
        if (this.zzh == null) {
            return true;
        }
        int i2 = this.zzm[i];
        return false;
    }

    private final int zzM(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.zzn[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.zzm[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.zzi) {
                i = 0;
            }
        }
        return i3;
    }

    private final int zzO(int i) {
        int i2 = this.zzr + i;
        int i3 = this.zzi;
        return i2 < i3 ? i2 : i2 - i3;
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzA(zzv zzvVar) {
        boolean zZzD = zzD(zzvVar);
        zzzb zzzbVar = this.zzf;
        if (zzzbVar == null || !zZzD) {
            return;
        }
        zzzbVar.zzy(zzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        return this.zza.zzg(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zzd(zzeu zzeuVar, int i, int i2) {
        this.zza.zzh(zzeuVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzahm
    public final void zze(long j, int i, int i2, int i3, zzahl zzahlVar) {
        if (this.zzA) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.zzA = false;
            }
        }
        if (this.zzD) {
            if (j < this.zzt) {
                return;
            }
            if ((i & 1) == 0) {
                if (!this.zzE) {
                    String strValueOf = String.valueOf(this.zzC);
                    String.valueOf(strValueOf);
                    zzeh.zzc("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(strValueOf)));
                    this.zzE = true;
                }
                i |= 1;
            }
        }
        zzH(j, i, (this.zza.zzf() - ((long) i2)) - ((long) i3), i2, zzahlVar);
    }

    public final void zzf() {
        zzg(true);
        zzG();
    }

    public final void zzg(boolean z) {
        this.zza.zza();
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzx = -1;
        this.zzy = -1;
        this.zzA = true;
        this.zzt = Long.MIN_VALUE;
        this.zzv = Long.MIN_VALUE;
        this.zzw = Long.MIN_VALUE;
        this.zzz = false;
        this.zzc.zze();
        if (z) {
            this.zzC = null;
            this.zzB = true;
            this.zzD = true;
        }
    }

    public final void zzh(long j) {
        this.zzt = j;
    }

    public final synchronized void zzi(long j) {
        if (this.zzu == Long.MIN_VALUE) {
            return;
        }
        this.zzu = Long.MIN_VALUE;
        this.zzx = -1;
        this.zzy = -1;
    }

    public final int zzj() {
        return this.zzq + this.zzp;
    }

    public final void zzk() {
        zzy();
        zzG();
    }

    public final void zzl() throws IOException {
        zzuj zzujVar = this.zzh;
        if (zzujVar != null) {
            throw zzujVar.zza();
        }
    }

    public final int zzm() {
        return this.zzq;
    }

    public final int zzn() {
        return this.zzq + this.zzs;
    }

    public final synchronized zzv zzo() {
        if (this.zzB) {
            return null;
        }
        return this.zzC;
    }

    public final synchronized long zzp() {
        return this.zzw;
    }

    public final synchronized boolean zzq() {
        return this.zzz;
    }

    public final synchronized boolean zzr(boolean z) {
        int i = this.zzq + this.zzs;
        int i2 = this.zzx;
        boolean z2 = true;
        if (i2 != -1 && i >= i2) {
            return true;
        }
        if (zzI() && !zzJ()) {
            if (((zzza) this.zzc.zza(i)).zza != this.zzg) {
                return true;
            }
            return zzL(zzO(this.zzs));
        }
        if (!z && !this.zzz) {
            zzv zzvVar = this.zzC;
            if (zzvVar == null) {
                z2 = false;
            } else if (zzvVar == this.zzg) {
                return false;
            }
        }
        return z2;
    }

    public final int zzs(zzly zzlyVar, zzix zzixVar, int i, boolean z) {
        boolean z2 = (i & 2) != 0;
        zzyy zzyyVar = this.zzb;
        int iZzC = zzC(zzlyVar, zzixVar, z2, z, zzyyVar);
        if (iZzC != -4) {
            return iZzC;
        }
        if (!zzixVar.zzb()) {
            int i2 = i & 1;
            if ((i & 4) == 0) {
                zzyx zzyxVar = this.zza;
                if (i2 != 0) {
                    zzyxVar.zzd(zzixVar, zzyyVar);
                    return -4;
                }
                zzyxVar.zzc(zzixVar, zzyyVar);
            } else if (i2 != 0) {
                return -4;
            }
            this.zzs++;
        }
        return -4;
    }

    public final synchronized boolean zzt(int i) {
        int i2;
        int i3;
        zzB();
        int i4 = this.zzq;
        if (i >= i4 && i <= this.zzp + i4 && (((i2 = this.zzx) == -1 || i < i2) && ((i3 = this.zzy) == -1 || i < i3))) {
            this.zzt = Long.MIN_VALUE;
            this.zzs = i - i4;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    public final synchronized boolean zzu(long j, boolean z) throws Throwable {
        Throwable th;
        zzzc zzzcVar;
        long j2;
        int iZzM;
        try {
            try {
                zzB();
                int iZzO = zzO(this.zzs);
                long j3 = this.zzu;
                long jMin = this.zzw;
                if (j3 != Long.MIN_VALUE) {
                    try {
                        jMin = Math.min(jMin, j3);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                if (zzI() && j >= this.zzn[iZzO]) {
                    if (j > jMin) {
                        if (z) {
                            z = true;
                        }
                    }
                    boolean z2 = this.zzD;
                    int i = this.zzp;
                    if (z2) {
                        int i2 = i - this.zzs;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= i2) {
                                if (!z) {
                                    zzzcVar = this;
                                    j2 = j;
                                    iZzM = -1;
                                    break;
                                }
                                j2 = j;
                                iZzM = i2;
                                zzzcVar = this;
                                break;
                            }
                            if (this.zzn[iZzO] >= j) {
                                zzzcVar = this;
                                j2 = j;
                                iZzM = i3;
                                break;
                            }
                            iZzO++;
                            if (iZzO == this.zzi) {
                                iZzO = 0;
                            }
                            i3++;
                        }
                    } else {
                        int i4 = i - this.zzs;
                        zzzcVar = this;
                        j2 = j;
                        iZzM = zzzcVar.zzM(iZzO, i4, j2, true);
                    }
                    if (iZzM != -1) {
                        zzzcVar.zzt = j2;
                        zzzcVar.zzs += iZzM;
                        return true;
                    }
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    public final synchronized int zzv(long j, boolean z) {
        Throwable th;
        try {
            try {
                int i = this.zzs;
                int iZzO = zzO(i);
                if (zzI() && j >= this.zzn[iZzO]) {
                    if (j <= this.zzw || !z) {
                        int iZzM = zzM(iZzO, this.zzp - i, j, true);
                        if (iZzM == -1) {
                            return 0;
                        }
                        return iZzM;
                    }
                    try {
                        return this.zzp - i;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
                return 0;
            } catch (Throwable th3) {
                th = th3;
                th = th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
        }
    }

    public final synchronized void zzw(int i) {
        boolean z = false;
        if (i >= 0) {
            try {
                if (this.zzs + i <= this.zzp) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzgtr.zza(z);
        this.zzs += i;
    }

    public final void zzx(long j, boolean z, boolean z2) {
        this.zza.zze(zzE(j, false, z2));
    }

    public final void zzy() {
        this.zza.zze(zzF());
    }

    public final void zzz(zzzb zzzbVar) {
        this.zzf = zzzbVar;
    }

    private final long zzN(int i) {
        long j = this.zzv;
        long jMax = Long.MIN_VALUE;
        if (i != 0) {
            int iZzO = zzO(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                jMax = Math.max(jMax, this.zzn[iZzO]);
                if ((this.zzm[iZzO] & 1) != 0) {
                    break;
                }
                iZzO--;
                if (iZzO == -1) {
                    iZzO = this.zzi - 1;
                }
            }
        }
        this.zzv = Math.max(j, jMax);
        this.zzp -= i;
        int i3 = this.zzq + i;
        this.zzq = i3;
        int i4 = this.zzr + i;
        this.zzr = i4;
        int i5 = this.zzi;
        if (i4 >= i5) {
            this.zzr = i4 - i5;
        }
        int i6 = this.zzs - i;
        this.zzs = i6;
        if (i6 < 0) {
            this.zzs = 0;
        }
        this.zzc.zzd(i3);
        if (this.zzp != 0) {
            return this.zzk[this.zzr];
        }
        int i7 = this.zzr;
        if (i7 == 0) {
            i7 = this.zzi;
        }
        int i8 = i7 - 1;
        return this.zzk[i8] + ((long) this.zzl[i8]);
    }

    private final synchronized int zzC(zzly zzlyVar, zzix zzixVar, boolean z, boolean z2, zzyy zzyyVar) {
        int i = this.zzq + this.zzs;
        int i2 = this.zzx;
        boolean z3 = false;
        if (i2 != -1 && i >= i2) {
            z3 = true;
        }
        if (!zzI() || zzJ() || z3) {
            if (!z2 && !this.zzz && !z3) {
                zzv zzvVar = this.zzC;
                if (zzvVar != null && (z || zzvVar != this.zzg)) {
                    zzK(zzvVar, zzlyVar);
                    return -5;
                }
            }
            zzixVar.zzg(4);
            zzixVar.zzd = Long.MIN_VALUE;
            return -4;
        }
        zzv zzvVar2 = ((zzza) this.zzc.zza(i)).zza;
        if (!z && zzvVar2 == this.zzg) {
            int iZzO = zzO(this.zzs);
            if (zzL(iZzO)) {
                zzixVar.zzg(this.zzm[iZzO]);
                if (this.zzs == this.zzp - 1 && (z2 || this.zzz)) {
                    zzixVar.zzh(536870912);
                }
                zzixVar.zzd = this.zzn[iZzO];
                zzyyVar.zza = this.zzl[iZzO];
                zzyyVar.zzb = this.zzk[iZzO];
                zzyyVar.zzc = this.zzo[iZzO];
                return -4;
            }
        }
        zzK(zzvVar2, zzlyVar);
        return -5;
        return -3;
    }
}
