package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzarg {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfj zza = new zzfj(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzeu zzb = new zzeu();

    zzarg(int i) {
    }

    private final int zze(zzagb zzagbVar) {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzagbVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzagb zzagbVar, zzaha zzahaVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzagbVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzagbVar);
                return 0;
            }
            if (this.zzd) {
                long j2 = this.zzf;
                if (j2 == -9223372036854775807L) {
                    zze(zzagbVar);
                    return 0;
                }
                zzfj zzfjVar = this.zza;
                this.zzh = zzfjVar.zzf(this.zzg) - zzfjVar.zze(j2);
                zze(zzagbVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzagbVar.zzo());
            if (zzagbVar.zzn() != 0) {
                zzahaVar.zza = 0L;
                return 1;
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zza(iMin);
            zzagbVar.zzl();
            zzagbVar.zzi(zzeuVar.zzi(), 0, iMin);
            int iZze = zzeuVar.zze();
            for (int iZzg = zzeuVar.zzg(); iZzg < iZze; iZzg++) {
                if (zzeuVar.zzi()[iZzg] == 71) {
                    long jZzb = zzarq.zzb(zzeuVar, iZzg, i);
                    if (jZzb != -9223372036854775807L) {
                        j = jZzb;
                        break;
                    }
                }
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        }
        long jZzo = zzagbVar.zzo();
        int iMin2 = (int) Math.min(112800L, jZzo);
        long j3 = jZzo - ((long) iMin2);
        if (zzagbVar.zzn() != j3) {
            zzahaVar.zza = j3;
            return 1;
        }
        zzeu zzeuVar2 = this.zzb;
        zzeuVar2.zza(iMin2);
        zzagbVar.zzl();
        zzagbVar.zzi(zzeuVar2.zzi(), 0, iMin2);
        int iZzg2 = zzeuVar2.zzg();
        int iZze2 = zzeuVar2.zze();
        for (int i2 = iZze2 - 188; i2 >= iZzg2; i2--) {
            byte[] bArrZzi = zzeuVar2.zzi();
            int i3 = 0;
            for (int i4 = -4; i4 <= 4; i4++) {
                int i5 = (i4 * 188) + i2;
                if (i5 >= iZzg2 && i5 < iZze2 && bArrZzi[i5] == 71) {
                    i3++;
                    if (i3 == 5) {
                        long jZzb2 = zzarq.zzb(zzeuVar2, i2, i);
                        if (jZzb2 == -9223372036854775807L) {
                            break;
                        }
                        j = jZzb2;
                        break;
                    }
                } else {
                    i3 = 0;
                }
            }
        }
        this.zzg = j;
        this.zze = true;
        return 0;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfj zzd() {
        return this.zza;
    }
}
