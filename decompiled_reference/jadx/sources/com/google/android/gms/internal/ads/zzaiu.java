package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaiu implements zzaga {
    private zzagd zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzajb zzg;
    private zzagb zzh;
    private zzahi zzi;
    private zzami zzj;
    private final zzeu zza = new zzeu(2);
    private long zzf = -1;

    private final int zzh(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt();
    }

    private final int zzi(zzagb zzagbVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(2);
        zzagbVar.zzi(zzeuVar.zzi(), 0, 2);
        return zzeuVar.zzt() - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        int iZzi;
        if (zzh(zzagbVar) == 65496) {
            while (true) {
                int iZzh = zzh(zzagbVar);
                this.zzd = iZzh;
                if (iZzh == 65498 || (iZzi = zzi(zzagbVar)) < 0) {
                    break;
                }
                if (this.zzd != 65505) {
                    zzagbVar.zzk(iZzi);
                } else {
                    zzeu zzeuVar = this.zza;
                    zzeuVar.zza(iZzi);
                    zzagbVar.zzi(zzeuVar.zzi(), 0, iZzi);
                    if (!Objects.equals(zzeuVar.zzM((char) 0), "http://ns.adobe.com/xap/1.0/") ? false : zzaix.zzb(zzeuVar.zzM((char) 0))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzb = zzagdVar;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws IOException {
        String strZzM;
        zzaiw zzaiwVarZza;
        zzajb zzajbVar;
        long j;
        int i = this.zzc;
        long j2 = -1;
        if (i == 0) {
            zzeu zzeuVar = this.zza;
            zzeuVar.zza(2);
            zzagbVar.zzc(zzeuVar.zzi(), 0, 2);
            int iZzt = zzeuVar.zzt();
            this.zzd = iZzt;
            if (iZzt == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                } else {
                    zzj();
                }
            } else if ((iZzt < 65488 || iZzt > 65497) && iZzt != 65281) {
                this.zzc = 1;
            }
            return 0;
        }
        if (i == 1) {
            this.zze = zzi(zzagbVar);
            zzagbVar.zzf(2);
            this.zzc = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzagbVar != this.zzh) {
                    this.zzh = zzagbVar;
                    this.zzi = new zzahi(zzagbVar, this.zzf);
                }
                zzami zzamiVar = this.zzj;
                zzamiVar.getClass();
                int iZzd = zzamiVar.zzd(this.zzi, zzahaVar);
                if (iZzd == 1) {
                    zzahaVar.zza += this.zzf;
                }
                return iZzd;
            }
            long jZzn = zzagbVar.zzn();
            long j3 = this.zzf;
            if (jZzn != j3) {
                zzahaVar.zza = j3;
                return 1;
            }
            if (zzagbVar.zzh(this.zza.zzi(), 0, 1, true)) {
                zzagbVar.zzl();
                if (this.zzj == null) {
                    this.zzj = new zzami(zzanq.zza, 8);
                }
                zzahi zzahiVar = new zzahi(zzagbVar, this.zzf);
                this.zzi = zzahiVar;
                if (this.zzj.zza(zzahiVar)) {
                    zzami zzamiVar2 = this.zzj;
                    long j4 = this.zzf;
                    zzagd zzagdVar = this.zzb;
                    zzagdVar.getClass();
                    zzamiVar2.zzc(new zzahk(j4, zzagdVar));
                    zzajb zzajbVar2 = this.zzg;
                    zzajbVar2.getClass();
                    zzagd zzagdVar2 = this.zzb;
                    zzagdVar2.getClass();
                    zzahm zzahmVarZzs = zzagdVar2.zzs(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzn("image/jpeg");
                    zztVar.zzl(new zzap(-9223372036854775807L, zzajbVar2));
                    zzahmVarZzs.zzA(zztVar.zzP());
                    this.zzc = 5;
                } else {
                    zzj();
                }
            } else {
                zzj();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzeu zzeuVar2 = new zzeu(this.zze);
            zzagbVar.zzc(zzeuVar2.zzi(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzeuVar2.zzM((char) 0)) && (strZzM = zzeuVar2.zzM((char) 0)) != null) {
                long jZzo = zzagbVar.zzo();
                if (jZzo == -1 || (zzaiwVarZza = zzaix.zza(strZzM)) == null) {
                    zzajbVar = null;
                } else {
                    List list = zzaiwVarZza.zzb;
                    if (list.size() < 2) {
                        zzajbVar = null;
                    } else {
                        int size = list.size() - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (size >= 0) {
                            zzaiv zzaivVar = (zzaiv) list.get(size);
                            String str = zzaivVar.zza;
                            long j9 = j2;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (size == 0) {
                                jZzo -= zzaivVar.zzc;
                                j = 0;
                            } else {
                                j = jZzo - zzaivVar.zzb;
                            }
                            long j10 = j;
                            long j11 = jZzo;
                            jZzo = j10;
                            if (z && jZzo != j11) {
                                j8 = j11 - jZzo;
                                j7 = jZzo;
                            }
                            if (size == 0) {
                                j6 = j11;
                            }
                            if (size == 0) {
                                j5 = jZzo;
                            }
                            size--;
                            j2 = j9;
                        }
                        long j12 = j2;
                        if (j7 == j12 || j8 == j12 || j5 == j12 || j6 == j12) {
                            zzajbVar = null;
                        } else {
                            zzajbVar = new zzajb(j5, j6, zzaiwVarZza.zza, j7, j8);
                        }
                    }
                }
                this.zzg = zzajbVar;
                if (zzajbVar != null) {
                    this.zzf = zzajbVar.zzd;
                }
            }
        } else {
            zzagbVar.zzf(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzami zzamiVar = this.zzj;
            zzamiVar.getClass();
            zzamiVar.zze(j, j2);
        }
    }

    private final void zzj() {
        zzagd zzagdVar = this.zzb;
        zzagdVar.getClass();
        zzagdVar.zzv();
        this.zzb.zzw(new zzahc(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
