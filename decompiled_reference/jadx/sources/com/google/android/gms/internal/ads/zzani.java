package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzani extends zzang {
    private zzanh zza;
    private int zzb;
    private boolean zzc;
    private zzhf zzd;
    private zzhd zze;

    zzani() {
    }

    @Override // com.google.android.gms.internal.ads.zzang
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzd = null;
            this.zze = null;
        }
        this.zzb = 0;
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    protected final long zzb(zzeu zzeuVar) {
        if ((zzeuVar.zzi()[0] & 1) == 1) {
            return -1L;
        }
        zzanh zzanhVar = this.zza;
        zzanhVar.getClass();
        byte b = zzeuVar.zzi()[0];
        zzhf zzhfVar = zzanhVar.zza;
        zzhe[] zzheVarArr = zzanhVar.zzd;
        int i = zzheVarArr[(b >> 1) & (255 >>> (8 - zzhg.zza(zzheVarArr.length + (-1))))].zza ? zzhfVar.zzf : zzhfVar.zze;
        int i2 = this.zzc ? (this.zzb + i) / 4 : 0;
        if (zzeuVar.zzj() < zzeuVar.zze() + 4) {
            byte[] bArrCopyOf = Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze() + 4);
            zzeuVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            zzeuVar.zzf(zzeuVar.zze() + 4);
        }
        long j = i2;
        byte[] bArrZzi = zzeuVar.zzi();
        bArrZzi[zzeuVar.zze() - 4] = (byte) (j & 255);
        bArrZzi[zzeuVar.zze() - 3] = (byte) ((j >>> 8) & 255);
        bArrZzi[zzeuVar.zze() - 2] = (byte) ((j >>> 16) & 255);
        bArrZzi[zzeuVar.zze() - 1] = (byte) ((j >>> 24) & 255);
        this.zzc = true;
        this.zzb = i;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    protected final void zzj(long j) {
        super.zzj(j);
        this.zzc = j != 0;
        zzhf zzhfVar = this.zzd;
        this.zzb = zzhfVar != null ? zzhfVar.zze : 0;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x03e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:169:0x03ea  */
    @Override // com.google.android.gms.internal.ads.zzang
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzeu zzeuVar, long j, zzane zzaneVar) throws IOException {
        zzanh zzanhVar;
        int i;
        int iZzb;
        int i2;
        int[] iArr;
        if (this.zza != null) {
            zzaneVar.zza.getClass();
            return false;
        }
        zzhf zzhfVar = this.zzd;
        int i3 = 1;
        if (zzhfVar != null) {
            int i4 = 4;
            zzhd zzhdVar = this.zze;
            if (zzhdVar == null) {
                this.zze = zzhg.zzb(zzeuVar, true, true);
            } else {
                byte[] bArr = new byte[zzeuVar.zze()];
                System.arraycopy(zzeuVar.zzi(), 0, bArr, 0, zzeuVar.zze());
                int i5 = zzhfVar.zza;
                int i6 = 5;
                zzhg.zzc(5, zzeuVar, false);
                int iZzs = zzeuVar.zzs() + 1;
                zzhc zzhcVar = new zzhc(zzeuVar.zzi());
                zzhcVar.zzc(zzeuVar.zzg() * 8);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = 16;
                    if (i7 >= iZzs) {
                        int i10 = i3;
                        int i11 = 6;
                        int iZzb2 = zzhcVar.zzb(6) + i10;
                        for (int i12 = 0; i12 < iZzb2; i12++) {
                            if (zzhcVar.zzb(16) != 0) {
                                throw zzat.zzb("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int iZzb3 = zzhcVar.zzb(6) + i10;
                        int i13 = 0;
                        while (true) {
                            int i14 = 3;
                            if (i13 >= iZzb3) {
                                int i15 = 1;
                                int iZzb4 = zzhcVar.zzb(i11) + 1;
                                int i16 = 0;
                                while (i16 < iZzb4) {
                                    if (zzhcVar.zzb(16) > 2) {
                                        throw zzat.zzb("residueType greater than 2 is not decodable", null);
                                    }
                                    zzhcVar.zzc(24);
                                    zzhcVar.zzc(24);
                                    zzhcVar.zzc(24);
                                    int iZzb5 = zzhcVar.zzb(i11) + i15;
                                    int i17 = 8;
                                    zzhcVar.zzc(8);
                                    int[] iArr2 = new int[iZzb5];
                                    for (int i18 = 0; i18 < iZzb5; i18++) {
                                        iArr2[i18] = ((zzhcVar.zza() ? zzhcVar.zzb(5) : 0) * 8) + zzhcVar.zzb(3);
                                    }
                                    int i19 = 0;
                                    while (i19 < iZzb5) {
                                        int i20 = 0;
                                        while (i20 < i17) {
                                            if ((iArr2[i19] & (1 << i20)) != 0) {
                                                zzhcVar.zzc(i17);
                                            }
                                            i20++;
                                            i17 = 8;
                                        }
                                        i19++;
                                        i17 = 8;
                                    }
                                    i16++;
                                    i11 = 6;
                                    i15 = 1;
                                }
                                int iZzb6 = zzhcVar.zzb(i11) + 1;
                                for (int i21 = 0; i21 < iZzb6; i21++) {
                                    int iZzb7 = zzhcVar.zzb(16);
                                    if (iZzb7 != 0) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(iZzb7).length() + 41);
                                        sb.append("mapping type other than 0 not supported: ");
                                        sb.append(iZzb7);
                                        zzeh.zze("VorbisUtil", sb.toString());
                                    } else {
                                        if (zzhcVar.zza()) {
                                            i = 1;
                                            iZzb = zzhcVar.zzb(4) + 1;
                                        } else {
                                            i = 1;
                                            iZzb = 1;
                                        }
                                        if (zzhcVar.zza()) {
                                            int iZzb8 = zzhcVar.zzb(8) + i;
                                            for (int i22 = 0; i22 < iZzb8; i22++) {
                                                int i23 = i5 - 1;
                                                zzhcVar.zzc(zzhg.zza(i23));
                                                zzhcVar.zzc(zzhg.zza(i23));
                                            }
                                        }
                                        if (zzhcVar.zzb(2) != 0) {
                                            throw zzat.zzb("to reserved bits must be zero after mapping coupling steps", null);
                                        }
                                        if (iZzb > 1) {
                                            for (int i24 = 0; i24 < i5; i24++) {
                                                zzhcVar.zzc(4);
                                            }
                                        }
                                        for (int i25 = 0; i25 < iZzb; i25++) {
                                            zzhcVar.zzc(8);
                                            zzhcVar.zzc(8);
                                            zzhcVar.zzc(8);
                                        }
                                    }
                                }
                                int iZzb9 = zzhcVar.zzb(6);
                                int i26 = iZzb9 + 1;
                                zzhe[] zzheVarArr = new zzhe[i26];
                                for (int i27 = 0; i27 < i26; i27++) {
                                    zzheVarArr[i27] = new zzhe(zzhcVar.zza(), zzhcVar.zzb(16), zzhcVar.zzb(16), zzhcVar.zzb(8));
                                }
                                if (!zzhcVar.zza()) {
                                    throw zzat.zzb("framing bit after modes not set as expected", null);
                                }
                                zzanhVar = new zzanh(zzhfVar, zzhdVar, bArr, zzheVarArr, zzhg.zza(iZzb9));
                                break;
                            }
                            int iZzb10 = zzhcVar.zzb(i9);
                            if (iZzb10 == 0) {
                                int i28 = 8;
                                zzhcVar.zzc(8);
                                zzhcVar.zzc(16);
                                zzhcVar.zzc(16);
                                zzhcVar.zzc(6);
                                zzhcVar.zzc(8);
                                int iZzb11 = zzhcVar.zzb(4) + 1;
                                int i29 = 0;
                                while (i29 < iZzb11) {
                                    zzhcVar.zzc(i28);
                                    i29++;
                                    i28 = 8;
                                }
                            } else {
                                if (iZzb10 != i10) {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb10).length() + 41);
                                    sb2.append("floor type greater than 1 not decodable: ");
                                    sb2.append(iZzb10);
                                    throw zzat.zzb(sb2.toString(), null);
                                }
                                int iZzb12 = zzhcVar.zzb(5);
                                int[] iArr3 = new int[iZzb12];
                                int i30 = -1;
                                for (int i31 = 0; i31 < iZzb12; i31++) {
                                    int iZzb13 = zzhcVar.zzb(4);
                                    iArr3[i31] = iZzb13;
                                    if (iZzb13 > i30) {
                                        i30 = iZzb13;
                                    }
                                }
                                int i32 = i30 + 1;
                                int[] iArr4 = new int[i32];
                                int i33 = 0;
                                while (i33 < i32) {
                                    int i34 = 1;
                                    iArr4[i33] = zzhcVar.zzb(i14) + 1;
                                    int iZzb14 = zzhcVar.zzb(2);
                                    if (iZzb14 > 0) {
                                        i2 = 8;
                                        zzhcVar.zzc(8);
                                    } else {
                                        i2 = 8;
                                    }
                                    int i35 = i32;
                                    int i36 = 0;
                                    while (true) {
                                        int i37 = i34 << iZzb14;
                                        iArr = iArr3;
                                        if (i36 < i37) {
                                            zzhcVar.zzc(i2);
                                            i36++;
                                            iArr3 = iArr;
                                            i2 = 8;
                                            i34 = 1;
                                        }
                                    }
                                    i33++;
                                    iArr3 = iArr;
                                    i32 = i35;
                                    i14 = 3;
                                }
                                int[] iArr5 = iArr3;
                                zzhcVar.zzc(2);
                                int iZzb15 = zzhcVar.zzb(4);
                                int i38 = 0;
                                int i39 = 0;
                                for (int i40 = 0; i40 < iZzb12; i40++) {
                                    i38 += iArr4[iArr5[i40]];
                                    while (i39 < i38) {
                                        zzhcVar.zzc(iZzb15);
                                        i39++;
                                    }
                                }
                            }
                            i13++;
                            i11 = 6;
                            i9 = 16;
                            i10 = 1;
                        }
                    } else {
                        if (zzhcVar.zzb(24) != 5653314) {
                            int iZzd = zzhcVar.zzd();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzd).length() + 55);
                            sb3.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb3.append(iZzd);
                            throw zzat.zzb(sb3.toString(), null);
                        }
                        int iZzb16 = zzhcVar.zzb(16);
                        int iZzb17 = zzhcVar.zzb(24);
                        if (zzhcVar.zza()) {
                            zzhcVar.zzc(i6);
                            for (int iZzb18 = 0; iZzb18 < iZzb17; iZzb18 += zzhcVar.zzb(zzhg.zza(iZzb17 - iZzb18))) {
                            }
                        } else {
                            boolean zZza = zzhcVar.zza();
                            for (int i41 = 0; i41 < iZzb17; i41++) {
                                if (!zZza) {
                                    zzhcVar.zzc(i6);
                                } else if (zzhcVar.zza()) {
                                    zzhcVar.zzc(i6);
                                }
                            }
                        }
                        int i42 = i4;
                        int iZzb19 = zzhcVar.zzb(i42);
                        if (iZzb19 > 2) {
                            StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb19).length() + 42);
                            sb4.append("lookup type greater than 2 not decodable: ");
                            sb4.append(iZzb19);
                            throw zzat.zzb(sb4.toString(), null);
                        }
                        if (iZzb19 != i3) {
                            if (iZzb19 != 2) {
                                i3 = i3;
                            }
                            i7++;
                            i3 = i3;
                            i4 = 4;
                            i6 = 5;
                        } else {
                            i8 = iZzb19;
                        }
                        zzhcVar.zzc(32);
                        zzhcVar.zzc(32);
                        int iZzb20 = zzhcVar.zzb(i42) + i3;
                        zzhcVar.zzc(i3);
                        zzhcVar.zzc((int) ((i8 == i3 ? iZzb16 != 0 ? (long) Math.floor(Math.pow(iZzb17, 1.0d / ((double) iZzb16))) : 0L : ((long) iZzb16) * ((long) iZzb17)) * ((long) iZzb20)));
                        i7++;
                        i3 = i3;
                        i4 = 4;
                        i6 = 5;
                    }
                }
            }
            this.zza = zzanhVar;
            if (zzanhVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            zzhf zzhfVar2 = zzanhVar.zza;
            arrayList.add(zzhfVar2.zzg);
            arrayList.add(zzanhVar.zzc);
            zzap zzapVarZzb = zzaho.zzb(zzgwt.zzr(zzanhVar.zzb.zza));
            zzt zztVar = new zzt();
            zztVar.zzn("audio/ogg");
            zztVar.zzo("audio/vorbis");
            zztVar.zzi(zzhfVar2.zzd);
            zztVar.zzj(zzhfVar2.zzc);
            zztVar.zzG(zzhfVar2.zza);
            zztVar.zzI(zzhfVar2.zzb);
            zztVar.zzr(arrayList);
            zztVar.zzl(zzapVarZzb);
            zzaneVar.zza = zztVar.zzP();
            return true;
        }
        zzhg.zzc(1, zzeuVar, false);
        int iZzI = zzeuVar.zzI();
        int iZzs2 = zzeuVar.zzs();
        int iZzI2 = zzeuVar.zzI();
        int iZzC = zzeuVar.zzC();
        int i43 = iZzC <= 0 ? -1 : iZzC;
        int iZzC2 = zzeuVar.zzC();
        int i44 = iZzC2 <= 0 ? -1 : iZzC2;
        int iZzC3 = zzeuVar.zzC();
        int i45 = iZzC3 <= 0 ? -1 : iZzC3;
        int iZzs3 = zzeuVar.zzs();
        this.zzd = new zzhf(iZzI, iZzs2, iZzI2, i43, i44, i45, (int) Math.pow(2.0d, iZzs3 & 15), (int) Math.pow(2.0d, (iZzs3 & 240) >> 4), 1 == (zzeuVar.zzs() & 1), Arrays.copyOf(zzeuVar.zzi(), zzeuVar.zze()));
        zzanhVar = null;
        this.zza = zzanhVar;
        if (zzanhVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        zzhf zzhfVar3 = zzanhVar.zza;
        arrayList2.add(zzhfVar3.zzg);
        arrayList2.add(zzanhVar.zzc);
        zzap zzapVarZzb2 = zzaho.zzb(zzgwt.zzr(zzanhVar.zzb.zza));
        zzt zztVar2 = new zzt();
        zztVar2.zzn("audio/ogg");
        zztVar2.zzo("audio/vorbis");
        zztVar2.zzi(zzhfVar3.zzd);
        zztVar2.zzj(zzhfVar3.zzc);
        zztVar2.zzG(zzhfVar3.zza);
        zztVar2.zzI(zzhfVar3.zzb);
        zztVar2.zzr(arrayList2);
        zztVar2.zzl(zzapVarZzb2);
        zzaneVar.zza = zztVar2.zzP();
        return true;
    }
}
