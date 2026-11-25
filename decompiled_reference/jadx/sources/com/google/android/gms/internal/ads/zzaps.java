package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaps implements zzaga {
    private final zzapt zza = new zzapt(null, 0, "audio/ac4");
    private final zzeu zzb = new zzeu(16384);
    private boolean zzc;

    static {
        int i = zzapr.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        int i;
        zzeu zzeuVar = new zzeu(10);
        int i2 = 0;
        while (true) {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 10);
            zzeuVar.zzh(0);
            if (zzeuVar.zzx() != 4801587) {
                break;
            }
            zzeuVar.zzk(3);
            int iZzG = zzeuVar.zzG();
            i2 += iZzG + 10;
            zzagbVar.zzk(iZzG);
        }
        zzagbVar.zzl();
        zzagbVar.zzk(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzagbVar.zzi(zzeuVar.zzi(), 0, 7);
            zzeuVar.zzh(0);
            int iZzt = zzeuVar.zzt();
            if (iZzt == 44096 || iZzt == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArrZzi = zzeuVar.zzi();
                int i6 = zzafd.zza;
                if (bArrZzi.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((bArrZzi[2] & 255) << 8) | (bArrZzi[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((bArrZzi[4] & 255) << 16) | ((bArrZzi[5] & 255) << 8) | (bArrZzi[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iZzt == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzagbVar.zzk(i - 7);
            } else {
                zzagbVar.zzl();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzagbVar.zzk(i4);
                i3 = 0;
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
        int iZza = zzagbVar.zza(zzeuVar.zzi(), 0, 16384);
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
