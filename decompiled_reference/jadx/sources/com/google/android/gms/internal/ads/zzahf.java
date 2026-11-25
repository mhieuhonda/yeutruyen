package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahf implements zzaga {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzagd zzf;
    private zzahm zzg;

    public zzahf(int i, int i2, String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        int i = this.zza;
        zzgtr.zzi((i == -1 || this.zzb == -1) ? false : true);
        int i2 = this.zzb;
        zzeu zzeuVar = new zzeu(i2);
        zzagbVar.zzi(zzeuVar.zzi(), 0, i2);
        return zzeuVar.zzt() == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzf = zzagdVar;
        zzahm zzahmVarZzs = zzagdVar.zzs(1024, 4);
        this.zzg = zzahmVarZzs;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzn(str);
        zztVar.zzo(str);
        zzahmVarZzs.zzA(zztVar.zzP());
        this.zzf.zzv();
        this.zzf.zzw(new zzahg(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        int i = this.zze;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzahm zzahmVar = this.zzg;
        zzahmVar.getClass();
        int iZza = zzahmVar.zza(zzagbVar, 1024, true);
        if (iZza == -1) {
            this.zze = 2;
            this.zzg.zze(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZza;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }
}
