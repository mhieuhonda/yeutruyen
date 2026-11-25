package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmh {
    private final zzno zzc;
    private final zzea zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjw zzh;
    private zzme zzi;
    private zzme zzj;
    private zzme zzk;
    private zzme zzl;
    private zzme zzm;
    private int zzn;
    private Object zzo;
    private long zzp;
    private final zzlp zzr;
    private final zzbd zza = new zzbd();
    private final zzbe zzb = new zzbe();
    private List zzq = new ArrayList();

    public zzmh(zzno zznoVar, zzea zzeaVar, zzlp zzlpVar, zzjw zzjwVar) {
        this.zzc = zznoVar;
        this.zzd = zzeaVar;
        this.zzr = zzlpVar;
        this.zzh = zzjwVar;
    }

    private static zzxl zzA(zzbf zzbfVar, Object obj, long j, long j2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbfVar.zzo(obj, zzbdVar);
        zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L);
        zzbfVar.zze(obj);
        zzbdVar.zzb();
        zzbfVar.zzo(obj, zzbdVar);
        int iZze = zzbdVar.zze(j);
        return iZze == -1 ? new zzxl(obj, j2, zzbdVar.zzf(j)) : new zzxl(obj, iZze, zzbdVar.zzd(iZze), j2);
    }

    private final void zzB() {
        int i = zzgwt.zzd;
        final zzgwq zzgwqVar = new zzgwq();
        for (zzme zzmeVarZzp = this.zzi; zzmeVarZzp != null; zzmeVarZzp = zzmeVarZzp.zzp()) {
            zzgwqVar.zzf(zzmeVarZzp.zzg.zza);
        }
        zzme zzmeVar = this.zzj;
        final zzxl zzxlVar = zzmeVar == null ? null : zzmeVar.zzg.zza;
        this.zzd.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgwqVar, zzxlVar);
            }
        });
    }

    private final long zzC(Object obj) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzme zzmeVar = (zzme) this.zzq.get(i);
            if (zzmeVar.zzb.equals(obj)) {
                return zzmeVar.zzg.zza.zzd;
            }
        }
        return -1L;
    }

    private final int zzD(zzbf zzbfVar) {
        zzbf zzbfVar2;
        zzme zzmeVarZzp = this.zzi;
        if (zzmeVarZzp == null) {
            return 0;
        }
        int iZze = zzbfVar.zze(zzmeVarZzp.zzb);
        while (true) {
            zzbfVar2 = zzbfVar;
            iZze = zzbfVar2.zzl(iZze, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzmeVarZzp.getClass();
                if (zzmeVarZzp.zzp() == null || zzmeVarZzp.zzg.zzg) {
                    break;
                }
                zzmeVarZzp = zzmeVarZzp.zzp();
            }
            zzme zzmeVarZzp2 = zzmeVarZzp.zzp();
            if (iZze == -1 || zzmeVarZzp2 == null || zzbfVar2.zze(zzmeVarZzp2.zzb) != iZze) {
                break;
            }
            zzmeVarZzp = zzmeVarZzp2;
            zzbfVar = zzbfVar2;
        }
        int iZzs = zzs(zzmeVarZzp);
        zzmeVarZzp.zzg = zzx(zzbfVar2, zzmeVarZzp.zzg);
        return iZzs;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    private final zzmf zzE(zzbf zzbfVar, zzme zzmeVar, long j) {
        int i;
        zzbf zzbfVar2;
        long j2;
        long j3;
        zzbe zzbeVar;
        Object obj;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        zzmf zzmfVar = zzmeVar.zzg;
        long jZza = zzmeVar.zza();
        long j9 = zzmfVar.zze;
        long j10 = (jZza + j9) - j;
        if (!zzmfVar.zzg) {
            zzxl zzxlVar = zzmfVar.zza;
            Object obj2 = zzxlVar.zza;
            zzbd zzbdVar = this.zza;
            zzbfVar.zzo(obj2, zzbdVar);
            if (!zzxlVar.zzb()) {
                int i2 = zzxlVar.zze;
                if (i2 != -1) {
                    zzbdVar.zzb();
                    if (i2 == -1) {
                        zzbdVar.zzg.zzb(-1);
                        i = -1;
                    } else {
                        i = i2;
                    }
                } else {
                    i = i2;
                }
                int iZzd = zzbdVar.zzd(i);
                zzbdVar.zzj(i);
                if (iZzd != zzbdVar.zzg(i)) {
                    return zzG(zzbfVar, obj2, i, iZzd, j9, zzxlVar.zzd);
                }
                zzL(zzbfVar, obj2, i);
                return zzH(zzbfVar, obj2, 0L, -9223372036854775807L, j9, zzxlVar.zzd);
            }
            int i3 = zzxlVar.zzb;
            if (zzbdVar.zzg(i3) == -1) {
                return null;
            }
            int iZza = zzbdVar.zzg.zza(i3).zza(zzxlVar.zzc);
            if (iZza < 0) {
                return zzG(zzbfVar, obj2, i3, iZza, zzmfVar.zzd, zzxlVar.zzd);
            }
            long jLongValue = zzmfVar.zzd;
            if (jLongValue == -9223372036854775807L) {
                zzbe zzbeVar2 = this.zzb;
                long jMax = zzM(zzbfVar, zzbdVar.zzc, zzbdVar.zzd, zzbeVar2) ? Math.max(0L, j10) : -9223372036854775807L;
                zzbfVar2 = zzbfVar;
                Pair pairZzn = zzbfVar2.zzn(zzbeVar2, zzbdVar, zzbdVar.zzc, -9223372036854775807L, jMax);
                if (pairZzn == null) {
                    return null;
                }
                jLongValue = ((Long) pairZzn.second).longValue();
                j3 = jMax;
                j2 = -9223372036854775807L;
            } else {
                zzbfVar2 = zzbfVar;
                j2 = jLongValue;
                j3 = -9223372036854775807L;
            }
            zzL(zzbfVar2, obj2, i3);
            return zzH(zzbfVar2, obj2, Math.max(0L, jLongValue), j3, j2, zzxlVar.zzd);
        }
        zzxl zzxlVar2 = zzmfVar.zza;
        Object obj3 = zzxlVar2.zza;
        int iZze = zzbfVar.zze(obj3);
        zzbd zzbdVar2 = this.zza;
        zzbe zzbeVar3 = this.zzb;
        int iZzl = zzbfVar.zzl(iZze, zzbdVar2, zzbeVar3, this.zzf, this.zzg);
        if (iZzl == -1) {
            return null;
        }
        int i4 = zzbfVar.zzd(iZzl, zzbdVar2, true).zzc;
        Object obj4 = zzbdVar2.zzb;
        obj4.getClass();
        long j11 = zzxlVar2.zzd;
        if (zzbfVar.zzb(i4, zzbeVar3, 0L).zzn == iZzl) {
            long jMax2 = zzM(zzbfVar, zzbdVar2.zzc, zzbdVar2.zzd, zzbeVar3) ? Math.max(0L, j10) : -9223372036854775807L;
            Pair pairZzn2 = zzbfVar.zzn(zzbeVar3, zzbdVar2, i4, -9223372036854775807L, jMax2);
            if (pairZzn2 == null) {
                return null;
            }
            Object obj5 = pairZzn2.first;
            long jLongValue2 = ((Long) pairZzn2.second).longValue();
            zzme zzmeVarZzp = zzmeVar.zzp();
            if (zzmeVarZzp == null || !zzmeVarZzp.zzb.equals(obj5)) {
                long jZzC = zzC(obj5);
                if (jZzC == -1) {
                    jZzC = this.zze;
                    this.zze = 1 + jZzC;
                }
                j8 = jZzC;
            } else {
                j8 = zzmeVarZzp.zzg.zza.zzd;
            }
            j4 = jLongValue2;
            j7 = jMax2;
            zzbeVar = zzbeVar3;
            obj = obj5;
            j5 = j8;
            j6 = -9223372036854775807L;
        } else {
            zzbeVar = zzbeVar3;
            obj = obj4;
            j4 = 0;
            j5 = j11;
            j6 = 0;
            j7 = -9223372036854775807L;
        }
        zzxl zzxlVarZzA = zzA(zzbfVar, obj, j4, j5, zzbeVar, zzbdVar2);
        long j12 = j4;
        if (j6 != -9223372036854775807L && zzmfVar.zzd != -9223372036854775807L) {
            zzbfVar.zzo(obj3, zzbdVar2).zzb();
            int i5 = zzbdVar2.zzg.zzd;
        }
        return zzF(zzbfVar, zzxlVarZzA, j6, j12, j7);
    }

    private final zzmf zzF(zzbf zzbfVar, zzxl zzxlVar, long j, long j2, long j3) {
        Object obj = zzxlVar.zza;
        zzbfVar.zzo(obj, this.zza);
        return zzxlVar.zzb() ? zzG(zzbfVar, obj, zzxlVar.zzb, zzxlVar.zzc, j, zzxlVar.zzd) : zzH(zzbfVar, obj, j2, j3, j, zzxlVar.zzd);
    }

    private final zzmf zzG(zzbf zzbfVar, Object obj, int i, int i2, long j, long j2) {
        zzxl zzxlVar = new zzxl(obj, i, i2, j2);
        Object obj2 = zzxlVar.zza;
        int i3 = zzxlVar.zzb;
        int i4 = zzxlVar.zzc;
        zzbd zzbdVar = this.zza;
        long jZzh = zzbfVar.zzo(obj2, zzbdVar).zzh(i3, i4);
        if (i2 == zzbdVar.zzd(i)) {
            zzbdVar.zzi();
        }
        zzbdVar.zzj(i3);
        long jMax = 0;
        if (jZzh != -9223372036854775807L && jZzh <= 0) {
            jMax = Math.max(0L, (-1) + jZzh);
        }
        return new zzmf(zzxlVar, jMax, -9223372036854775807L, j, jZzh, false, false, false, false);
    }

    private final zzmf zzH(zzbf zzbfVar, Object obj, long j, long j2, long j3, long j4) {
        long jMax = j;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        int iZzf = zzbdVar.zzf(jMax);
        if (iZzf != -1) {
            zzbdVar.zzj(iZzf);
        }
        if (iZzf != -1) {
            zzbdVar.zzj(iZzf);
        }
        zzxl zzxlVar = new zzxl(obj, j4, iZzf);
        boolean zZzN = zzN(zzxlVar);
        boolean zZzI = zzI(zzbfVar, zzxlVar);
        boolean zZzJ = zzJ(zzbfVar, zzxlVar, zZzN);
        long jZzK = zzK(zzbfVar, zzxlVar);
        if (jZzK != -9223372036854775807L && jMax >= jZzK) {
            jMax = Math.max(0L, jZzK - 1);
        }
        return new zzmf(zzxlVar, jMax, j2, j3, jZzK, false, zZzN, zZzI, zZzJ);
    }

    private final boolean zzI(zzbf zzbfVar, zzxl zzxlVar) {
        if (!zzN(zzxlVar)) {
            return false;
        }
        Object obj = zzxlVar.zza;
        return zzbfVar.zzb(zzbfVar.zzo(obj, this.zza).zzc, this.zzb, 0L).zzo == zzbfVar.zze(obj);
    }

    private final boolean zzJ(zzbf zzbfVar, zzxl zzxlVar, boolean z) {
        int iZze = zzbfVar.zze(zzxlVar.zza);
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzd(iZze, zzbdVar, false).zzc;
        zzbe zzbeVar = this.zzb;
        return !zzbfVar.zzb(i, zzbeVar, 0L).zzi && zzbfVar.zzl(iZze, zzbdVar, zzbeVar, this.zzf, this.zzg) == -1 && z;
    }

    private final long zzK(zzbf zzbfVar, zzxl zzxlVar) {
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxlVar.zzb()) {
            return zzbdVar.zzh(zzxlVar.zzb, zzxlVar.zzc);
        }
        int i = zzxlVar.zze;
        if (i == -1) {
            return zzbdVar.zzd;
        }
        zzbdVar.zzc(i);
        return 0L;
    }

    private final long zzL(zzbf zzbfVar, Object obj, int i) {
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        zzbdVar.zzc(i);
        long j = zzbdVar.zzg.zza(i).zzi;
        return 0L;
    }

    private static boolean zzM(zzbf zzbfVar, int i, long j, zzbe zzbeVar) {
        if (j == -9223372036854775807L) {
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzi && !zzbeVar.zzk) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzN(zzxl zzxlVar) {
        return !zzxlVar.zzb() && zzxlVar.zze == -1;
    }

    public final int zza(zzbf zzbfVar, int i) {
        this.zzf = i;
        return zzD(zzbfVar);
    }

    public final int zzb(zzbf zzbfVar, boolean z) {
        this.zzg = z;
        return zzD(zzbfVar);
    }

    public final void zzc(zzbf zzbfVar, zzjw zzjwVar) {
        this.zzh = zzjwVar;
        long j = zzjwVar.zzb;
        zzj();
    }

    public final boolean zzd(zzxj zzxjVar) {
        zzme zzmeVar = this.zzl;
        return zzmeVar != null && zzmeVar.zza == zzxjVar;
    }

    public final boolean zze(zzxj zzxjVar) {
        zzme zzmeVar = this.zzm;
        return zzmeVar != null && zzmeVar.zza == zzxjVar;
    }

    public final void zzf(long j) {
        zzme zzmeVar = this.zzl;
        if (zzmeVar != null) {
            zzmeVar.zzi(j);
        }
    }

    public final boolean zzg() {
        zzme zzmeVar = this.zzl;
        if (zzmeVar != null) {
            return !zzmeVar.zzg.zzi && zzmeVar.zzd() && this.zzl.zzg.zze != -9223372036854775807L && this.zzn < 100;
        }
        return true;
    }

    public final zzmf zzh(long j, zzmu zzmuVar) {
        zzme zzmeVar = this.zzl;
        return zzmeVar == null ? zzF(zzmuVar.zza, zzmuVar.zzb, zzmuVar.zzc, zzmuVar.zzs, -9223372036854775807L) : zzE(zzmuVar.zza, zzmeVar, j);
    }

    public final void zzj() {
        if (this.zzq.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzq.size(); i++) {
            ((zzme) this.zzq.get(i)).zzn();
        }
        this.zzq = arrayList;
        this.zzm = null;
        zzt();
    }

    public final zzme zzk() {
        return this.zzl;
    }

    public final zzme zzl() {
        return this.zzm;
    }

    public final zzme zzm() {
        return this.zzi;
    }

    public final zzme zzn() {
        return this.zzj;
    }

    public final zzme zzo() {
        return this.zzk;
    }

    public final zzme zzp() {
        zzme zzmeVar = this.zzk;
        zzme zzmeVar2 = this.zzj;
        if (zzmeVar == zzmeVar2) {
            zzmeVar2.getClass();
            this.zzk = zzmeVar2.zzp();
        }
        zzmeVar2.getClass();
        this.zzj = zzmeVar2.zzp();
        zzB();
        zzme zzmeVar3 = this.zzj;
        zzmeVar3.getClass();
        return zzmeVar3;
    }

    public final zzme zzr() {
        zzme zzmeVar = this.zzi;
        if (zzmeVar == null) {
            return null;
        }
        if (zzmeVar == this.zzj) {
            this.zzj = zzmeVar.zzp();
        }
        if (zzmeVar == this.zzk) {
            this.zzk = zzmeVar.zzp();
        }
        zzmeVar.zzn();
        int i = this.zzn - 1;
        this.zzn = i;
        if (i == 0) {
            this.zzl = null;
            zzme zzmeVar2 = this.zzi;
            this.zzo = zzmeVar2.zzb;
            this.zzp = zzmeVar2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzp();
        zzB();
        return this.zzi;
    }

    public final void zzt() {
        zzme zzmeVar = this.zzm;
        if (zzmeVar == null || zzmeVar.zze()) {
            this.zzm = null;
            for (int i = 0; i < this.zzq.size(); i++) {
                zzme zzmeVar2 = (zzme) this.zzq.get(i);
                if (!zzmeVar2.zze()) {
                    this.zzm = zzmeVar2;
                    return;
                }
            }
        }
    }

    public final zzme zzu(zzxj zzxjVar) {
        for (int i = 0; i < this.zzq.size(); i++) {
            zzme zzmeVar = (zzme) this.zzq.get(i);
            if (zzmeVar.zza == zzxjVar) {
                return zzmeVar;
            }
        }
        return null;
    }

    public final void zzv() {
        if (this.zzn == 0) {
            return;
        }
        zzme zzmeVarZzp = this.zzi;
        zzmeVarZzp.getClass();
        this.zzo = zzmeVarZzp.zzb;
        this.zzp = zzmeVarZzp.zzg.zza.zzd;
        while (zzmeVarZzp != null) {
            zzmeVarZzp.zzn();
            zzmeVarZzp = zzmeVarZzp.zzp();
        }
        this.zzi = null;
        this.zzl = null;
        this.zzj = null;
        this.zzk = null;
        this.zzn = 0;
        zzB();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a9  */
    public final int zzw(zzbf zzbfVar, long j, long j2, long j3) {
        zzmf zzmfVarZzE;
        long j4;
        int i;
        zzmf zzmfVar;
        int i2;
        zzme zzmeVarZzp = this.zzi;
        zzme zzmeVar = null;
        while (zzmeVarZzp != null) {
            zzmf zzmfVar2 = zzmeVarZzp.zzg;
            if (zzmeVar != null) {
                zzmfVarZzE = zzE(zzbfVar, zzmeVar, j);
                if (zzmfVarZzE != null && zzmfVar2.zza.equals(zzmfVarZzE.zza)) {
                    long j5 = zzmfVar2.zzb;
                    long j6 = zzmfVarZzE.zzb;
                    if (j5 == j6) {
                        j4 = -9223372036854775807L;
                        i = 0;
                    } else {
                        j4 = -9223372036854775807L;
                        long j7 = zzmfVar2.zzc;
                        if (j7 != -9223372036854775807L) {
                            i = 0;
                            long j8 = zzmfVarZzE.zzc;
                            if (j8 != -9223372036854775807L) {
                                if (Math.abs((j6 - j8) - (j5 - j7)) >= 5000000) {
                                }
                            }
                        }
                    }
                    if (j5 != j6) {
                        zzmfVar = zzmfVar2;
                        zzmfVarZzE = zzmfVarZzE.zza(j5, zzmfVar.zzc);
                    } else {
                        zzmfVar = zzmfVar2;
                    }
                }
                return zzs(zzmeVar);
            }
            zzmfVarZzE = zzx(zzbfVar, zzmfVar2);
            zzmfVar = zzmfVar2;
            j4 = -9223372036854775807L;
            i = 0;
            zzmeVarZzp.zzg = zzmfVarZzE.zzb(zzmfVar.zzd);
            long j9 = zzmfVar.zze;
            long j10 = zzmfVarZzE.zze;
            if (j9 != j10) {
                long jZza = j10 == j4 ? Long.MAX_VALUE : j10 + zzmeVarZzp.zza();
                if (zzmeVarZzp == this.zzj) {
                    boolean z = zzmeVarZzp.zzg.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= jZza) {
                        i2 = 1;
                    } else {
                        i2 = i;
                    }
                } else {
                    i2 = i;
                }
                int i3 = (zzmeVarZzp != this.zzk || (j3 != Long.MIN_VALUE && j3 < jZza)) ? i : 1;
                int iZzs = zzs(zzmeVarZzp);
                if (iZzs != 0) {
                    return iZzs;
                }
                int i4 = (i2 == 0 || (j9 == j4 && zzmfVar.zza.zze == -1)) ? i : 1;
                return i3 != 0 ? i4 | 2 : i4;
            }
            zzmeVar = zzmeVarZzp;
            zzmeVarZzp = zzmeVarZzp.zzp();
        }
        return 0;
    }

    public final zzmf zzx(zzbf zzbfVar, zzmf zzmfVar) {
        zzxl zzxlVar = zzmfVar.zza;
        boolean zZzN = zzN(zzxlVar);
        boolean zZzI = zzI(zzbfVar, zzxlVar);
        boolean zZzJ = zzJ(zzbfVar, zzxlVar, zZzN);
        long jZzK = zzK(zzbfVar, zzxlVar);
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zza;
        zzbfVar.zzo(obj, zzbdVar);
        if (zzxlVar.zzb()) {
            zzbdVar.zzj(zzxlVar.zzb);
        } else {
            int i = zzxlVar.zze;
            if (i != -1) {
                zzbdVar.zzj(i);
            }
        }
        return new zzmf(zzxlVar, zzmfVar.zzb, zzmfVar.zzc, zzmfVar.zzd, jZzK, false, zZzN, zZzI, zZzJ);
    }

    public final zzxl zzy(zzbf zzbfVar, Object obj, long j) {
        long jZzC;
        int iZze;
        zzbd zzbdVar = this.zza;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        Object obj2 = this.zzo;
        if (obj2 == null || (iZze = zzbfVar.zze(obj2)) == -1 || zzbfVar.zzd(iZze, zzbdVar, false).zzc != i) {
            zzme zzmeVarZzp = this.zzi;
            while (true) {
                if (zzmeVarZzp == null) {
                    zzme zzmeVarZzp2 = this.zzi;
                    while (true) {
                        if (zzmeVarZzp2 == null) {
                            jZzC = zzC(obj);
                            if (jZzC != -1) {
                                break;
                            }
                            jZzC = this.zze;
                            this.zze = 1 + jZzC;
                            if (this.zzi != null) {
                                break;
                            }
                            this.zzo = obj;
                            this.zzp = jZzC;
                            break;
                        }
                        int iZze2 = zzbfVar.zze(zzmeVarZzp2.zzb);
                        if (iZze2 != -1 && zzbfVar.zzd(iZze2, zzbdVar, false).zzc == i) {
                            jZzC = zzmeVarZzp2.zzg.zza.zzd;
                            break;
                        }
                        zzmeVarZzp2 = zzmeVarZzp2.zzp();
                    }
                } else {
                    if (zzmeVarZzp.zzb.equals(obj)) {
                        jZzC = zzmeVarZzp.zzg.zza.zzd;
                        break;
                    }
                    zzmeVarZzp = zzmeVarZzp.zzp();
                }
            }
        } else {
            jZzC = this.zzp;
        }
        long j2 = jZzC;
        zzbfVar.zzo(obj, zzbdVar);
        int i2 = zzbdVar.zzc;
        zzbe zzbeVar = this.zzb;
        zzbfVar.zzb(i2, zzbeVar, 0L);
        Object obj3 = obj;
        for (int iZze3 = zzbfVar.zze(obj); iZze3 >= zzbeVar.zzn; iZze3--) {
            zzbfVar.zzd(iZze3, zzbdVar, true);
            zzbdVar.zzb();
            if (zzbdVar.zze(zzbdVar.zzd) != -1) {
                Object obj4 = zzbdVar.zzb;
                obj4.getClass();
                obj3 = obj4;
            }
        }
        return zzA(zzbfVar, obj3, j, j2, zzbeVar, zzbdVar);
    }

    final /* synthetic */ void zzz(zzgwq zzgwqVar, zzxl zzxlVar) {
        this.zzc.zzz(zzgwqVar.zzi(), zzxlVar);
    }

    public final zzme zzi(zzmf zzmfVar) {
        zzme zzmeVarZza;
        zzme zzmeVar = this.zzl;
        long jZza = zzmeVar == null ? 1000000000000L : (zzmeVar.zza() + zzmeVar.zzg.zze) - zzmfVar.zzb;
        int i = 0;
        while (true) {
            if (i >= this.zzq.size()) {
                zzmeVarZza = null;
                break;
            }
            zzmf zzmfVar2 = ((zzme) this.zzq.get(i)).zzg;
            long j = zzmfVar2.zze;
            long j2 = zzmfVar.zze;
            if ((j == -9223372036854775807L || j == j2) && zzmfVar2.zzb == zzmfVar.zzb && zzmfVar2.zza.equals(zzmfVar.zza)) {
                zzmeVarZza = (zzme) this.zzq.remove(i);
                break;
            }
            i++;
        }
        if (zzmeVarZza == null) {
            zzmeVarZza = this.zzr.zza(zzmfVar, jZza);
        } else {
            zzmeVarZza.zzg = zzmfVar;
            zzmeVarZza.zzb(jZza);
        }
        zzme zzmeVar2 = this.zzl;
        if (zzmeVar2 != null) {
            zzmeVar2.zzo(zzmeVarZza);
        } else {
            this.zzi = zzmeVarZza;
            this.zzj = zzmeVarZza;
            this.zzk = zzmeVarZza;
        }
        this.zzo = null;
        this.zzl = zzmeVarZza;
        this.zzn++;
        zzB();
        return zzmeVarZza;
    }

    public final void zzq() {
        zzme zzmeVarZzp;
        zzme zzmeVar = this.zzk;
        if (zzmeVar == null || (zzmeVarZzp = zzmeVar.zzp()) == null) {
            throw null;
        }
        this.zzk = zzmeVarZzp;
        zzB();
    }

    public final int zzs(zzme zzmeVar) {
        zzmeVar.getClass();
        int i = 0;
        if (zzmeVar.equals(this.zzl)) {
            return 0;
        }
        this.zzl = zzmeVar;
        while (zzmeVar.zzp() != null) {
            zzmeVar = zzmeVar.zzp();
            zzmeVar.getClass();
            if (zzmeVar == this.zzj) {
                zzme zzmeVar2 = this.zzi;
                this.zzj = zzmeVar2;
                this.zzk = zzmeVar2;
                i = 3;
            }
            if (zzmeVar == this.zzk) {
                this.zzk = this.zzj;
                i |= 2;
            }
            zzmeVar.zzn();
            this.zzn--;
        }
        zzme zzmeVar3 = this.zzl;
        zzmeVar3.getClass();
        zzmeVar3.zzo(null);
        zzB();
        return i;
    }
}
