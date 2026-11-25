package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaay extends zzaar {
    private final boolean zze;
    private final zzaan zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final boolean zzt;
    private final boolean zzu;
    private final int zzv;

    /* JADX WARN: Code duplicated, block: B:111:0x0172  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0053  */
    /* JADX WARN: Code duplicated, block: B:36:0x0057  */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x0068  */
    /* JADX WARN: Code duplicated, block: B:45:0x006e  */
    public zzaay(int i, zzbg zzbgVar, int i2, zzaan zzaanVar, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iZzj;
        int i6;
        boolean z4;
        int i7;
        float f;
        int i8;
        zzv zzvVar;
        int i9;
        int i10;
        int i11;
        super(i, zzbgVar, i2);
        this.zzf = zzaanVar;
        int i12 = 1;
        int i13 = true != zzaanVar.zzM ? 16 : 24;
        boolean z5 = zzaanVar.zzL;
        if (!z || (((i9 = (zzvVar = this.zzd).zzw) != -1 && i9 > zzaanVar.zza) || ((i10 = zzvVar.zzx) != -1 && i10 > zzaanVar.zzb))) {
            z2 = false;
        } else {
            float f2 = zzvVar.zzA;
            if ((f2 == -1.0f || f2 <= zzaanVar.zzc) && ((i11 = zzvVar.zzj) == -1 || i11 <= zzaanVar.zzd)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.zze = z2;
        if (z) {
            zzv zzvVar2 = this.zzd;
            int i14 = zzvVar2.zzw;
            if (i14 != -1) {
                int i15 = zzaanVar.zze;
                if (i14 >= 0) {
                    i7 = zzvVar2.zzx;
                    if (i7 != -1) {
                        int i16 = zzaanVar.zzf;
                        if (i7 >= 0) {
                            f = zzvVar2.zzA;
                            if (f != -1.0f) {
                                int i17 = zzaanVar.zzg;
                                if (f >= 0.0f) {
                                    i8 = zzvVar2.zzj;
                                    if (i8 != -1) {
                                        int i18 = zzaanVar.zzh;
                                        if (i8 >= 0) {
                                            z3 = false;
                                        }
                                    }
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                            } else {
                                i8 = zzvVar2.zzj;
                                if (i8 != -1) {
                                    int i19 = zzaanVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            }
                        } else {
                            z3 = false;
                        }
                    } else {
                        f = zzvVar2.zzA;
                        if (f != -1.0f) {
                            int i110 = zzaanVar.zzg;
                            if (f >= 0.0f) {
                                i8 = zzvVar2.zzj;
                                if (i8 != -1) {
                                    int i111 = zzaanVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = zzvVar2.zzj;
                            if (i8 != -1) {
                                int i112 = zzaanVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    }
                } else {
                    z3 = false;
                }
            } else {
                i7 = zzvVar2.zzx;
                if (i7 != -1) {
                    int i113 = zzaanVar.zzf;
                    if (i7 >= 0) {
                        f = zzvVar2.zzA;
                        if (f != -1.0f) {
                            int i114 = zzaanVar.zzg;
                            if (f >= 0.0f) {
                                i8 = zzvVar2.zzj;
                                if (i8 != -1) {
                                    int i115 = zzaanVar.zzh;
                                    if (i8 >= 0) {
                                        z3 = false;
                                    }
                                }
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        } else {
                            i8 = zzvVar2.zzj;
                            if (i8 != -1) {
                                int i116 = zzaanVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    f = zzvVar2.zzA;
                    if (f != -1.0f) {
                        int i117 = zzaanVar.zzg;
                        if (f >= 0.0f) {
                            i8 = zzvVar2.zzj;
                            if (i8 != -1) {
                                int i118 = zzaanVar.zzh;
                                if (i8 >= 0) {
                                    z3 = false;
                                }
                            }
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } else {
                        i8 = zzvVar2.zzj;
                        if (i8 != -1) {
                            int i119 = zzaanVar.zzh;
                            if (i8 >= 0) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    }
                }
            }
        } else {
            z3 = false;
        }
        this.zzg = z3;
        this.zzh = zzne.zzad(i3, false);
        zzv zzvVar3 = this.zzd;
        float f3 = zzvVar3.zzA;
        this.zzi = f3 != -1.0f && f3 >= 10.0f;
        this.zzj = zzvVar3.zzj;
        this.zzk = zzvVar3.zzc();
        int i20 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i20 >= zzaanVar.zzo.size()) {
                iZzj = 0;
                i20 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzaaz.zzj(this.zzd, (String) zzaanVar.zzo.get(i20), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        this.zzm = i20;
        this.zzn = iZzj;
        int i21 = this.zzd.zzf;
        int i22 = zzaanVar.zzp;
        this.zzo = zzaaz.zzm(i21, 0);
        int i23 = this.zzd.zzf;
        this.zzq = i23 == 0 || (i23 & 1) != 0;
        this.zzr = zzaaz.zzj(this.zzd, str, zzaaz.zzi(str) == null);
        for (int i24 = 0; i24 < zzaanVar.zzm.size(); i24++) {
            String str2 = this.zzd.zzp;
            if (str2 != null && str2.equals(zzaanVar.zzm.get(i24))) {
                i5 = i24;
                break;
            }
        }
        this.zzl = i5;
        this.zzp = zzaaz.zzn(this.zzd, zzaanVar.zzn);
        this.zzt = (i3 & 384) == 128;
        this.zzu = (i3 & 64) == 64;
        zzv zzvVar4 = this.zzd;
        String str3 = zzvVar4.zzp;
        if (str3 != null) {
            switch (str3) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    i6 = 4;
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.zzv = i6;
        if ((zzvVar4.zzf & 16384) != 0) {
            i12 = 0;
        } else {
            zzaan zzaanVar2 = this.zzf;
            if (!zzne.zzad(i3, zzaanVar2.zzV) || (!(z4 = this.zze) && !zzaanVar2.zzK)) {
                i12 = 0;
            } else if (zzne.zzad(i3, false) && this.zzg && z4 && zzvVar4.zzj != -1) {
                boolean z6 = zzaanVar2.zzG;
                boolean z7 = zzaanVar2.zzF;
                if ((i13 & i3) != 0) {
                    i12 = 2;
                }
            }
        }
        this.zzs = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzi(zzaay zzaayVar, zzaay zzaayVar2) {
        zzgwg zzgwgVarZza = zzgwg.zzg().zzd(zzaayVar.zzh, zzaayVar2.zzh).zza(Integer.valueOf(zzaayVar.zzm), Integer.valueOf(zzaayVar2.zzm), zzgyn.zzb().zza()).zzb(zzaayVar.zzn, zzaayVar2.zzn).zzb(zzaayVar.zzo, zzaayVar2.zzo).zza(Integer.valueOf(zzaayVar.zzp), Integer.valueOf(zzaayVar2.zzp), zzgyn.zzb().zza()).zzd(zzaayVar.zzq, zzaayVar2.zzq).zzb(zzaayVar.zzr, zzaayVar2.zzr).zzd(zzaayVar.zzi, zzaayVar2.zzi).zzd(zzaayVar.zze, zzaayVar2.zze).zzd(zzaayVar.zzg, zzaayVar2.zzg).zza(Integer.valueOf(zzaayVar.zzl), Integer.valueOf(zzaayVar2.zzl), zzgyn.zzb().zza());
        boolean z = zzaayVar.zzt;
        zzgwg zzgwgVarZzd = zzgwgVarZza.zzd(z, zzaayVar2.zzt);
        boolean z2 = zzaayVar.zzu;
        zzgwg zzgwgVarZzd2 = zzgwgVarZzd.zzd(z2, zzaayVar2.zzu);
        if (z && z2) {
            zzgwgVarZzd2 = zzgwgVarZzd2.zzb(zzaayVar.zzv, zzaayVar2.zzv);
        }
        return zzgwgVarZzd2.zze();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(zzaay zzaayVar, zzaay zzaayVar2) {
        zzgyn zzgynVarZza = (zzaayVar.zze && zzaayVar.zzh) ? zzaaz.zzc : zzaaz.zzc.zza();
        zzgwg zzgwgVarZzg = zzgwg.zzg();
        boolean z = zzaayVar.zzf.zzF;
        return zzgwgVarZzg.zza(Integer.valueOf(zzaayVar.zzk), Integer.valueOf(zzaayVar2.zzk), zzgynVarZza).zza(Integer.valueOf(zzaayVar.zzj), Integer.valueOf(zzaayVar2.zzj), zzgynVarZza).zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final int zza() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzaar
    public final /* bridge */ /* synthetic */ boolean zzc(zzaar zzaarVar) {
        zzaay zzaayVar = (zzaay) zzaarVar;
        if (!Objects.equals(this.zzd.zzp, zzaayVar.zzd.zzp)) {
            return false;
        }
        boolean z = this.zzf.zzN;
        return this.zzt == zzaayVar.zzt && this.zzu == zzaayVar.zzu;
    }
}
