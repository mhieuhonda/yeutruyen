package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapt implements zzaqa {
    private final zzet zza;
    private final zzeu zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzahm zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private zzv zzm;
    private int zzn;
    private long zzo;

    public zzapt(String str, int i, String str2) {
        zzet zzetVar = new zzet(new byte[16], 16);
        this.zza = zzetVar;
        this.zzb = new zzeu(zzetVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzk = false;
        this.zzo = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzf = zzaroVar.zzc();
        this.zzg = zzagdVar.zzs(zzaroVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j, int i) {
        this.zzo = j;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) {
        boolean z;
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (true) {
                    if (zzeuVar.zzd() > 0) {
                        if (this.zzj) {
                            int iZzs = zzeuVar.zzs();
                            this.zzj = iZzs == 172;
                            byte b = SignedBytes.MAX_POWER_OF_TWO;
                            if (iZzs == 64) {
                                if (iZzs != 65) {
                                    z = false;
                                }
                                this.zzk = z;
                                this.zzh = 1;
                                zzeu zzeuVar2 = this.zzb;
                                zzeuVar2.zzi()[0] = -84;
                                byte[] bArrZzi = zzeuVar2.zzi();
                                if (true == this.zzk) {
                                    b = 65;
                                }
                                bArrZzi[1] = b;
                                this.zzi = 2;
                            } else if (iZzs == 65) {
                            }
                            z = true;
                            this.zzk = z;
                            this.zzh = 1;
                            zzeu zzeuVar3 = this.zzb;
                            zzeuVar3.zzi()[0] = -84;
                            byte[] bArrZzi2 = zzeuVar3.zzi();
                            if (true == this.zzk) {
                                b = 65;
                            }
                            bArrZzi2[1] = b;
                            this.zzi = 2;
                        } else {
                            this.zzj = zzeuVar.zzs() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzeuVar.zzd(), this.zzn - this.zzi);
                this.zzg.zzc(zzeuVar, iMin);
                int i2 = this.zzi + iMin;
                this.zzi = i2;
                if (i2 == this.zzn) {
                    zzgtr.zzi(this.zzo != -9223372036854775807L);
                    this.zzg.zze(this.zzo, 1, this.zzn, 0, null);
                    this.zzo += this.zzl;
                    this.zzh = 0;
                }
            } else {
                zzeu zzeuVar4 = this.zzb;
                byte[] bArrZzi3 = zzeuVar4.zzi();
                int iMin2 = Math.min(zzeuVar.zzd(), 16 - this.zzi);
                zzeuVar.zzm(bArrZzi3, this.zzi, iMin2);
                int i3 = this.zzi + iMin2;
                this.zzi = i3;
                if (i3 == 16) {
                    zzet zzetVar = this.zza;
                    zzetVar.zzf(0);
                    zzafc zzafcVarZzb = zzafd.zzb(zzetVar);
                    zzv zzvVar = this.zzm;
                    if (zzvVar == null || zzvVar.zzH != 2 || zzafcVarZzb.zza != zzvVar.zzJ || !"audio/ac4".equals(zzvVar.zzp)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzn(this.zze);
                        zztVar.zzo("audio/ac4");
                        zztVar.zzG(2);
                        zztVar.zzI(zzafcVarZzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        zzv zzvVarZzP = zztVar.zzP();
                        this.zzm = zzvVarZzP;
                        this.zzg.zzA(zzvVarZzP);
                    }
                    this.zzn = zzafcVarZzb.zzb;
                    this.zzl = (((long) zzafcVarZzb.zzc) * 1000000) / ((long) this.zzm.zzJ);
                    zzeuVar4.zzh(0);
                    this.zzg.zzc(zzeuVar4, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z) {
    }
}
