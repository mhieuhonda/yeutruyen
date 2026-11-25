package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapp implements zzaga {
    private final zzapq zza = new zzapq(null, 0, "audio/ac3");
    private final zzeu zzb = new zzeu(2786);
    private boolean zzc;

    static {
        int i = zzapo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = new zzeu(10);
        int i = 0;
        while (true) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int iZzG = zzeuVar.zzG();
            i += iZzG + 10;
            zzagbVar.zzk(iZzG);
        }
        zzagbVar.zzl();
        zzagbVar.zzk(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 6);
            zzeuVar.zzh(0);
            if (zzeuVar.zzt() != 2935) {
                zzagbVar.zzl();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzagbVar.zzk(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iZzd = zzafa.zzd(zzeuVar.zzi());
                if (iZzd == -1) {
                    return false;
                }
                zzagbVar.zzk(iZzd - 6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zza.zzb(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.zzv();
        zzagdVar.zzw(new zzahc(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        zzeu zzeuVar = this.zzb;
        int iZza = zzagbVar.zza(zzeuVar.zzi(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(iZza);
        if (!this.zzc) {
            this.zza.zzc(0L, 4);
            this.zzc = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzc = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }
}
