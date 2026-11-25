package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaif implements zzafl {
    private final zzagn zza;
    private final int zzb;
    private final zzagh zzc = new zzagh();

    /* synthetic */ zzaif(zzagn zzagnVar, int i, byte[] bArr) {
        this.zza = zzagnVar;
        this.zzb = i;
    }

    private final long zzc(zzagb zzagbVar) throws IOException {
        while (zzagbVar.zzm() < zzagbVar.zzo() - 6) {
            zzagn zzagnVar = this.zza;
            int i = this.zzb;
            zzagh zzaghVar = this.zzc;
            long jZzm = zzagbVar.zzm();
            zzeu zzeuVar = new zzeu(17);
            zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
            if (zzeuVar.zzo() != i) {
                zzagbVar.zzl();
                zzagbVar.zzk((int) (jZzm - zzagbVar.zzn()));
            } else {
                zzeuVar.zzf(zzage.zzb(zzagbVar, zzeuVar.zzi(), 2, 15) + 2);
                zzagbVar.zzl();
                zzagbVar.zzk((int) (jZzm - zzagbVar.zzn()));
                if (zzagi.zza(zzeuVar, zzagnVar, i, zzaghVar)) {
                    break;
                }
            }
            zzagbVar.zzk(1);
        }
        if (zzagbVar.zzm() < zzagbVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzagbVar.zzk((int) (zzagbVar.zzo() - zzagbVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafl
    public final zzafk zza(zzagb zzagbVar, long j) throws IOException {
        long jZzn = zzagbVar.zzn();
        long jZzc = zzc(zzagbVar);
        long jZzm = zzagbVar.zzm();
        zzagbVar.zzk(Math.max(6, this.zza.zzc));
        long jZzc2 = zzc(zzagbVar);
        long jZzm2 = zzagbVar.zzm();
        if (jZzc > j || jZzc2 <= j) {
            return jZzc2 <= j ? zzafk.zzb(jZzc2, jZzm2) : zzafk.zza(jZzc, jZzn);
        }
        return zzafk.zzc(jZzm);
    }
}
