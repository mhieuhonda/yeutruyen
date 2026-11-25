package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzare implements zzafl {
    private final zzfj zza;
    private final zzeu zzb = new zzeu();
    private final int zzc;

    public zzare(int i, zzfj zzfjVar, int i2) {
        this.zzc = i;
        this.zza = zzfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final zzafk zza(zzagb zzagbVar, long j) throws IOException {
        int iZza;
        int iZza2;
        long jZzn = zzagbVar.zzn();
        int iMin = (int) Math.min(112800L, zzagbVar.zzo() - jZzn);
        zzeu zzeuVar = this.zzb;
        zzeuVar.zza(iMin);
        zzagbVar.zzi(zzeuVar.zzi(), 0, iMin);
        int iZze = zzeuVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzeuVar.zzd() >= 188 && (iZza2 = (iZza = zzarq.zza(zzeuVar.zzi(), zzeuVar.zzg(), iZze)) + 188) <= iZze) {
            long jZzb = zzarq.zzb(zzeuVar, iZza, this.zzc);
            if (jZzb != -9223372036854775807L) {
                long jZze = this.zza.zze(jZzb);
                if (jZze > j) {
                    return j3 == -9223372036854775807L ? zzafk.zza(jZze, jZzn) : zzafk.zzc(jZzn + j4);
                }
                j4 = iZza;
                if (100000 + jZze > j) {
                    return zzafk.zzc(jZzn + j4);
                }
                j3 = jZze;
            }
            zzeuVar.zzh(iZza2);
            j2 = iZza2;
        }
        return j3 != -9223372036854775807L ? zzafk.zzb(j3, jZzn + j2) : zzafk.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final void zzb() {
        byte[] bArr = zzfm.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
