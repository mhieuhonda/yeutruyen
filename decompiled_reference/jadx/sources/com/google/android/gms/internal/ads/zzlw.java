package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlw implements Handler.Callback, zzxi, zzabh, zzms, zzjj, zzmw, zzcc, zzadt {
    private static final long zza = zzfm.zzs(WorkRequest.MIN_BACKOFF_MILLIS);
    private zznk zzA;
    private boolean zzC;
    private boolean zzD;
    private zzlv zzE;
    private int zzF;
    private zzmu zzG;
    private zzlt zzH;
    private boolean zzI;
    private boolean zzK;
    private boolean zzL;
    private boolean zzN;
    private boolean zzQ;
    private int zzR;
    private zzlv zzS;
    private long zzT;
    private long zzU;
    private int zzV;
    private boolean zzW;
    private zzjm zzX;
    private zzjw zzZ;
    private boolean zzab;
    private final zzjf zzad;
    private final zzng[] zzb;
    private final zzne[] zzc;
    private final boolean[] zzd;
    private final zzabi zze;
    private final zzabj zzf;
    private final zzma zzg;
    private final zzea zzh;
    private final zzmv zzi;
    private final Looper zzj;
    private final zzbe zzk;
    private final zzbd zzl;
    private final long zzm;
    private final zzjk zzn;
    private final ArrayList zzo;
    private final zzdp zzp;
    private final zzlu zzq;
    private final zzmh zzr;
    private final zzmt zzs;
    private final long zzt;
    private final zzqh zzu;
    private final boolean zzv;
    private final zzno zzw;
    private final zzea zzx;
    private final boolean zzy;
    private final zzcd zzz;
    private long zzaa = -9223372036854775807L;
    private int zzO = 0;
    private boolean zzP = false;
    private boolean zzJ = false;
    private float zzac = 1.0f;
    private zznj zzB = zznj.zza;
    private long zzY = -9223372036854775807L;
    private long zzM = -9223372036854775807L;

    public zzlw(Context context, zznc[] zzncVarArr, zznc[] zzncVarArr2, zzabi zzabiVar, zzabj zzabjVar, zzma zzmaVar, zzabr zzabrVar, int i, boolean z, zzno zznoVar, zznk zznkVar, zzjf zzjfVar, long j, boolean z2, boolean z3, Looper looper, zzdp zzdpVar, zzlu zzluVar, zzqh zzqhVar, zzmv zzmvVar, zzjw zzjwVar, final zzadt zzadtVar) {
        this.zzq = zzluVar;
        this.zze = zzabiVar;
        this.zzf = zzabjVar;
        this.zzg = zzmaVar;
        int i2 = 0;
        this.zzA = zznkVar;
        this.zzad = zzjfVar;
        this.zzt = j;
        this.zzv = z3;
        this.zzp = zzdpVar;
        this.zzu = zzqhVar;
        this.zzZ = zzjwVar;
        this.zzw = zznoVar;
        this.zzm = zzmaVar.zzf(zzqhVar);
        zzmaVar.zzg(zzqhVar);
        zzbf zzbfVar = zzbf.zza;
        this.zzG = zzmu.zza(zzabjVar);
        this.zzH = new zzlt(this.zzG);
        int length = zzncVarArr.length;
        this.zzc = new zzne[2];
        this.zzd = new boolean[2];
        zznd zzndVarZzg = zzabiVar.zzg();
        this.zzb = new zzng[2];
        boolean z4 = false;
        while (true) {
            int length2 = zzncVarArr.length;
            if (i2 >= 2) {
                this.zzy = z4;
                this.zzn = new zzjk(this, zzdpVar);
                this.zzo = new ArrayList();
                this.zzk = new zzbe();
                this.zzl = new zzbd();
                zzabiVar.zzs(this, zzabrVar);
                this.zzW = true;
                zzea zzeaVarZzd = zzdpVar.zzd(looper, null);
                this.zzx = zzeaVarZzd;
                this.zzr = new zzmh(zznoVar, zzeaVarZzd, new zzlp(this), zzjwVar);
                this.zzs = new zzmt(this, zznoVar, zzeaVarZzd, zzqhVar, zzabrVar);
                zzmv zzmvVar2 = new zzmv(null);
                this.zzi = zzmvVar2;
                Looper looperZza = zzmvVar2.zza();
                this.zzj = looperZza;
                zzea zzeaVarZzd2 = zzdpVar.zzd(looperZza, this);
                this.zzh = zzeaVarZzd2;
                this.zzz = new zzcd(context, looperZza, this);
                zzeaVarZzd2.zzd(35, new zzadt() { // from class: com.google.android.gms.internal.ads.zzll
                    @Override // com.google.android.gms.internal.ads.zzadt
                    public final /* synthetic */ void zzcS(long j2, long j3, zzv zzvVar, MediaFormat mediaFormat) {
                        this.zza.zzcS(j2, j3, zzvVar, mediaFormat);
                    }
                }).zza();
                return;
            }
            zzncVarArr[i2].zzc(i2, zzqhVar, zzdpVar);
            this.zzc[i2] = zzncVarArr[i2].zzb();
            this.zzc[i2].zzv(zzndVarZzg);
            zznc zzncVar = zzncVarArr2[i2];
            if (zzncVar != null) {
                zzncVar.zzc(i2, zzqhVar, zzdpVar);
                z4 = true;
            }
            this.zzb[i2] = new zzng(zzncVarArr[i2], zzncVarArr2[i2], i2);
            i2++;
        }
    }

    private final void zzA(IOException iOException, int i) {
        zzmh zzmhVar = this.zzr;
        zzjm zzjmVarZza = zzjm.zza(iOException, i);
        zzme zzmeVarZzm = zzmhVar.zzm();
        if (zzmeVarZzm != null) {
            zzjmVarZza = zzjmVarZza.zzd(zzmeVarZzm.zzg.zza);
        }
        zzeh.zzf("ExoPlayerImplInternal", "Playback error", zzjmVarZza);
        zzW(false, false);
        this.zzG = this.zzG.zzf(zzjmVarZza);
    }

    private final void zzB(int i) {
        zzmu zzmuVar = this.zzG;
        if (zzmuVar.zze != i) {
            if (i != 2) {
                this.zzY = -9223372036854775807L;
            }
            if (i != 3) {
                boolean z = zzmuVar.zzp;
            }
            this.zzG = this.zzG.zze(i);
        }
    }

    private final void zzC(int i) {
        this.zzH.zzb(this.zzG);
        if (this.zzH.zzd()) {
            if (!this.zzG.zza.zzg()) {
                zzmu zzmuVar = this.zzG;
                boolean z = zzmuVar.zza.zze(zzmuVar.zzb.zza) != -1;
                Locale locale = Locale.US;
                zzmu zzmuVar2 = this.zzG;
                zzgtr.zzj(z, String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", zzmuVar2.zzb.zza, zzmuVar2.zza.getClass().getName(), Integer.valueOf(this.zzG.zza.zza()), Integer.valueOf(i)));
            }
            this.zzq.zza(this.zzH);
            this.zzH = new zzlt(this.zzG);
        }
    }

    private final void zzD(float f) throws zzjm {
        this.zzac = f;
        float fZza = f * this.zzz.zza();
        int i = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzngVarArr[i].zzL(fZza);
            i++;
        }
    }

    private final void zzE(boolean z, int i, boolean z2, int i2) throws zzjm {
        this.zzH.zza(z2 ? 1 : 0);
        zzG(z, i, i2);
    }

    private final void zzF() throws zzjm {
        zzmu zzmuVar = this.zzG;
        zzG(zzmuVar.zzl, zzmuVar.zzn, zzmuVar.zzm);
    }

    private final void zzG(boolean z, int i, int i2) throws zzjm {
        zzH(z, this.zzz.zzc(z, this.zzG.zze), i, i2);
    }

    private final void zzH(boolean z, int i, int i2, int i3) throws zzjm {
        boolean z2;
        if (!z) {
            z2 = false;
        } else if (i != -1) {
            z2 = true;
        } else {
            i = -1;
            z2 = false;
        }
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.zzC;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        zzmu zzmuVar = this.zzG;
        if (zzmuVar.zzl == z2 && zzmuVar.zzn == i2 && zzmuVar.zzm == i3) {
            return;
        }
        this.zzG = zzmuVar.zzi(z2, i3, i2);
        zzaC(false, false);
        zzmh zzmhVar = this.zzr;
        for (zzme zzmeVarZzm = zzmhVar.zzm(); zzmeVarZzm != null; zzmeVarZzm = zzmeVarZzm.zzp()) {
            for (zzabb zzabbVar : zzmeVarZzm.zzr().zzc) {
            }
        }
        if (!zzax()) {
            zzK();
            zzL();
            boolean z4 = this.zzG.zzp;
            zzmhVar.zzf(this.zzT);
            return;
        }
        int i4 = this.zzG.zze;
        if (i4 == 3) {
            this.zzn.zza();
            zzJ();
            this.zzh.zzh(2);
        } else if (i4 == 2) {
            this.zzh.zzh(2);
        }
    }

    private final void zzI(boolean z) throws zzjm {
        zzxl zzxlVar = this.zzr.zzm().zzg.zza;
        long jZzT = zzT(zzxlVar, this.zzG.zzs, true, false);
        if (jZzT != this.zzG.zzs) {
            zzmu zzmuVar = this.zzG;
            this.zzG = zzao(zzxlVar, jZzT, zzmuVar.zzc, zzmuVar.zzd, z, 5);
        }
    }

    private final void zzJ() throws zzjm {
        zzme zzmeVarZzm = this.zzr.zzm();
        if (zzmeVarZzm == null) {
            return;
        }
        zzabj zzabjVarZzr = zzmeVarZzm.zzr();
        int i = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            if (zzabjVarZzr.zza(i)) {
                zzngVarArr[i].zzv();
            }
            i++;
        }
    }

    private final void zzK() throws zzjm {
        this.zzn.zzb();
        int i = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzngVarArr[i].zzw();
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r13 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzL() throws com.google.android.gms.internal.ads.zzjm {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.zzL():void");
    }

    private final void zzM(zzav zzavVar) {
        this.zzh.zzk(16);
        this.zzn.zzi(zzavVar);
    }

    private final void zzN(final int i, final boolean z) {
        boolean[] zArr = this.zzd;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.zzx.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzlm
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzu(i, z);
                }
            });
        }
    }

    private final long zzO(zzbf zzbfVar, Object obj, long j) {
        int i = zzbfVar.zzo(obj, this.zzl).zzc;
        zzbe zzbeVar = this.zzk;
        zzbfVar.zzb(i, zzbeVar, 0L);
        if (zzbeVar.zzf == -9223372036854775807L || !zzbeVar.zzb() || !zzbeVar.zzi) {
            return -9223372036854775807L;
        }
        long j2 = zzbeVar.zzg;
        String str = zzfm.zza;
        return zzfm.zzt((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - zzbeVar.zzf) - j;
    }

    private final boolean zzP(zzbf zzbfVar, zzxl zzxlVar) {
        if (!zzxlVar.zzb() && !zzbfVar.zzg()) {
            int i = zzbfVar.zzo(zzxlVar.zza, this.zzl).zzc;
            zzbe zzbeVar = this.zzk;
            zzbfVar.zzb(i, zzbeVar, 0L);
            if (zzbeVar.zzb() && zzbeVar.zzi && zzbeVar.zzf != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    private final void zzQ(long j) {
        boolean zZzw = zzw();
        zzmu zzmuVar = this.zzG;
        long jMin = 1000;
        if (zZzw) {
            jMin = zzmuVar.zze != 3 ? zza : 1000L;
            zzng[] zzngVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                jMin = Math.min(jMin, zzfm.zzs(zzngVarArr[i].zzk(this.zzT, this.zzU)));
            }
            if (this.zzG.zzj()) {
                zzmh zzmhVar = this.zzr;
                zzme zzmeVarZzp = zzmhVar.zzm() != null ? zzmhVar.zzm().zzp() : null;
                if (zzmeVarZzp != null) {
                    if (this.zzT + (zzfm.zzt(jMin) * this.zzG.zzo.zzb) >= zzmeVarZzp.zzc()) {
                        jMin = Math.min(jMin, zza);
                    }
                }
            }
        } else if (zzmuVar.zze != 3 || zzax()) {
            jMin = zza;
        }
        this.zzh.zzj(2, j + jMin);
    }

    private final void zzR(zzlv zzlvVar) throws Throwable {
        long jLongValue;
        zzxl zzxlVarZzy;
        boolean z;
        boolean z2;
        long j;
        long jZzu;
        boolean z3;
        long jZzS;
        zzmu zzmuVar;
        zzxl zzxlVar;
        zzbf zzbfVar;
        long j2;
        long j3;
        long j4;
        zzmu zzmuVar2;
        int i;
        if (this.zzD) {
            if (this.zzE != null) {
                this.zzF++;
                this.zzH.zza(1);
            }
            this.zzE = zzlvVar;
            return;
        }
        this.zzH.zza(1);
        zzbf zzbfVar2 = this.zzG.zza;
        int i2 = this.zzO;
        boolean z4 = this.zzP;
        zzbe zzbeVar = this.zzk;
        zzbd zzbdVar = this.zzl;
        Pair pairZzaD = zzaD(zzbfVar2, zzlvVar, true, i2, z4, zzbeVar, zzbdVar);
        long jMax = -9223372036854775807L;
        if (pairZzaD == null) {
            Pair pairZzY = zzY(this.zzG.zza);
            zzxl zzxlVar2 = (zzxl) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            z = !this.zzG.zza.zzg();
            zzxlVarZzy = zzxlVar2;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairZzaD.first;
            jLongValue = ((Long) pairZzaD.second).longValue();
            long j5 = zzlvVar.zzc;
            if (j5 != -9223372036854775807L) {
                jMax = jLongValue;
            }
            zzxlVarZzy = this.zzr.zzy(this.zzG.zza, obj, jLongValue);
            if (zzxlVarZzy.zzb()) {
                this.zzG.zza.zzo(zzxlVarZzy.zza, zzbdVar);
                int i3 = zzxlVarZzy.zzb;
                if (zzbdVar.zzd(i3) == zzxlVarZzy.zzc) {
                    zzbdVar.zzi();
                }
                zza zzaVarZza = zzbdVar.zzg.zza(i3);
                long j6 = zzaVarZza.zza;
                long j7 = zzaVarZza.zzi;
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
            } else if (j5 != -9223372036854775807L) {
                z = false;
            }
            z = true;
        }
        try {
            if (this.zzG.zza.zzg()) {
                this.zzS = zzlvVar;
            } else {
                zzmu zzmuVar3 = this.zzG;
                if (pairZzaD == null) {
                    if (zzmuVar3.zze != 1) {
                        zzB(4);
                    }
                    zzX(false, true, false, true);
                } else {
                    try {
                        try {
                            try {
                                if (zzxlVarZzy.equals(zzmuVar3.zzb)) {
                                    zzme zzmeVarZzm = this.zzr.zzm();
                                    if (zzmeVarZzm == null || !zzmeVarZzm.zze || jLongValue == 0) {
                                        jZzu = jLongValue;
                                    } else {
                                        zzxj zzxjVar = zzmeVarZzm.zza;
                                        long j8 = zzbeVar.zzm;
                                        if (this.zzC && j8 != jMax) {
                                            Double d = this.zzB.zzc;
                                        }
                                        jZzu = zzxjVar.zzu(jLongValue, this.zzA);
                                    }
                                    if (zzfm.zzs(jZzu) == zzfm.zzs(this.zzG.zzs) && ((i = (zzmuVar2 = this.zzG).zze) == 2 || i == 3)) {
                                        jLongValue = zzmuVar2.zzs;
                                    }
                                    this.zzG = zzao(zzxlVarZzy, j4, j3, j4, z2, 2);
                                }
                                jZzu = jLongValue;
                                zzag(zzbfVar, zzxlVar, zzbfVar, zzmuVar.zzb, j2, true);
                                zzxlVarZzy = zzxlVar;
                                j3 = j2;
                                j4 = jZzS;
                                this.zzG = zzao(zzxlVarZzy, j4, j3, j4, z2, 2);
                            } catch (Throwable th) {
                                th = th;
                                zzxlVarZzy = zzxlVar;
                                jMax = j2;
                                j = jZzS;
                                this.zzG = zzao(zzxlVarZzy, j, jMax, j, z2, 2);
                                throw th;
                            }
                            zzbfVar = zzmuVar.zza;
                            j2 = jMax;
                        } catch (Throwable th2) {
                            th = th2;
                            zzxlVarZzy = zzxlVar;
                        }
                        zzmuVar = this.zzG;
                        zzxlVar = zzxlVarZzy;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (!this.zzC) {
                        z3 = true;
                        break;
                    }
                    zzng[] zzngVarArr = this.zzb;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 2) {
                            z3 = true;
                            break;
                        }
                        zzng zzngVar = zzngVarArr[i4];
                        if (zzngVar.zzM() && zzngVar.zze() == 2) {
                            z3 = true;
                            this.zzD = true;
                            break;
                        }
                        i4++;
                    }
                    jZzS = zzS(zzxlVarZzy, jZzu, this.zzG.zze == 4 ? z3 : false);
                    z2 = (jLongValue != jZzS ? z3 : false) | z;
                }
            }
            z2 = z;
            j3 = jMax;
            j4 = jLongValue;
            this.zzG = zzao(zzxlVarZzy, j4, j3, j4, z2, 2);
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            j = jLongValue;
        }
    }

    private final long zzS(zzxl zzxlVar, long j, boolean z) throws zzjm {
        zzmh zzmhVar = this.zzr;
        return zzT(zzxlVar, j, zzmhVar.zzm() != zzmhVar.zzn(), z);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    private final long zzT(zzxl zzxlVar, long j, boolean z, boolean z2) throws zzjm {
        zzK();
        boolean z3 = true;
        zzaC(false, true);
        if (z2 || this.zzG.zze == 3) {
            zzB(2);
        }
        zzmh zzmhVar = this.zzr;
        zzme zzmeVarZzm = zzmhVar.zzm();
        zzme zzmeVarZzp = zzmeVarZzm;
        while (zzmeVarZzp != null && !zzxlVar.equals(zzmeVarZzp.zzg.zza)) {
            zzmeVarZzp = zzmeVarZzp.zzp();
        }
        if (z || zzmeVarZzm != zzmeVarZzp || (zzmeVarZzp != null && zzmeVarZzp.zza() + j < 0)) {
            zzaa();
            if (zzmeVarZzp != null) {
                while (zzmhVar.zzm() != zzmeVarZzp) {
                    zzmhVar.zzr();
                }
                zzmhVar.zzs(zzmeVarZzp);
                zzmeVarZzp.zzb(1000000000000L);
                zzap();
                zzmeVarZzp.zzh = true;
            }
        }
        zzab();
        if (zzmeVarZzp != null) {
            zzmhVar.zzs(zzmeVarZzp);
            if (!zzmeVarZzp.zze) {
                zzmeVarZzp.zzg = zzmeVarZzp.zzg.zza(j, -9223372036854775807L);
            } else if (zzmeVarZzp.zzf) {
                if (this.zzC) {
                    boolean z4 = this.zzB.zzi;
                    if (this.zzG.zza.zzg() || !zzmeVarZzp.zzg.zza.equals(this.zzG.zzb)) {
                        zzxj zzxjVar = zzmeVarZzp.zza;
                        j = zzxjVar.zzt(j);
                        zzxjVar.zzq(j - this.zzm, false);
                    } else {
                        long jZza = zzmeVarZzp.zza() + j;
                        zzng[] zzngVarArr = this.zzb;
                        boolean zZzF = true;
                        for (int i = 0; i < 2; i++) {
                            zzng zzngVar = zzngVarArr[i];
                            if (zzngVar.zzM()) {
                                zZzF &= zzngVar.zzF(zzmeVarZzp, jZza);
                            }
                        }
                        if (zZzF) {
                            zzxj zzxjVar2 = zzmeVarZzp.zza;
                            long j2 = this.zzG.zzs;
                            zznk zznkVar = zznk.zzb;
                            if (zzxjVar2.zzu(j2, zznkVar) == zzxjVar2.zzu(j, zznkVar)) {
                                z3 = false;
                            } else {
                                zzxj zzxjVar3 = zzmeVarZzp.zza;
                                j = zzxjVar3.zzt(j);
                                zzxjVar3.zzq(j - this.zzm, false);
                            }
                        } else {
                            zzxj zzxjVar4 = zzmeVarZzp.zza;
                            j = zzxjVar4.zzt(j);
                            zzxjVar4.zzq(j - this.zzm, false);
                        }
                    }
                } else {
                    zzxj zzxjVar5 = zzmeVarZzp.zza;
                    j = zzxjVar5.zzt(j);
                    zzxjVar5.zzq(j - this.zzm, false);
                }
            }
            zzU(j, z3);
            zzam();
        } else {
            zzmhVar.zzv();
            zzU(j, true);
        }
        zzas(false);
        this.zzh.zzh(2);
        return j;
    }

    private final void zzU(long j, boolean z) throws zzjm {
        zzme zzmeVarZzm = this.zzr.zzm();
        long jZza = j + (zzmeVarZzm == null ? 1000000000000L : zzmeVarZzm.zza());
        this.zzT = jZza;
        this.zzn.zzc(jZza);
        zzng[] zzngVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            zzngVarArr[i].zzE(zzmeVarZzm, this.zzT, z);
        }
        for (zzme zzmeVarZzm2 = r0.zzm(); zzmeVarZzm2 != null; zzmeVarZzm2 = zzmeVarZzm2.zzp()) {
            for (zzabb zzabbVar : zzmeVarZzm2.zzr().zzc) {
            }
        }
    }

    private final void zzV() throws zzjm {
        int i = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i >= 2) {
                return;
            }
            zzngVarArr[i].zzz(this.zzC ? this.zzB : null);
            i++;
        }
    }

    private final void zzW(boolean z, boolean z2) {
        zzX(z || !this.zzQ, false, true, false);
        this.zzH.zza(z2 ? 1 : 0);
        this.zzg.zzc(this.zzu);
        this.zzz.zzc(this.zzG.zzl, 1);
        zzB(1);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b A[PHI: r2 r7 r9
      0x009b: PHI (r2v2 com.google.android.gms.internal.ads.zzxl) = (r2v1 com.google.android.gms.internal.ads.zzxl), (r2v19 com.google.android.gms.internal.ads.zzxl) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r7v3 long) = (r7v2 long), (r7v11 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r9v2 long) = (r9v1 long), (r9v7 long) binds: [B:28:0x0073, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0 A[PHI: r3
      0x00e0: PHI (r3v3 com.google.android.gms.internal.ads.zzbf) = 
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v2 com.google.android.gms.internal.ads.zzbf)
      (r3v6 com.google.android.gms.internal.ads.zzbf)
      (r3v6 com.google.android.gms.internal.ads.zzbf)
     binds: [B:34:0x00a9, B:36:0x00ad, B:38:0x00be, B:40:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    private final void zzX(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        zzxl zzxlVar;
        zzbf zzbfVar;
        this.zzh.zzk(2);
        this.zzD = false;
        if (this.zzE != null) {
            this.zzH.zza(1);
            this.zzE = null;
        }
        this.zzX = null;
        zzaC(false, true);
        this.zzn.zzb();
        this.zzT = 1000000000000L;
        try {
            zzaa();
        } catch (zzjm | RuntimeException e) {
            zzeh.zzf("ExoPlayerImplInternal", "Disable failed.", e);
        }
        if (z) {
            zzng[] zzngVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                try {
                    zzngVarArr[i].zzG();
                } catch (RuntimeException e2) {
                    zzeh.zzf("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.zzR = 0;
        zzmu zzmuVar = this.zzG;
        zzxl zzxlVar2 = zzmuVar.zzb;
        long jLongValue = zzmuVar.zzs;
        long j = (this.zzG.zzb.zzb() || zzaB(this.zzG, this.zzl)) ? this.zzG.zzc : this.zzG.zzs;
        if (z2) {
            this.zzS = null;
            Pair pairZzY = zzY(this.zzG.zza);
            zzxlVar2 = (zzxl) pairZzY.first;
            jLongValue = ((Long) pairZzY.second).longValue();
            j = -9223372036854775807L;
            z5 = zzxlVar2.equals(this.zzG.zzb) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        zzmh zzmhVar = this.zzr;
        zzmhVar.zzv();
        this.zzN = false;
        zzbf zzbfVarZzx = this.zzG.zza;
        if (z3 && (zzbfVarZzx instanceof zzna)) {
            zzbfVarZzx = ((zzna) zzbfVarZzx).zzx(this.zzs.zzq());
            if (zzxlVar2.zzb != -1) {
                Object obj = zzxlVar2.zza;
                zzbd zzbdVar = this.zzl;
                zzbfVarZzx.zzo(obj, zzbdVar);
                zzbe zzbeVar = this.zzk;
                zzbfVarZzx.zzb(zzbdVar.zzc, zzbeVar, 0L);
                if (zzbeVar.zzb()) {
                    zzbfVar = zzbfVarZzx;
                    zzxlVar = new zzxl(obj, zzxlVar2.zzd);
                } else {
                    zzxlVar = zzxlVar2;
                    zzbfVar = zzbfVarZzx;
                }
            } else {
                zzxlVar = zzxlVar2;
                zzbfVar = zzbfVarZzx;
            }
        } else {
            zzxlVar = zzxlVar2;
            zzbfVar = zzbfVarZzx;
        }
        zzmu zzmuVar2 = this.zzG;
        int i2 = zzmuVar2.zze;
        zzjm zzjmVar = z4 ? null : zzmuVar2.zzf;
        zzzo zzzoVar = z5 ? zzzo.zza : zzmuVar2.zzh;
        zzabj zzabjVar = z5 ? this.zzf : this.zzG.zzi;
        List listZzi = z5 ? zzgwt.zzi() : this.zzG.zzj;
        zzmu zzmuVar3 = this.zzG;
        this.zzG = new zzmu(zzbfVar, zzxlVar, j3, j2, i2, zzjmVar, false, zzzoVar, zzabjVar, listZzi, zzxlVar, zzmuVar3.zzl, zzmuVar3.zzm, zzmuVar3.zzn, zzmuVar3.zzo, j2, 0L, j2, 0L, false);
        if (z3) {
            zzmhVar.zzj();
            this.zzs.zzg();
        }
    }

    private final Pair zzY(zzbf zzbfVar) {
        long j = 0;
        if (zzbfVar.zzg()) {
            return Pair.create(zzmu.zzb(), 0L);
        }
        int iZzk = zzbfVar.zzk(this.zzP);
        zzbe zzbeVar = this.zzk;
        zzbd zzbdVar = this.zzl;
        Pair pairZzm = zzbfVar.zzm(zzbeVar, zzbdVar, iZzk, -9223372036854775807L);
        zzxl zzxlVarZzy = this.zzr.zzy(zzbfVar, pairZzm.first, 0L);
        long jLongValue = ((Long) pairZzm.second).longValue();
        if (zzxlVarZzy.zzb()) {
            zzbfVar.zzo(zzxlVarZzy.zza, zzbdVar);
            if (zzxlVarZzy.zzc == zzbdVar.zzd(zzxlVarZzy.zzb)) {
                zzbdVar.zzi();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(zzxlVarZzy, Long.valueOf(j));
    }

    private final void zzZ(zzbf zzbfVar, zzbf zzbfVar2) {
        if (zzbfVar.zzg() && zzbfVar2.zzg()) {
            return;
        }
        ArrayList arrayList = this.zzo;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
            return;
        }
        zzls zzlsVar = (zzls) arrayList.get(size);
        Object obj = zzlsVar.zzb;
        zzmy zzmyVar = zzlsVar.zza;
        String str = zzfm.zza;
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzaA, reason: merged with bridge method [inline-methods] */
    public final boolean zzw() {
        if (!this.zzv) {
            if (!this.zzC) {
                return false;
            }
            boolean z = this.zzB.zzg;
        }
        return true;
    }

    private static boolean zzaB(zzmu zzmuVar, zzbd zzbdVar) {
        zzxl zzxlVar = zzmuVar.zzb;
        zzbf zzbfVar = zzmuVar.zza;
        return zzbfVar.zzg() || zzbfVar.zzo(zzxlVar.zza, zzbdVar).zzf;
    }

    private final void zzaC(boolean z, boolean z2) {
        this.zzL = z;
        long jElapsedRealtime = -9223372036854775807L;
        if (z && !z2) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.zzM = jElapsedRealtime;
    }

    private static Pair zzaD(zzbf zzbfVar, zzlv zzlvVar, boolean z, int i, boolean z2, zzbe zzbeVar, zzbd zzbdVar) {
        zzbf zzbfVar2 = zzlvVar.zza;
        if (zzbfVar.zzg()) {
            return null;
        }
        boolean zZzg = zzbfVar2.zzg();
        zzbf zzbfVar3 = zzbfVar2;
        if (true == zZzg) {
            zzbfVar3 = zzbfVar;
        }
        try {
            Pair pairZzm = zzbfVar3.zzm(zzbeVar, zzbdVar, zzlvVar.zzb, zzlvVar.zzc);
            zzbf zzbfVar4 = zzbfVar3;
            if (!zzbfVar.equals(zzbfVar4)) {
                if (zzbfVar.zze(pairZzm.first) == -1) {
                    int iZzr = zzr(zzbeVar, zzbdVar, i, z2, pairZzm.first, zzbfVar4, zzbfVar);
                    if (iZzr != -1) {
                        return zzbfVar.zzm(zzbeVar, zzbdVar, iZzr, -9223372036854775807L);
                    }
                    return null;
                }
                if (zzbfVar4.zzo(pairZzm.first, zzbdVar).zzf && zzbfVar4.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar4.zze(pairZzm.first)) {
                    return zzbfVar.zzm(zzbeVar, zzbdVar, zzbfVar.zzo(pairZzm.first, zzbdVar).zzc, zzlvVar.zzc);
                }
            }
            return pairZzm;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private static final void zzaE(zzmy zzmyVar) throws zzjm {
        zzmyVar.zzh();
        try {
            zzmyVar.zza().zzx(zzmyVar.zzc(), zzmyVar.zze());
        } finally {
            zzmyVar.zzi(true);
        }
    }

    private static final boolean zzaF(zzme zzmeVar) {
        if (zzmeVar != null) {
            try {
                if (zzmeVar.zze) {
                    zzzd[] zzzdVarArr = zzmeVar.zzc;
                    for (int i = 0; i < 2; i++) {
                        zzzd zzzdVar = zzzdVarArr[i];
                        if (zzzdVar != null) {
                            zzzdVar.zzb();
                        }
                    }
                } else {
                    zzmeVar.zza.zzm();
                }
                if (zzmeVar.zzg() != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private final void zzaa() throws zzjm {
        int i = 0;
        while (true) {
            zzng[] zzngVarArr = this.zzb;
            if (i >= 2) {
                this.zzaa = -9223372036854775807L;
                return;
            }
            int iZzd = zzngVarArr[i].zzd();
            zzngVarArr[i].zzA(this.zzn);
            zzN(i, false);
            this.zzR -= iZzd;
            i++;
        }
    }

    private final void zzab() {
        if (this.zzy && zzaz()) {
            zzng[] zzngVarArr = this.zzb;
            for (int i = 0; i < 2; i++) {
                zzng zzngVar = zzngVarArr[i];
                int iZzd = zzngVar.zzd();
                zzngVar.zzC(this.zzn);
                this.zzR -= iZzd - zzngVar.zzd();
            }
            this.zzaa = -9223372036854775807L;
        }
    }

    private final void zzac() throws zzjm {
        zzad();
        zzI(true);
    }

    private final void zzad() throws zzjm {
        zzabj zzabjVarZzk;
        zzabj zzabjVar;
        boolean z;
        zzlw zzlwVar;
        int i;
        zzjk zzjkVar = this.zzn;
        float f = zzjkVar.zzj().zzb;
        zzmh zzmhVar = this.zzr;
        zzme zzmeVarZzm = zzmhVar.zzm();
        zzme zzmeVarZzn = zzmhVar.zzn();
        zzabj zzabjVar2 = null;
        boolean z2 = true;
        loop0: while (true) {
            if (zzmeVarZzm == null || !zzmeVarZzm.zze) {
                return;
            }
            zzmu zzmuVar = this.zzG;
            zzabjVarZzk = zzmeVarZzm.zzk(f, zzmuVar.zza, zzmuVar.zzl);
            zzabjVar = zzmeVarZzm == zzmhVar.zzm() ? zzabjVarZzk : zzabjVar2;
            zzabj zzabjVarZzr = zzmeVarZzm.zzr();
            z = false;
            if (zzabjVarZzr == null) {
                break;
            }
            zzabb[] zzabbVarArr = zzabjVarZzk.zzc;
            if (zzabjVarZzr.zzc.length != zzabbVarArr.length) {
                break;
            }
            for (int i2 = 0; i2 < zzabbVarArr.length; i2++) {
                if (!zzabjVarZzk.zzb(zzabjVarZzr, i2)) {
                    break loop0;
                }
            }
            if (zzmeVarZzm != zzmeVarZzn) {
                z = true;
            }
            z2 &= z;
            zzmeVarZzm = zzmeVarZzm.zzp();
            zzabjVar2 = zzabjVar;
        }
        if (z2) {
            zzme zzmeVarZzm2 = zzmhVar.zzm();
            int iZzs = zzmhVar.zzs(zzmeVarZzm2) & 1;
            zzng[] zzngVarArr = this.zzb;
            boolean[] zArr = new boolean[2];
            zzabjVar.getClass();
            long jZzm = zzmeVarZzm2.zzm(zzabjVar, this.zzG.zzs, 1 == iZzs, zArr);
            zzmu zzmuVar2 = this.zzG;
            if (zzmuVar2.zze != 4 && jZzm != zzmuVar2.zzs) {
                z = true;
            }
            zzmu zzmuVar3 = this.zzG;
            i = 2;
            zzlwVar = this;
            zzlwVar.zzG = zzao(zzmuVar3.zzb, jZzm, zzmuVar3.zzc, zzmuVar3.zzd, z, 5);
            if (z) {
                zzlwVar.zzU(jZzm, true);
            }
            zzlwVar.zzab();
            boolean[] zArr2 = new boolean[2];
            for (int i3 = 0; i3 < 2; i3++) {
                int iZzd = zzngVarArr[i3].zzd();
                zArr2[i3] = zzngVarArr[i3].zzM();
                zzngVarArr[i3].zzD(zzmeVarZzm2.zzc[i3], zzjkVar, zzlwVar.zzT, zArr[i3]);
                if (iZzd - zzngVarArr[i3].zzd() > 0) {
                    zzlwVar.zzN(i3, false);
                }
                zzlwVar.zzR -= iZzd - zzngVarArr[i3].zzd();
            }
            zzlwVar.zzaq(zArr2, zzlwVar.zzT);
            zzmeVarZzm2.zzh = true;
        } else {
            zzlwVar = this;
            i = 2;
            zzmhVar.zzs(zzmeVarZzm);
            if (zzmeVarZzm.zze) {
                long jMax = Math.max(zzmeVarZzm.zzg.zzb, zzlwVar.zzT - zzmeVarZzm.zza());
                if (zzlwVar.zzy && zzlwVar.zzaz() && zzmhVar.zzo() == zzmeVarZzm) {
                    zzlwVar.zzab();
                }
                zzmeVarZzm.zzl(zzabjVarZzk, jMax, false);
            }
        }
        zzlwVar.zzas(true);
        if (zzlwVar.zzG.zze != 4) {
            zzlwVar.zzam();
            zzlwVar.zzL();
            zzlwVar.zzh.zzh(i);
        }
    }

    private final boolean zzae() {
        zzme zzmeVarZzm = this.zzr.zzm();
        long j = zzmeVarZzm.zzg.zze;
        if (zzmeVarZzm.zze) {
            return j == -9223372036854775807L || this.zzG.zzs < j || !zzax();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0234  */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0241  */
    /* JADX WARN: Code duplicated, block: B:111:0x0243 A[PHI: r3
      0x0243: PHI (r3v9 long) = (r3v5 long), (r3v5 long), (r3v14 long) binds: [B:116:0x025b, B:118:0x0261, B:110:0x0241] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:112:0x0245  */
    /* JADX WARN: Code duplicated, block: B:114:0x0254  */
    /* JADX WARN: Code duplicated, block: B:116:0x025b  */
    /* JADX WARN: Code duplicated, block: B:139:0x02af  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:152:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:160:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:18:0x0043  */
    /* JADX WARN: Code duplicated, block: B:235:0x042c  */
    /* JADX WARN: Code duplicated, block: B:236:0x042f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0439  */
    /* JADX WARN: Code duplicated, block: B:241:0x0441 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x0443  */
    /* JADX WARN: Code duplicated, block: B:243:0x0446  */
    /* JADX WARN: Code duplicated, block: B:247:0x046d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0206  */
    /* JADX WARN: Code duplicated, block: B:91:0x020d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0211  */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0220  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [com.google.android.gms.internal.ads.zzlv] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [com.google.android.gms.internal.ads.zzlv] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.google.android.gms.internal.ads.zzlw] */
    private final void zzaf(zzbf zzbfVar, boolean z) throws Throwable {
        zzxl zzxlVar;
        int i;
        Object obj;
        long j;
        zzbf zzbfVar2;
        zzbd zzbdVar;
        long j2;
        long j3;
        int i2;
        boolean z2;
        long jMax;
        boolean z3;
        boolean z4;
        int iZzk;
        boolean z5;
        zzbf zzbfVar3;
        long jMin;
        long j4;
        boolean zEquals;
        boolean z6;
        zzbd zzbdVarZzo;
        ?? r16;
        Object obj2;
        boolean z7;
        int i3;
        Object obj3;
        boolean z8;
        zzxl zzxlVar2;
        int i4;
        ?? r12;
        boolean z9;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        long jLongValue;
        Object obj4;
        int i8;
        boolean z10;
        int iZzk2;
        Object obj5;
        boolean z11;
        boolean z12;
        ?? r17;
        ?? r13;
        zzbf zzbfVar4;
        zzxl zzxlVar3;
        Throwable th;
        long j5;
        zzxl zzxlVar4;
        long j6;
        long j7;
        long jZzah;
        ?? r18;
        ?? r14;
        long j8;
        long j9;
        zzmu zzmuVar = this.zzG;
        zzlv zzlvVar = this.zzS;
        zzbd zzbdVar2 = this.zzl;
        int i9 = this.zzO;
        boolean z13 = this.zzP;
        long jZzS = 0;
        if (zzbfVar.zzg()) {
            zzxl zzxlVarZzb = zzmu.zzb();
            zzxl zzxlVar5 = zzmuVar.zzb;
            boolean z14 = (zzxlVarZzb.equals(zzxlVar5) && zzmuVar.zzs == 0) ? false : true;
            if (z14 && z) {
                zzbf zzbfVar5 = zzmuVar.zza;
                if (zzbfVar5.zzg() || zzbfVar5.zzo(zzxlVar5.zza, zzbdVar2).zzf) {
                    z8 = false;
                } else {
                    z8 = true;
                }
            } else {
                z8 = false;
            }
            zzxlVar2 = zzxlVarZzb;
            r12 = z14;
            i4 = 4;
            j4 = 0;
            z9 = false;
            z3 = true;
            z4 = false;
            j = -9223372036854775807L;
            j3 = -9223372036854775807L;
            zzbfVar3 = zzbfVar;
        } else {
            zzxl zzxlVar6 = zzmuVar.zzb;
            Object obj6 = zzxlVar6.zza;
            boolean zZzaB = zzaB(zzmuVar, zzbdVar2);
            long j10 = (zzxlVar6.zzb() || zZzaB) ? zzmuVar.zzc : zzmuVar.zzs;
            zzbe zzbeVar = this.zzk;
            if (zzlvVar != null) {
                zzxlVar = zzxlVar6;
                obj = obj6;
                i = -1;
                j = -9223372036854775807L;
                Pair pairZzaD = zzaD(zzbfVar, zzlvVar, true, i9, z13, zzbeVar, zzbdVar2);
                if (pairZzaD == null) {
                    iZzk2 = zzbfVar.zzk(z13);
                    obj5 = obj;
                    jLongValue = j10;
                    z12 = true;
                    z11 = false;
                    z2 = false;
                } else {
                    if (zzlvVar.zzc == -9223372036854775807L) {
                        i8 = zzbfVar.zzo(pairZzaD.first, zzbdVar2).zzc;
                        obj4 = obj;
                        jLongValue = j10;
                        z10 = false;
                    } else {
                        Object obj7 = pairZzaD.first;
                        jLongValue = ((Long) pairZzaD.second).longValue();
                        obj4 = obj7;
                        i8 = -1;
                        z10 = true;
                    }
                    z2 = zzmuVar.zze == 4;
                    iZzk2 = i8;
                    obj5 = obj4;
                    z11 = z10;
                    z12 = false;
                }
                i2 = iZzk2;
                j3 = jLongValue;
                zzbdVar = zzbdVar2;
                zzbfVar2 = zzbfVar;
                z3 = z12;
                z4 = z11;
                j2 = j10;
                obj = obj5;
            } else {
                zzxlVar = zzxlVar6;
                zzbeVar = zzbeVar;
                i = -1;
                obj = obj6;
                j = -9223372036854775807L;
                zzbfVar2 = zzbfVar;
                zzbdVar = zzbdVar2;
                zzbf zzbfVar6 = zzmuVar.zza;
                if (zzbfVar6.zzg()) {
                    iZzk = zzbfVar2.zzk(z13);
                } else if (zzbfVar2.zze(obj) == -1) {
                    int iZzr = zzr(zzbeVar, zzbdVar, i9, z13, obj, zzbfVar6, zzbfVar2);
                    obj = obj;
                    if (iZzr == -1) {
                        iZzr = zzbfVar2.zzk(z13);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    i2 = iZzr;
                    zzbdVar = zzbdVar;
                    obj = obj;
                    j3 = j10;
                    z2 = false;
                    zzbfVar2 = zzbfVar2;
                    z3 = z5;
                    z4 = false;
                    zzbeVar = zzbeVar;
                    j2 = j3;
                } else if (j10 == -9223372036854775807L) {
                    iZzk = zzbfVar2.zzo(obj, zzbdVar).zzc;
                } else if (zZzaB) {
                    zzbfVar6.zzo(obj, zzbdVar);
                    if (zzbfVar6.zzb(zzbdVar.zzc, zzbeVar, 0L).zzn == zzbfVar6.zze(obj)) {
                        zzbdVar = zzbdVar;
                        Pair pairZzm = zzbfVar2.zzm(zzbeVar, zzbdVar, zzbfVar2.zzo(obj, zzbdVar).zzc, j10);
                        zzbfVar2 = zzbfVar2;
                        j2 = j10;
                        obj = pairZzm.first;
                        jMax = ((Long) pairZzm.second).longValue();
                    } else {
                        zzbdVar = zzbdVar;
                        zzbfVar2 = zzbfVar2;
                        j2 = j10;
                        if (zzbfVar2.zzo(obj, zzbdVar).zzd != -9223372036854775807L) {
                            long j11 = zzbdVar.zzd - 1;
                            String str = zzfm.zza;
                            jMax = Math.max(0L, Math.min(j2, j11));
                        } else {
                            jMax = j2;
                        }
                        obj = obj;
                    }
                    i2 = -1;
                    j3 = jMax;
                    z2 = false;
                    z3 = false;
                    z4 = true;
                } else {
                    j2 = j10;
                    j3 = j2;
                    i2 = -1;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                }
                i2 = iZzk;
                j3 = j10;
                z2 = false;
                j2 = j3;
                z3 = false;
                z4 = false;
            }
            if (i2 != i) {
                zzbfVar3 = zzbfVar2;
                Pair pairZzm2 = zzbfVar3.zzm(zzbeVar, zzbdVar, i2, -9223372036854775807L);
                obj = pairZzm2.first;
                jMin = ((Long) pairZzm2.second).longValue();
                j3 = j;
            } else {
                zzbfVar3 = zzbfVar2;
                jMin = j3;
            }
            zzxl zzxlVarZzy = this.zzr.zzy(zzbfVar3, obj, jMin);
            int i10 = zzxlVarZzy.zze;
            if (i10 != i) {
                j4 = 0;
                int i11 = zzxlVar.zze;
                boolean z15 = i11 != i && i10 >= i11;
                zEquals = obj.equals(obj);
                if (zEquals || zzxlVar.zzb() || zzxlVarZzy.zzb() || !z15) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                zzbdVarZzo = zzbfVar3.zzo(obj, zzbdVar);
                r16 = zZzaB;
                if (!zZzaB) {
                    i7 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                    r16 = i7;
                    if (i7 == 0) {
                        r16 = i7;
                        if (obj.equals(zzxlVarZzy.zza)) {
                            if (zzxlVar.zzb()) {
                                zzbdVarZzo.zzj(zzxlVar.zzb);
                            }
                            r16 = i7;
                            if (zzxlVarZzy.zzb()) {
                                zzbdVarZzo.zzj(zzxlVarZzy.zzb);
                                r16 = i7;
                            }
                        }
                    }
                }
                if (true == z6) {
                    zzxlVarZzy = zzxlVar;
                }
                if (zzxlVarZzy.zzb()) {
                    if (zzxlVarZzy.equals(zzxlVar)) {
                        jMin = zzmuVar.zzs;
                        obj2 = obj;
                    } else {
                        zzbfVar3.zzo(zzxlVarZzy.zza, zzbdVar);
                        if (zzxlVarZzy.zzc == zzbdVar.zzd(zzxlVarZzy.zzb)) {
                            zzbdVar.zzi();
                        }
                        obj2 = obj;
                        jMin = j4;
                    }
                } else if (zEquals || !zzxlVar.zzb()) {
                    obj2 = obj;
                } else {
                    zza zzaVarZza = zzbfVar3.zzo(obj, zzbdVar).zzg.zza(zzxlVar.zzb);
                    long j12 = zzaVarZza.zzi;
                    long j13 = zzmuVar.zzc;
                    if (j13 != j) {
                        obj2 = obj;
                        long j14 = zzaVarZza.zza;
                        if (j13 < j4) {
                        }
                    } else {
                        obj2 = obj;
                    }
                    int i12 = zzaVarZza.zzb;
                    int i13 = zzxlVar.zzc;
                    if (i12 > i13 && zzaVarZza.zze[i13] == 2) {
                        long j15 = zzbfVar3.zzo(obj, zzbdVar).zzd;
                        if (j15 != j) {
                            jMin = Math.min(j15 - 1, jMin);
                        }
                        j3 = jMin;
                    }
                }
                if (zzxlVarZzy.equals(zzxlVar) || jMin != zzmuVar.zzs) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (zzbfVar3.zze(obj2) == -1) {
                    i3 = 4;
                } else {
                    i3 = 3;
                }
                obj3 = zzxlVarZzy.zza;
                if (obj3.equals(obj2) && (i5 = zzxlVarZzy.zzb) != -1) {
                    zza zzaVarZza2 = zzbfVar3.zzo(obj3, zzbdVar).zzg.zza(i5);
                    i6 = zzxlVarZzy.zzc;
                    iArr = zzaVarZza2.zze;
                    if (i6 < iArr.length || iArr[i6] != 2) {
                        i3 = 0;
                    }
                }
                if (z7 || !z) {
                    z8 = false;
                } else {
                    zzbf zzbfVar7 = zzmuVar.zza;
                    if (zzbfVar7.zzg() || zzbfVar7.zzo(obj2, zzbdVar).zzf) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                }
                jZzS = jMin;
                zzxlVar2 = zzxlVarZzy;
                i4 = i3;
                r12 = z7;
                z9 = z2;
            } else {
                j4 = 0;
            }
            zEquals = obj.equals(obj);
            if (zEquals) {
                z6 = false;
            } else {
                z6 = false;
            }
            zzbdVarZzo = zzbfVar3.zzo(obj, zzbdVar);
            r16 = zZzaB;
            if (!zZzaB) {
                i7 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
                r16 = i7;
                if (i7 == 0) {
                    r16 = i7;
                    if (obj.equals(zzxlVarZzy.zza)) {
                        if (zzxlVar.zzb()) {
                            zzbdVarZzo.zzj(zzxlVar.zzb);
                        }
                        r16 = i7;
                        if (zzxlVarZzy.zzb()) {
                            zzbdVarZzo.zzj(zzxlVarZzy.zzb);
                            r16 = i7;
                        }
                    }
                }
            }
            if (true == z6) {
                zzxlVarZzy = zzxlVar;
            }
            if (zzxlVarZzy.zzb()) {
                if (zzxlVarZzy.equals(zzxlVar)) {
                    jMin = zzmuVar.zzs;
                    obj2 = obj;
                } else {
                    zzbfVar3.zzo(zzxlVarZzy.zza, zzbdVar);
                    if (zzxlVarZzy.zzc == zzbdVar.zzd(zzxlVarZzy.zzb)) {
                        zzbdVar.zzi();
                    }
                    obj2 = obj;
                    jMin = j4;
                }
            } else if (zEquals) {
                obj2 = obj;
            } else {
                obj2 = obj;
            }
            if (zzxlVarZzy.equals(zzxlVar)) {
                z7 = true;
            } else {
                z7 = true;
            }
            if (zzbfVar3.zze(obj2) == -1) {
                i3 = 4;
            } else {
                i3 = 3;
            }
            obj3 = zzxlVarZzy.zza;
            if (obj3.equals(obj2)) {
                zza zzaVarZza3 = zzbfVar3.zzo(obj3, zzbdVar).zzg.zza(i5);
                i6 = zzxlVarZzy.zzc;
                iArr = zzaVarZza3.zze;
                if (i6 < iArr.length) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            jZzS = jMin;
            zzxlVar2 = zzxlVarZzy;
            i4 = i3;
            r12 = z7;
            z9 = z2;
        }
        z4 = z8;
        if (z3) {
            try {
                if (this.zzG.zze != 1) {
                    zzB(4);
                }
                zzX(false, false, false, true);
            } catch (Throwable th2) {
                th = th2;
                zzxl zzxlVar7 = zzxlVar2;
                zzbfVar4 = zzbfVar3;
                zzxlVar3 = zzxlVar7;
                r13 = 0;
                r17 = r12;
                zzmu zzmuVar2 = this.zzG;
                zzbf zzbfVar8 = zzmuVar2.zza;
                zzxl zzxlVar8 = zzmuVar2.zzb;
                if (true != z4) {
                    j5 = j;
                } else {
                    j5 = jZzS;
                }
                zzxlVar4 = zzxlVar3;
                zzag(zzbfVar4, zzxlVar4, zzbfVar8, zzxlVar8, j5, false);
                if (r17 == 0) {
                    if (z4) {
                        j7 = jZzS;
                        j6 = j7;
                    } else {
                        j6 = this.zzG.zzd;
                        j7 = jZzS;
                    }
                    this.zzG = zzao(zzxlVar4, j7, j3, j6, z4, i4);
                } else {
                    if (z4) {
                        j7 = jZzS;
                        j6 = j7;
                    } else {
                        j6 = this.zzG.zzd;
                        j7 = jZzS;
                    }
                    this.zzG = zzao(zzxlVar4, j7, j3, j6, z4, i4);
                }
                zzaj();
                zzZ(zzbfVar4, this.zzG.zza);
                this.zzG = this.zzG.zzd(zzbfVar4);
                if (!zzbfVar4.zzg()) {
                    this.zzS = r13;
                }
                zzas(false);
                this.zzh.zzh(2);
                throw th;
            }
        }
        zzng[] zzngVarArr = this.zzb;
        for (int i14 = 0; i14 < 2; i14++) {
            zzngVarArr[i14].zzn(zzbfVar3);
        }
        try {
            if (r12 == 0) {
                try {
                    zzmh zzmhVar = this.zzr;
                    long jZzah2 = zzmhVar.zzn() == null ? j4 : zzah(zzmhVar.zzn());
                    if (zzaz()) {
                        try {
                            jZzah = zzmhVar.zzo() == null ? j4 : zzah(zzmhVar.zzo());
                        } catch (Throwable th3) {
                            th = th3;
                            zzxlVar3 = zzxlVar2;
                            zzbfVar4 = zzbfVar;
                            r13 = 0;
                            r17 = r12;
                            zzmu zzmuVar3 = this.zzG;
                            zzbf zzbfVar9 = zzmuVar3.zza;
                            zzxl zzxlVar9 = zzmuVar3.zzb;
                            if (true != z4) {
                                j5 = j;
                            } else {
                                j5 = jZzS;
                            }
                            zzxlVar4 = zzxlVar3;
                            zzag(zzbfVar4, zzxlVar4, zzbfVar9, zzxlVar9, j5, false);
                            if (r17 == 0) {
                                if (z4) {
                                    j7 = jZzS;
                                    j6 = j7;
                                } else {
                                    j6 = this.zzG.zzd;
                                    j7 = jZzS;
                                }
                                this.zzG = zzao(zzxlVar4, j7, j3, j6, z4, i4);
                            } else {
                                if (z4) {
                                    j7 = jZzS;
                                    j6 = j7;
                                } else {
                                    j6 = this.zzG.zzd;
                                    j7 = jZzS;
                                }
                                this.zzG = zzao(zzxlVar4, j7, j3, j6, z4, i4);
                            }
                            zzaj();
                            zzZ(zzbfVar4, this.zzG.zza);
                            this.zzG = this.zzG.zzd(zzbfVar4);
                            if (!zzbfVar4.zzg()) {
                                this.zzS = r13;
                            }
                            zzas(false);
                            this.zzh.zzh(2);
                            throw th;
                        }
                    }
                    z = z4;
                    r16 = r12;
                    z4 = z4;
                    r12 = 0;
                    try {
                        int iZzw = zzmhVar.zzw(zzbfVar, this.zzT, jZzah2, jZzah);
                        zzbfVar3 = zzbfVar;
                        if ((iZzw & 1) != 0) {
                            zzI(false);
                            r14 = r12;
                            r18 = r16;
                        } else {
                            r14 = r12;
                            r18 = r16;
                            if ((iZzw & 2) != 0) {
                                zzab();
                                r14 = r12;
                                r18 = r16;
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        zzbfVar3 = zzbfVar;
                        zzxl zzxlVar10 = zzxlVar2;
                        zzbfVar4 = zzbfVar3;
                        zzxlVar3 = zzxlVar10;
                        z4 = z;
                        r13 = r12;
                        r17 = r16;
                        zzmu zzmuVar4 = this.zzG;
                        zzbf zzbfVar10 = zzmuVar4.zza;
                        zzxl zzxlVar11 = zzmuVar4.zzb;
                        if (true != z4) {
                            j5 = j;
                        } else {
                            j5 = jZzS;
                        }
                        zzxlVar4 = zzxlVar3;
                        zzag(zzbfVar4, zzxlVar4, zzbfVar10, zzxlVar11, j5, false);
                        if (r17 == 0 || j3 != this.zzG.zzc) {
                            if (z4) {
                                j7 = jZzS;
                                j6 = j7;
                            } else {
                                j6 = this.zzG.zzd;
                                j7 = jZzS;
                            }
                            this.zzG = zzao(zzxlVar4, j7, j3, j6, z4, i4);
                        }
                        zzaj();
                        zzZ(zzbfVar4, this.zzG.zza);
                        this.zzG = this.zzG.zzd(zzbfVar4);
                        if (!zzbfVar4.zzg()) {
                            this.zzS = r13;
                        }
                        zzas(false);
                        this.zzh.zzh(2);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    zzbfVar3 = zzbfVar;
                    z = z4;
                    r16 = r12;
                    z4 = z4;
                    r12 = 0;
                }
            } else {
                z = z4;
                ?? r19 = r12;
                z4 = z4;
                Object obj8 = null;
                r14 = obj8;
                r18 = r19;
                if (!zzbfVar3.zzg()) {
                    zzmh zzmhVar2 = this.zzr;
                    for (zzme zzmeVarZzm = zzmhVar2.zzm(); zzmeVarZzm != null; zzmeVarZzm = zzmeVarZzm.zzp()) {
                        if (zzmeVarZzm.zzg.zza.equals(zzxlVar2)) {
                            zzmeVarZzm.zzg = zzmhVar2.zzx(zzbfVar3, zzmeVarZzm.zzg);
                        }
                    }
                    jZzS = zzS(zzxlVar2, jZzS, z9);
                    r14 = obj8;
                    r18 = r19;
                }
            }
            zzmu zzmuVar5 = this.zzG;
            zzxl zzxlVar12 = zzxlVar2;
            zzag(zzbfVar3, zzxlVar12, zzmuVar5.zza, zzmuVar5.zzb, true != z4 ? j : jZzS, false);
            zzbf zzbfVar11 = zzbfVar3;
            if (r18 != 0 || j3 != this.zzG.zzc) {
                if (z) {
                    j9 = jZzS;
                    j8 = j9;
                } else {
                    j8 = this.zzG.zzd;
                    j9 = jZzS;
                }
                this.zzG = zzao(zzxlVar12, j9, j3, j8, z, i4);
            }
            zzaj();
            zzZ(zzbfVar11, this.zzG.zza);
            this.zzG = this.zzG.zzd(zzbfVar11);
            if (!zzbfVar11.zzg()) {
                this.zzS = r14;
            }
            zzas(false);
            this.zzh.zzh(2);
        } catch (Throwable th6) {
            th = th6;
        }
    }

    private final void zzag(zzbf zzbfVar, zzxl zzxlVar, zzbf zzbfVar2, zzxl zzxlVar2, long j, boolean z) throws zzjm {
        if (!zzP(zzbfVar, zzxlVar)) {
            zzav zzavVar = zzxlVar.zzb() ? zzav.zza : this.zzG.zzo;
            if (this.zzn.zzj().equals(zzavVar)) {
                return;
            }
            zzM(zzavVar);
            zzal(this.zzG.zzo, zzavVar.zzb, false, false);
            return;
        }
        Object obj = zzxlVar.zza;
        zzbd zzbdVar = this.zzl;
        int i = zzbfVar.zzo(obj, zzbdVar).zzc;
        zzbe zzbeVar = this.zzk;
        zzbfVar.zzb(i, zzbeVar, 0L);
        zzjf zzjfVar = this.zzad;
        zzaf zzafVar = zzbeVar.zzj;
        String str = zzfm.zza;
        zzjfVar.zza(zzafVar);
        if (j != -9223372036854775807L) {
            zzjfVar.zzb(zzO(zzbfVar, obj, j));
            return;
        }
        if (!Objects.equals(!zzbfVar2.zzg() ? zzbfVar2.zzb(zzbfVar2.zzo(zzxlVar2.zza, zzbdVar).zzc, zzbeVar, 0L).zzb : null, zzbeVar.zzb) || z) {
            zzjfVar.zzb(-9223372036854775807L);
        }
    }

    private final long zzah(zzme zzmeVar) {
        if (zzmeVar == null) {
            return 0L;
        }
        long jZza = zzmeVar.zza();
        if (zzmeVar.zze) {
            int i = 0;
            while (true) {
                zzng[] zzngVarArr = this.zzb;
                if (i >= 2) {
                    break;
                }
                if (zzngVarArr[i].zzp(zzmeVar)) {
                    long jZzf = zzngVarArr[i].zzf(zzmeVar);
                    if (jZzf == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    jZza = Math.max(jZzf, jZza);
                }
                i++;
            }
        }
        return jZza;
    }

    private final void zzai() {
        zzmh zzmhVar = this.zzr;
        zzmhVar.zzt();
        zzme zzmeVarZzl = zzmhVar.zzl();
        if (zzmeVarZzl != null) {
            if (!zzmeVarZzl.zzd || zzmeVarZzl.zze) {
                zzxj zzxjVar = zzmeVarZzl.zza;
                if (zzxjVar.zze()) {
                    return;
                }
                if (this.zzg.zzj(this.zzu, this.zzG.zza, zzmeVarZzl.zzg.zza, zzmeVarZzl.zze ? zzxjVar.zzb() : 0L)) {
                    if (!zzmeVarZzl.zzd) {
                        zzmeVarZzl.zzs(this, zzmeVarZzl.zzg.zzb);
                        return;
                    }
                    zzmb zzmbVar = new zzmb();
                    zzmbVar.zza(this.zzT - zzmeVarZzl.zza());
                    zzmbVar.zzb(this.zzn.zzj().zzb);
                    zzmbVar.zzc(this.zzM);
                    zzmeVarZzl.zzj(new zzmc(zzmbVar, null));
                }
            }
        }
    }

    private final void zzaj() {
        zzme zzmeVarZzm = this.zzr.zzm();
        boolean z = false;
        if (zzmeVarZzm != null && zzmeVarZzm.zzg.zzh && this.zzJ) {
            z = true;
        }
        this.zzK = z;
    }

    private final void zzak(zzav zzavVar, boolean z) throws zzjm {
        zzal(zzavVar, zzavVar.zzb, true, z);
    }

    private final void zzal(zzav zzavVar, float f, boolean z, boolean z2) throws zzjm {
        int i;
        if (z) {
            if (z2) {
                this.zzH.zza(1);
            }
            zzmu zzmuVar = this.zzG;
            zzbf zzbfVar = zzmuVar.zza;
            zzxl zzxlVar = zzmuVar.zzb;
            long j = zzmuVar.zzc;
            long j2 = zzmuVar.zzd;
            int i2 = zzmuVar.zze;
            zzjm zzjmVar = zzmuVar.zzf;
            boolean z3 = zzmuVar.zzg;
            zzzo zzzoVar = zzmuVar.zzh;
            zzabj zzabjVar = zzmuVar.zzi;
            List list = zzmuVar.zzj;
            zzxl zzxlVar2 = zzmuVar.zzk;
            boolean z4 = zzmuVar.zzl;
            int i3 = zzmuVar.zzm;
            int i4 = zzmuVar.zzn;
            long j3 = zzmuVar.zzq;
            long j4 = zzmuVar.zzr;
            long j5 = zzmuVar.zzs;
            long j6 = zzmuVar.zzt;
            boolean z5 = zzmuVar.zzp;
            this.zzG = new zzmu(zzbfVar, zzxlVar, j, j2, i2, zzjmVar, z3, zzzoVar, zzabjVar, list, zzxlVar2, z4, i3, i4, zzavVar, j3, j4, j5, j6, false);
        }
        float f2 = zzavVar.zzb;
        zzme zzmeVarZzm = this.zzr.zzm();
        while (true) {
            i = 0;
            if (zzmeVarZzm == null) {
                break;
            }
            zzabb[] zzabbVarArr = zzmeVarZzm.zzr().zzc;
            int length = zzabbVarArr.length;
            while (i < length) {
                zzabb zzabbVar = zzabbVarArr[i];
                i++;
            }
            zzmeVarZzm = zzmeVarZzm.zzp();
        }
        zzng[] zzngVarArr = this.zzb;
        while (i < 2) {
            zzngVarArr[i].zzm(f, f2);
            i++;
        }
    }

    private final void zzam() {
        long jZza;
        zzmh zzmhVar = this.zzr;
        boolean zZzh = false;
        if (zzaF(zzmhVar.zzk())) {
            zzme zzmeVarZzk = zzmhVar.zzk();
            long jZzau = zzau(zzmeVarZzk.zzg());
            zzme zzmeVarZzm = zzmhVar.zzm();
            long jZza2 = this.zzT;
            if (zzmeVarZzk == zzmeVarZzm) {
                jZza = zzmeVarZzk.zza();
            } else {
                jZza2 -= zzmeVarZzk.zza();
                jZza = zzmeVarZzk.zzg.zzb;
            }
            zzlz zzlzVar = new zzlz(this.zzu, this.zzG.zza, zzmeVarZzk.zzg.zza, jZza2 - jZza, jZzau, this.zzn.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzmeVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM);
            zzma zzmaVar = this.zzg;
            boolean zZzh2 = zzmaVar.zzh(zzlzVar);
            zzme zzmeVarZzm2 = zzmhVar.zzm();
            if (zZzh2 || !zzmeVarZzm2.zze || jZzau >= 500000 || this.zzm <= 0) {
                zZzh = zZzh2;
            } else {
                zzmeVarZzm2.zza.zzq(this.zzG.zzs, false);
                zZzh = zzmaVar.zzh(zzlzVar);
            }
        }
        this.zzN = zZzh;
        if (zZzh) {
            zzme zzmeVarZzk2 = zzmhVar.zzk();
            zzmeVarZzk2.getClass();
            zzmb zzmbVar = new zzmb();
            zzmbVar.zza(this.zzT - zzmeVarZzk2.zza());
            zzmbVar.zzb(this.zzn.zzj().zzb);
            zzmbVar.zzc(this.zzM);
            zzmeVarZzk2.zzj(new zzmc(zzmbVar, null));
        }
        zzan();
    }

    private final void zzan() {
        zzme zzmeVarZzk = this.zzr.zzk();
        boolean z = true;
        if (!this.zzN && (zzmeVarZzk == null || !zzmeVarZzk.zza.zze())) {
            z = false;
        }
        zzmu zzmuVar = this.zzG;
        if (z != zzmuVar.zzg) {
            this.zzG = zzmuVar.zzg(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    private final zzmu zzao(zzxl zzxlVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        zzabj zzabjVar;
        zzme zzmeVarZzm;
        int i2 = 0;
        this.zzW = (!this.zzW && j == this.zzG.zzs && zzxlVar.equals(this.zzG.zzb)) ? false : true;
        zzaj();
        zzmu zzmuVar = this.zzG;
        zzzo zzzoVar = zzmuVar.zzh;
        zzabj zzabjVar2 = zzmuVar.zzi;
        List listZzi = zzmuVar.zzj;
        if (this.zzs.zzb()) {
            zzmh zzmhVar = this.zzr;
            zzme zzmeVarZzm2 = zzmhVar.zzm();
            zzzo zzzoVarZzq = zzmeVarZzm2 == null ? zzzo.zza : zzmeVarZzm2.zzq();
            zzabj zzabjVarZzr = zzmeVarZzm2 == null ? this.zzf : zzmeVarZzm2.zzr();
            zzabb[] zzabbVarArr = zzabjVarZzr.zzc;
            zzgwq zzgwqVar = new zzgwq();
            boolean z2 = false;
            for (zzabb zzabbVar : zzabbVarArr) {
                if (zzabbVar != null) {
                    zzap zzapVar = zzabbVar.zzb(0).zzl;
                    if (zzapVar == null) {
                        zzgwqVar.zzf(new zzap(-9223372036854775807L, new zzao[0]));
                    } else {
                        zzgwqVar.zzf(zzapVar);
                        z2 = true;
                    }
                }
            }
            zzgwt zzgwtVarZzi = z2 ? zzgwqVar.zzi() : zzgwt.zzi();
            if (zzmeVarZzm2 != null) {
                zzmf zzmfVar = zzmeVarZzm2.zzg;
                if (zzmfVar.zzd != j2) {
                    zzmeVarZzm2.zzg = zzmfVar.zzb(j2);
                }
            }
            if (zzmhVar.zzm() == zzmhVar.zzn() && (zzmeVarZzm = zzmhVar.zzm()) != null) {
                zzabj zzabjVarZzr2 = zzmeVarZzm.zzr();
                while (true) {
                    zzng[] zzngVarArr = this.zzb;
                    if (i2 >= 2) {
                        break;
                    }
                    if (zzabjVarZzr2.zza(i2)) {
                        if (zzngVarArr[i2].zze() != 1) {
                            break;
                        }
                        int i3 = zzabjVarZzr2.zzb[i2].zzb;
                    }
                    i2++;
                }
            }
            list = zzgwtVarZzi;
            zzzoVar = zzzoVarZzq;
            zzabjVar = zzabjVarZzr;
        } else {
            if (!zzxlVar.equals(this.zzG.zzb)) {
                zzabjVar2 = this.zzf;
                zzzoVar = zzzo.zza;
                listZzi = zzgwt.zzi();
            }
            list = listZzi;
            zzabjVar = zzabjVar2;
        }
        if (z) {
            this.zzH.zzc(i);
        }
        return this.zzG.zzc(zzxlVar, j, j2, j3, zzat(), zzzoVar, zzabjVar, list);
    }

    private final void zzap() throws zzjm {
        zzaq(new boolean[2], this.zzr.zzn().zzc());
    }

    private final void zzaq(boolean[] zArr, long j) throws zzjm {
        zzng[] zzngVarArr;
        long j2;
        zzme zzmeVarZzn = this.zzr.zzn();
        zzabj zzabjVarZzr = zzmeVarZzn.zzr();
        int i = 0;
        while (true) {
            zzngVarArr = this.zzb;
            if (i >= 2) {
                break;
            }
            if (!zzabjVarZzr.zza(i)) {
                zzngVarArr[i].zzG();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            if (!zzabjVarZzr.zza(i2) || zzngVarArr[i2].zzp(zzmeVarZzn)) {
                j2 = j;
            } else {
                j2 = j;
                zzar(zzmeVarZzn, i2, zArr[i2], j2);
            }
            i2++;
            j = j2;
        }
    }

    private final void zzar(zzme zzmeVar, int i, boolean z, long j) throws zzjm {
        zzng zzngVar = this.zzb[i];
        if (zzngVar.zzM()) {
            return;
        }
        boolean z2 = zzmeVar == this.zzr.zzm();
        zzabj zzabjVarZzr = zzmeVar.zzr();
        zznf zznfVar = zzabjVarZzr.zzb[i];
        zzabb zzabbVar = zzabjVarZzr.zzc[i];
        boolean z3 = zzax() && this.zzG.zze == 3;
        boolean z4 = !z && z3;
        this.zzR++;
        zzngVar.zzx(zznfVar, zzabbVar, zzmeVar.zzc[i], this.zzT, z4, z2, j, zzmeVar.zza(), zzmeVar.zzg.zza, this.zzn);
        zzngVar.zzy(11, new zzlk(this), zzmeVar);
        if (z3 && z2) {
            zzngVar.zzv();
        }
    }

    private final void zzas(boolean z) {
        zzme zzmeVarZzk = this.zzr.zzk();
        zzxl zzxlVar = zzmeVarZzk == null ? this.zzG.zzb : zzmeVarZzk.zzg.zza;
        boolean zEquals = this.zzG.zzk.equals(zzxlVar);
        if (!zEquals) {
            this.zzG = this.zzG.zzh(zzxlVar);
        }
        zzmu zzmuVar = this.zzG;
        zzmuVar.zzq = zzmeVarZzk == null ? zzmuVar.zzs : zzmeVarZzk.zzf();
        this.zzG.zzr = zzat();
        if ((!zEquals || z) && zzmeVarZzk != null && zzmeVarZzk.zze) {
            zzaw(zzmeVarZzk.zzg.zza, zzmeVarZzk.zzq(), zzmeVarZzk.zzr());
        }
    }

    private final long zzat() {
        return zzau(this.zzG.zzq);
    }

    private final long zzau(long j) {
        zzme zzmeVarZzk = this.zzr.zzk();
        if (zzmeVarZzk == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.zzT - zzmeVarZzk.zza()));
    }

    private final long zzav(zzme zzmeVar) {
        zzgtr.zzi(zzmeVar.zze);
        return (long) ((zzmeVar.zzc() - this.zzT) / this.zzn.zzj().zzb);
    }

    private final void zzaw(zzxl zzxlVar, zzzo zzzoVar, zzabj zzabjVar) {
        long jZza;
        zzmh zzmhVar = this.zzr;
        zzme zzmeVarZzk = zzmhVar.zzk();
        zzmeVarZzk.getClass();
        zzme zzmeVarZzm = zzmhVar.zzm();
        long jZza2 = this.zzT;
        if (zzmeVarZzk == zzmeVarZzm) {
            jZza = zzmeVarZzk.zza();
        } else {
            jZza2 -= zzmeVarZzk.zza();
            jZza = zzmeVarZzk.zzg.zzb;
        }
        this.zzg.zzb(new zzlz(this.zzu, this.zzG.zza, zzxlVar, jZza2 - jZza, zzau(zzmeVarZzk.zzf()), this.zzn.zzj().zzb, this.zzG.zzl, this.zzL, zzP(this.zzG.zza, zzmeVarZzk.zzg.zza) ? this.zzad.zze() : -9223372036854775807L, this.zzM), zzzoVar, zzabjVar.zzc);
    }

    private final boolean zzax() {
        zzmu zzmuVar = this.zzG;
        return zzmuVar.zzl && zzmuVar.zzn == 0;
    }

    private final void zzay(int i) throws IOException, zzjm {
        zzng zzngVar = this.zzb[i];
        try {
            zzme zzmeVarZzm = this.zzr.zzm();
            if (zzmeVarZzm == null) {
                throw null;
            }
            zzme zzmeVar = zzmeVarZzm;
            zzngVar.zzu(zzmeVarZzm);
        } catch (IOException | RuntimeException e) {
            zzngVar.zze();
            throw e;
        }
    }

    private final boolean zzaz() {
        if (!this.zzy) {
            return false;
        }
        zzng[] zzngVarArr = this.zzb;
        for (int i = 0; i < 2; i++) {
            if (zzngVarArr[i].zzc()) {
                return true;
            }
        }
        return false;
    }

    static int zzr(zzbe zzbeVar, zzbd zzbdVar, int i, boolean z, Object obj, zzbf zzbfVar, zzbf zzbfVar2) {
        zzbf zzbfVar3 = zzbfVar;
        Object obj2 = zzbfVar3.zzb(zzbfVar3.zzo(obj, zzbdVar).zzc, zzbeVar, 0L).zzb;
        for (int i2 = 0; i2 < zzbfVar2.zza(); i2++) {
            if (zzbfVar2.zzb(i2, zzbeVar, 0L).zzb.equals(obj2)) {
                return i2;
            }
        }
        int iZze = zzbfVar3.zze(obj);
        int iZzc = zzbfVar3.zzc();
        int iZze2 = -1;
        int i3 = 0;
        while (i3 < iZzc && iZze2 == -1) {
            zzbf zzbfVar4 = zzbfVar3;
            int iZzl = zzbfVar4.zzl(iZze, zzbdVar, zzbeVar, i, z);
            if (iZzl == -1) {
                iZze2 = -1;
                break;
            }
            iZze2 = zzbfVar2.zze(zzbfVar4.zzf(iZzl));
            i3++;
            zzbfVar3 = zzbfVar4;
            iZze = iZzl;
        }
        if (iZze2 == -1) {
            return -1;
        }
        return zzbfVar2.zzd(iZze2, zzbdVar, false).zzc;
    }

    static final /* synthetic */ void zzz(zzmy zzmyVar) {
        try {
            zzaE(zzmyVar);
        } catch (zzjm e) {
            zzeh.zzf("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:276:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:277:0x05d8 A[Catch: zzjm -> 0x0892, RuntimeException -> 0x0aef, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TRY_LEAVE, TryCatch #16 {zzjm -> 0x0892, blocks: (B:274:0x05cd, B:277:0x05d8), top: B:706:0x05cd }] */
    /* JADX WARN: Code duplicated, block: B:281:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:282:0x05e4 A[Catch: RuntimeException -> 0x06f4, IOException -> 0x06f9, zzwn -> 0x06fe, zzhs -> 0x0703, zzat -> 0x0708, zzui -> 0x070d, zzjm -> 0x0712, TryCatch #21 {zzat -> 0x0708, zzhs -> 0x0703, zzjm -> 0x0712, zzui -> 0x070d, zzwn -> 0x06fe, IOException -> 0x06f9, RuntimeException -> 0x06f4, blocks: (B:279:0x05de, B:282:0x05e4, B:285:0x05ed, B:292:0x0602, B:296:0x0612, B:301:0x0628, B:306:0x063c), top: B:724:0x05de }] */
    /* JADX WARN: Code duplicated, block: B:284:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:287:0x05f1 A[Catch: zzjm -> 0x05fc, RuntimeException -> 0x0aef, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TRY_ENTER, TRY_LEAVE, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:289:0x05f9 A[LOOP:16: B:285:0x05ed->B:289:0x05f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x0676 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:338:0x06e8 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, LOOP:19: B:337:0x06e6->B:338:0x06e8, LOOP_END, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x0718 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:355:0x0721 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:357:0x0725 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:359:0x072a A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:361:0x0732 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x0733 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:366:0x0741  */
    /* JADX WARN: Code duplicated, block: B:369:0x074d  */
    /* JADX WARN: Code duplicated, block: B:382:0x0774 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, LOOP:6: B:380:0x0770->B:382:0x0774, LOOP_END, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:384:0x0796  */
    /* JADX WARN: Code duplicated, block: B:386:0x0799 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:428:0x0859 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, LOOP:9: B:427:0x0857->B:428:0x0859, LOOP_END, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:431:0x0867 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0877 A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:437:0x087d A[Catch: RuntimeException -> 0x0aef, zzjm -> 0x0af1, IOException -> 0x0aff, zzwn -> 0x0b04, zzhs -> 0x0b09, zzat -> 0x0b0e, zzui -> 0x0b13, TryCatch #26 {RuntimeException -> 0x0aef, blocks: (B:260:0x0575, B:262:0x0585, B:263:0x058f, B:265:0x05a1, B:267:0x05af, B:274:0x05cd, B:372:0x0754, B:374:0x075a, B:376:0x0760, B:379:0x0765, B:380:0x0770, B:382:0x0774, B:386:0x0799, B:388:0x079f, B:390:0x07a7, B:391:0x07af, B:392:0x07b2, B:394:0x07bb, B:442:0x088d, B:446:0x08a2, B:448:0x08aa, B:450:0x08b3, B:452:0x08c1, B:453:0x08db, B:455:0x08df, B:457:0x08e7, B:472:0x0914, B:458:0x08ec, B:460:0x08f6, B:464:0x08ff, B:470:0x090f, B:475:0x0926, B:477:0x092c, B:481:0x0934, B:483:0x093c, B:485:0x0940, B:486:0x094b, B:488:0x0951, B:540:0x0a60, B:543:0x0a67, B:545:0x0a6b, B:547:0x0a73, B:548:0x0a76, B:549:0x0a79, B:551:0x0a7f, B:553:0x0a88, B:555:0x0a92, B:557:0x0a98, B:559:0x0a9e, B:566:0x0ac0, B:568:0x0ac6, B:572:0x0ad0, B:582:0x0aea, B:579:0x0ae3, B:581:0x0ae7, B:560:0x0aa5, B:563:0x0ab3, B:564:0x0abb, B:565:0x0abc, B:489:0x095a, B:491:0x0960, B:493:0x0964, B:518:0x0a00, B:520:0x0a0d, B:522:0x0a1b, B:524:0x0a22, B:526:0x0a26, B:530:0x0a2f, B:532:0x0a3e, B:534:0x0a44, B:536:0x0a4e, B:537:0x0a53, B:538:0x0a58, B:539:0x0a5d, B:496:0x096f, B:498:0x0973, B:500:0x0985, B:502:0x0990, B:504:0x099a, B:508:0x09a3, B:510:0x09ad, B:516:0x09b8, B:474:0x091e, B:397:0x07c7, B:399:0x07cb, B:401:0x07d1, B:403:0x07d7, B:405:0x07e1, B:408:0x07e7, B:409:0x07eb, B:411:0x07f4, B:413:0x0809, B:415:0x0812, B:417:0x081a, B:422:0x0824, B:424:0x084e, B:426:0x0854, B:428:0x0859, B:429:0x0861, B:431:0x0867, B:432:0x086a, B:433:0x0873, B:435:0x0877, B:437:0x087d, B:438:0x0882, B:441:0x088c, B:277:0x05d8, B:287:0x05f1, B:294:0x0608, B:298:0x061a, B:303:0x0630, B:308:0x066f, B:310:0x0676, B:312:0x067a, B:316:0x068a, B:318:0x068e, B:322:0x0695, B:324:0x069b, B:326:0x06b8, B:329:0x06c1, B:330:0x06c4, B:332:0x06cb, B:333:0x06d3, B:335:0x06d9, B:314:0x0680, B:338:0x06e8, B:353:0x0718, B:355:0x0721, B:357:0x0725, B:359:0x072a, B:371:0x0751, B:362:0x0733, B:364:0x0739, B:368:0x0747, B:370:0x074e), top: B:708:0x0575 }] */
    /* JADX WARN: Code duplicated, block: B:724:0x05de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x0794 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:748:0x0882 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:761:0x05d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:762:0x0602 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:395:0x07bf
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:127)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:75)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:115)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r45) {
        /*
            Method dump skipped, instruction units count: 3320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzlw.handleMessage(android.os.Message):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(float f) {
        this.zzh.zzh(34);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zzb(int i) {
        this.zzh.zze(33, i, 0).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzjj
    public final void zzc(zzav zzavVar) {
        this.zzh.zzd(16, zzavVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadt
    public final void zzcS(long j, long j2, zzv zzvVar, MediaFormat mediaFormat) {
        if (this.zzD) {
            this.zzh.zzc(37).zza();
        }
    }

    public final void zzd() {
        this.zzh.zzc(29).zza();
    }

    public final void zze(boolean z, int i, int i2) {
        this.zzh.zze(1, z ? 1 : 0, (i2 << 4) | 1).zza();
    }

    public final void zzf(zzbf zzbfVar, int i, long j) {
        this.zzh.zzd(3, new zzlv(zzbfVar, i, j)).zza();
    }

    public final void zzg(zznj zznjVar) {
        this.zzh.zzd(38, zznjVar).zza();
    }

    public final void zzh() {
        this.zzh.zzc(6).zza();
    }

    public final void zzi(zzd zzdVar, boolean z) {
        this.zzh.zzf(31, 0, 0, zzdVar).zza();
    }

    public final void zzj(float f) {
        this.zzh.zzd(32, Float.valueOf(f)).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzmw
    public final void zzk(zzmy zzmyVar) {
        if (!this.zzI && this.zzj.getThread().isAlive()) {
            this.zzh.zzd(14, zzmyVar).zza();
        } else {
            zzeh.zzc("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            zzmyVar.zzi(false);
        }
    }

    public final boolean zzl(Object obj, long j) {
        if (this.zzI || !this.zzj.getThread().isAlive()) {
            return true;
        }
        zzdt zzdtVar = new zzdt(this.zzp);
        this.zzh.zzd(30, new Pair(obj, zzdtVar)).zza();
        if (j != -9223372036854775807L) {
            return zzdtVar.zze(j);
        }
        return true;
    }

    public final boolean zzm() {
        if (this.zzI || !this.zzj.getThread().isAlive()) {
            return true;
        }
        this.zzI = true;
        zzdt zzdtVar = new zzdt(this.zzp);
        this.zzh.zzd(7, zzdtVar).zza();
        return zzdtVar.zze(this.zzt);
    }

    public final Looper zzn() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzo() {
        zzea zzeaVar = this.zzh;
        zzeaVar.zzk(2);
        zzeaVar.zzh(22);
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzp(zzxj zzxjVar) {
        this.zzh.zzd(8, zzxjVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq() {
        this.zzh.zzh(10);
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final /* bridge */ /* synthetic */ void zzs(zzzf zzzfVar) {
        this.zzh.zzd(9, (zzxj) zzzfVar).zza();
    }

    final /* synthetic */ zzme zzt(zzmf zzmfVar, long j) {
        zzabm zzabmVarZze = this.zzg.zze(this.zzu);
        long j2 = this.zzZ.zzb;
        zzabj zzabjVar = this.zzf;
        zzmt zzmtVar = this.zzs;
        return new zzme(this.zzc, j, this.zze, zzabmVarZze, zzmtVar, zzmfVar, zzabjVar, -9223372036854775807L);
    }

    final /* synthetic */ void zzu(int i, boolean z) {
        this.zzw.zzB(i, this.zzb[i].zze(), z);
    }

    final /* synthetic */ void zzv(int i) {
        this.zzw.zzW(i);
    }

    final /* synthetic */ zzea zzx() {
        return this.zzh;
    }

    public final void zzy(List list, int i, long j, zzzg zzzgVar) {
        this.zzh.zzd(17, new zzlq(list, zzzgVar, i, j, null)).zza();
    }
}
