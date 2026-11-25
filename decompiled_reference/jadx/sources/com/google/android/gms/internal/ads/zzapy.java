package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzapy implements zzaqa {
    private final zzeu zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzahm zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzapy(String str, int i, int i2, String str2) {
        this.zza = new zzeu(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzf(zzeu zzeuVar, byte[] bArr, int i) {
        int iMin = Math.min(zzeuVar.zzd(), i - this.zzi);
        zzeuVar.zzm(bArr, this.zzi, iMin);
        int i2 = this.zzi + iMin;
        this.zzi = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    private final void zzg(zzafy zzafyVar) {
        int i;
        int i2 = zzafyVar.zzb;
        if (i2 == -2147483647 || (i = zzafyVar.zzc) == -1) {
            return;
        }
        zzv zzvVar = this.zzl;
        if (zzvVar != null && i == zzvVar.zzH && i2 == zzvVar.zzJ && Objects.equals(zzafyVar.zza, zzvVar.zzp)) {
            return;
        }
        zzv zzvVar2 = this.zzl;
        zzt zztVar = zzvVar2 == null ? new zzt() : zzvVar2.zza();
        zztVar.zza(this.zzf);
        zztVar.zzn(this.zze);
        zztVar.zzo(zzafyVar.zza);
        zztVar.zzG(i);
        zztVar.zzI(i2);
        zztVar.zze(this.zzc);
        zztVar.zzg(this.zzd);
        zzv zzvVarZzP = zztVar.zzP();
        this.zzl = zzvVarZzP;
        this.zzg.zzA(zzvVarZzP);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzb(zzagd zzagdVar, zzaro zzaroVar) {
        zzaroVar.zza();
        this.zzf = zzaroVar.zzc();
        this.zzg = zzagdVar.zzs(zzaroVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzc(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zzd(zzeu zzeuVar) throws zzat {
        int i;
        byte b;
        int i2;
        byte b2;
        this.zzg.getClass();
        while (zzeuVar.zzd() > 0) {
            int i3 = this.zzh;
            if (i3 == 0) {
                while (zzeuVar.zzd() > 0) {
                    int i4 = this.zzj << 8;
                    this.zzj = i4;
                    int iZzs = i4 | zzeuVar.zzs();
                    this.zzj = iZzs;
                    int iZza = zzafz.zza(iZzs);
                    this.zzn = iZza;
                    if (iZza != 0) {
                        byte[] bArrZzi = this.zza.zzi();
                        int i5 = this.zzj;
                        bArrZzi[0] = (byte) ((i5 >> 24) & 255);
                        bArrZzi[1] = (byte) ((i5 >> 16) & 255);
                        bArrZzi[2] = (byte) ((i5 >> 8) & 255);
                        bArrZzi[3] = (byte) (i5 & 255);
                        this.zzi = 4;
                        this.zzj = 0;
                        int i6 = this.zzn;
                        if (i6 != 3 && i6 != 4) {
                            if (i6 != 1) {
                                this.zzh = 2;
                                break;
                            } else {
                                this.zzh = 1;
                                break;
                            }
                        }
                        this.zzh = 4;
                        break;
                    }
                }
            } else if (i3 == 1) {
                zzeu zzeuVar2 = this.zza;
                if (zzf(zzeuVar, zzeuVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzeuVar2.zzi();
                    if (this.zzl == null) {
                        zzv zzvVarZzb = zzafz.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzvVarZzb;
                        this.zzg.zzA(zzvVarZzb);
                    }
                    this.zzm = zzafz.zzc(bArrZzi2);
                    byte b3 = bArrZzi2[0];
                    if (b3 != -2) {
                        if (b3 == -1) {
                            i = (bArrZzi2[4] & 7) << 4;
                            b2 = bArrZzi2[7];
                        } else if (b3 != 31) {
                            i = (bArrZzi2[4] & 1) << 6;
                            b = bArrZzi2[5];
                        } else {
                            i = (bArrZzi2[5] & 7) << 4;
                            b2 = bArrZzi2[6];
                        }
                        i2 = b2 & 60;
                        this.zzk = zzhaq.zza(zzfm.zzu(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzJ));
                        zzeuVar2.zzh(0);
                        this.zzg.zzc(zzeuVar2, 18);
                        this.zzh = 6;
                    } else {
                        i = (bArrZzi2[5] & 1) << 6;
                        b = bArrZzi2[4];
                    }
                    i2 = b & 252;
                    this.zzk = zzhaq.zza(zzfm.zzu(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzJ));
                    zzeuVar2.zzh(0);
                    this.zzg.zzc(zzeuVar2, 18);
                    this.zzh = 6;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    zzeu zzeuVar3 = this.zza;
                    if (zzf(zzeuVar, zzeuVar3.zzi(), this.zzo)) {
                        zzafy zzafyVarZzd = zzafz.zzd(zzeuVar3.zzi());
                        zzg(zzafyVarZzd);
                        this.zzm = zzafyVarZzd.zzd;
                        long j = zzafyVarZzd.zze;
                        this.zzk = j != -9223372036854775807L ? j : 0L;
                        zzeuVar3.zzh(0);
                        this.zzg.zzc(zzeuVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i3 == 4) {
                    zzeu zzeuVar4 = this.zza;
                    if (zzf(zzeuVar, zzeuVar4.zzi(), 6)) {
                        int iZzg = zzafz.zzg(zzeuVar4.zzi());
                        this.zzp = iZzg;
                        int i7 = this.zzi;
                        if (i7 > iZzg) {
                            int i8 = i7 - iZzg;
                            this.zzi = i7 - i8;
                            zzeuVar.zzh(zzeuVar.zzg() - i8);
                        }
                        this.zzh = 5;
                    }
                } else if (i3 != 5) {
                    int iMin = Math.min(zzeuVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzc(zzeuVar, iMin);
                    int i9 = this.zzi + iMin;
                    this.zzi = i9;
                    if (i9 == this.zzm) {
                        zzgtr.zzi(this.zzq != -9223372036854775807L);
                        this.zzg.zze(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzeu zzeuVar5 = this.zza;
                    if (zzf(zzeuVar, zzeuVar5.zzi(), this.zzp)) {
                        zzafy zzafyVarZzf = zzafz.zzf(zzeuVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzafyVarZzf);
                        }
                        this.zzm = zzafyVarZzf.zzd;
                        long j2 = zzafyVarZzf.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzeuVar5.zzh(0);
                        this.zzg.zzc(zzeuVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzeu zzeuVar6 = this.zza;
                if (zzf(zzeuVar, zzeuVar6.zzi(), 7)) {
                    this.zzo = zzafz.zze(zzeuVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqa
    public final void zze(boolean z) {
    }
}
