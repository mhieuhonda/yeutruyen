package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzang {
    private zzahm zzb;
    private zzagd zzc;
    private zzanc zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzana zza = new zzana();
    private zzane zzj = new zzane();

    protected void zza(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzane();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    protected abstract long zzb(zzeu zzeuVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected abstract boolean zzc(zzeu zzeuVar, long j, zzane zzaneVar) throws IOException;

    final void zze(zzagd zzagdVar, zzahm zzahmVar) {
        this.zzc = zzagdVar;
        this.zzb = zzahmVar;
        zza(true);
    }

    final void zzf(long j, long j2) {
        this.zza.zza();
        if (j == 0) {
            zza(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            this.zze = zzi(j2);
            zzanc zzancVar = this.zzd;
            String str = zzfm.zza;
            zzancVar.zzb(this.zze);
            this.zzh = 2;
        }
    }

    final int zzg(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        this.zzb.getClass();
        String str = zzfm.zza;
        int i = this.zzh;
        if (i != 0) {
            if (i == 1) {
                zzagbVar.zzf((int) this.zzf);
                this.zzh = 2;
                return 0;
            }
            if (i != 2) {
                return -1;
            }
            long jZza = this.zzd.zza(zzagbVar);
            if (jZza >= 0) {
                zzahaVar.zza = jZza;
                return 1;
            }
            if (jZza < -1) {
                zzj(-(jZza + 2));
            }
            if (!this.zzl) {
                zzahd zzahdVarZzc = this.zzd.zzc();
                zzahdVarZzc.getClass();
                this.zzc.zzw(zzahdVarZzc);
                this.zzb.zzP(zzahdVarZzc.zza());
                this.zzl = true;
            }
            if (this.zzk <= 0 && !this.zza.zzb(zzagbVar)) {
                this.zzh = 3;
                return -1;
            }
            this.zzk = 0L;
            zzeu zzeuVarZzd = this.zza.zzd();
            long jZzb = zzb(zzeuVarZzd);
            if (jZzb >= 0) {
                long j = this.zzg;
                if (j + jZzb >= this.zze) {
                    long jZzh = zzh(j);
                    this.zzb.zzc(zzeuVarZzd, zzeuVarZzd.zze());
                    this.zzb.zze(jZzh, 1, zzeuVarZzd.zze(), 0, null);
                    this.zze = -1L;
                }
            }
            this.zzg += jZzb;
            return 0;
        }
        while (true) {
            zzana zzanaVar = this.zza;
            if (!zzanaVar.zzb(zzagbVar)) {
                this.zzh = 3;
                return -1;
            }
            long jZzn = zzagbVar.zzn();
            long j2 = this.zzf;
            this.zzk = jZzn - j2;
            if (!zzc(zzanaVar.zzd(), j2, this.zzj)) {
                zzv zzvVar = this.zzj.zza;
                this.zzi = zzvVar.zzJ;
                if (!this.zzm) {
                    this.zzb.zzA(zzvVar);
                    this.zzm = true;
                }
                zzanc zzancVar = this.zzj.zzb;
                if (zzancVar != null) {
                    this.zzd = zzancVar;
                } else if (zzagbVar.zzo() == -1) {
                    this.zzd = new zzanf(null);
                } else {
                    zzanb zzanbVarZzc = zzanaVar.zzc();
                    this.zzd = new zzamv(this, this.zzf, zzagbVar.zzo(), zzanbVarZzc.zzd + zzanbVarZzc.zze, zzanbVarZzc.zzb, (zzanbVarZzc.zza & 4) != 0);
                }
                this.zzh = 2;
                zzanaVar.zze();
                return 0;
            }
            this.zzf = zzagbVar.zzn();
        }
    }

    protected final long zzh(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    protected final long zzi(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    protected void zzj(long j) {
        this.zzg = j;
    }
}
