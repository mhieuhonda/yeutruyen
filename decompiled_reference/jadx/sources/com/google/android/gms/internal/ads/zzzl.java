package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzzl implements zzxj, zzxi {
    private final zzxj zza;
    private final long zzb;
    private zzxi zzc;

    public zzzl(zzxj zzxjVar, long j) {
        this.zza = zzxjVar;
        this.zzb = j;
    }

    public final zzxj zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzb() {
        long jZzb = this.zza.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final long zzc() {
        long jZzc = this.zza.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzmc zzmcVar) {
        long j = zzmcVar.zza;
        long j2 = this.zzb;
        zzmb zzmbVarZza = zzmcVar.zza();
        zzmbVarZza.zza(j - j2);
        return this.zza.zzd(zzmbVarZza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final boolean zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxj, com.google.android.gms.internal.ads.zzzf
    public final void zzf(long j) {
        this.zza.zzf(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzl(zzxi zzxiVar, long j) {
        this.zzc = zzxiVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzm() throws IOException {
        this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final zzzo zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzo(zzabb[] zzabbVarArr, boolean[] zArr, zzzd[] zzzdVarArr, boolean[] zArr2, long j) {
        zzzd[] zzzdVarArr2 = new zzzd[zzzdVarArr.length];
        int i = 0;
        while (true) {
            zzzd zzzdVarZze = null;
            if (i >= zzzdVarArr.length) {
                break;
            }
            zzzk zzzkVar = (zzzk) zzzdVarArr[i];
            if (zzzkVar != null) {
                zzzdVarZze = zzzkVar.zze();
            }
            zzzdVarArr2[i] = zzzdVarZze;
            i++;
        }
        zzxj zzxjVar = this.zza;
        long j2 = this.zzb;
        long jZzo = zzxjVar.zzo(zzabbVarArr, zArr, zzzdVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzzdVarArr.length; i2++) {
            zzzd zzzdVar = zzzdVarArr2[i2];
            if (zzzdVar == null) {
                zzzdVarArr[i2] = null;
            } else {
                zzzd zzzdVar2 = zzzdVarArr[i2];
                if (zzzdVar2 == null || ((zzzk) zzzdVar2).zze() != zzzdVar) {
                    zzzdVarArr[i2] = new zzzk(zzzdVar, j2);
                }
            }
        }
        return jZzo + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final void zzq(long j, boolean z) {
        this.zza.zzq(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzr() {
        long jZzr = this.zza.zzr();
        if (jZzr == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzr + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final /* bridge */ /* synthetic */ void zzs(zzzf zzzfVar) {
        zzxi zzxiVar = this.zzc;
        zzxiVar.getClass();
        zzxiVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzt(long j) {
        long j2 = this.zzb;
        return this.zza.zzt(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxj
    public final long zzu(long j, zznk zznkVar) {
        long j2 = this.zzb;
        return this.zza.zzu(j - j2, zznkVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzp(zzxj zzxjVar) {
        zzxi zzxiVar = this.zzc;
        zzxiVar.getClass();
        zzxiVar.zzp(this);
    }
}
