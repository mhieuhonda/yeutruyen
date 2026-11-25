package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalb implements zzaky {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzalb(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzd = i2;
        this.zze = j3;
        this.zzg = jArr;
        this.zzf = j3 != -1 ? j + j3 : -1L;
    }

    public static zzalb zze(zzala zzalaVar, long j, long j2) {
        long jZzb = zzalaVar.zzb();
        if (jZzb == -9223372036854775807L) {
            return null;
        }
        long jMin = zzalaVar.zzc;
        if (jMin != -1 && j2 != -1 && j + jMin != j2) {
            long j3 = j2 - j;
            StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 53 + String.valueOf(jMin).length() + 23);
            sb.append("Data size mismatch between stream (");
            sb.append(j3);
            sb.append(") and Xing frame (");
            sb.append(jMin);
            sb.append("), using smaller value.");
            zzeh.zzb("XingSeeker", sb.toString());
            jMin = Math.min(jMin, j3);
        }
        zzagx zzagxVar = zzalaVar.zza;
        long[] jArr = zzalaVar.zzg;
        return new zzalb(j, zzagxVar.zzc, jZzb, zzagxVar.zzf, jMin, jArr);
    }

    private final long zzi(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return this.zzg != null;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j) {
        if (!zzb()) {
            zzahe zzaheVar = new zzahe(0L, this.zza + ((long) this.zzb));
            return new zzahb(zzaheVar, zzaheVar);
        }
        long j2 = this.zzc;
        String str = zzfm.zza;
        long jMax = Math.max(0L, Math.min(j, j2));
        double d = (jMax * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzg;
                jArr.getClass();
                long[] jArr2 = jArr;
                double d3 = jArr2[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr2[i + 1]) - d3));
            }
        }
        long j3 = this.zze;
        zzahe zzaheVar2 = new zzahe(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * j3), j3 - 1)));
        return new zzahb(zzaheVar2, zzaheVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzf(long j) {
        if (!zzb()) {
            return 0L;
        }
        long j2 = j - this.zza;
        if (j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        jArr.getClass();
        long[] jArr2 = jArr;
        double d = (j2 * 256.0d) / this.zze;
        int iZzo = zzfm.zzo(jArr2, (long) d, true, true);
        long jZzi = zzi(iZzo);
        long j3 = jArr2[iZzo];
        int i = iZzo + 1;
        long jZzi2 = zzi(i);
        long j4 = iZzo == 99 ? 256L : jArr2[i];
        return jZzi + Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (jZzi2 - jZzi));
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.zzd;
    }
}
