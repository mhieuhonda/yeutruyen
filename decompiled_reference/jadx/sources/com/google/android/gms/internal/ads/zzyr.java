package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyr implements zzxj, zzagd, zzabx, zzacc, zzzb {
    private static final Map zzb;
    private static final zzv zzc;
    private boolean zzA;
    private zzyq zzB;
    private zzahd zzC;
    private long zzD;
    private boolean zzE;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private long zzL;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private boolean zzQ;
    private final Uri zzd;
    private final zzhr zze;
    private final zzuq zzf;
    private final zzxv zzg;
    private final zzul zzh;
    private final zzyj zzi;
    private final zzabm zzj;
    private final long zzk;
    private final long zzl;
    private final zzye zzn;
    private zzxi zzs;
    private zzajh zzt;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;
    private final zzacf zzm = new zzacf("ProgressiveMediaPeriod");
    private final zzdt zzo = new zzdt(zzdp.zza);
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyn
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzD();
        }
    };
    private final Runnable zzq = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyk
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzr = zzfm.zzd(null);
    private zzyp[] zzw = new zzyp[0];
    private zzzc[] zzv = new zzzc[0];
    private zzyh[] zzu = new zzyh[0];
    private long zzM = -9223372036854775807L;
    private int zzF = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(map);
        zzt zztVar = new zzt();
        zztVar.zza("icy");
        zztVar.zzo("application/x-icy");
        zzc = zztVar.zzP();
    }

    public zzyr(Uri uri, zzhr zzhrVar, zzye zzyeVar, zzuq zzuqVar, zzul zzulVar, zzabw zzabwVar, zzxv zzxvVar, zzyj zzyjVar, zzabm zzabmVar, String str, int i, boolean z, int i2, zzv zzvVar, long j, zzacl zzaclVar) {
        this.zzd = uri;
        this.zze = zzhrVar;
        this.zzf = zzuqVar;
        this.zzh = zzulVar;
        this.zzg = zzxvVar;
        this.zzi = zzyjVar;
        this.zzj = zzabmVar;
        this.zzk = i;
        this.zzn = zzyeVar;
        this.zzl = j;
    }

    private final void zzR(int i) {
        zzaa();
        zzyq zzyqVar = this.zzB;
        boolean[] zArr = zzyqVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzv zzvVarZza = zzyqVar.zza.zza(i).zza(0);
        this.zzg.zzh(new zzxh(1, zzas.zzf(zzvVarZza.zzp), zzvVarZza, 0, null, zzfm.zzs(this.zzL), -9223372036854775807L));
        zArr[i] = true;
    }

    private final void zzS(int i) {
        zzaa();
        if (this.zzN) {
            if ((!this.zzz || this.zzB.zzb[i]) && !this.zzv[i].zzr(false)) {
                this.zzM = 0L;
                this.zzN = false;
                this.zzH = true;
                this.zzL = 0L;
                this.zzO = 0;
                for (zzzc zzzcVar : this.zzv) {
                    zzzcVar.zzg(false);
                }
                zzxi zzxiVar = this.zzs;
                zzxiVar.getClass();
                zzxiVar.zzs(this);
            }
        }
    }

    private final boolean zzT() {
        return this.zzH || zzZ();
    }

    private final zzahm zzU(zzyp zzypVar) {
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            if (zzypVar.equals(this.zzw[i])) {
                return this.zzv[i];
            }
        }
        if (this.zzx) {
            int i2 = zzypVar.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 55);
            sb.append("Extractor added new track (id=");
            sb.append(i2);
            sb.append(") after finishing tracks.");
            zzeh.zzc("ProgressiveMediaPeriod", sb.toString());
            return new zzafx();
        }
        zzzc zzzcVar = new zzzc(this.zzj, this.zzf, this.zzh);
        zzyh zzyhVar = new zzyh(zzzcVar);
        zzzcVar.zzz(this);
        int i3 = length + 1;
        zzyp[] zzypVarArr = (zzyp[]) Arrays.copyOf(this.zzw, i3);
        zzypVarArr[length] = zzypVar;
        String str = zzfm.zza;
        this.zzw = zzypVarArr;
        zzzc[] zzzcVarArr = (zzzc[]) Arrays.copyOf(this.zzv, i3);
        zzzcVarArr[length] = zzzcVar;
        this.zzv = zzzcVarArr;
        zzyh[] zzyhVarArr = (zzyh[]) Arrays.copyOf(this.zzu, i3);
        zzyhVarArr[length] = zzyhVar;
        this.zzu = zzyhVarArr;
        return zzyhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final void zzD() {
        int i;
        if (this.zzQ || this.zzy || !this.zzx || this.zzC == null) {
            return;
        }
        for (zzzc zzzcVar : this.zzv) {
            if (zzzcVar.zzo() == null) {
                return;
            }
        }
        this.zzo.zzb();
        int length = this.zzv.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            zzv zzvVarZzo = this.zzv[i4].zzo();
            zzvVarZzo.getClass();
            int iZzf = zzas.zzf(zzvVarZzo.zzp);
            int iZzab = zzab(iZzf);
            int iZzab2 = zzab(i2);
            if (iZzab > iZzab2) {
                i2 = iZzf;
            }
            if (iZzab > iZzab2) {
                i3 = i4;
            }
        }
        zzbg[] zzbgVarArr = new zzbg[length];
        boolean[] zArr = new boolean[length];
        for (int i5 = 0; i5 < length; i5++) {
            zzv zzvVarZzo2 = this.zzv[i5].zzo();
            zzvVarZzo2.getClass();
            String str = zzvVarZzo2.zzp;
            boolean zZza = zzas.zza(str);
            boolean z = zZza || zzas.zzb(str);
            zArr[i5] = z;
            this.zzz = z | this.zzz;
            this.zzA = this.zzl != -9223372036854775807L && length == 1 && zzas.zzc(str);
            zzajh zzajhVar = this.zzt;
            if (zzajhVar != null) {
                if (zZza || this.zzw[i5].zzb) {
                    zzap zzapVar = zzvVarZzo2.zzl;
                    zzap zzapVar2 = zzapVar == null ? new zzap(-9223372036854775807L, zzajhVar) : zzapVar.zzg(zzajhVar);
                    zzt zztVarZza = zzvVarZzo2.zza();
                    zztVarZza.zzl(zzapVar2);
                    zzvVarZzo2 = zztVarZza.zzP();
                }
                if (zZza && zzvVarZzo2.zzh == -1 && zzvVarZzo2.zzi == -1 && (i = zzajhVar.zza) != -1) {
                    zzt zztVarZza2 = zzvVarZzo2.zza();
                    zztVarZza2.zzi(i);
                    zzvVarZzo2 = zztVarZza2.zzP();
                }
            }
            zzv zzvVarZzb = zzvVarZzo2.zzb(this.zzf.zzb(zzvVarZzo2));
            if (i5 != i3) {
                zzt zztVarZza3 = zzvVarZzb.zza();
                zztVarZza3.zzm(Integer.toString(i3));
                zzvVarZzb = zztVarZza3.zzP();
            }
            zzbgVarArr[i5] = new zzbg(Integer.toString(i5), zzvVarZzb);
            this.zzI = zzvVarZzb.zzv | this.zzI;
            this.zzv[i5].zzi(Long.MIN_VALUE);
        }
        this.zzB = new zzyq(new zzzo(zzbgVarArr), zArr);
        if (this.zzA && this.zzD == -9223372036854775807L) {
            this.zzD = this.zzl;
            this.zzC = new zzyf(this, this.zzC);
        }
        this.zzi.zzb(this.zzD, this.zzC, this.zzE);
        this.zzy = true;
        zzxi zzxiVar = this.zzs;
        zzxiVar.getClass();
        zzxiVar.zzp(this);
    }

    private final void zzW() {
        zzyi zzyiVar = new zzyi(this, this.zzd, this.zze, this.zzn, this, this.zzo);
        if (this.zzy) {
            zzgtr.zzi(zzZ());
            long j = this.zzD;
            if (j != -9223372036854775807L && this.zzM > j) {
                this.zzP = true;
                this.zzM = -9223372036854775807L;
                return;
            }
            zzahd zzahdVar = this.zzC;
            zzahdVar.getClass();
            zzyiVar.zzd(zzahdVar.zzc(this.zzM).zza.zzc, this.zzM);
            for (zzzc zzzcVar : this.zzv) {
                zzzcVar.zzh(this.zzM);
            }
            this.zzM = -9223372036854775807L;
        }
        this.zzO = zzX();
        this.zzm.zzd(zzyiVar, this, zzabw.zza(this.zzF));
    }

    private final int zzX() {
        int iZzj = 0;
        for (zzzc zzzcVar : this.zzv) {
            iZzj += zzzcVar.zzj();
        }
        return iZzj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    private final long zzY(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzzc[] zzzcVarArr = this.zzv;
            if (i >= zzzcVarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = Math.max(jMax, zzzcVarArr[i].zzp());
            } else {
                zzyq zzyqVar = this.zzB;
                zzyqVar.getClass();
                if (zzyqVar.zzc[i]) {
                    jMax = Math.max(jMax, zzzcVarArr[i].zzp());
                }
            }
            i++;
        }
    }

    private final boolean zzZ() {
        return this.zzM != -9223372036854775807L;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzaa() {
        zzgtr.zzi(this.zzy);
        this.zzB.getClass();
        this.zzC.getClass();
    }

    private static int zzab(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i != 4 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ void zzA(zzacb zzacbVar, long j, long j2, boolean z) {
        zzyi zzyiVar = (zzyi) zzacbVar;
        zzio zzioVarZzf = zzyiVar.zzf();
        zzxc zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j, j2, zzioVarZzf.zzf());
        zzyiVar.zze();
        this.zzg.zzf(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)));
        if (z) {
            return;
        }
        for (zzzc zzzcVar : this.zzv) {
            zzzcVar.zzg(false);
        }
        if (this.zzJ > 0) {
            zzxi zzxiVar = this.zzs;
            zzxiVar.getClass();
            zzxiVar.zzs(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ void zzB(zzacb zzacbVar, long j, long j2) {
        zzyi zzyiVar = (zzyi) zzacbVar;
        if (this.zzD == -9223372036854775807L && this.zzC != null) {
            long jZzY = zzY(true);
            long j3 = jZzY == Long.MIN_VALUE ? 0L : jZzY + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzD = j3;
            this.zzi.zzb(j3, this.zzC, this.zzE);
        }
        zzio zzioVarZzf = zzyiVar.zzf();
        zzxc zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j, j2, zzioVarZzf.zzf());
        zzyiVar.zze();
        this.zzg.zze(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)));
        this.zzP = true;
        zzxi zzxiVar = this.zzs;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ void zzC(zzacb zzacbVar, long j, long j2, int i) {
        zzxc zzxcVar;
        zzyi zzyiVar = (zzyi) zzacbVar;
        zzio zzioVarZzf = zzyiVar.zzf();
        if (i == 0) {
            long jZze = zzyiVar.zze();
            zzhv zzhvVarZzh = zzyiVar.zzh();
            zzxcVar = new zzxc(jZze, zzhvVarZzh, zzhvVarZzh.zza, Collections.emptyMap(), j, 0L, 0L);
        } else {
            zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j, j2, zzioVarZzf.zzf());
        }
        this.zzg.zzd(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)), i);
    }

    final /* synthetic */ void zzG() {
        this.zzK = true;
    }

    final /* synthetic */ void zzH() {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzym
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG();
            }
        });
    }

    final /* synthetic */ long zzI(boolean z) {
        return zzY(true);
    }

    final /* synthetic */ long zzL() {
        return this.zzk;
    }

    final /* synthetic */ Runnable zzM() {
        return this.zzq;
    }

    final /* synthetic */ Handler zzN() {
        return this.zzr;
    }

    final /* synthetic */ zzajh zzO() {
        return this.zzt;
    }

    final /* synthetic */ void zzP(zzajh zzajhVar) {
        this.zzt = zzajhVar;
    }

    final /* synthetic */ long zzQ() {
        return this.zzD;
    }

    public final void zza() {
        if (this.zzy) {
            for (zzzc zzzcVar : this.zzv) {
                zzzcVar.zzk();
            }
        }
        this.zzm.zzg(this);
        this.zzr.removeCallbacksAndMessages(null);
        this.zzs = null;
        this.zzQ = true;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        long jZzY;
        zzaa();
        if (this.zzP || this.zzJ == 0) {
            return Long.MIN_VALUE;
        }
        if (zzZ()) {
            return this.zzM;
        }
        if (this.zzz) {
            int length = this.zzv.length;
            jZzY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzyq zzyqVar = this.zzB;
                if (zzyqVar.zzb[i] && zzyqVar.zzc[i] && !this.zzv[i].zzq()) {
                    jZzY = Math.min(jZzY, this.zzv[i].zzp());
                }
            }
        } else {
            jZzY = Long.MAX_VALUE;
        }
        if (jZzY == Long.MAX_VALUE) {
            jZzY = zzY(false);
        }
        return jZzY == Long.MIN_VALUE ? this.zzL : jZzY;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        if (this.zzP) {
            return false;
        }
        zzacf zzacfVar = this.zzm;
        if (zzacfVar.zzb() || this.zzN) {
            return false;
        }
        if (this.zzy && this.zzJ == 0) {
            return false;
        }
        boolean zZza = this.zzo.zza();
        if (zzacfVar.zze()) {
            return zZza;
        }
        zzW();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        return !this.zzP && this.zzm.zze() && this.zzo.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzacc
    public final void zzg() {
        for (zzzc zzzcVar : this.zzv) {
            zzzcVar.zzf();
        }
        this.zzn.zzb();
    }

    final boolean zzh(int i) {
        return !zzT() && this.zzv[i].zzr(this.zzP);
    }

    final void zzi(int i) throws IOException {
        this.zzv[i].zzl();
        zzj();
    }

    final void zzj() throws IOException {
        this.zzm.zzh(zzabw.zza(this.zzF));
    }

    final int zzk(int i, zzly zzlyVar, zzix zzixVar, int i2) {
        if (zzT()) {
            return -3;
        }
        zzR(i);
        int iZzs = this.zzv[i].zzs(zzlyVar, zzixVar, i2, this.zzP);
        if (iZzs == -3) {
            zzS(i);
        }
        return iZzs;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzl(zzxi zzxiVar, long j) {
        this.zzs = zzxiVar;
        this.zzo.zza();
        zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzm() throws IOException {
        zzj();
        if (this.zzP && !this.zzy) {
            throw zzat.zzb("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzzo zzn() {
        zzaa();
        return this.zzB.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzo(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j) {
        zzabb zzabbVar;
        zzaa();
        zzyq zzyqVar = this.zzB;
        zzzo zzzoVar = zzyqVar.zza;
        boolean[] zArr3 = zzyqVar.zzc;
        int i = this.zzJ;
        int i2 = 0;
        for (int i3 = 0; i3 < zzabbVarArr.length; i3++) {
            zzzd zzzdVar = zzzdVarArr[i3];
            if (zzzdVar != null && (zzabbVarArr[i3] == null || !zArr[i3])) {
                int iZze = ((zzyo) zzzdVar).zze();
                zzgtr.zzi(zArr3[iZze]);
                this.zzJ--;
                zArr3[iZze] = false;
                zzzdVarArr[i3] = null;
            }
        }
        boolean z = !this.zzG ? j == 0 || this.zzA : i != 0;
        for (int i4 = 0; i4 < zzabbVarArr.length; i4++) {
            if (zzzdVarArr[i4] == null && (zzabbVar = zzabbVarArr[i4]) != null) {
                zzgtr.zzi(zzabbVar.zze() == 1);
                zzgtr.zzi(zzabbVar.zzf(0) == 0);
                int iZzb = zzzoVar.zzb(zzabbVar.zza());
                zzgtr.zzi(!zArr3[iZzb]);
                this.zzJ++;
                zArr3[iZzb] = true;
                this.zzI = zzabbVar.zzc().zzv | this.zzI;
                zzzdVarArr[i4] = new zzyo(this, iZzb);
                zArr2[i4] = true;
                if (!z) {
                    zzzc zzzcVar = this.zzv[iZzb];
                    z = (zzzcVar.zzn() == 0 || zzzcVar.zzu(j, true)) ? false : true;
                }
            }
        }
        if (this.zzJ == 0) {
            this.zzN = false;
            this.zzH = false;
            this.zzI = false;
            zzacf zzacfVar = this.zzm;
            if (zzacfVar.zze()) {
                zzzc[] zzzcVarArr = this.zzv;
                int length = zzzcVarArr.length;
                while (i2 < length) {
                    zzzcVarArr[i2].zzy();
                    i2++;
                }
                zzacfVar.zzf();
            } else {
                this.zzP = false;
                for (zzzc zzzcVar2 : this.zzv) {
                    zzzcVar2.zzg(false);
                }
            }
        } else if (z) {
            j = zzt(j);
            while (i2 < zzzdVarArr.length) {
                if (zzzdVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzG = true;
        return j;
    }

    final int zzp(int i, long j) {
        if (zzT()) {
            return 0;
        }
        zzR(i);
        zzzc zzzcVar = this.zzv[i];
        int iZzv = zzzcVar.zzv(j, this.zzP);
        zzzcVar.zzw(iZzv);
        if (iZzv != 0) {
            return iZzv;
        }
        zzS(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzq(long j, boolean z) {
        if (this.zzA) {
            return;
        }
        zzaa();
        if (zzZ()) {
            return;
        }
        boolean[] zArr = this.zzB.zzc;
        int length = this.zzv.length;
        for (int i = 0; i < length; i++) {
            this.zzv[i].zzx(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzr() {
        if (this.zzI) {
            this.zzI = false;
        } else {
            if (!this.zzH) {
                return -9223372036854775807L;
            }
            if (!this.zzP && zzX() <= this.zzO) {
                return -9223372036854775807L;
            }
            this.zzH = false;
        }
        return this.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final zzahm zzs(int i, int i2) {
        return zzU(new zzyp(i, false));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088 A[LOOP:1: B:38:0x0086->B:39:0x0088, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[LOOP:2: B:43:0x009b->B:44:0x009d, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x0083, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x0094, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzt(long j) {
        zzacf zzacfVar;
        int i;
        zzaa();
        boolean[] zArr = this.zzB.zzb;
        if (true != this.zzC.zzb()) {
            j = 0;
        }
        this.zzH = false;
        long j2 = this.zzL;
        this.zzL = j;
        if (zzZ()) {
            this.zzM = j;
            return j;
        }
        if (this.zzF == 7 || !(this.zzP || this.zzm.zze())) {
            this.zzN = false;
            this.zzM = j;
            this.zzP = false;
            this.zzI = false;
            zzacfVar = this.zzm;
            if (zzacfVar.zze()) {
                zzacfVar.zzc();
                for (zzzc zzzcVar : this.zzv) {
                    zzzcVar.zzg(false);
                }
                break;
            }
            for (zzzc zzzcVar2 : this.zzv) {
                zzzcVar2.zzy();
            }
            zzacfVar.zzf();
            return j;
        }
        int length = this.zzv.length;
        for (int i2 = 0; i2 < length; i2++) {
            zzzc zzzcVar3 = this.zzv[i2];
            if (this.zzu[i2].zzf() && (zzzcVar3.zzn() != 0 || j2 != j)) {
                if (!(this.zzA ? zzzcVar3.zzt(zzzcVar3.zzm()) : zzzcVar3.zzu(j, this.zzP)) && (zArr[i2] || !this.zzz)) {
                    this.zzN = false;
                    this.zzM = j;
                    this.zzP = false;
                    this.zzI = false;
                    zzacfVar = this.zzm;
                    if (zzacfVar.zze()) {
                        zzacfVar.zzc();
                        while (i < r2) {
                            zzzcVar.zzg(false);
                        }
                        break;
                        break;
                    }
                    while (i < r3) {
                        zzzcVar2.zzy();
                    }
                    zzacfVar.zzf();
                    return j;
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzu(long j, zznk zznkVar) {
        long j2;
        boolean z;
        long j3;
        boolean z2;
        zzaa();
        if (!this.zzC.zzb()) {
            return 0L;
        }
        zzahb zzahbVarZzc = this.zzC.zzc(j);
        zzahe zzaheVar = zzahbVarZzc.zza;
        zzahe zzaheVar2 = zzahbVarZzc.zzb;
        long j4 = zznkVar.zzd;
        if (j4 == 0) {
            long j5 = zznkVar.zze;
            return j;
        }
        String str = zzfm.zza;
        long j6 = j - j4;
        long j7 = j4 ^ j;
        boolean z3 = (j ^ j6) >= 0;
        boolean z4 = j7 >= 0;
        long j8 = Long.MAX_VALUE;
        long j9 = z4 | z3 ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
        long j10 = Long.MIN_VALUE;
        if (j9 != Long.MIN_VALUE) {
            if (j9 == Long.MAX_VALUE) {
                if (j6 != Long.MAX_VALUE) {
                    j9 = Long.MIN_VALUE;
                } else {
                    j9 = Long.MAX_VALUE;
                }
            }
        } else if (j6 == Long.MIN_VALUE) {
            j6 = Long.MIN_VALUE;
            if (j9 == Long.MAX_VALUE) {
                if (j6 != Long.MAX_VALUE) {
                    j9 = Long.MIN_VALUE;
                } else {
                    j9 = Long.MAX_VALUE;
                }
            }
        } else {
            j9 = Long.MIN_VALUE;
        }
        long j11 = zznkVar.zze;
        if (j == Long.MIN_VALUE) {
            if (j == Long.MIN_VALUE) {
            }
            j2 = zzaheVar.zzb;
            if (j9 <= j2 || j2 > j8) {
                z = false;
            } else {
                z = true;
            }
            j3 = zzaheVar2.zzb;
            if (j9 <= j3 || j3 > j8) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z && z2) {
                if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                    return j2;
                }
                return j3;
            }
            if (!z) {
                if (z2) {
                    return j3;
                }
                return j9;
            }
            return j2;
        }
        j10 = j;
        if (j == Long.MAX_VALUE) {
            int i = (j10 > Long.MAX_VALUE ? 1 : (j10 == Long.MAX_VALUE ? 0 : -1));
        } else {
            j8 = j;
        }
        j2 = zzaheVar.zzb;
        if (j9 <= j2) {
            z = false;
        } else {
            z = false;
        }
        j3 = zzaheVar2.zzb;
        if (j9 <= j3) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (!z) {
        }
        if (!z) {
            if (z2) {
                return j3;
            }
            return j9;
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzv() {
        this.zzx = true;
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzw(final zzahd zzahdVar) {
        this.zzr.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzyl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzF(zzahdVar);
            }
        });
    }

    final zzahm zzx() {
        return zzU(new zzyp(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzzb
    public final void zzy(zzv zzvVar) {
        this.zzr.post(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final /* bridge */ /* synthetic */ zzabz zzz(zzacb zzacbVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzabz zzabzVarZza;
        zzahd zzahdVar;
        zzyi zzyiVar = (zzyi) zzacbVar;
        zzio zzioVarZzf = zzyiVar.zzf();
        zzxc zzxcVar = new zzxc(zzyiVar.zze(), zzyiVar.zzh(), zzioVarZzf.zzg(), zzioVarZzf.zzh(), j, j2, zzioVarZzf.zzf());
        zzyiVar.zzg();
        String str = zzfm.zza;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof zzat) || (cause instanceof FileNotFoundException) || (cause instanceof zzif) || (cause instanceof zzace) || ((cause instanceof zzhs) && ((zzhs) cause).zza == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            zzabzVarZza = zzacf.zzb;
        } else {
            int iZzX = zzX();
            boolean z = iZzX > this.zzO;
            if (this.zzK || !((zzahdVar = this.zzC) == null || zzahdVar.zza() == -9223372036854775807L)) {
                this.zzO = iZzX;
            } else {
                boolean z2 = this.zzy;
                if (!z2 || zzT()) {
                    this.zzH = z2;
                    this.zzL = 0L;
                    this.zzO = 0;
                    for (zzzc zzzcVar : this.zzv) {
                        zzzcVar.zzg(false);
                    }
                    zzyiVar.zzd(0L, 0L);
                } else {
                    this.zzN = true;
                    zzabzVarZza = zzacf.zza;
                }
            }
            zzabzVarZza = zzacf.zza(z, jMin);
        }
        boolean zZza = zzabzVarZza.zza();
        this.zzg.zzg(zzxcVar, new zzxh(1, -1, null, 0, null, zzfm.zzs(zzyiVar.zzg()), zzfm.zzs(this.zzD)), iOException, !zZza);
        if (!zZza) {
            zzyiVar.zze();
        }
        return zzabzVarZza;
    }

    final /* synthetic */ void zzE() {
        if (this.zzQ) {
            return;
        }
        zzxi zzxiVar = this.zzs;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    final /* synthetic */ void zzF(zzahd zzahdVar) {
        this.zzC = this.zzt == null ? zzahdVar : new zzahc(-9223372036854775807L, 0L);
        this.zzD = zzahdVar.zza();
        boolean z = false;
        if (!this.zzK && zzahdVar.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzE = z;
        this.zzF = true == z ? 7 : 1;
        if (this.zzy) {
            this.zzi.zzb(this.zzD, zzahdVar, z);
        } else {
            zzD();
        }
    }
}
