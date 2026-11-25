package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzme {
    public final zzxj zza;
    public final Object zzb;
    public boolean zzd;
    public boolean zze;
    public boolean zzf;
    public zzmf zzg;
    public boolean zzh;
    private final zzne[] zzj;
    private final zzabi zzk;
    private final zzmt zzl;
    private zzme zzm;
    private zzabj zzo;
    private long zzp;
    private zzzo zzn = zzzo.zza;
    public final zzzd[] zzc = new zzzd[2];
    private final boolean[] zzi = new boolean[2];

    public zzme(zzne[] zzneVarArr, long j, zzabi zzabiVar, zzabm zzabmVar, zzmt zzmtVar, zzmf zzmfVar, zzabj zzabjVar, long j2) {
        this.zzj = zzneVarArr;
        this.zzp = j;
        this.zzk = zzabiVar;
        this.zzl = zzmtVar;
        this.zzb = zzmfVar.zza.zza;
        this.zzg = zzmfVar;
        this.zzo = zzabjVar;
        this.zza = zzmtVar.zze(zzmfVar.zza, zzabmVar, zzmfVar.zzb);
    }

    private final void zzt() {
        if (!zzv()) {
            return;
        }
        int i = 0;
        while (true) {
            zzabj zzabjVar = this.zzo;
            if (i >= zzabjVar.zza) {
                return;
            }
            zzabjVar.zza(i);
            zzabb zzabbVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final void zzu() {
        if (!zzv()) {
            return;
        }
        int i = 0;
        while (true) {
            zzabj zzabjVar = this.zzo;
            if (i >= zzabjVar.zza) {
                return;
            }
            zzabjVar.zza(i);
            zzabb zzabbVar = this.zzo.zzc[i];
            i++;
        }
    }

    private final boolean zzv() {
        return this.zzm == null;
    }

    public final long zza() {
        return this.zzp;
    }

    public final void zzb(long j) {
        this.zzp = j;
    }

    public final long zzc() {
        return this.zzg.zzb + this.zzp;
    }

    public final boolean zzd() {
        if (this.zze) {
            return !this.zzf || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean zze() {
        if (this.zze) {
            return zzd() || zzf() - this.zzg.zzb >= -9223372036854775807L;
        }
        return false;
    }

    public final long zzf() {
        if (!this.zze) {
            return this.zzg.zzb;
        }
        long jZzb = this.zzf ? this.zza.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.zzg.zze : jZzb;
    }

    public final long zzg() {
        if (this.zze) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final void zzh(float f, zzbf zzbfVar, boolean z) throws zzjm {
        this.zze = true;
        this.zzn = this.zza.zzn();
        zzabj zzabjVarZzk = zzk(f, zzbfVar, z);
        zzmf zzmfVar = this.zzg;
        long jMax = zzmfVar.zzb;
        long j = zzmfVar.zze;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jZzl = zzl(zzabjVarZzk, jMax, false);
        long j2 = this.zzp;
        zzmf zzmfVar2 = this.zzg;
        this.zzp = j2 + (zzmfVar2.zzb - jZzl);
        this.zzg = zzmfVar2.zza(jZzl, zzmfVar2.zzc);
    }

    public final void zzi(long j) {
        zzgtr.zzi(zzv());
        if (this.zze) {
            this.zza.zzf(j - this.zzp);
        }
    }

    public final void zzj(zzmc zzmcVar) {
        zzgtr.zzi(zzv());
        this.zza.zzd(zzmcVar);
    }

    public final zzabj zzk(float f, zzbf zzbfVar, boolean z) throws zzjm {
        zzzo zzzoVar = this.zzn;
        zzxl zzxlVar = this.zzg.zza;
        zzabi zzabiVar = this.zzk;
        zzne[] zzneVarArr = this.zzj;
        zzabj zzabjVarZzr = zzabiVar.zzr(zzneVarArr, zzzoVar, zzxlVar, zzbfVar);
        for (int i = 0; i < zzabjVarZzr.zza; i++) {
            boolean z2 = true;
            if (zzabjVarZzr.zza(i)) {
                if (zzabjVarZzr.zzc[i] == null) {
                    zzneVarArr[i].zza();
                    z2 = false;
                }
                zzgtr.zzi(z2);
            } else {
                zzgtr.zzi(zzabjVarZzr.zzc[i] == null);
            }
        }
        for (zzabb zzabbVar : zzabjVarZzr.zzc) {
        }
        return zzabjVarZzr;
    }

    public final long zzl(zzabj zzabjVar, long j, boolean z) {
        return zzm(zzabjVar, j, false, new boolean[2]);
    }

    public final long zzm(zzabj zzabjVar, long j, boolean z, boolean[] zArr) {
        zzne[] zzneVarArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= zzabjVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzi;
            if (z || !zzabjVar.zzb(this.zzo, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            zzneVarArr = this.zzj;
            if (i2 >= 2) {
                break;
            }
            zzneVarArr[i2].zza();
            i2++;
        }
        zzu();
        this.zzo = zzabjVar;
        zzt();
        zzxj zzxjVar = this.zza;
        zzabb[] zzabbVarArr = zzabjVar.zzc;
        boolean[] zArr3 = this.zzi;
        zzzd[] zzzdVarArr = this.zzc;
        long jZzo = zzxjVar.zzo(zzabbVarArr, zArr3, zzzdVarArr, zArr, j);
        for (int i3 = 0; i3 < 2; i3++) {
            zzneVarArr[i3].zza();
        }
        this.zzf = false;
        for (int i4 = 0; i4 < 2; i4++) {
            if (zzzdVarArr[i4] != null) {
                zzgtr.zzi(zzabjVar.zza(i4));
                zzneVarArr[i4].zza();
                this.zzf = true;
            } else {
                zzgtr.zzi(zzabbVarArr[i4] == null);
            }
        }
        return jZzo;
    }

    public final void zzn() {
        zzu();
        try {
            this.zzl.zzf(this.zza);
        } catch (RuntimeException e) {
            zzeh.zzf("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(zzme zzmeVar) {
        if (zzmeVar == this.zzm) {
            return;
        }
        zzu();
        this.zzm = zzmeVar;
        zzt();
    }

    public final zzme zzp() {
        return this.zzm;
    }

    public final zzzo zzq() {
        return this.zzn;
    }

    public final zzabj zzr() {
        return this.zzo;
    }

    public final void zzs(zzxi zzxiVar, long j) {
        this.zzd = true;
        this.zza.zzl(zzxiVar, j);
    }
}
