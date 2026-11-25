package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaiq implements zzaga {
    private zzagd zzb;
    private zzajb zzc;
    private zzagb zzd;
    private zzahi zze;
    private zzami zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzeu zza = new zzeu(16);
    private long zzk = -1;
    private int zzg = 0;

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return zzais.zza(zzagbVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzb = zzagdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        if (j != 0) {
            if (this.zzg == 3) {
                zzami zzamiVar = this.zzf;
                zzamiVar.getClass();
                zzamiVar.zze(j, j2);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    private final void zzh() {
        zzagd zzagdVar = this.zzb;
        zzagdVar.getClass();
        zzagdVar.zzv();
        this.zzb.zzw(new zzahc(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    zzeu zzeuVar = this.zza;
                    if (!zzagbVar.zzb(zzeuVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzeuVar.zzh(0);
                    this.zzi = zzeuVar.zzz();
                    this.zzh = zzeuVar.zzB();
                }
                long jZzJ = this.zzi;
                if (jZzJ == 1) {
                    zzeu zzeuVar2 = this.zza;
                    zzagbVar.zzc(zzeuVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    jZzJ = zzeuVar2.zzJ();
                    this.zzi = jZzJ;
                }
                if (this.zzh == 1836086884) {
                    long jZzn = zzagbVar.zzn();
                    this.zzk = jZzn;
                    long j = this.zzj;
                    zzajb zzajbVar = new zzajb(0L, jZzn - j, -9223372036854775807L, jZzn, jZzJ - j);
                    this.zzc = zzajbVar;
                    zzagd zzagdVar = this.zzb;
                    zzagdVar.getClass();
                    zzahm zzahmVarZzs = zzagdVar.zzs(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/heic");
                    zztVar.zzl(new zzap(-9223372036854775807L, zzajbVar));
                    zzahmVarZzs.zzA(zztVar.zzP());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i == 1) {
                zzagbVar.zzf((int) (this.zzi - ((long) this.zzj)));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzagbVar != this.zzd) {
                        this.zzd = zzagbVar;
                        this.zze = new zzahi(zzagbVar, this.zzk);
                    }
                    zzami zzamiVar = this.zzf;
                    zzamiVar.getClass();
                    int iZzd = zzamiVar.zzd(this.zze, zzahaVar);
                    if (iZzd == 1) {
                        zzahaVar.zza += this.zzk;
                    }
                    return iZzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzami(zzanq.zza, 8);
                }
                zzahi zzahiVar = new zzahi(zzagbVar, this.zzk);
                this.zze = zzahiVar;
                if (this.zzf.zza(zzahiVar)) {
                    zzami zzamiVar2 = this.zzf;
                    long j2 = this.zzk;
                    zzagd zzagdVar2 = this.zzb;
                    zzagdVar2.getClass();
                    zzamiVar2.zzc(new zzahk(j2, zzagdVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }
}
