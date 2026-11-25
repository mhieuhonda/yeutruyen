package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaii implements zzaga {
    private final byte[] zza;
    private final zzeu zzb;
    private final zzagh zzc;
    private zzagd zzd;
    private zzahm zze;
    private int zzf;
    private zzap zzg;
    private zzagn zzh;
    private int zzi;
    private int zzj;
    private zzaig zzk;
    private int zzl;
    private long zzm;

    static {
        int i = zzaih.zza;
    }

    public zzaii() {
        throw null;
    }

    public zzaii(int i) {
        this.zza = new byte[42];
        this.zzb = new zzeu(new byte[32768], 0);
        this.zzc = new zzagh();
        this.zzf = 0;
    }

    private final long zzh(zzeu zzeuVar, boolean z) {
        boolean zZza;
        this.zzh.getClass();
        int iZzg = zzeuVar.zzg();
        while (iZzg <= zzeuVar.zze() - 16) {
            zzeuVar.zzh(iZzg);
            zzagn zzagnVar = this.zzh;
            int i = this.zzj;
            zzagh zzaghVar = this.zzc;
            if (zzagi.zza(zzeuVar, zzagnVar, i, zzaghVar)) {
                zzeuVar.zzh(iZzg);
                return zzaghVar.zza;
            }
            iZzg++;
        }
        if (!z) {
            zzeuVar.zzh(iZzg);
            return -1L;
        }
        while (iZzg <= zzeuVar.zze() - this.zzi) {
            zzeuVar.zzh(iZzg);
            try {
                zZza = zzagi.zza(zzeuVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZza = false;
            }
            if (zzeuVar.zzg() <= zzeuVar.zze() && zZza) {
                zzeuVar.zzh(iZzg);
                return this.zzc.zza;
            }
            iZzg++;
        }
        zzeuVar.zzh(zzeuVar.zze());
        return -1L;
    }

    private final void zzi() {
        long j = this.zzm * 1000000;
        zzagn zzagnVar = this.zzh;
        String str = zzfm.zza;
        this.zze.zze(j / ((long) zzagnVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        zzagk.zza(zzagbVar, false);
        zzeu zzeuVar = new zzeu(4);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        return zzeuVar.zzz() == 1716281667;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzd = zzagdVar;
        this.zze = zzagdVar.zzs(0, 1);
        zzagdVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzaig zzaigVar = this.zzk;
            if (zzaigVar != null) {
                zzaigVar.zzb(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        boolean zZzb;
        zzagn zzagnVar;
        zzahd zzahcVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzagbVar.zzl();
            long jZzm = zzagbVar.zzm();
            zzap zzapVarZza = zzagk.zza(zzagbVar, true);
            zzagbVar.zzf((int) (zzagbVar.zzm() - jZzm));
            this.zzg = zzapVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzagbVar.zzi(this.zza, 0, 42);
            zzagbVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzeu zzeuVar = new zzeu(4);
            zzagbVar.zzc(zzeuVar.zzi(), 0, 4);
            if (zzeuVar.zzz() != 1716281667) {
                throw zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzagj zzagjVar = new zzagj(this.zzh);
            do {
                zZzb = zzagk.zzb(zzagbVar, zzagjVar);
                zzagnVar = zzagjVar.zza;
                String str = zzfm.zza;
                this.zzh = zzagnVar;
            } while (!zZzb);
            zzagnVar.getClass();
            this.zzi = Math.max(zzagnVar.zzc, 6);
            zzv zzvVarZzc = this.zzh.zzc(this.zza, this.zzg);
            zzahm zzahmVar = this.zze;
            zzt zztVarZza = zzvVarZzc.zza();
            zztVarZza.zzn("audio/flac");
            zzahmVar.zzA(zztVarZza.zzP());
            this.zze.zzP(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzagbVar.zzl();
            zzeu zzeuVar2 = new zzeu(2);
            zzagbVar.zzi(zzeuVar2.zzi(), 0, 2);
            int iZzt = zzeuVar2.zzt();
            if ((iZzt >> 2) != 16382) {
                zzagbVar.zzl();
                throw zzat.zzb("First frame does not start with sync code.", null);
            }
            zzagbVar.zzl();
            this.zzj = iZzt;
            zzagd zzagdVar = this.zzd;
            String str2 = zzfm.zza;
            long jZzn = zzagbVar.zzn();
            long jZzo = zzagbVar.zzo();
            zzagn zzagnVar2 = this.zzh;
            zzagnVar2.getClass();
            zzagm zzagmVar = zzagnVar2.zzk;
            if (zzagmVar != null && zzagmVar.zza.length > 0) {
                zzahcVar = new zzagl(zzagnVar2, jZzn);
            } else if (jZzo == -1 || zzagnVar2.zzj <= 0) {
                zzahcVar = new zzahc(zzagnVar2.zza(), 0L);
            } else {
                zzaig zzaigVar = new zzaig(zzagnVar2, this.zzj, jZzn, jZzo);
                this.zzk = zzaigVar;
                zzahcVar = zzaigVar.zza();
            }
            zzagdVar.zzw(zzahcVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzagn zzagnVar3 = this.zzh;
        zzagnVar3.getClass();
        zzaig zzaigVar2 = this.zzk;
        if (zzaigVar2 != null && zzaigVar2.zzc()) {
            return zzaigVar2.zzd(zzagbVar, zzahaVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzagi.zzb(zzagbVar, zzagnVar3);
            return 0;
        }
        zzeu zzeuVar3 = this.zzb;
        int iZze = zzeuVar3.zze();
        if (iZze < 32768) {
            int iZza = zzagbVar.zza(zzeuVar3.zzi(), iZze, 32768 - iZze);
            z = iZza == -1;
            if (!z) {
                zzeuVar3.zzf(iZze + iZza);
            } else if (zzeuVar3.zzd() == 0) {
                zzi();
                return -1;
            }
        } else {
            z = false;
        }
        int iZzg = zzeuVar3.zzg();
        int i2 = this.zzl;
        int i3 = this.zzi;
        if (i2 < i3) {
            zzeuVar3.zzk(Math.min(i3 - i2, zzeuVar3.zzd()));
        }
        long jZzh = zzh(zzeuVar3, z);
        int iZzg2 = zzeuVar3.zzg() - iZzg;
        zzeuVar3.zzh(iZzg);
        this.zze.zzc(zzeuVar3, iZzg2);
        this.zzl += iZzg2;
        if (jZzh != -1) {
            zzi();
            this.zzl = 0;
            this.zzm = jZzh;
        }
        int length = zzeuVar3.zzi().length - zzeuVar3.zze();
        if (zzeuVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int iZzd = zzeuVar3.zzd();
        System.arraycopy(zzeuVar3.zzi(), zzeuVar3.zzg(), zzeuVar3.zzi(), 0, iZzd);
        zzeuVar3.zzh(0);
        zzeuVar3.zzf(iZzd);
        return 0;
    }
}
