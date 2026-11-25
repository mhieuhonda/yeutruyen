package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaku implements zzaga {
    public static final /* synthetic */ int zza = 0;
    private final zzeu zzb;
    private final zzagx zzc;
    private final zzagt zzd;
    private final zzagv zze;
    private final zzahm zzf;
    private zzagd zzg;
    private zzahm zzh;
    private zzahm zzi;
    private int zzj;
    private zzap zzk;
    private zzap zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private zzaky zzr;
    private boolean zzs;

    static {
        int i = zzaks.zza;
    }

    public zzaku() {
        throw null;
    }

    public zzaku(int i) {
        this.zzb = new zzeu(10);
        this.zzc = new zzagx();
        this.zzd = new zzagt();
        this.zzm = -9223372036854775807L;
        this.zze = new zzagv();
        zzafx zzafxVar = new zzafx();
        this.zzf = zzafxVar;
        this.zzi = zzafxVar;
        this.zzp = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    @RequiresNonNull({"extractorOutput", "realTrackOutput"})
    private final int zzi(zzagb zzagbVar) throws Throwable {
        long j;
        Throwable th;
        int iZzB;
        zzala zzalaVarZza;
        zzagt zzagtVar;
        zzakw zzakwVar;
        zzap zzapVar;
        long jZzn;
        long jZzo;
        long jZzb;
        long j2;
        long j3;
        zzaky zzakpVar;
        int i;
        int i2;
        zzajv zzajvVar;
        zzakr zzakrVarZze;
        if (this.zzj == 0) {
            try {
                zzk(zzagbVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzr == null) {
            zzagx zzagxVar = this.zzc;
            zzeu zzeuVar = new zzeu(zzagxVar.zzc);
            zzagbVar.zzi(zzeuVar.zzi(), 0, zzagxVar.zzc);
            int i3 = 21;
            if ((zzagxVar.zza & 1) != 0) {
                if (zzagxVar.zze != 1) {
                    i3 = 36;
                }
            } else if (zzagxVar.zze == 1) {
                i3 = 13;
            }
            th = null;
            if (zzeuVar.zze() >= i3 + 4) {
                zzeuVar.zzh(i3);
                iZzB = zzeuVar.zzB();
                if (iZzB != 1483304551) {
                    if (iZzB == 1231971951) {
                        iZzB = 1231971951;
                    } else if (zzeuVar.zze() >= 40) {
                        zzeuVar.zzh(36);
                        if (zzeuVar.zzB() == 1447187017) {
                            iZzB = 1447187017;
                        } else {
                            iZzB = 0;
                        }
                    } else {
                        iZzB = 0;
                    }
                }
            } else if (zzeuVar.zze() >= 40) {
                zzeuVar.zzh(36);
                if (zzeuVar.zzB() == 1447187017) {
                    iZzB = 1447187017;
                } else {
                    iZzB = 0;
                }
            } else {
                iZzB = 0;
            }
            if (iZzB == 1231971951) {
                zzalaVarZza = zzala.zza(zzagxVar, zzeuVar);
                zzagtVar = this.zzd;
                if (!zzagtVar.zzb() && (i = zzalaVarZza.zze) != -1 && (i2 = zzalaVarZza.zzf) != -1) {
                    zzagtVar.zza = i;
                    zzagtVar.zzb = i2;
                }
                zzakwVar = zzalaVarZza.zzd;
                if (zzakwVar != null) {
                    zzapVar = new zzap(-9223372036854775807L, zzakwVar);
                } else {
                    zzapVar = null;
                }
                this.zzl = zzapVar;
                jZzn = zzagbVar.zzn();
                zzagbVar.zzf(zzagxVar.zzc);
                if (iZzB == 1483304551) {
                    zzakpVar = zzalb.zze(zzalaVarZza, jZzn, zzagbVar.zzo());
                    j = -9223372036854775807L;
                } else {
                    jZzo = zzagbVar.zzo();
                    jZzb = zzalaVarZza.zzb();
                    if (jZzb != -9223372036854775807L) {
                        j = -9223372036854775807L;
                    } else {
                        j2 = zzalaVarZza.zzc;
                        if (j2 != -1) {
                            jZzo = jZzn + j2;
                            j = -9223372036854775807L;
                            j3 = j2 - ((long) zzalaVarZza.zza.zzc);
                        } else {
                            j = -9223372036854775807L;
                            if (jZzo != -1) {
                                j3 = (jZzo - jZzn) - ((long) zzalaVarZza.zza.zzc);
                            }
                        }
                        long j4 = j3;
                        zzakpVar = new zzakp(jZzo, jZzn + ((long) zzalaVarZza.zza.zzc), zzhaq.zza(zzfm.zzw(j4, 8000000L, jZzb, RoundingMode.HALF_UP)), zzhaq.zza(zzhai.zza(j4, zzalaVarZza.zzb, RoundingMode.HALF_UP)), false);
                    }
                    zzakpVar = null;
                }
            } else {
                if (iZzB != 1447187017) {
                    if (iZzB != 1483304551) {
                        zzagbVar.zzl();
                    } else {
                        zzalaVarZza = zzala.zza(zzagxVar, zzeuVar);
                        zzagtVar = this.zzd;
                        if (!zzagtVar.zzb()) {
                            zzagtVar.zza = i;
                            zzagtVar.zzb = i2;
                        }
                        zzakwVar = zzalaVarZza.zzd;
                        if (zzakwVar != null) {
                            zzapVar = new zzap(-9223372036854775807L, zzakwVar);
                        } else {
                            zzapVar = null;
                        }
                        this.zzl = zzapVar;
                        jZzn = zzagbVar.zzn();
                        zzagbVar.zzf(zzagxVar.zzc);
                        if (iZzB == 1483304551) {
                            zzakpVar = zzalb.zze(zzalaVarZza, jZzn, zzagbVar.zzo());
                        } else {
                            jZzo = zzagbVar.zzo();
                            jZzb = zzalaVarZza.zzb();
                            if (jZzb != -9223372036854775807L) {
                                j2 = zzalaVarZza.zzc;
                                if (j2 != -1) {
                                    jZzo = jZzn + j2;
                                    j = -9223372036854775807L;
                                    j3 = j2 - ((long) zzalaVarZza.zza.zzc);
                                } else {
                                    j = -9223372036854775807L;
                                    if (jZzo != -1) {
                                        j3 = (jZzo - jZzn) - ((long) zzalaVarZza.zza.zzc);
                                    }
                                }
                                long j5 = j3;
                                zzakpVar = new zzakp(jZzo, jZzn + ((long) zzalaVarZza.zza.zzc), zzhaq.zza(zzfm.zzw(j5, 8000000L, jZzb, RoundingMode.HALF_UP)), zzhaq.zza(zzhai.zza(j5, zzalaVarZza.zzb, RoundingMode.HALF_UP)), false);
                            }
                            zzakpVar = null;
                        }
                    }
                    j = -9223372036854775807L;
                    zzakpVar = null;
                } else {
                    zzakpVar = zzakz.zze(zzagbVar.zzo(), zzagbVar.zzn(), zzagxVar, zzeuVar);
                    zzagxVar = zzagxVar;
                    zzagbVar.zzf(zzagxVar.zzc);
                }
                j = -9223372036854775807L;
            }
            zzap zzapVar2 = this.zzk;
            long jZzn2 = zzagbVar.zzn();
            if (zzapVar2 == null || (zzajvVar = (zzajv) zzapVar2.zzc(zzajv.class, zzgtv.zza())) == null) {
                zzakrVarZze = null;
            } else {
                zzajx zzajxVar = (zzajx) zzapVar2.zzc(zzajx.class, zzakt.zza);
                zzakrVarZze = zzakr.zze(jZzn2, zzajvVar, zzajxVar == null ? j : zzfm.zzt(Long.parseLong((String) zzajxVar.zzb.get(0))));
            }
            if (this.zzs) {
                zzakpVar = new zzakx();
            } else {
                if (zzakrVarZze != null) {
                    zzakpVar = zzakrVarZze;
                } else if (zzakpVar == null) {
                    zzakpVar = null;
                }
                if (zzakpVar == null) {
                    zzeu zzeuVar2 = this.zzb;
                    zzagbVar.zzi(zzeuVar2.zzi(), 0, 4);
                    zzeuVar2.zzh(0);
                    zzagxVar.zza(zzeuVar2.zzB());
                    zzakpVar = new zzakp(zzagbVar.zzo(), zzagbVar.zzn(), zzagxVar, false);
                }
                this.zzh.zzP(zzakpVar.zza());
            }
            this.zzr = zzakpVar;
            this.zzg.zzw(zzakpVar);
            zzap zzapVarZzf = this.zzk;
            zzap zzapVar3 = this.zzl;
            if (zzapVarZzf == null) {
                zzapVarZzf = zzapVar3;
            } else if (zzapVar3 != null) {
                zzapVarZzf = zzapVarZzf.zzf(zzapVar3);
            }
            zzt zztVar = new zzt();
            zztVar.zzn("audio/mpeg");
            zztVar.zzo(zzagxVar.zzb);
            zztVar.zzp(4096);
            zztVar.zzG(zzagxVar.zze);
            zztVar.zzI(zzagxVar.zzd);
            zzagt zzagtVar2 = this.zzd;
            zztVar.zzK(zzagtVar2.zza);
            zztVar.zzL(zzagtVar2.zzb);
            zztVar.zzl(zzapVarZzf);
            if (this.zzr.zzh() != -2147483647) {
                zztVar.zzi(this.zzr.zzh());
            }
            this.zzi.zzA(zztVar.zzP());
            this.zzo = zzagbVar.zzn();
        } else {
            j = -9223372036854775807L;
            th = null;
            long j6 = this.zzo;
            if (j6 != 0) {
                long jZzn3 = zzagbVar.zzn();
                if (jZzn3 < j6) {
                    zzagbVar.zzf((int) (j6 - jZzn3));
                }
            }
        }
        int i4 = this.zzq;
        if (i4 == 0) {
            zzagbVar.zzl();
            if (zzl(zzagbVar)) {
                return -1;
            }
            zzeu zzeuVar3 = this.zzb;
            zzeuVar3.zzh(0);
            int iZzB2 = zzeuVar3.zzB();
            if (!zzn(iZzB2, this.zzj) || zzagy.zza(iZzB2) == -1) {
                zzagbVar.zzf(1);
                this.zzj = 0;
                return 0;
            }
            zzagx zzagxVar2 = this.zzc;
            zzagxVar2.zza(iZzB2);
            if (this.zzm == j) {
                this.zzm = this.zzr.zzf(zzagbVar.zzn());
            }
            i4 = zzagxVar2.zzc;
            this.zzq = i4;
            this.zzp = zzagbVar.zzn() + ((long) i4);
            zzaky zzakyVar = this.zzr;
            if (zzakyVar instanceof zzakq) {
                zzj(this.zzn + ((long) zzagxVar2.zzg));
                throw th;
            }
        }
        int iZza = this.zzi.zza(zzagbVar, i4, true);
        if (iZza == -1) {
            return -1;
        }
        int i5 = this.zzq - iZza;
        this.zzq = i5;
        if (i5 > 0) {
            return 0;
        }
        zzahm zzahmVar = this.zzi;
        long jZzj = zzj(this.zzn);
        zzagx zzagxVar3 = this.zzc;
        zzahmVar.zze(jZzj, 1, zzagxVar3.zzc, 0, null);
        this.zzn += (long) zzagxVar3.zzg;
        this.zzq = 0;
        return 0;
    }

    private final long zzj(long j) {
        return this.zzm + ((j * 1000000) / ((long) this.zzc.zzd));
    }

    private final boolean zzk(zzagb zzagbVar, boolean z) throws IOException {
        int iZzm;
        int i;
        int iZza;
        zzagbVar.zzl();
        if (zzagbVar.zzn() == 0) {
            zzap zzapVarZza = this.zze.zza(zzagbVar, null, 131072);
            this.zzk = zzapVarZza;
            if (zzapVarZza != null) {
                this.zzd.zza(zzapVarZza);
            }
            iZzm = (int) zzagbVar.zzm();
            if (!z) {
                zzagbVar.zzf(iZzm);
            }
            i = 0;
        } else {
            iZzm = 0;
            i = 0;
        }
        int i2 = i;
        int i3 = i2;
        while (true) {
            if (zzl(zzagbVar)) {
                if (i2 > 0) {
                    break;
                }
                zzm();
                throw new EOFException();
            }
            zzeu zzeuVar = this.zzb;
            zzeuVar.zzh(0);
            int iZzB = zzeuVar.zzB();
            if ((i == 0 || zzn(iZzB, i)) && (iZza = zzagy.zza(iZzB)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.zzc.zza(iZzB);
                    i = iZzB;
                }
                zzagbVar.zzk(iZza - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == 131072) {
                    if (z) {
                        return false;
                    }
                    zzm();
                    throw new EOFException();
                }
                if (z) {
                    zzagbVar.zzl();
                    zzagbVar.zzk(iZzm + i4);
                } else {
                    zzagbVar.zzf(1);
                }
                i2 = 0;
                i3 = i4;
                i = 0;
            }
        }
        if (z) {
            zzagbVar.zzf(iZzm + i3);
        } else {
            zzagbVar.zzl();
        }
        this.zzj = i;
        return true;
    }

    private final boolean zzl(zzagb zzagbVar) throws IOException {
        zzaky zzakyVar = this.zzr;
        if (zzakyVar != null) {
            long jZzg = zzakyVar.zzg();
            if (jZzg != -1 && zzagbVar.zzm() > jZzg - 4) {
                return true;
            }
        }
        try {
            return !zzagbVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzaky zzakyVar = this.zzr;
        if ((zzakyVar instanceof zzakp) && zzakyVar.zzb()) {
            long j = this.zzp;
            if (j == -1 || j == this.zzr.zzg()) {
                return;
            }
            this.zzr = ((zzakp) this.zzr).zzi(this.zzp);
            zzagd zzagdVar = this.zzg;
            zzagdVar.getClass();
            zzagdVar.zzw(this.zzr);
            this.zzh.getClass();
            this.zzr.zza();
        }
    }

    private static boolean zzn(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final boolean zza(zzagb zzagbVar) throws IOException {
        return zzk(zzagbVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc(zzagd zzagdVar) {
        this.zzg = zzagdVar;
        zzahm zzahmVarZzs = zzagdVar.zzs(0, 1);
        this.zzh = zzahmVarZzs;
        this.zzi = zzahmVarZzs;
        this.zzg.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final int zzd(zzagb zzagbVar, zzaha zzahaVar) throws Throwable {
        this.zzh.getClass();
        String str = zzfm.zza;
        int iZzi = zzi(zzagbVar);
        if (iZzi == -1 && (this.zzr instanceof zzakq)) {
            if (this.zzr.zza() != zzj(this.zzn)) {
                throw null;
            }
        }
        return iZzi;
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = 0L;
        this.zzq = 0;
        this.zzp = -1L;
        zzaky zzakyVar = this.zzr;
        if (zzakyVar instanceof zzakq) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzf() {
    }

    public final void zzh() {
        this.zzs = true;
    }
}
