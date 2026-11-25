package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzafm {
    protected final zzafg zza;
    protected final zzafl zzb;
    protected zzafi zzc;
    private final int zzd;

    protected zzafm(zzafj zzafjVar, zzafl zzaflVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzaflVar;
        this.zzd = i;
        this.zza = new zzafg(zzafjVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(zzagb zzagbVar, long j, zzaha zzahaVar) {
        if (j == zzagbVar.zzn()) {
            return 0;
        }
        zzahaVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzagb zzagbVar, long j) throws IOException {
        long jZzn = j - zzagbVar.zzn();
        if (jZzn < 0 || jZzn > 262144) {
            return false;
        }
        zzagbVar.zzf((int) jZzn);
        return true;
    }

    public final zzahd zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzafi zzafiVar = this.zzc;
        if (zzafiVar == null || zzafiVar.zze() != j) {
            zzafg zzafgVar = this.zza;
            this.zzc = new zzafi(j, zzafgVar.zzd(j), 0L, zzafgVar.zze(), zzafgVar.zzf(), zzafgVar.zzg(), zzafgVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        while (true) {
            zzafi zzafiVar = this.zzc;
            zzafiVar.getClass();
            long jZzb = zzafiVar.zzb();
            long jZzc = zzafiVar.zzc();
            long jZzh = zzafiVar.zzh();
            if (jZzc - jZzb <= this.zzd) {
                zze(false, jZzb);
                return zzf(zzagbVar, jZzb, zzahaVar);
            }
            if (!zzg(zzagbVar, jZzh)) {
                return zzf(zzagbVar, jZzh, zzahaVar);
            }
            zzagbVar.zzl();
            zzafk zzafkVarZza = this.zzb.zza(zzagbVar, zzafiVar.zzd());
            int iZzd = zzafkVarZza.zzd();
            if (iZzd == -3) {
                zze(false, jZzh);
                return zzf(zzagbVar, jZzh, zzahaVar);
            }
            if (iZzd == -2) {
                zzafiVar.zzf(zzafkVarZza.zze(), zzafkVarZza.zzf());
            } else {
                if (iZzd != -1) {
                    zzg(zzagbVar, zzafkVarZza.zzf());
                    zze(true, zzafkVarZza.zzf());
                    return zzf(zzagbVar, zzafkVarZza.zzf(), zzahaVar);
                }
                zzafiVar.zzg(zzafkVarZza.zze(), zzafkVarZza.zzf());
            }
        }
    }

    protected final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
