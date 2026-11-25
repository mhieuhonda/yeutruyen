package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zziz implements zznc, zzne {
    private final int zzb;
    private zznf zzd;
    private int zze;
    private zzqh zzf;
    private zzdp zzg;
    private int zzh;
    private zzzd zzi;
    private zzv[] zzj;
    private long zzk;
    private long zzl;
    private boolean zzn;
    private boolean zzo;
    private zzxl zzq;
    private zznd zzs;
    private final Object zza = new Object();
    private final zzly zzc = new zzly();
    private long zzm = Long.MIN_VALUE;
    private zzbf zzp = zzbf.zza;
    private long zzr = -9223372036854775807L;

    public zziz(int i) {
        this.zzb = i;
    }

    private final void zzaf(long j, boolean z, boolean z2) throws zzjm {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        if (!z2) {
            z2 = zzS(j) != 0;
        }
        zzA(j, z, z2);
    }

    private final void zzag() {
        zzxl zzxlVar;
        int iZze;
        if (this.zzp.zzg() || (zzxlVar = this.zzq) == null || (iZze = this.zzp.zze(zzxlVar.zza)) == -1) {
            this.zzr = -9223372036854775807L;
            return;
        }
        zzbd zzbdVarZzd = this.zzp.zzd(iZze, new zzbd(), false);
        this.zzr = zzbdVarZzd.zzd;
        boolean z = zzbdVarZzd.zzh;
    }

    protected void zzA(long j, boolean z, boolean z2) throws zzjm {
        throw null;
    }

    protected void zzB() throws zzjm {
    }

    protected void zzC() {
    }

    protected void zzD() {
        throw null;
    }

    protected void zzE() {
    }

    protected void zzF() {
    }

    protected void zzG(zzbf zzbfVar) {
    }

    protected final long zzH() {
        return this.zzl;
    }

    protected final zzly zzI() {
        zzly zzlyVar = this.zzc;
        zzlyVar.zza = null;
        zzlyVar.zzb = null;
        return zzlyVar;
    }

    protected final zzbf zzN() {
        return this.zzp;
    }

    protected final zzxl zzO() {
        return this.zzq;
    }

    protected final long zzP() {
        return this.zzr;
    }

    protected final zzjm zzQ(Throwable th, zzv zzvVar, boolean z, int i) {
        int iZzae = 4;
        if (zzvVar != null && !this.zzo) {
            this.zzo = true;
            try {
                iZzae = zzae(zzvVar) & 7;
            } catch (zzjm unused) {
            } finally {
                this.zzo = false;
            }
        }
        return zzjm.zzb(th, zzV(), this.zze, zzvVar, iZzae, this.zzq, z, i);
    }

    protected final int zzR(zzly zzlyVar, zzix zzixVar, int i) {
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        int iZzc = zzzdVar.zzc(zzlyVar, zzixVar, i);
        if (iZzc == -4) {
            int i2 = i & 1;
            if (zzixVar.zzb()) {
                if (i2 == 0) {
                    this.zzm = Long.MIN_VALUE;
                }
                return this.zzn ? -4 : -3;
            }
            long j = zzixVar.zzd + this.zzk;
            zzixVar.zzd = j;
            if (i2 == 0) {
                this.zzm = Math.max(this.zzm, j);
                return -4;
            }
        } else if (iZzc == -5) {
            zzv zzvVar = zzlyVar.zzb;
            zzvVar.getClass();
            long j2 = zzvVar.zzu;
            if (j2 != Long.MAX_VALUE) {
                zzt zztVarZza = zzvVar.zza();
                zztVarZza.zzt(j2 + this.zzk);
                zzlyVar.zzb = zztVarZza.zzP();
                return -5;
            }
        }
        return iZzc;
    }

    protected final void zzU() {
        zznd zzndVar;
        synchronized (this.zza) {
            zzndVar = this.zzs;
        }
        if (zzndVar != null) {
            zzndVar.zza(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznc, com.google.android.gms.internal.ads.zzne
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final zzne zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzc(int i, zzqh zzqhVar, zzdp zzdpVar) {
        this.zze = i;
        this.zzf = zzqhVar;
        this.zzg = zzdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzcT() throws zzjm {
        zzgtr.zzi(this.zzh == 1);
        this.zzh = 2;
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzcU(zzv[] zzvVarArr, zzzd zzzdVar, long j, long j2, zzxl zzxlVar) throws zzjm {
        zzgtr.zzi(!this.zzn);
        this.zzi = zzzdVar;
        this.zzq = zzxlVar;
        zzag();
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzvVarArr;
        this.zzk = j2;
        zzz(zzvVarArr, j, j2, zzxlVar);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final zzzd zzcV() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final boolean zzcW() {
        return this.zzm == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public zzmd zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final int zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzf(zznf zznfVar, zzv[] zzvVarArr, zzzd zzzdVar, long j, boolean z, boolean z2, long j2, long j3, zzxl zzxlVar) throws zzjm {
        zzgtr.zzi(this.zzh == 0);
        this.zzd = zznfVar;
        this.zzq = zzxlVar;
        this.zzh = 1;
        zzy(z, z2);
        zzcU(zzvVarArr, zzzdVar, j2, j3, zzxlVar);
        zzaf(j2, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzl() {
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final boolean zzm() {
        return this.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzo(zzbf zzbfVar) {
        if (Objects.equals(this.zzp, zzbfVar)) {
            return;
        }
        this.zzp = zzbfVar;
        zzag();
        zzG(this.zzp);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzp(long j, boolean z) throws zzjm {
        zzaf(j, false, z);
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzq() {
        zzgtr.zzi(this.zzh == 2);
        this.zzh = 1;
        zzC();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzr() {
        zzgtr.zzi(this.zzh == 1);
        zzly zzlyVar = this.zzc;
        zzlyVar.zza = null;
        zzlyVar.zzb = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzD();
        this.zzq = null;
        this.zzr = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzs() {
        zzgtr.zzi(this.zzh == 0);
        zzly zzlyVar = this.zzc;
        zzlyVar.zza = null;
        zzlyVar.zzb = null;
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzt() {
        zzgtr.zzi(this.zzh == 0);
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public int zzu() throws zzjm {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzv(zznd zzndVar) {
        synchronized (this.zza) {
            this.zzs = zzndVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzne
    public final void zzw() {
        synchronized (this.zza) {
            this.zzs = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmx
    public void zzx(int i, Object obj) throws zzjm {
    }

    protected void zzy(boolean z, boolean z2) throws zzjm {
    }

    protected void zzz(zzv[] zzvVarArr, long j, long j2, zzxl zzxlVar) throws zzjm {
    }

    protected final zzv[] zzJ() {
        zzv[] zzvVarArr = this.zzj;
        zzvVarArr.getClass();
        return zzvVarArr;
    }

    protected final zznf zzK() {
        zznf zznfVar = this.zzd;
        zznfVar.getClass();
        return zznfVar;
    }

    protected final zzqh zzL() {
        zzqh zzqhVar = this.zzf;
        zzqhVar.getClass();
        return zzqhVar;
    }

    protected final zzdp zzM() {
        zzdp zzdpVar = this.zzg;
        zzdpVar.getClass();
        return zzdpVar;
    }

    protected final int zzS(long j) {
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        return zzzdVar.zzd(j - this.zzk);
    }

    protected final boolean zzT() {
        if (zzcW()) {
            return this.zzn;
        }
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        return zzzdVar.zza();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzn() throws IOException {
        zzzd zzzdVar = this.zzi;
        zzzdVar.getClass();
        zzzdVar.zzb();
    }
}
