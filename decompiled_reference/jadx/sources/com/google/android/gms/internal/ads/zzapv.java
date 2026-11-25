package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapv implements zzaga {
    private final zzapw zza;
    private final zzeu zzb;
    private final zzeu zzc;
    private final zzet zzd;
    private zzagd zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        int i = zzapu.zza;
    }

    public zzapv() {
        throw null;
    }

    public zzapv(int i) {
        this.zza = new zzapw(true, null, 0, "audio/mp4a-latm");
        this.zzb = new zzeu(2048);
        this.zzg = -1L;
        zzeu zzeuVar = new zzeu(10);
        this.zzc = zzeuVar;
        byte[] bArrZzi = zzeuVar.zzi();
        this.zzd = new zzet(bArrZzi, bArrZzi.length);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar;
        int i = 0;
        while (true) {
            zzeuVar = this.zzc;
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
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
            zzeuVar.zzh(0);
            if (zzapw.zzf(zzeuVar.zzt())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
                zzet zzetVar = this.zzd;
                zzetVar.zzf(14);
                int iZzj = zzetVar.zzj(13);
                if (iZzj <= 6) {
                    i4++;
                    zzagbVar.zzl();
                    zzagbVar.zzk(i4);
                } else {
                    zzagbVar.zzk(iZzj - 6);
                    i3 += iZzj;
                }
            } else {
                i4++;
                zzagbVar.zzl();
                zzagbVar.zzk(i4);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zze = zzagdVar;
        this.zza.zzb(zzagdVar, new zzaro(Integer.MIN_VALUE, 0, 1));
        zzagdVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        this.zze.getClass();
        zzeu zzeuVar = this.zzb;
        int iZza = zzagbVar.zza(zzeuVar.zzi(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzw(new zzahc(-9223372036854775807L, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzeuVar.zzh(0);
        zzeuVar.zzf(iZza);
        if (!this.zzh) {
            this.zza.zzc(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zzd(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzh = false;
        this.zza.zza();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }
}
