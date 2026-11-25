package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaqw {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    zzaqw() {
    }

    public static long zze(zzeu zzeuVar) {
        int iZzg = zzeuVar.zzg();
        if (zzeuVar.zzd() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzeuVar.zzm(bArr, 0, 9);
        zzeuVar.zzh(iZzg);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    private final int zzf(zzagb zzagbVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagbVar.zzl();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final zzfj zzb() {
        return this.zza;
    }

    public final int zzc(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long jZzo = zzagbVar.zzo();
            int iMin = (int) Math.min(20000L, jZzo);
            long j2 = jZzo - ((long) iMin);
            if (zzagbVar.zzn() != j2) {
                zzahaVar.zza = j2;
                return 1;
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zza(iMin);
            zzagbVar.zzl();
            zzagbVar.zzi(zzeuVar.zzi(), 0, iMin);
            int iZzg = zzeuVar.zzg();
            for (int iZze = zzeuVar.zze() - 4; iZze >= iZzg; iZze--) {
                if (zzg(zzeuVar.zzi(), iZze) == 442) {
                    zzeuVar.zzh(iZze + 4);
                    long jZze = zze(zzeuVar);
                    if (jZze != -9223372036854775807L) {
                        j = jZze;
                        break;
                    }
                }
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzagbVar);
            return 0;
        }
        if (this.zzd) {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzagbVar);
                return 0;
            }
            zzfj zzfjVar = this.zza;
            this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j3);
            zzf(zzagbVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzagbVar.zzo());
        if (zzagbVar.zzn() != 0) {
            zzahaVar.zza = 0L;
            return 1;
        }
        zzeu zzeuVar2 = this.zzb;
        zzeuVar2.zza(iMin2);
        zzagbVar.zzl();
        zzagbVar.zzi(zzeuVar2.zzi(), 0, iMin2);
        int iZze2 = zzeuVar2.zze();
        for (int iZzg2 = zzeuVar2.zzg(); iZzg2 < iZze2 - 3; iZzg2++) {
            if (zzg(zzeuVar2.zzi(), iZzg2) == 442) {
                zzeuVar2.zzh(iZzg2 + 4);
                long jZze2 = zze(zzeuVar2);
                if (jZze2 != -9223372036854775807L) {
                    j = jZze2;
                    break;
                }
            }
        }
        this.zzf = j;
        this.zzd = true;
        return 0;
    }

    public final long zzd() {
        return this.zzh;
    }
}
