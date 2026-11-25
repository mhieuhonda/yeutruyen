package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.work.WorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzalo {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;

    static {
        String str = zzfm.zza;
        zzb = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int zza(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code duplicated, block: B:268:0x0460  */
    /* JADX WARN: Code duplicated, block: B:269:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:72:0x014c  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Code duplicated, block: B:79:0x015a A[PHI: r5
      0x015a: PHI (r5v10 int) = (r5v11 int), (r5v5 int) binds: [B:84:0x0162, B:74:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    /* JADX WARN: Code duplicated, block: B:87:0x0168 A[DONT_INVERT, PHI: r5 r6 r8
      0x0168: PHI (r5v6 int) = (r5v5 int), (r5v9 int) binds: [B:71:0x014a, B:86:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r6v6 int) = (r6v5 int), (r6v7 int) binds: [B:71:0x014a, B:86:0x0167] A[DONT_GENERATE, DONT_INLINE]
      0x0168: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:71:0x014a, B:86:0x0167] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:88:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x016c A[ADDED_TO_REGION] */
    public static List zzb(zzfz zzfzVar, zzagt zzagtVar, long j, zzq zzqVar, boolean z, boolean z2, zzgti zzgtiVar, boolean z3) throws zzat {
        int i;
        zzeu zzeuVar;
        long jZzz;
        int i2;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        long jZzw;
        long j2;
        int i5;
        ArrayList arrayList;
        zzfz zzfzVar2;
        zzhao zzhaoVar;
        zzhao zzhaoVar2;
        boolean z6;
        zzamp zzampVarZzo;
        zzap zzapVar;
        zzfz zzfzVarZzd;
        Pair pairZzo;
        zzga zzgaVarZzc;
        zzq zzqVarZzb;
        String str;
        String str2;
        String str3;
        int i6;
        String str4;
        String str5;
        zzalk zzalkVar;
        int i7;
        zzgo zzgoVar;
        int i8;
        int i9;
        boolean z7;
        String strZza;
        int i10;
        boolean z8;
        boolean z9;
        boolean z10;
        String str6;
        zzgwt zzgwtVarZzj;
        String str7;
        String str8;
        zzgwt zzgwtVar;
        long j3;
        boolean z11;
        ArrayList arrayList2;
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        while (true) {
            List list = zzfzVar.zzc;
            if (i11 >= list.size()) {
                return arrayList3;
            }
            zzfz zzfzVar3 = (zzfz) list.get(i11);
            if (zzfzVar3.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i5 = i11;
            } else {
                zzga zzgaVarZzc2 = zzfzVar.zzc(1836476516);
                zzgaVarZzc2.getClass();
                zzfz zzfzVarZzd2 = zzfzVar3.zzd(1835297121);
                zzfzVarZzd2.getClass();
                zzga zzgaVarZzc3 = zzfzVarZzd2.zzc(1751411826);
                zzgaVarZzc3.getClass();
                int iZzj = zzj(zzgaVarZzc3.zza);
                if (iZzj == 1936684398) {
                    i = 1;
                } else if (iZzj == 1986618469) {
                    i = 2;
                } else if (iZzj == 1952807028 || iZzj == 1935832172 || iZzj == 1937072756 || iZzj == 1668047728 || iZzj == 1937072752) {
                    i = 3;
                } else {
                    i = iZzj == 1835365473 ? 5 : -1;
                }
                if (i == -1) {
                    arrayList = arrayList3;
                    i5 = i11;
                    zzfzVar2 = zzfzVar3;
                    zzampVarZzo = null;
                } else {
                    zzga zzgaVarZzc4 = zzfzVar3.zzc(1953196132);
                    zzgaVarZzc4.getClass();
                    zzeu zzeuVar2 = zzgaVarZzc4.zza;
                    zzeuVar2.zzh(8);
                    int iZza = zza(zzeuVar2.zzB());
                    zzeuVar2.zzk(iZza == 0 ? 8 : 16);
                    int iZzB = zzeuVar2.zzB();
                    int i12 = 4;
                    zzeuVar2.zzk(4);
                    int iZzg = zzeuVar2.zzg();
                    int i13 = 0;
                    while (true) {
                        int i14 = iZza == 0 ? i12 : 8;
                        zzeu zzeuVar3 = zzeuVar2;
                        if (i13 >= i14) {
                            zzeuVar = zzeuVar3;
                            zzeuVar.zzk(i14);
                        } else if (zzeuVar3.zzi()[iZzg + i13] != -1) {
                            jZzz = iZza == 0 ? zzeuVar3.zzz() : zzeuVar3.zzJ();
                            if (jZzz != 0) {
                                zzeuVar = zzeuVar3;
                                break;
                            }
                            zzeuVar = zzeuVar3;
                        } else {
                            i13++;
                            zzeuVar2 = zzeuVar3;
                            i12 = 4;
                        }
                        jZzz = -9223372036854775807L;
                        break;
                    }
                    zzeuVar.zzk(10);
                    int iZzt = zzeuVar.zzt();
                    zzeuVar.zzk(4);
                    int iZzB2 = zzeuVar.zzB();
                    int iZzB3 = zzeuVar.zzB();
                    zzeuVar.zzk(4);
                    int iZzB4 = zzeuVar.zzB();
                    int iZzB5 = zzeuVar.zzB();
                    if (iZzB2 == 0) {
                        if (iZzB3 == 65536) {
                            if (iZzB4 != -65536) {
                                if (iZzB4 == 65536) {
                                    z11 = iZzB5 != 0;
                                    iZzB4 = 65536;
                                }
                                iZzB3 = 65536;
                            } else {
                                z11 = iZzB5 != 0;
                            }
                            if (true != z11) {
                                i2 = 90;
                            } else {
                                iZzB3 = 65536;
                            }
                            i4 = i2;
                            i3 = 16;
                        }
                        iZzB2 = 0;
                        if (iZzB2 == 0) {
                            if (iZzB2 != -65536) {
                                i2 = 180;
                                i4 = i2;
                                i3 = 16;
                            } else {
                                i2 = 180;
                                i4 = i2;
                                i3 = 16;
                            }
                            i3 = 16;
                            i4 = 0;
                        } else {
                            if (iZzB3 == -65536) {
                                if (iZzB4 != 65536) {
                                    if (iZzB4 == -65536) {
                                        if (iZzB5 == 0) {
                                            z5 = false;
                                        } else {
                                            z5 = true;
                                        }
                                        z4 = z5;
                                        iZzB4 = -65536;
                                    }
                                    iZzB3 = -65536;
                                } else if (iZzB5 == 0) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (true != z4) {
                                    i2 = 270;
                                } else {
                                    iZzB3 = -65536;
                                }
                                i4 = i2;
                                i3 = 16;
                            }
                            iZzB2 = 0;
                            if (iZzB2 != -65536) {
                                i2 = 180;
                                i4 = i2;
                                i3 = 16;
                            } else {
                                i2 = 180;
                                i4 = i2;
                                i3 = 16;
                            }
                            i3 = 16;
                            i4 = 0;
                        }
                    } else if (iZzB2 == 0) {
                        if (iZzB3 == -65536) {
                            if (iZzB4 != 65536) {
                                if (iZzB4 == -65536) {
                                    if (iZzB5 == 0) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    z4 = z5;
                                    iZzB4 = -65536;
                                }
                                iZzB3 = -65536;
                            } else if (iZzB5 == 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (true != z4) {
                                i2 = 270;
                            } else {
                                iZzB3 = -65536;
                            }
                            i4 = i2;
                            i3 = 16;
                        }
                        iZzB2 = 0;
                        if (iZzB2 != -65536) {
                            i2 = 180;
                            i4 = i2;
                            i3 = 16;
                        } else {
                            i2 = 180;
                            i4 = i2;
                            i3 = 16;
                        }
                        i3 = 16;
                        i4 = 0;
                    } else if ((iZzB2 != -65536 || iZzB2 == 65536) && iZzB3 == 0 && iZzB4 == 0 && iZzB5 == -65536) {
                        i2 = 180;
                        i4 = i2;
                        i3 = 16;
                    } else {
                        i3 = 16;
                        i4 = 0;
                    }
                    zzeuVar.zzk(i3);
                    short sZzv = zzeuVar.zzv();
                    zzeuVar.zzk(2);
                    short sZzv2 = zzeuVar.zzv();
                    long j4 = j == -9223372036854775807L ? jZzz : j;
                    long j5 = zzd(zzgaVarZzc2.zza).zzc;
                    if (j4 == -9223372036854775807L) {
                        j2 = j5;
                        jZzw = -9223372036854775807L;
                    } else {
                        jZzw = zzfm.zzw(j4, 1000000L, j5, RoundingMode.DOWN);
                        j2 = j5;
                    }
                    zzfz zzfzVarZzd3 = zzfzVarZzd2.zzd(1835626086);
                    zzfzVarZzd3.getClass();
                    zzfz zzfzVarZzd4 = zzfzVarZzd3.zzd(1937007212);
                    zzfzVarZzd4.getClass();
                    zzga zzgaVarZzc5 = zzfzVarZzd2.zzc(1835296868);
                    zzgaVarZzc5.getClass();
                    zzalh zzalhVarZzk = zzk(zzgaVarZzc5.zza);
                    zzga zzgaVarZzc6 = zzfzVarZzd4.zzc(1937011556);
                    if (zzgaVarZzc6 == null) {
                        zzeh.zzc("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        arrayList = arrayList3;
                        i5 = i11;
                        zzfzVar2 = zzfzVar3;
                        zzampVarZzo = null;
                    } else {
                        String strZzc = zzalhVarZzk.zzc();
                        zzeu zzeuVar4 = zzgaVarZzc6.zza;
                        zzeuVar4.zzh(12);
                        int iZzB6 = zzeuVar4.zzB();
                        zzalk zzalkVar2 = new zzalk(iZzB6);
                        int i15 = iZzt;
                        int i16 = 0;
                        while (i16 < iZzB6) {
                            int i17 = i;
                            int iZzg2 = zzeuVar4.zzg();
                            int iZzB7 = zzeuVar4.zzB();
                            int i18 = iZzg2;
                            String str9 = "childAtomSize must be positive";
                            zzage.zza(iZzB7 > 0, "childAtomSize must be positive");
                            int iZzB8 = zzeuVar4.zzB();
                            long j6 = jZzw;
                            if (iZzB8 == 1635148593 || iZzB8 == 1635148595 || iZzB8 == 1701733238 || iZzB8 == 1831958048 || iZzB8 == 1836070006 || iZzB8 == 1752589105 || iZzB8 == 1751479857 || iZzB8 == 1987470129 || iZzB8 == 1987471665 || iZzB8 == 1932670515 || iZzB8 == 1211250227 || iZzB8 == 1748121139 || iZzB8 == 1987063864 || iZzB8 == 1987063865 || iZzB8 == 1635135537 || iZzB8 == 1685479798 || iZzB8 == 1685479729 || iZzB8 == 1685481573 || iZzB8 == 1685481521 || iZzB8 == 1634760241 || iZzB8 == 1684108849) {
                                sZzv2 = sZzv2;
                                sZzv = sZzv;
                                iZzB6 = iZzB6;
                                int i19 = iZzB;
                                i15 = i15;
                                i17 = i17;
                                int i20 = iZzB7;
                                i18 = i18;
                                j6 = j6;
                                int i21 = iZzB8;
                                zzalk zzalkVar3 = zzalkVar2;
                                zzeuVar4 = zzeuVar4;
                                zzeuVar4.zzh(i18 + 16);
                                zzeuVar4.zzk(16);
                                int iZzt2 = zzeuVar4.zzt();
                                int iZzt3 = zzeuVar4.zzt();
                                i16 = i16;
                                zzeuVar4.zzk(50);
                                int iZzg3 = zzeuVar4.zzg();
                                i11 = i11;
                                int iIntValue = 1701733238;
                                if (i21 == 1701733238) {
                                    Pair pairZzs = zzs(zzeuVar4, i18, i20);
                                    if (pairZzs != null) {
                                        iIntValue = ((Integer) pairZzs.first).intValue();
                                        zzqVarZzb = zzqVar == null ? null : zzqVar.zzb(((zzamq) pairZzs.second).zzb);
                                        zzalkVar3.zza[i16] = (zzamq) pairZzs.second;
                                    } else {
                                        i18 = i18;
                                        zzqVarZzb = zzqVar;
                                    }
                                    zzeuVar4.zzh(iZzg3);
                                    i21 = iIntValue;
                                } else {
                                    i18 = i18;
                                    zzqVarZzb = zzqVar;
                                }
                                if (i21 == 1831958048) {
                                    str = "video/mpeg";
                                } else if (i21 == 1211250227) {
                                    i21 = 1211250227;
                                    str = "video/3gpp";
                                } else {
                                    str = null;
                                }
                                zzq zzqVar2 = zzqVarZzb;
                                String str10 = strZzc;
                                arrayList3 = arrayList3;
                                float fZzH = 1.0f;
                                zzfzVar3 = zzfzVar3;
                                int i22 = i4;
                                int i23 = 8;
                                int i24 = -1;
                                zzgo zzgoVar2 = null;
                                int i25 = 8;
                                int i26 = -1;
                                int iZzc = -1;
                                List listZzj = null;
                                int i27 = -1;
                                int i28 = -1;
                                boolean z12 = false;
                                ByteBuffer byteBufferZzn = null;
                                int i29 = -1;
                                int i30 = -1;
                                String strZzd = null;
                                byte[] bArrCopyOfRange = null;
                                zzald zzaldVarZzr = null;
                                zzalf zzalfVarZzq = null;
                                zzfw zzfwVarZza = null;
                                int i31 = iZzg3;
                                int i32 = -1;
                                while (i31 - i18 < i20) {
                                    zzeuVar4.zzh(i31);
                                    int iZzg4 = zzeuVar4.zzg();
                                    int iZzB9 = zzeuVar4.zzB();
                                    if (iZzB9 != 0) {
                                        i6 = iZzB9;
                                    } else {
                                        if (zzeuVar4.zzg() - i18 == i20) {
                                            break;
                                        }
                                        i6 = 0;
                                    }
                                    zzage.zza(i6 > 0, str9);
                                    int iZzB10 = zzeuVar4.zzB();
                                    if (iZzB10 == 1635148611) {
                                        int i33 = iZzg4 + 8;
                                        zzage.zza(str == null, null);
                                        zzeuVar4.zzh(i33);
                                        zzaff zzaffVarZza = zzaff.zza(zzeuVar4);
                                        listZzj = zzaffVarZza.zza;
                                        zzalkVar3.zzc = zzaffVarZza.zzb;
                                        if (z12) {
                                            z10 = true;
                                        } else {
                                            fZzH = zzaffVarZza.zzk;
                                            z10 = false;
                                        }
                                        String str11 = zzaffVarZza.zzl;
                                        int i34 = zzaffVarZza.zzj;
                                        int i35 = zzaffVarZza.zzg;
                                        int i36 = zzaffVarZza.zzh;
                                        int i37 = zzaffVarZza.zzi;
                                        int i38 = zzaffVarZza.zze;
                                        i23 = zzaffVarZza.zzf;
                                        i26 = i36;
                                        i25 = i38;
                                        iZzc = i37;
                                        z12 = z10;
                                        str5 = str9;
                                        strZzd = str11;
                                        i24 = i35;
                                        zzalkVar = zzalkVar3;
                                        i21 = i21;
                                        str4 = "video/avc";
                                        i28 = i34;
                                    } else if (iZzB10 == 1752589123) {
                                        int i39 = iZzg4 + 8;
                                        zzage.zza(str == null, null);
                                        zzeuVar4.zzh(i39);
                                        zzagu zzaguVarZza = zzagu.zza(zzeuVar4);
                                        listZzj = zzaguVarZza.zza;
                                        zzalkVar3.zzc = zzaguVarZza.zzb;
                                        if (z12) {
                                            z9 = true;
                                        } else {
                                            fZzH = zzaguVarZza.zzl;
                                            z9 = false;
                                        }
                                        int i40 = zzaguVarZza.zzm;
                                        int i41 = zzaguVarZza.zzc;
                                        String str12 = zzaguVarZza.zzn;
                                        int i42 = zzaguVarZza.zzk;
                                        if (i42 == -1) {
                                            i42 = i32;
                                        }
                                        int i43 = zzaguVarZza.zzd;
                                        int i44 = zzaguVarZza.zze;
                                        int i45 = zzaguVarZza.zzh;
                                        int i46 = zzaguVarZza.zzi;
                                        boolean z13 = z9;
                                        int i47 = zzaguVarZza.zzj;
                                        int i48 = zzaguVarZza.zzf;
                                        int i49 = zzaguVarZza.zzg;
                                        i28 = i40;
                                        i24 = i45;
                                        i26 = i46;
                                        iZzc = i47;
                                        str5 = str9;
                                        strZzd = str12;
                                        i30 = i43;
                                        zzalkVar = zzalkVar3;
                                        i21 = i21;
                                        i25 = i48;
                                        str4 = "video/hevc";
                                        i29 = i44;
                                        z12 = z13;
                                        i27 = i41;
                                        i32 = i42;
                                        zzgoVar2 = zzaguVarZza.zzo;
                                        i23 = i49;
                                    } else if (iZzB10 == 1818785347) {
                                        int i50 = iZzg4 + 8;
                                        zzage.zza("video/hevc".equals(str), "lhvC must follow hvcC atom");
                                        if (zzgoVar2 != null) {
                                            z8 = zzgoVar2.zza.size() >= 2;
                                        } else {
                                            z8 = false;
                                            zzgoVar2 = null;
                                        }
                                        zzage.zza(z8, "must have at least two layers");
                                        zzeuVar4.zzh(i50);
                                        zzgoVar2.getClass();
                                        zzagu zzaguVarZzb = zzagu.zzb(zzeuVar4, zzgoVar2);
                                        zzage.zza(zzalkVar3.zzc == zzaguVarZzb.zzb, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                        int i51 = zzaguVarZzb.zzh;
                                        if (i51 != -1) {
                                            zzage.zza(i24 == i51, "colorSpace must be the same for both views");
                                        }
                                        int i52 = zzaguVarZzb.zzi;
                                        if (i52 != -1) {
                                            zzage.zza(i26 == i52, "colorRange must be the same for both views");
                                        }
                                        int i53 = zzaguVarZzb.zzj;
                                        if (i53 != -1) {
                                            zzage.zza(iZzc == i53, "colorTransfer must be the same for both views");
                                        }
                                        zzage.zza(i25 == zzaguVarZzb.zzf, "bitdepthLuma must be the same for both views");
                                        zzage.zza(i23 == zzaguVarZzb.zzg, "bitdepthChroma must be the same for both views");
                                        if (listZzj != null) {
                                            int i54 = zzgwt.zzd;
                                            zzgwq zzgwqVar = new zzgwq();
                                            zzgwqVar.zzh(listZzj);
                                            zzgwqVar.zzh(zzaguVarZzb.zza);
                                            listZzj = zzgwqVar.zzi();
                                        } else {
                                            zzage.zza(false, "initializationData must be already set from hvcC atom");
                                        }
                                        strZzd = zzaguVarZzb.zzn;
                                        str5 = str9;
                                        str4 = "video/mv-hevc";
                                        zzalkVar = zzalkVar3;
                                    } else if (iZzB10 == 1987470147) {
                                        int i55 = iZzg4 + 8;
                                        zzage.zza(str == null, null);
                                        zzeuVar4.zzh(i55);
                                        zzahp zzahpVarZza = zzahp.zza(zzeuVar4);
                                        listZzj = zzahpVarZza.zza;
                                        zzalkVar3.zzc = zzahpVarZza.zzb;
                                        String str13 = zzahpVarZza.zzc;
                                        i25 = zzahpVarZza.zzd;
                                        str4 = "video/vvc";
                                        strZzd = str13;
                                        str5 = str9;
                                        i23 = i25;
                                        zzalkVar = zzalkVar3;
                                        i21 = i21;
                                        i28 = 16;
                                    } else if (iZzB10 == 1986361461) {
                                        zzeuVar4.zzh(iZzg4 + 8);
                                        int iZzg5 = zzeuVar4.zzg();
                                        str4 = str;
                                        zzalg zzalgVar = null;
                                        while (iZzg5 - iZzg4 < i6) {
                                            zzeuVar4.zzh(iZzg5);
                                            int iZzB11 = zzeuVar4.zzB();
                                            zzage.zza(iZzB11 > 0, str9);
                                            zzalk zzalkVar4 = zzalkVar3;
                                            if (zzeuVar4.zzB() == 1702454643) {
                                                zzeuVar4.zzh(iZzg5 + 8);
                                                int iZzg6 = zzeuVar4.zzg();
                                                while (true) {
                                                    if (iZzg6 - iZzg5 >= iZzB11) {
                                                        i10 = iZzB11;
                                                        str9 = str9;
                                                        zzalgVar = null;
                                                        break;
                                                    }
                                                    zzeuVar4.zzh(iZzg6);
                                                    int iZzB12 = zzeuVar4.zzB();
                                                    zzage.zza(iZzB12 > 0, str9);
                                                    i10 = iZzB11;
                                                    if (zzeuVar4.zzB() == 1937011305) {
                                                        zzeuVar4.zzk(4);
                                                        int iZzs = zzeuVar4.zzs();
                                                        zzalgVar = new zzalg(new zzalj(1 == (iZzs & 1), (iZzs & 2) == 2, (iZzs & 8) == 8));
                                                    } else {
                                                        iZzg6 += iZzB12;
                                                        iZzB11 = i10;
                                                    }
                                                }
                                                iZzg5 += i10;
                                                zzalkVar3 = zzalkVar4;
                                                str9 = str9;
                                            } else {
                                                i10 = iZzB11;
                                            }
                                            iZzg5 += i10;
                                            zzalkVar3 = zzalkVar4;
                                            str9 = str9;
                                        }
                                        str5 = str9;
                                        zzalkVar = zzalkVar3;
                                        zzaln zzalnVar = zzalgVar == null ? null : new zzaln(zzalgVar);
                                        if (zzalnVar != null) {
                                            if (zzgoVar2 == null) {
                                                zzgoVar2 = null;
                                            } else if (zzgoVar2.zza.size() >= 2) {
                                                zzage.zza(zzalnVar.zza(), "both eye views must be marked as available");
                                                zzage.zza(!zzalnVar.zzb().zza().zzc(), "for MV-HEVC, eye_views_reversed must be set to false");
                                            }
                                            if (i32 != -1) {
                                                i21 = i21;
                                            } else if (true != zzalnVar.zzb().zza().zzc()) {
                                                i21 = i21;
                                                i32 = 4;
                                            } else {
                                                i32 = 5;
                                            }
                                        }
                                        i7 = i23;
                                        zzgoVar = zzgoVar2;
                                        i8 = i25;
                                        i9 = i26;
                                        i21 = i21;
                                        zzgoVar2 = zzgoVar;
                                        i23 = i7;
                                        i25 = i8;
                                        i26 = i9;
                                    } else {
                                        str4 = str;
                                        str5 = str9;
                                        zzalkVar = zzalkVar3;
                                        if (iZzB10 == 1685480259 || iZzB10 == 1685485123 || iZzB10 == 1685485379) {
                                            i7 = i23;
                                            zzgoVar = zzgoVar2;
                                            i8 = i25;
                                            i9 = i26;
                                            i21 = i21;
                                            zzfwVarZza = zzfw.zza(zzeuVar4);
                                        } else if (iZzB10 == 1987076931) {
                                            int i56 = iZzg4 + 12;
                                            zzage.zza(str4 == null, null);
                                            zzeuVar4.zzh(i56);
                                            byte bZzs = (byte) zzeuVar4.zzs();
                                            byte bZzs2 = (byte) zzeuVar4.zzs();
                                            int iZzs2 = zzeuVar4.zzs();
                                            i25 = iZzs2 >> 4;
                                            int i57 = iZzs2 >> 1;
                                            String str14 = i21 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            if (str14.equals("video/x-vnd.on2.vp9")) {
                                                listZzj = zzdr.zza(bZzs, bZzs2, (byte) i25, (byte) (i57 & 7));
                                            }
                                            int i58 = iZzs2 & 1;
                                            int iZzs3 = zzeuVar4.zzs();
                                            int iZzs4 = zzeuVar4.zzs();
                                            int iZzb = zzi.zzb(iZzs3);
                                            i26 = 1 != i58 ? 2 : 1;
                                            iZzc = zzi.zzc(iZzs4);
                                            str4 = str14;
                                            i23 = i25;
                                            i21 = i21;
                                            i24 = iZzb;
                                        } else if (iZzB10 == 1635135811) {
                                            int i59 = i6 - 8;
                                            byte[] bArr = new byte[i59];
                                            zzeuVar4.zzm(bArr, 0, i59);
                                            listZzj = zzgwt.zzj(bArr);
                                            zzafe zzafeVarZza = zzafe.zza(bArr);
                                            if (zzafeVarZza != null) {
                                                String str15 = zzafeVarZza.zze;
                                                iZzc = zzafeVarZza.zzd;
                                                i26 = zzafeVarZza.zzc;
                                                i24 = zzafeVarZza.zzb;
                                                i25 = zzafeVarZza.zza;
                                                strZzd = str15;
                                                i23 = i25;
                                            }
                                            str4 = "video/av01";
                                        } else if (iZzB10 == 1668050025) {
                                            if (byteBufferZzn == null) {
                                                byteBufferZzn = zzn();
                                            }
                                            ByteBuffer byteBuffer = byteBufferZzn;
                                            byteBuffer.position(21);
                                            byteBuffer.putShort(zzeuVar4.zzv());
                                            byteBuffer.putShort(zzeuVar4.zzv());
                                            byteBufferZzn = byteBuffer;
                                        } else if (iZzB10 == 1835295606) {
                                            if (byteBufferZzn == null) {
                                                byteBufferZzn = zzn();
                                            }
                                            ByteBuffer byteBuffer2 = byteBufferZzn;
                                            short sZzv3 = zzeuVar4.zzv();
                                            short sZzv4 = zzeuVar4.zzv();
                                            short sZzv5 = zzeuVar4.zzv();
                                            short sZzv6 = zzeuVar4.zzv();
                                            zzgo zzgoVar3 = zzgoVar2;
                                            short sZzv7 = zzeuVar4.zzv();
                                            short sZzv8 = zzeuVar4.zzv();
                                            int i60 = i23;
                                            short sZzv9 = zzeuVar4.zzv();
                                            int i61 = i25;
                                            short sZzv10 = zzeuVar4.zzv();
                                            long jZzz2 = zzeuVar4.zzz();
                                            long jZzz3 = zzeuVar4.zzz();
                                            byteBuffer2.position(1);
                                            byteBuffer2.putShort(sZzv7);
                                            byteBuffer2.putShort(sZzv8);
                                            byteBuffer2.putShort(sZzv3);
                                            byteBuffer2.putShort(sZzv4);
                                            byteBuffer2.putShort(sZzv5);
                                            byteBuffer2.putShort(sZzv6);
                                            byteBuffer2.putShort(sZzv9);
                                            byteBuffer2.putShort(sZzv10);
                                            byteBuffer2.putShort((short) (jZzz2 / WorkRequest.MIN_BACKOFF_MILLIS));
                                            byteBuffer2.putShort((short) (jZzz3 / WorkRequest.MIN_BACKOFF_MILLIS));
                                            byteBufferZzn = byteBuffer2;
                                            zzgoVar2 = zzgoVar3;
                                            i23 = i60;
                                            i25 = i61;
                                            i26 = i26;
                                        } else {
                                            i7 = i23;
                                            zzgoVar = zzgoVar2;
                                            i8 = i25;
                                            i9 = i26;
                                            i21 = i21;
                                            if (iZzB10 == 1681012275) {
                                                zzage.zza(str4 == null, null);
                                                strZza = "video/3gpp";
                                            } else if (iZzB10 == 1702061171) {
                                                zzage.zza(str4 == null, null);
                                                zzalfVarZzq = zzq(zzeuVar4, iZzg4);
                                                strZza = zzalfVarZzq.zza();
                                                byte[] bArrZzb = zzalfVarZzq.zzb();
                                                if (bArrZzb != null) {
                                                    listZzj = zzgwt.zzj(bArrZzb);
                                                }
                                            } else {
                                                if (iZzB10 == 1651798644) {
                                                    zzaldVarZzr = zzr(zzeuVar4, iZzg4);
                                                } else if (iZzB10 == 1885434736) {
                                                    zzeuVar4.zzh(iZzg4 + 8);
                                                    fZzH = zzeuVar4.zzH() / zzeuVar4.zzH();
                                                    zzgoVar2 = zzgoVar;
                                                    i23 = i7;
                                                    i25 = i8;
                                                    i26 = i9;
                                                    z12 = true;
                                                } else if (iZzB10 == 1937126244) {
                                                    int i62 = iZzg4 + 8;
                                                    while (true) {
                                                        if (i62 - iZzg4 >= i6) {
                                                            bArrCopyOfRange = null;
                                                            break;
                                                        }
                                                        zzeuVar4.zzh(i62);
                                                        int iZzB13 = zzeuVar4.zzB() + i62;
                                                        if (zzeuVar4.zzB() == 1886547818) {
                                                            bArrCopyOfRange = Arrays.copyOfRange(zzeuVar4.zzi(), i62, iZzB13);
                                                            break;
                                                        }
                                                        i62 = iZzB13;
                                                    }
                                                } else if (iZzB10 == 1936995172) {
                                                    int iZzs5 = zzeuVar4.zzs();
                                                    zzeuVar4.zzk(3);
                                                    if (iZzs5 == 0) {
                                                        int iZzs6 = zzeuVar4.zzs();
                                                        if (iZzs6 == 0) {
                                                            zzgoVar2 = zzgoVar;
                                                            i23 = i7;
                                                            i25 = i8;
                                                            i26 = i9;
                                                            i32 = 0;
                                                        } else if (iZzs6 == 1) {
                                                            zzgoVar2 = zzgoVar;
                                                            i23 = i7;
                                                            i25 = i8;
                                                            i26 = i9;
                                                            i32 = 1;
                                                        } else if (iZzs6 == 2) {
                                                            zzgoVar2 = zzgoVar;
                                                            i23 = i7;
                                                            i25 = i8;
                                                            i26 = i9;
                                                            i32 = 2;
                                                        } else if (iZzs6 == 3) {
                                                            i32 = 3;
                                                            zzgoVar2 = zzgoVar;
                                                            i23 = i7;
                                                            i25 = i8;
                                                            i26 = i9;
                                                        }
                                                    }
                                                } else if (iZzB10 == 1634760259) {
                                                    int i63 = i6 - 12;
                                                    byte[] bArr2 = new byte[i63];
                                                    zzeuVar4.zzh(iZzg4 + 12);
                                                    zzeuVar4.zzm(bArr2, 0, i63);
                                                    strZzd = zzdr.zzd(bArr2);
                                                    listZzj = zzgwt.zzj(bArr2);
                                                    zzi zziVarZzm = zzm(new zzeu(bArr2));
                                                    i25 = zziVarZzm.zzf;
                                                    int i64 = zziVarZzm.zzg;
                                                    int i65 = zziVarZzm.zzb;
                                                    int i66 = zziVarZzm.zzc;
                                                    iZzc = zziVarZzm.zzd;
                                                    i23 = i64;
                                                    i24 = i65;
                                                    i26 = i66;
                                                    str4 = "video/apv";
                                                    zzgoVar2 = zzgoVar;
                                                } else if (iZzB10 == 1668246642) {
                                                    if (i24 == -1) {
                                                        if (iZzc == -1) {
                                                            int iZzB14 = zzeuVar4.zzB();
                                                            if (iZzB14 == 1852009592 || iZzB14 == 1852009571) {
                                                                int iZzt4 = zzeuVar4.zzt();
                                                                int iZzt5 = zzeuVar4.zzt();
                                                                zzeuVar4.zzk(2);
                                                                if (i6 != 19) {
                                                                    z7 = false;
                                                                } else if ((zzeuVar4.zzs() & 128) != 0) {
                                                                    i6 = 19;
                                                                    z7 = true;
                                                                } else {
                                                                    i6 = 19;
                                                                    z7 = false;
                                                                }
                                                                int iZzb2 = zzi.zzb(iZzt4);
                                                                int i67 = true != z7 ? 2 : 1;
                                                                iZzc = zzi.zzc(iZzt5);
                                                                i26 = i67;
                                                                zzgoVar2 = zzgoVar;
                                                                i25 = i8;
                                                                i24 = iZzb2;
                                                                i23 = i7;
                                                            } else {
                                                                zzeh.zzc("BoxParsers", "Unsupported color type: ".concat(zzgb.zze(iZzB14)));
                                                                i24 = -1;
                                                                iZzc = -1;
                                                                zzgoVar2 = zzgoVar;
                                                                i23 = i7;
                                                                i25 = i8;
                                                                i26 = i9;
                                                            }
                                                        } else {
                                                            i24 = -1;
                                                        }
                                                    }
                                                }
                                                zzgoVar2 = zzgoVar;
                                                i23 = i7;
                                                i25 = i8;
                                                i26 = i9;
                                            }
                                            str4 = strZza;
                                            zzgoVar2 = zzgoVar;
                                            i23 = i7;
                                            i25 = i8;
                                            i26 = i9;
                                        }
                                        zzgoVar2 = zzgoVar;
                                        i23 = i7;
                                        i25 = i8;
                                        i26 = i9;
                                    }
                                    i31 += i6;
                                    i20 = i20;
                                    str = str4;
                                    zzalkVar3 = zzalkVar;
                                    i21 = i21;
                                    str9 = str5;
                                }
                                int i68 = i23;
                                String str16 = str;
                                iZzB7 = i20;
                                int i69 = i25;
                                zzalk zzalkVar5 = zzalkVar3;
                                int i70 = i26;
                                if (zzfwVarZza != null) {
                                    str2 = zzfwVarZza.zza;
                                    str3 = "video/dolby-vision";
                                } else {
                                    str2 = strZzd;
                                    str3 = str16;
                                }
                                if (str3 == null) {
                                    strZzc = str10;
                                    i4 = i22;
                                    iZzB = i19;
                                    zzalkVar2 = zzalkVar5;
                                } else {
                                    zzt zztVar = new zzt();
                                    iZzB = i19;
                                    zztVar.zzb(iZzB);
                                    zztVar.zzo(str3);
                                    zztVar.zzk(str2);
                                    zztVar.zzv(iZzt2);
                                    zztVar.zzw(iZzt3);
                                    zztVar.zzx(i30);
                                    zztVar.zzy(i29);
                                    zztVar.zzB(fZzH);
                                    i4 = i22;
                                    zztVar.zzA(i4);
                                    zztVar.zzC(bArrCopyOfRange);
                                    zztVar.zzD(i32);
                                    zztVar.zzr(listZzj);
                                    zztVar.zzq(i28);
                                    zztVar.zzF(i27);
                                    zztVar.zzs(zzqVar2);
                                    strZzc = str10;
                                    zztVar.zze(strZzc);
                                    zzh zzhVar = new zzh();
                                    zzhVar.zza(i24);
                                    zzhVar.zzb(i70);
                                    zzhVar.zzc(iZzc);
                                    zzhVar.zzd(byteBufferZzn != null ? byteBufferZzn.array() : null);
                                    zzhVar.zze(i69);
                                    zzhVar.zzf(i68);
                                    zztVar.zzE(zzhVar.zzg());
                                    if (zzaldVarZzr != null) {
                                        zztVar.zzi(zzhaq.zzb(zzaldVarZzr.zza()));
                                        zztVar.zzj(zzhaq.zzb(zzaldVarZzr.zzb()));
                                    } else if (zzalfVarZzq != null) {
                                        zztVar.zzi(zzhaq.zzb(zzalfVarZzq.zzc()));
                                        zztVar.zzj(zzhaq.zzb(zzalfVarZzq.zzd()));
                                    }
                                    zzalkVar2 = zzalkVar5;
                                    zzalkVar2.zzb = zztVar.zzP();
                                }
                            } else if (iZzB8 == 1836069985 || iZzB8 == 1701733217 || iZzB8 == 1633889587 || iZzB8 == 1700998451 || iZzB8 == 1633889588 || iZzB8 == 1835823201 || iZzB8 == 1685353315 || iZzB8 == 1685353317 || iZzB8 == 1685353320 || iZzB8 == 1685353324 || iZzB8 == 1685353336 || iZzB8 == 1935764850 || iZzB8 == 1935767394 || iZzB8 == 1819304813 || iZzB8 == 1936684916 || iZzB8 == 1953984371 || iZzB8 == 778924082 || iZzB8 == 778924083 || iZzB8 == 1835557169 || iZzB8 == 1835560241 || iZzB8 == 1634492771 || iZzB8 == 1634492791 || iZzB8 == 1970037111 || iZzB8 == 1332770163 || iZzB8 == 1716281667 || iZzB8 == 1767992678 || iZzB8 == 1768973165 || iZzB8 == 1718641517) {
                                sZzv2 = sZzv2;
                                sZzv = sZzv;
                                iZzB6 = iZzB6;
                                int i71 = iZzB;
                                i15 = i15;
                                i17 = i17;
                                j6 = j6;
                                zzalkVar2 = zzalkVar2;
                                zzp(zzeuVar4, iZzB8, i18, iZzB7, i71, strZzc, z2, zzqVar, zzalkVar2, i16);
                                zzeuVar4 = zzeuVar4;
                                i18 = i18;
                                iZzB7 = iZzB7;
                                iZzB = i71;
                                strZzc = strZzc;
                                i16 = i16;
                                arrayList3 = arrayList3;
                                i11 = i11;
                                zzfzVar3 = zzfzVar3;
                                i4 = i4;
                            } else {
                                if (iZzB8 != 1414810956 && iZzB8 != 1954034535 && iZzB8 != 2004251764 && iZzB8 != 1937010800 && iZzB8 != 1664495672 && iZzB8 != 1836070003) {
                                    if (iZzB8 != 1952807028) {
                                        if (iZzB8 == 1835365492) {
                                            zzeuVar4.zzh(i18 + 16);
                                            zzeuVar4.zzM((char) 0);
                                            String strZzM = zzeuVar4.zzM((char) 0);
                                            if (strZzM != null) {
                                                zzt zztVar2 = new zzt();
                                                zztVar2.zzb(iZzB);
                                                zztVar2.zzo(strZzM);
                                                zzalkVar2.zzb = zztVar2.zzP();
                                            }
                                        } else if (iZzB8 == 1667329389) {
                                            zzt zztVar3 = new zzt();
                                            zztVar3.zzb(iZzB);
                                            zztVar3.zzo("application/x-camera-motion");
                                            zzalkVar2.zzb = zztVar3.zzP();
                                        }
                                    }
                                }
                                zzeuVar4.zzh(i18 + 16);
                                long j7 = Long.MAX_VALUE;
                                if (iZzB8 == 1414810956) {
                                    str6 = "application/ttml+xml";
                                } else {
                                    if (iZzB8 == 1954034535) {
                                        int i72 = iZzB7 - 16;
                                        byte[] bArr3 = new byte[i72];
                                        zzeuVar4.zzm(bArr3, 0, i72);
                                        zzgwtVarZzj = zzgwt.zzj(bArr3);
                                        str8 = "application/x-quicktime-tx3g";
                                    } else if (iZzB8 == 2004251764) {
                                        str6 = "application/x-mp4-vtt";
                                    } else if (iZzB8 == 1937010800) {
                                        j7 = 0;
                                        str6 = "application/ttml+xml";
                                    } else if (iZzB8 == 1664495672) {
                                        zzalkVar2.zzd = 1;
                                        str6 = "application/x-mp4-cea-608";
                                    } else if (iZzB8 == 1836070003) {
                                        int iZzg7 = zzeuVar4.zzg();
                                        zzeuVar4.zzk(4);
                                        if (zzeuVar4.zzB() == 1702061171) {
                                            zzalf zzalfVarZzq2 = zzq(zzeuVar4, iZzg7);
                                            if (zzalfVarZzq2.zzb() != null && zzalfVarZzq2.zzb().length == 64) {
                                                String strZzl = zzl(zzalfVarZzq2.zzb(), sZzv, sZzv2);
                                                String str17 = zzfm.zza;
                                                zzgwtVarZzj = zzgwt.zzj(strZzl.getBytes(StandardCharsets.UTF_8));
                                                str7 = "application/vobsub";
                                            }
                                        } else {
                                            zzgwtVarZzj = null;
                                            str7 = null;
                                        }
                                        str8 = str7;
                                    } else {
                                        str6 = "text/x-unknown";
                                    }
                                    zzgwtVar = zzgwtVarZzj;
                                    str6 = str8;
                                    j3 = Long.MAX_VALUE;
                                    if (str6 != null) {
                                        zzeu zzeuVar5 = zzeuVar4;
                                        zzt zztVar4 = new zzt();
                                        zztVar4.zzb(iZzB);
                                        zztVar4.zzo(str6);
                                        zztVar4.zze(strZzc);
                                        zztVar4.zzt(j3);
                                        zztVar4.zzr(zzgwtVar);
                                        zzalkVar2.zzb = zztVar4.zzP();
                                        zzalkVar2 = zzalkVar2;
                                        sZzv2 = sZzv2;
                                        sZzv = sZzv;
                                        strZzc = strZzc;
                                        iZzB6 = iZzB6;
                                        i16 = i16;
                                        iZzB = iZzB;
                                        i11 = i11;
                                        zzfzVar3 = zzfzVar3;
                                        i4 = i4;
                                        i15 = i15;
                                        i17 = i17;
                                        iZzB7 = iZzB7;
                                        j6 = j6;
                                        zzeuVar4 = zzeuVar5;
                                        arrayList3 = arrayList3;
                                    } else {
                                        sZzv2 = sZzv2;
                                        sZzv = sZzv;
                                        strZzc = strZzc;
                                        iZzB6 = iZzB6;
                                        i16 = i16;
                                        iZzB = iZzB;
                                        i11 = i11;
                                        zzfzVar3 = zzfzVar3;
                                        i4 = i4;
                                        i15 = i15;
                                        i17 = i17;
                                        iZzB7 = iZzB7;
                                        j6 = j6;
                                    }
                                }
                                j3 = j7;
                                zzgwtVar = null;
                                if (str6 != null) {
                                    zzeu zzeuVar6 = zzeuVar4;
                                    zzt zztVar5 = new zzt();
                                    zztVar5.zzb(iZzB);
                                    zztVar5.zzo(str6);
                                    zztVar5.zze(strZzc);
                                    zztVar5.zzt(j3);
                                    zztVar5.zzr(zzgwtVar);
                                    zzalkVar2.zzb = zztVar5.zzP();
                                    zzalkVar2 = zzalkVar2;
                                    sZzv2 = sZzv2;
                                    sZzv = sZzv;
                                    strZzc = strZzc;
                                    iZzB6 = iZzB6;
                                    i16 = i16;
                                    iZzB = iZzB;
                                    i11 = i11;
                                    zzfzVar3 = zzfzVar3;
                                    i4 = i4;
                                    i15 = i15;
                                    i17 = i17;
                                    iZzB7 = iZzB7;
                                    j6 = j6;
                                    zzeuVar4 = zzeuVar6;
                                    arrayList3 = arrayList3;
                                } else {
                                    sZzv2 = sZzv2;
                                    sZzv = sZzv;
                                    strZzc = strZzc;
                                    iZzB6 = iZzB6;
                                    i16 = i16;
                                    iZzB = iZzB;
                                    i11 = i11;
                                    zzfzVar3 = zzfzVar3;
                                    i4 = i4;
                                    i15 = i15;
                                    i17 = i17;
                                    iZzB7 = iZzB7;
                                    j6 = j6;
                                }
                            }
                            zzeuVar4.zzh(i18 + iZzB7);
                            i16++;
                            strZzc = strZzc;
                            zzeuVar4 = zzeuVar4;
                            i4 = i4;
                            iZzB = iZzB;
                            zzalkVar2 = zzalkVar2;
                            sZzv = sZzv;
                            sZzv2 = sZzv2;
                            iZzB6 = iZzB6;
                            arrayList3 = arrayList3;
                            i11 = i11;
                            zzfzVar3 = zzfzVar3;
                            i = i17;
                            i15 = i15;
                            jZzw = j6;
                        }
                        zzalk zzalkVar6 = zzalkVar2;
                        int i73 = i;
                        long j8 = jZzw;
                        int i74 = iZzB;
                        i5 = i11;
                        int i75 = i15;
                        int iZzB15 = -1;
                        arrayList = arrayList3;
                        zzfzVar2 = zzfzVar3;
                        zzfz zzfzVarZzd5 = zzfzVar2.zzd(1953654118);
                        if (zzfzVarZzd5 != null && (zzgaVarZzc = zzfzVarZzd5.zzc(1667785072)) != null) {
                            zzeu zzeuVar7 = zzgaVarZzc.zza;
                            zzeuVar7.zzh(8);
                            if (zzeuVar7.zzd() >= 4) {
                                iZzB15 = zzeuVar7.zzB();
                            }
                        }
                        if (z || (zzfzVarZzd = zzfzVar2.zzd(1701082227)) == null || (pairZzo = zzo(zzfzVarZzd)) == null) {
                            zzhaoVar = null;
                            zzhaoVar2 = null;
                        } else {
                            zzhaoVar2 = (zzhao) pairZzo.first;
                            zzhaoVar = (zzhao) pairZzo.second;
                        }
                        zzv zzvVarZzP = zzalkVar6.zzb;
                        if (zzvVarZzP == null) {
                            zzampVarZzo = null;
                        } else {
                            if (i75 != 0) {
                                zzfy zzfyVar = new zzfy(i75);
                                zzt zztVarZza = zzvVarZzP.zza();
                                zzap zzapVar2 = zzvVarZzP.zzl;
                                if (zzapVar2 != null) {
                                    z6 = true;
                                    zzapVar = zzapVar2.zzg(zzfyVar);
                                } else {
                                    z6 = true;
                                    zzapVar = new zzap(-9223372036854775807L, zzfyVar);
                                }
                                zztVarZza.zzl(zzapVar);
                                zzvVarZzP = zztVarZza.zzP();
                            } else {
                                z6 = true;
                            }
                            boolean zEquals = Objects.equals(zzvVarZzP.zzp, "text/x-unknown") ^ z6;
                            zzamo zzamoVar = new zzamo();
                            zzamoVar.zza(i74);
                            zzamoVar.zzb(i73);
                            zzamoVar.zzc(zzalhVarZzk.zza());
                            zzamoVar.zzd(j2);
                            zzamoVar.zze(j8);
                            zzamoVar.zzf(zzalhVarZzk.zzb());
                            zzamoVar.zzg(zzvVarZzP);
                            zzamoVar.zzh(zzalkVar6.zzd);
                            zzamoVar.zzi(zzalkVar6.zza);
                            zzamoVar.zzj(zzalkVar6.zzc);
                            zzamoVar.zzk(zzhaoVar2);
                            zzamoVar.zzl(zzhaoVar);
                            zzamoVar.zzm(zEquals);
                            zzamoVar.zzn(iZzB15);
                            zzampVarZzo = zzamoVar.zzo();
                        }
                    }
                }
                zzamp zzampVar = (zzamp) zzgtiVar.apply(zzampVarZzo);
                if (zzampVar != null) {
                    zzfz zzfzVarZzd6 = zzfzVar2.zzd(1835297121);
                    zzfzVarZzd6.getClass();
                    zzfz zzfzVarZzd7 = zzfzVarZzd6.zzd(1835626086);
                    zzfzVarZzd7.getClass();
                    zzfz zzfzVarZzd8 = zzfzVarZzd7.zzd(1937007212);
                    zzfzVarZzd8.getClass();
                    zzams zzamsVarZzg = zzg(zzampVar, zzfzVarZzd8, zzagtVar, false);
                    arrayList2 = arrayList;
                    arrayList2.add(zzamsVarZzg);
                } else {
                    arrayList2 = arrayList;
                }
                i11 = i5 + 1;
                arrayList3 = arrayList2;
            }
            i11 = i5 + 1;
            arrayList3 = arrayList2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    public static zzap zzc(zzga zzgaVar) {
        int iZzF;
        zzeu zzeuVar = zzgaVar.zza;
        zzeuVar.zzh(8);
        zzap zzapVar = new zzap(-9223372036854775807L, new zzao[0]);
        while (zzeuVar.zzd() >= 8) {
            int iZzg = zzeuVar.zzg();
            int iZzB = zzeuVar.zzB() + iZzg;
            int iZzB2 = zzeuVar.zzB();
            zzap zzapVar2 = null;
            if (iZzB2 == 1835365473) {
                zzeuVar.zzh(iZzg);
                zzeuVar.zzk(8);
                zzf(zzeuVar);
                while (zzeuVar.zzg() < iZzB) {
                    int iZzg2 = zzeuVar.zzg();
                    int iZzB3 = zzeuVar.zzB() + iZzg2;
                    if (zzeuVar.zzB() == 1768715124) {
                        zzeuVar.zzh(iZzg2);
                        zzeuVar.zzk(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzeuVar.zzg() < iZzB3) {
                            zzao zzaoVarZzc = zzaly.zzc(zzeuVar);
                            if (zzaoVarZzc != null) {
                                arrayList.add(zzaoVarZzc);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzapVar2 = new zzap(arrayList);
                            break;
                        }
                        break;
                    }
                    zzeuVar.zzh(iZzB3);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == 1936553057) {
                zzeuVar.zzh(iZzg);
                zzeuVar.zzk(12);
                while (zzeuVar.zzg() < iZzB) {
                    int iZzg3 = zzeuVar.zzg();
                    int iZzB4 = zzeuVar.zzB();
                    if (zzeuVar.zzB() == 1935766900) {
                        if (iZzB4 < 16) {
                            break;
                        }
                        zzeuVar.zzk(4);
                        int i = -1;
                        int i2 = 0;
                        for (int i3 = 0; i3 < 2; i3++) {
                            int iZzs = zzeuVar.zzs();
                            int iZzs2 = zzeuVar.zzs();
                            if (iZzs == 0) {
                                i = iZzs2;
                            } else if (iZzs == 1) {
                                i2 = iZzs2;
                            }
                        }
                        if (i == 12) {
                            iZzF = 240;
                        } else if (i == 13) {
                            iZzF = 120;
                        } else if (i == 21 && zzeuVar.zzd() >= 8 && zzeuVar.zzg() + 8 <= iZzB) {
                            int iZzB5 = zzeuVar.zzB();
                            int iZzB6 = zzeuVar.zzB();
                            if (iZzB5 < 12 || iZzB6 != 1936877170) {
                                iZzF = -2147483647;
                            } else {
                                iZzF = zzeuVar.zzF();
                            }
                        } else {
                            iZzF = -2147483647;
                        }
                        if (iZzF == -2147483647) {
                            break;
                        }
                        zzapVar2 = new zzap(-9223372036854775807L, new zzakb(iZzF, i2));
                        break;
                    }
                    zzeuVar.zzh(iZzg3 + iZzB4);
                }
                zzapVar = zzapVar.zzf(zzapVar2);
            } else if (iZzB2 == -1451722374) {
                zzapVar = zzapVar.zzf(zzi(zzeuVar));
            } else if (iZzB2 == 1667788908) {
                zzapVar = zzapVar.zzf(zzh(zzeuVar));
            }
            zzeuVar.zzh(iZzB);
        }
        return zzapVar;
    }

    public static zzgd zzd(zzeu zzeuVar) {
        long jZzD;
        long jZzD2;
        zzeuVar.zzh(8);
        if (zza(zzeuVar.zzB()) == 0) {
            jZzD = zzeuVar.zzz();
            jZzD2 = zzeuVar.zzz();
        } else {
            jZzD = zzeuVar.zzD();
            jZzD2 = zzeuVar.zzD();
        }
        return new zzgd(jZzD, jZzD2, zzeuVar.zzz());
    }

    public static zzap zze(zzfz zzfzVar) {
        zzfx zzfxVar;
        zzga zzgaVarZzc = zzfzVar.zzc(1751411826);
        zzga zzgaVarZzc2 = zzfzVar.zzc(1801812339);
        zzga zzgaVarZzc3 = zzfzVar.zzc(1768715124);
        if (zzgaVarZzc != null && zzgaVarZzc2 != null && zzgaVarZzc3 != null && zzj(zzgaVarZzc.zza) == 1835299937) {
            zzeu zzeuVar = zzgaVarZzc2.zza;
            zzeuVar.zzh(12);
            int iZzB = zzeuVar.zzB();
            String[] strArr = new String[iZzB];
            for (int i = 0; i < iZzB; i++) {
                int iZzB2 = zzeuVar.zzB();
                zzeuVar.zzk(4);
                strArr[i] = zzeuVar.zzK(iZzB2 - 8, StandardCharsets.UTF_8);
            }
            zzeu zzeuVar2 = zzgaVarZzc3.zza;
            zzeuVar2.zzh(8);
            ArrayList arrayList = new ArrayList();
            while (zzeuVar2.zzd() > 8) {
                int iZzg = zzeuVar2.zzg() + zzeuVar2.zzB();
                int iZzB3 = zzeuVar2.zzB() - 1;
                if (iZzB3 < 0 || iZzB3 >= iZzB) {
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzB3).length() + 41);
                    sb.append("Skipped metadata with unknown key index: ");
                    sb.append(iZzB3);
                    zzeh.zzc("BoxParsers", sb.toString());
                } else {
                    String str = strArr[iZzB3];
                    while (true) {
                        int iZzg2 = zzeuVar2.zzg();
                        if (iZzg2 < iZzg) {
                            int iZzB4 = zzeuVar2.zzB();
                            if (zzeuVar2.zzB() == 1684108385) {
                                int iZzB5 = zzeuVar2.zzB();
                                int iZzB6 = zzeuVar2.zzB();
                                int i2 = iZzB4 - 16;
                                byte[] bArr = new byte[i2];
                                zzeuVar2.zzm(bArr, 0, i2);
                                try {
                                    zzfxVar = new zzfx(str, bArr, iZzB6, iZzB5);
                                    break;
                                } catch (Exception unused) {
                                    String.valueOf(str);
                                    zzeh.zzc("MetadataUtil", "Failed to parse metadata entry with key: ".concat(String.valueOf(str)));
                                    zzfxVar = null;
                                    break;
                                }
                            }
                            zzeuVar2.zzh(iZzg2 + iZzB4);
                        }
                        zzfxVar = null;
                        break;
                    }
                    if (zzfxVar != null) {
                        arrayList.add(zzfxVar);
                    }
                }
                zzeuVar2.zzh(iZzg);
            }
            if (!arrayList.isEmpty()) {
                return new zzap(arrayList);
            }
        }
        return null;
    }

    public static void zzf(zzeu zzeuVar) {
        int iZzg = zzeuVar.zzg();
        zzeuVar.zzk(4);
        if (zzeuVar.zzB() != 1751411826) {
            iZzg += 4;
        }
        zzeuVar.zzh(iZzg);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0290  */
    /* JADX WARN: Code duplicated, block: B:106:0x029d  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d8 A[DONT_INVERT, LOOP:14: B:116:0x02d8->B:120:0x02e2, LOOP_START, PHI: r33
      0x02d8: PHI (r33v3 int) = (r33v1 int), (r33v4 int) binds: [B:115:0x02d6, B:120:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:117:0x02da  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e2 A[LOOP:14: B:116:0x02d8->B:120:0x02e2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x02e8 A[EDGE_INSN: B:121:0x02e8->B:122:0x02ea BREAK  A[LOOP:14: B:116:0x02d8->B:120:0x02e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x02ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x02ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x02f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:129:0x0301  */
    /* JADX WARN: Code duplicated, block: B:130:0x030b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0315  */
    /* JADX WARN: Code duplicated, block: B:132:0x0320  */
    /* JADX WARN: Code duplicated, block: B:133:0x032c  */
    /* JADX WARN: Code duplicated, block: B:135:0x033b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0394  */
    /* JADX WARN: Code duplicated, block: B:139:0x0397  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:151:0x0439  */
    /* JADX WARN: Code duplicated, block: B:153:0x0446  */
    /* JADX WARN: Code duplicated, block: B:180:0x050e  */
    /* JADX WARN: Code duplicated, block: B:193:0x056f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0571  */
    /* JADX WARN: Code duplicated, block: B:198:0x0592  */
    /* JADX WARN: Code duplicated, block: B:200:0x059e  */
    /* JADX WARN: Code duplicated, block: B:203:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:205:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:206:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:218:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:220:0x0601  */
    /* JADX WARN: Code duplicated, block: B:226:0x0616  */
    /* JADX WARN: Code duplicated, block: B:229:0x061e  */
    /* JADX WARN: Code duplicated, block: B:230:0x0620  */
    /* JADX WARN: Code duplicated, block: B:232:0x0626  */
    /* JADX WARN: Code duplicated, block: B:236:0x0642  */
    /* JADX WARN: Code duplicated, block: B:237:0x0644  */
    /* JADX WARN: Code duplicated, block: B:240:0x0649  */
    /* JADX WARN: Code duplicated, block: B:241:0x064c  */
    /* JADX WARN: Code duplicated, block: B:243:0x064f  */
    /* JADX WARN: Code duplicated, block: B:244:0x0652  */
    /* JADX WARN: Code duplicated, block: B:247:0x0656  */
    /* JADX WARN: Code duplicated, block: B:249:0x065a  */
    /* JADX WARN: Code duplicated, block: B:250:0x065d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0660  */
    /* JADX WARN: Code duplicated, block: B:253:0x0666  */
    /* JADX WARN: Code duplicated, block: B:257:0x0676  */
    /* JADX WARN: Code duplicated, block: B:259:0x0684  */
    /* JADX WARN: Code duplicated, block: B:262:0x0693  */
    /* JADX WARN: Code duplicated, block: B:264:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:265:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:280:0x070f  */
    /* JADX WARN: Code duplicated, block: B:294:0x05df A[EDGE_INSN: B:294:0x05df->B:210:0x05df BREAK  A[LOOP:6: B:201:0x05c8->B:209:0x05dc], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x0146  */
    /* JADX WARN: Code duplicated, block: B:63:0x0152 A[LOOP:0: B:61:0x014c->B:63:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0165 A[LOOP:1: B:65:0x0163->B:66:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0188  */
    /* JADX WARN: Code duplicated, block: B:71:0x019c A[LOOP:3: B:70:0x019a->B:71:0x019c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0211  */
    /* JADX WARN: Code duplicated, block: B:80:0x0217  */
    /* JADX WARN: Code duplicated, block: B:82:0x021d A[LOOP:12: B:79:0x0215->B:82:0x021d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x024f A[ADDED_TO_REGION, LOOP:13: B:90:0x024f->B:92:0x0253, LOOP_START, PHI: r11 r23 r33
      0x024f: PHI (r11v12 int) = (r11v2 int), (r11v13 int) binds: [B:88:0x024c, B:92:0x0253] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r23v6 int) = (r23v1 int), (r23v10 int) binds: [B:88:0x024c, B:92:0x0253] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r33v6 int) = (r33v1 int), (r33v7 int) binds: [B:88:0x024c, B:92:0x0253] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0253 A[LOOP:13: B:90:0x024f->B:92:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x026f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r26v18 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r28v3, types: [int[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v19 */
    public static zzams zzg(zzamp zzampVar, zzfz zzfzVar, zzagt zzagtVar, boolean z) throws zzat {
        zzali zzalmVar;
        boolean z2;
        int iZzH;
        int iZzH2;
        int iZzH3;
        char c;
        int i;
        boolean z3;
        ArrayList arrayList;
        ?? r30;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        zzeu zzeuVar;
        ?? r0;
        int i2;
        int iZzH4;
        long j;
        long j2;
        long j3;
        int i3;
        int iZzH5;
        int iZzH6;
        int i4;
        int iZzB;
        zzali zzaliVar;
        int i5;
        int i6;
        int i7;
        int iZzB2;
        long[] jArr3;
        long[] jArrCopyOf;
        int[] iArr2;
        ?? CopyOf;
        ?? r15;
        long j4;
        char c2;
        int i8;
        int i9;
        int i10;
        char c3;
        int i11;
        int i12;
        long[] jArr4;
        long j5;
        String str;
        long j6;
        ?? r26;
        int i13;
        ?? r27;
        int i14;
        int iZzc;
        int i15;
        boolean zZza;
        long j7;
        int[] iArr3;
        ?? r28;
        int i16;
        long j8;
        long j9;
        long jZzw;
        int[] iArrZzf;
        zzhao zzhaoVar;
        long j10;
        long j11;
        long j12;
        long[] jArr5;
        int i17;
        boolean z4;
        int[] iArr4;
        int[] iArr5;
        zzhao zzhaoVar2;
        int i18;
        int i19;
        boolean z5;
        int i20;
        int[] iArr6;
        ArrayList arrayList2;
        int i21;
        boolean z6;
        boolean z7;
        long[] jArr6;
        int[] iArr7;
        ?? r9;
        ArrayList arrayList3;
        long[] jArr7;
        int i22;
        boolean z8;
        long jZzc;
        long jZzc2;
        int i23;
        int i24;
        long[] jArr8;
        int i25;
        long jZzw2;
        boolean z9;
        int[] iArr8;
        long jZzc3;
        int i26;
        long jZzw3;
        int iZzq;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z10;
        boolean z11;
        int length;
        long jZzw4;
        int i31;
        long[] jArr9;
        int[] iArr9;
        long j13;
        int i32;
        int i33;
        int i34;
        long[] jArr10;
        int[] iArr10;
        int i35;
        int i36;
        int i37;
        int i38;
        long j14;
        int iMax;
        int i39;
        int i40;
        zzamp zzampVarZzo = zzampVar;
        zzga zzgaVarZzc = zzfzVar.zzc(1937011578);
        if (zzgaVarZzc != null) {
            zzalmVar = new zzall(zzgaVarZzc, zzampVarZzo.zzg);
        } else {
            zzga zzgaVarZzc2 = zzfzVar.zzc(1937013298);
            if (zzgaVarZzc2 == null) {
                throw zzat.zzb("Track has no sample table size information", null);
            }
            zzalmVar = new zzalm(zzgaVarZzc2);
        }
        int iZza = zzalmVar.zza();
        if (iZza == 0) {
            return new zzams(zzampVarZzo, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
        }
        if (zzampVarZzo.zzb == 2) {
            long j15 = zzampVarZzo.zzf;
            if (j15 > 0) {
                zzt zztVarZza = zzampVarZzo.zzg.zza();
                zztVarZza.zzz(iZza / (j15 / 1000000.0f));
                zzv zzvVarZzP = zztVarZza.zzP();
                zzamo zzamoVar = new zzamo(zzampVarZzo, null);
                zzamoVar.zzg(zzvVarZzP);
                zzampVarZzo = zzamoVar.zzo();
            }
        }
        zzga zzgaVarZzc3 = zzfzVar.zzc(1937007471);
        if (zzgaVarZzc3 == null) {
            zzgaVarZzc3 = zzfzVar.zzc(1668232756);
            zzgaVarZzc3.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        zzga zzgaVarZzc4 = zzfzVar.zzc(1937011555);
        zzgaVarZzc4.getClass();
        zzeu zzeuVar2 = zzgaVarZzc4.zza;
        zzga zzgaVarZzc5 = zzfzVar.zzc(1937011827);
        zzgaVarZzc5.getClass();
        zzeu zzeuVar3 = zzgaVarZzc5.zza;
        zzga zzgaVarZzc6 = zzfzVar.zzc(1937011571);
        zzeu zzeuVar4 = zzgaVarZzc6 != null ? zzgaVarZzc6.zza : null;
        zzga zzgaVarZzc7 = zzfzVar.zzc(1668576371);
        zzeu zzeuVar5 = zzgaVarZzc7 != null ? zzgaVarZzc7.zza : null;
        zzale zzaleVar = new zzale(zzeuVar2, zzgaVarZzc3.zza, z2);
        zzeuVar3.zzh(12);
        int iZzH7 = zzeuVar3.zzH() - 1;
        int iZzH8 = zzeuVar3.zzH();
        int iZzH9 = zzeuVar3.zzH();
        if (zzeuVar5 != null) {
            zzeuVar5.zzh(12);
            iZzH = zzeuVar5.zzH();
        } else {
            iZzH = 0;
        }
        if (zzeuVar4 != null) {
            zzeuVar4.zzh(12);
            iZzH3 = zzeuVar4.zzH();
            if (iZzH3 > 0) {
                iZzH2 = zzeuVar4.zzH() - 1;
            } else {
                zzeuVar4 = null;
                iZzH2 = -1;
            }
        } else {
            iZzH2 = -1;
            iZzH3 = 0;
        }
        int iZzb = zzalmVar.zzb();
        zzv zzvVar = zzampVarZzo.zzg;
        if (iZzb != -1) {
            String str2 = zzvVar.zzp;
            c = 1;
            if (("audio/raw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/g711-alaw".equals(str2)) && iZzH7 == 0) {
                z3 = iZzH == 0 && iZzH3 == 0;
                i = 0;
            }
            arrayList = new ArrayList();
            if (zzeuVar4 == null) {
                r30 = c;
            } else {
                r30 = 0;
            }
            if (z3) {
                i31 = zzaleVar.zza;
                jArr9 = new long[i31];
                iArr9 = new int[i31];
                while (zzaleVar.zza()) {
                    int i41 = zzaleVar.zzb;
                    jArr9[i41] = zzaleVar.zzd;
                    iArr9[i41] = zzaleVar.zzc;
                }
                j13 = iZzH9;
                i32 = 8192 / iZzb;
                i34 = 0;
                for (i33 = 0; i33 < i31; i33++) {
                    int i42 = iArr9[i33];
                    String str3 = zzfm.zza;
                    i34 += ((i42 + i32) - 1) / i32;
                }
                jArr10 = new long[i34];
                iArr2 = new int[i34];
                jArr4 = new long[i34];
                iArr10 = new int[i34];
                i35 = 0;
                i36 = 0;
                i37 = 0;
                i7 = 0;
                i38 = 0;
                while (i35 < i31) {
                    int i43 = iArr9[i35];
                    j14 = jArr9[i35];
                    int i44 = i38;
                    int i45 = i31;
                    iMax = i7;
                    i39 = i44;
                    int i46 = i35;
                    i40 = i43;
                    while (i40 > 0) {
                        int iMin = Math.min(i32, i40);
                        jArr10[i39] = j14;
                        int i47 = i40;
                        int i48 = iZzb * iMin;
                        iArr2[i39] = i48;
                        iMax = Math.max(iMax, i48);
                        jArr4[i39] = ((long) i36) * j13;
                        iArr10[i39] = c;
                        j14 += (long) iArr2[i39];
                        i36 += iMin;
                        i39++;
                        i37 += i48;
                        i40 = i47 - iMin;
                        i32 = i32;
                    }
                    int i49 = i32;
                    i35 = i46 + 1;
                    int i50 = i39;
                    i7 = iMax;
                    i31 = i45;
                    i38 = i50;
                    i32 = i49;
                }
                j4 = j13 * ((long) i36);
                j5 = i37;
                jArr3 = jArr10;
                i12 = i34;
                r15 = iArr10;
            } else {
                jArr = new long[iZza];
                iArr = new int[iZza];
                jArr2 = new long[iZza];
                zzeuVar = zzeuVar5;
                r0 = new int[iZza];
                i2 = iZzH3;
                iZzH4 = iZzH8;
                j = 0;
                j2 = 0;
                j3 = 0;
                i3 = iZzH;
                iZzH5 = iZzH2;
                iZzH6 = 0;
                i4 = 0;
                iZzB = iZzH9;
                zzaliVar = zzalmVar;
                i5 = i;
                i6 = 0;
                i7 = 0;
                iZzB2 = 0;
                while (true) {
                    if (i6 < iZza) {
                        jArr3 = jArr;
                        jArrCopyOf = jArr2;
                        iArr2 = iArr;
                        CopyOf = r0;
                        break;
                    }
                    j6 = j;
                    r26 = c;
                    while (true) {
                        if (i4 != 0) {
                            i13 = i4;
                            r27 = r26;
                            break;
                        }
                        zZza = zzaleVar.zza();
                        if (zZza) {
                            i13 = 0;
                            r27 = zZza;
                            break;
                        }
                        j6 = zzaleVar.zzd;
                        i4 = zzaleVar.zzc;
                        iZza = iZza;
                        r26 = zZza;
                    }
                    i14 = iZza;
                    if (r27 == 0) {
                        zzeh.zzc("BoxParsers", "Unexpected end of chunk data");
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr, i6);
                        int[] iArrCopyOf = Arrays.copyOf(iArr, i6);
                        jArrCopyOf = Arrays.copyOf(jArr2, i6);
                        jArr3 = jArrCopyOf2;
                        iArr2 = iArrCopyOf;
                        iZza = i6;
                        CopyOf = Arrays.copyOf((int[]) r0, i6);
                        break;
                    }
                    if (zzeuVar != null) {
                        while (iZzH6 == 0) {
                            if (i3 > 0) {
                                iZzH6 = 0;
                                break;
                            }
                            i3--;
                            iZzH6 = zzeuVar.zzH();
                            iZzB2 = zzeuVar.zzB();
                        }
                        iZzH6--;
                    }
                    iZzc = zzaliVar.zzc();
                    int[] iArr11 = iArr;
                    zzale zzaleVar2 = zzaleVar;
                    long j16 = iZzc;
                    j3 += j16;
                    if (iZzc > i7) {
                        i7 = iZzc;
                    }
                    jArr[i6] = j6;
                    iArr11[i6] = iZzc;
                    int i51 = i13;
                    jArr2[i6] = j2 + ((long) iZzB2);
                    r0[i6] = r30;
                    if (i6 == iZzH5) {
                        r0[i6] = c;
                        arrayList.add(Integer.valueOf(i6));
                    }
                    if (zzeuVar4 != null && i6 == iZzH5) {
                        i15 = i2 - 1;
                        if (i15 > 0) {
                            i2 = i15;
                            iZzH5 = zzeuVar4.zzH() - 1;
                        } else {
                            i2 = i15;
                        }
                    }
                    j2 += (long) iZzB;
                    iZzH4--;
                    if (iZzH4 != 0) {
                        if (i5 > 0) {
                            i5--;
                            iZzH4 = zzeuVar3.zzH();
                            iZzB = zzeuVar3.zzB();
                        } else {
                            iZzH4 = 0;
                        }
                    }
                    long j17 = j6 + j16;
                    i4 = i51 - 1;
                    i6++;
                    zzaleVar = zzaleVar2;
                    iArr = iArr11;
                    iZza = i14;
                    j = j17;
                }
                r15 = CopyOf;
                j4 = j2 + ((long) iZzB2);
                if (zzeuVar != null) {
                    c2 = c;
                    break;
                }
                while (true) {
                    if (i3 > 0) {
                        c2 = c;
                        break;
                    }
                    if (zzeuVar.zzH() != 0) {
                        c2 = 0;
                        break;
                    }
                    zzeuVar.zzB();
                    i3--;
                }
                if (i2 == 0) {
                    if (iZzH4 == 0) {
                        i8 = i5;
                        i9 = i4;
                        i10 = iZzH4;
                    } else if (i4 == 0) {
                        i8 = i5;
                        i9 = i4;
                        i10 = 0;
                    } else if (i5 == 0) {
                        if (iZzH6 == 0) {
                            i10 = 0;
                            i9 = 0;
                            i8 = 0;
                        } else if (c2 == 0) {
                            iZza = iZza;
                            jArrCopyOf = jArrCopyOf;
                            i11 = 0;
                            i10 = 0;
                            c3 = 0;
                            i9 = 0;
                            i8 = 0;
                            iZzH6 = 0;
                        } else {
                            iZza = iZza;
                            jArrCopyOf = jArrCopyOf;
                        }
                        i12 = iZza;
                        jArr4 = jArrCopyOf;
                        j5 = j3;
                    } else {
                        i8 = i5;
                        i10 = 0;
                        i9 = 0;
                    }
                    c3 = c2;
                    i11 = 0;
                } else {
                    iZza = iZza;
                    jArrCopyOf = jArrCopyOf;
                    i8 = i5;
                    iZzH6 = iZzH6;
                    i9 = i4;
                    i10 = iZzH4;
                    c3 = c2;
                    i11 = i2;
                }
                int i52 = zzampVarZzo.zza;
                int length2 = String.valueOf(i52).length() + 66 + String.valueOf(i11).length() + 35 + String.valueOf(i10).length() + 26 + String.valueOf(i9).length() + 33 + String.valueOf(i8).length() + 36;
                int length3 = String.valueOf(iZzH6).length();
                if (c != c3) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                StringBuilder sb = new StringBuilder(length2 + length3 + str.length());
                sb.append("Inconsistent stbl box for track ");
                sb.append(i52);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i11);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i10);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i9);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i8);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(iZzH6);
                sb.append(str);
                zzeh.zzc("BoxParsers", sb.toString());
                i12 = iZza;
                jArr4 = jArrCopyOf;
                j5 = j3;
            }
            j7 = j4;
            iArr3 = iArr2;
            r28 = r15;
            i16 = i7;
            j8 = zzampVarZzo.zzf;
            if (j8 > 0) {
                jZzw4 = zzfm.zzw(j5 * 8, 1000000L, j8, RoundingMode.HALF_DOWN);
                if (jZzw4 > 0 && jZzw4 < 2147483647L) {
                    zzt zztVarZza2 = zzvVar.zza();
                    zztVarZza2.zzi((int) jZzw4);
                    zzv zzvVarZzP2 = zztVarZza2.zzP();
                    zzamo zzamoVar2 = new zzamo(zzampVarZzo, null);
                    zzamoVar2.zzg(zzvVarZzP2);
                    zzampVarZzo = zzamoVar2.zzo();
                }
            }
            j9 = zzampVarZzo.zzc;
            jZzw = zzfm.zzw(j7, 1000000L, j9, RoundingMode.DOWN);
            iArrZzf = zzhaq.zzf(arrayList);
            zzhaoVar = zzampVarZzo.zzi;
            if (zzhaoVar == null) {
                zzfm.zzx(jArr4, 1000000L, j9);
                return new zzams(zzampVarZzo, jArr3, iArr3, i16, jArr4, r28, iArrZzf, r30, jZzw, i12);
            }
            if (zzhaoVar.zzb() == 1 || zzampVarZzo.zzb != 1 || (length = jArr4.length) < 2) {
                j10 = j7;
                j11 = j9;
            } else {
                zzhao zzhaoVar3 = zzampVarZzo.zzj;
                zzhaoVar3.getClass();
                long jZzc4 = zzhaoVar3.zzc(0);
                long jZzc5 = zzhaoVar.zzc(0);
                long j18 = zzampVarZzo.zzd;
                long jZzw5 = jZzc4 + zzfm.zzw(jZzc5, j9, j18, RoundingMode.DOWN);
                int i53 = length - 1;
                int iMax2 = Math.max(0, Math.min(4, i53));
                int iMax3 = Math.max(0, Math.min(length - 4, i53));
                if (jArr4[0] > jZzc4 || jZzc4 >= jArr4[iMax2] || jArr4[iMax3] >= jZzw5 || jZzw5 > 2 + j7) {
                    j10 = j7;
                    j11 = j9;
                } else {
                    long jMax = Math.max(0L, j7 - jZzw5);
                    long j19 = jZzc4 - jArr4[0];
                    long j20 = zzampVarZzo.zzg.zzJ;
                    long jZzw6 = zzfm.zzw(j19, j20, j9, RoundingMode.DOWN);
                    long jZzw7 = zzfm.zzw(jMax, j20, j9, RoundingMode.DOWN);
                    j10 = j7;
                    j11 = j9;
                    if (jZzw6 != 0) {
                        if (jZzw6 <= 2147483647L && jZzw7 <= 2147483647L) {
                            zzagtVar.zza = (int) jZzw6;
                            zzagtVar.zzb = (int) jZzw7;
                            zzfm.zzx(jArr4, 1000000L, j11);
                            return new zzams(zzampVarZzo, jArr3, iArr3, i16, jArr4, r28, iArrZzf, r30, zzfm.zzw(zzhaoVar.zzc(0), 1000000L, j18, RoundingMode.DOWN), i12);
                        }
                    } else if (jZzw7 != 0) {
                        jZzw6 = 0;
                        if (jZzw6 <= 2147483647L) {
                            zzagtVar.zza = (int) jZzw6;
                            zzagtVar.zzb = (int) jZzw7;
                            zzfm.zzx(jArr4, 1000000L, j11);
                            return new zzams(zzampVarZzo, jArr3, iArr3, i16, jArr4, r28, iArrZzf, r30, zzfm.zzw(zzhaoVar.zzc(0), 1000000L, j18, RoundingMode.DOWN), i12);
                        }
                    }
                }
            }
            if (zzhaoVar.zzb() != 1 && zzhaoVar.zzc(0) == 0) {
                zzhao zzhaoVar4 = zzampVarZzo.zzj;
                zzhaoVar4.getClass();
                long jZzc6 = zzhaoVar4.zzc(0);
                int i54 = 0;
                while (i54 < jArr4.length) {
                    long j21 = j11;
                    jArr4[i54] = zzfm.zzw(jArr4[i54] - jZzc6, 1000000L, j21, RoundingMode.DOWN);
                    i54++;
                    j11 = j21;
                }
                return new zzams(zzampVarZzo, jArr3, iArr3, i16, jArr4, r28, iArrZzf, r30, zzfm.zzw(j10 - jZzc6, 1000000L, j11, RoundingMode.DOWN), i12);
            }
            j12 = j11;
            jArr5 = jArr3;
            i17 = i12;
            if (zzampVarZzo.zzb == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            iArr4 = new int[zzhaoVar.zzb()];
            iArr5 = new int[zzhaoVar.zzb()];
            zzhaoVar2 = zzampVarZzo.zzj;
            zzhaoVar2.getClass();
            i18 = 0;
            i19 = 0;
            z5 = false;
            i20 = 0;
            while (i19 < zzhaoVar.zzb()) {
                iArr8 = iArr5;
                jZzc3 = zzhaoVar2.zzc(i19);
                if (jZzc3 != -1) {
                    i26 = i19;
                    boolean z12 = z5;
                    long j22 = j12;
                    j12 = j22;
                    jZzw3 = zzfm.zzw(zzhaoVar.zzc(i19), j22, zzampVarZzo.zzd, RoundingMode.DOWN) + jZzc3;
                    iArr4[i26] = zzfm.zzo(jArr4, jZzc3, true, true);
                    iZzq = zzfm.zzq(jArr4, jZzw3, z4, false);
                    i27 = iZzq - 1;
                    i28 = 0;
                    while (iZzq < jArr4.length) {
                        if (jArr4[iZzq] < jZzw3) {
                            i28++;
                            if (i28 > zzampVarZzo.zzg.zzr) {
                                break;
                            }
                        } else {
                            i27 = iZzq;
                        }
                        iZzq++;
                    }
                    iArr8[i26] = i27 + 1;
                    i29 = iArr4[i26];
                    while (true) {
                        i30 = iArr4[i26];
                        if (i30 > 0 || (r28[i30] & 1) != 0) {
                            break;
                            break;
                        }
                        iArr4[i26] = i30 - 1;
                    }
                    if (i30 == 0) {
                        z10 = false;
                        if ((r28[0] & 1) == 0) {
                            iArr4[i26] = i29;
                            while (true) {
                                i30 = iArr4[i26];
                                if (i30 >= iArr8[i26] || (r28[i30] & 1) != 0) {
                                    break;
                                }
                                iArr4[i26] = i30 + 1;
                            }
                        }
                    } else {
                        z10 = false;
                    }
                    int i55 = iArr8[i26];
                    i18 += i55 - i30;
                    if (i20 != i30) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    i20 = i55;
                    z5 = z12 | z11;
                } else {
                    i26 = i19;
                }
                i19 = i26 + 1;
                arrayList = arrayList;
                iArr5 = iArr8;
                z4 = z4;
            }
            iArr6 = iArr5;
            boolean z13 = z5;
            arrayList2 = arrayList;
            i21 = 0;
            if (i18 != i17) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z13 | z6;
            if (z7) {
                jArr6 = new long[i18];
            } else {
                jArr6 = jArr5;
            }
            if (z7) {
                iArr7 = new int[i18];
            } else {
                iArr7 = iArr3;
            }
            if (true == z7) {
                i16 = 0;
            }
            if (z7) {
                r9 = new int[i18];
            } else {
                r9 = r28;
            }
            if (z7) {
                arrayList3 = new ArrayList();
            } else {
                arrayList3 = arrayList2;
            }
            jArr7 = new long[i18];
            i22 = 0;
            z8 = false;
            jZzc = 0;
            while (i22 < zzhaoVar.zzb()) {
                jZzc2 = zzhaoVar2.zzc(i22);
                i23 = iArr4[i22];
                zzhao zzhaoVar5 = zzhaoVar2;
                i24 = iArr6[i22];
                jArr8 = jArr7;
                if (z7) {
                    int i56 = i24 - i23;
                    System.arraycopy(jArr5, i23, jArr6, i21, i56);
                    System.arraycopy(iArr3, i23, iArr7, i21, i56);
                    System.arraycopy(r28, i23, r9, i21, i56);
                }
                i25 = i16;
                while (i23 < i24) {
                    int i57 = i21;
                    int i58 = i24;
                    long jZzw8 = zzfm.zzw(jZzc, 1000000L, zzampVarZzo.zzd, RoundingMode.DOWN);
                    jZzw2 = zzfm.zzw(jArr4[i23] - jZzc2, 1000000L, j12, RoundingMode.DOWN);
                    if (jZzw2 < 0) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    z8 = (!z9) | z8;
                    jArr8[i57] = jZzw8 + jZzw2;
                    if (z7 && iArr7[i57] > i25) {
                        i25 = iArr3[i23];
                    }
                    if (!z7 && r30 == 0 && (r9[i57] & 1) != 0) {
                        arrayList3.add(Integer.valueOf(i57));
                    }
                    i21 = i57 + 1;
                    i23++;
                    i24 = i58;
                }
                jZzc += zzhaoVar.zzc(i22);
                i22++;
                i21 = i21;
                i16 = i25;
                zzhaoVar2 = zzhaoVar5;
                jArr7 = jArr8;
            }
            long[] jArr11 = jArr7;
            long jZzw9 = zzfm.zzw(jZzc, 1000000L, zzampVarZzo.zzd, RoundingMode.DOWN);
            if (z8) {
                zzt zztVarZza3 = zzampVarZzo.zzg.zza();
                zztVarZza3.zzu(true);
                zzv zzvVarZzP3 = zztVarZza3.zzP();
                zzamo zzamoVar3 = new zzamo(zzampVarZzo, null);
                zzamoVar3.zzg(zzvVarZzP3);
                zzampVarZzo = zzamoVar3.zzo();
            }
            return new zzams(zzampVarZzo, jArr6, iArr7, i16, jArr11, r9, zzhaq.zzf(arrayList3), r30, jZzw9, jArr6.length);
        }
        c = 1;
        i = iZzH7;
        z3 = false;
        arrayList = new ArrayList();
        if (zzeuVar4 == null) {
            r30 = c;
        } else {
            r30 = 0;
        }
        if (z3) {
            i31 = zzaleVar.zza;
            jArr9 = new long[i31];
            iArr9 = new int[i31];
            while (zzaleVar.zza()) {
                int i410 = zzaleVar.zzb;
                jArr9[i410] = zzaleVar.zzd;
                iArr9[i410] = zzaleVar.zzc;
            }
            j13 = iZzH9;
            i32 = 8192 / iZzb;
            i34 = 0;
            while (i33 < i31) {
                int i411 = iArr9[i33];
                String str4 = zzfm.zza;
                i34 += ((i411 + i32) - 1) / i32;
            }
            jArr10 = new long[i34];
            iArr2 = new int[i34];
            jArr4 = new long[i34];
            iArr10 = new int[i34];
            i35 = 0;
            i36 = 0;
            i37 = 0;
            i7 = 0;
            i38 = 0;
            while (i35 < i31) {
                int i412 = iArr9[i35];
                j14 = jArr9[i35];
                int i413 = i38;
                int i414 = i31;
                iMax = i7;
                i39 = i413;
                int i415 = i35;
                i40 = i412;
                while (i40 > 0) {
                    int iMin2 = Math.min(i32, i40);
                    jArr10[i39] = j14;
                    int i416 = i40;
                    int i417 = iZzb * iMin2;
                    iArr2[i39] = i417;
                    iMax = Math.max(iMax, i417);
                    jArr4[i39] = ((long) i36) * j13;
                    iArr10[i39] = c;
                    j14 += (long) iArr2[i39];
                    i36 += iMin2;
                    i39++;
                    i37 += i417;
                    i40 = i416 - iMin2;
                    i32 = i32;
                }
                int i418 = i32;
                i35 = i415 + 1;
                int i59 = i39;
                i7 = iMax;
                i31 = i414;
                i38 = i59;
                i32 = i418;
            }
            j4 = j13 * ((long) i36);
            j5 = i37;
            jArr3 = jArr10;
            i12 = i34;
            r15 = iArr10;
        } else {
            jArr = new long[iZza];
            iArr = new int[iZza];
            jArr2 = new long[iZza];
            zzeuVar = zzeuVar5;
            r0 = new int[iZza];
            i2 = iZzH3;
            iZzH4 = iZzH8;
            j = 0;
            j2 = 0;
            j3 = 0;
            i3 = iZzH;
            iZzH5 = iZzH2;
            iZzH6 = 0;
            i4 = 0;
            iZzB = iZzH9;
            zzaliVar = zzalmVar;
            i5 = i;
            i6 = 0;
            i7 = 0;
            iZzB2 = 0;
            while (true) {
                if (i6 < iZza) {
                    jArr3 = jArr;
                    jArrCopyOf = jArr2;
                    iArr2 = iArr;
                    CopyOf = r0;
                    break;
                }
                j6 = j;
                r26 = c;
                while (true) {
                    if (i4 != 0) {
                        i13 = i4;
                        r27 = r26;
                        break;
                    }
                    zZza = zzaleVar.zza();
                    if (zZza) {
                        i13 = 0;
                        r27 = zZza;
                        break;
                    }
                    j6 = zzaleVar.zzd;
                    i4 = zzaleVar.zzc;
                    iZza = iZza;
                    r26 = zZza;
                }
                i14 = iZza;
                if (r27 == 0) {
                    zzeh.zzc("BoxParsers", "Unexpected end of chunk data");
                    long[] jArrCopyOf3 = Arrays.copyOf(jArr, i6);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr, i6);
                    jArrCopyOf = Arrays.copyOf(jArr2, i6);
                    jArr3 = jArrCopyOf3;
                    iArr2 = iArrCopyOf2;
                    iZza = i6;
                    CopyOf = Arrays.copyOf((int[]) r0, i6);
                    break;
                }
                if (zzeuVar != null) {
                    while (iZzH6 == 0) {
                        if (i3 > 0) {
                            iZzH6 = 0;
                            break;
                        }
                        i3--;
                        iZzH6 = zzeuVar.zzH();
                        iZzB2 = zzeuVar.zzB();
                    }
                    iZzH6--;
                }
                iZzc = zzaliVar.zzc();
                int[] iArr12 = iArr;
                zzale zzaleVar3 = zzaleVar;
                long j110 = iZzc;
                j3 += j110;
                if (iZzc > i7) {
                    i7 = iZzc;
                }
                jArr[i6] = j6;
                iArr12[i6] = iZzc;
                int i510 = i13;
                jArr2[i6] = j2 + ((long) iZzB2);
                r0[i6] = r30;
                if (i6 == iZzH5) {
                    r0[i6] = c;
                    arrayList.add(Integer.valueOf(i6));
                }
                if (zzeuVar4 != null) {
                    i15 = i2 - 1;
                    if (i15 > 0) {
                        i2 = i15;
                        iZzH5 = zzeuVar4.zzH() - 1;
                    } else {
                        i2 = i15;
                    }
                }
                j2 += (long) iZzB;
                iZzH4--;
                if (iZzH4 != 0) {
                    if (i5 > 0) {
                        i5--;
                        iZzH4 = zzeuVar3.zzH();
                        iZzB = zzeuVar3.zzB();
                    } else {
                        iZzH4 = 0;
                    }
                }
                long j111 = j6 + j110;
                i4 = i510 - 1;
                i6++;
                zzaleVar = zzaleVar3;
                iArr = iArr12;
                iZza = i14;
                j = j111;
            }
            r15 = CopyOf;
            j4 = j2 + ((long) iZzB2);
            if (zzeuVar != null) {
                c2 = c;
                break;
            }
            while (true) {
                if (i3 > 0) {
                    c2 = c;
                    break;
                }
                if (zzeuVar.zzH() != 0) {
                    c2 = 0;
                    break;
                }
                zzeuVar.zzB();
                i3--;
            }
            if (i2 == 0) {
                if (iZzH4 == 0) {
                    i8 = i5;
                    i9 = i4;
                    i10 = iZzH4;
                } else if (i4 == 0) {
                    i8 = i5;
                    i9 = i4;
                    i10 = 0;
                } else if (i5 == 0) {
                    if (iZzH6 == 0) {
                        i10 = 0;
                        i9 = 0;
                        i8 = 0;
                    } else if (c2 == 0) {
                        iZza = iZza;
                        jArrCopyOf = jArrCopyOf;
                        i11 = 0;
                        i10 = 0;
                        c3 = 0;
                        i9 = 0;
                        i8 = 0;
                        iZzH6 = 0;
                    } else {
                        iZza = iZza;
                        jArrCopyOf = jArrCopyOf;
                    }
                    i12 = iZza;
                    jArr4 = jArrCopyOf;
                    j5 = j3;
                } else {
                    i8 = i5;
                    i10 = 0;
                    i9 = 0;
                }
                c3 = c2;
                i11 = 0;
            } else {
                iZza = iZza;
                jArrCopyOf = jArrCopyOf;
                i8 = i5;
                iZzH6 = iZzH6;
                i9 = i4;
                i10 = iZzH4;
                c3 = c2;
                i11 = i2;
            }
            int i511 = zzampVarZzo.zza;
            int length4 = String.valueOf(i511).length() + 66 + String.valueOf(i11).length() + 35 + String.valueOf(i10).length() + 26 + String.valueOf(i9).length() + 33 + String.valueOf(i8).length() + 36;
            int length5 = String.valueOf(iZzH6).length();
            if (c != c3) {
                str = ", ctts invalid";
            } else {
                str = "";
            }
            StringBuilder sb2 = new StringBuilder(length4 + length5 + str.length());
            sb2.append("Inconsistent stbl box for track ");
            sb2.append(i511);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i11);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(i10);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i9);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i8);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(iZzH6);
            sb2.append(str);
            zzeh.zzc("BoxParsers", sb2.toString());
            i12 = iZza;
            jArr4 = jArrCopyOf;
            j5 = j3;
        }
        j7 = j4;
        iArr3 = iArr2;
        r28 = r15;
        i16 = i7;
        j8 = zzampVarZzo.zzf;
        if (j8 > 0) {
            jZzw4 = zzfm.zzw(j5 * 8, 1000000L, j8, RoundingMode.HALF_DOWN);
            if (jZzw4 > 0) {
                zzt zztVarZza4 = zzvVar.zza();
                zztVarZza4.zzi((int) jZzw4);
                zzv zzvVarZzP4 = zztVarZza4.zzP();
                zzamo zzamoVar4 = new zzamo(zzampVarZzo, null);
                zzamoVar4.zzg(zzvVarZzP4);
                zzampVarZzo = zzamoVar4.zzo();
            }
        }
        j9 = zzampVarZzo.zzc;
        jZzw = zzfm.zzw(j7, 1000000L, j9, RoundingMode.DOWN);
        iArrZzf = zzhaq.zzf(arrayList);
        zzhaoVar = zzampVarZzo.zzi;
        if (zzhaoVar == null) {
            zzfm.zzx(jArr4, 1000000L, j9);
            return new zzams(zzampVarZzo, jArr3, iArr3, i16, jArr4, r28, iArrZzf, r30, jZzw, i12);
        }
        if (zzhaoVar.zzb() == 1) {
            j10 = j7;
            j11 = j9;
        } else {
            j10 = j7;
            j11 = j9;
        }
        if (zzhaoVar.zzb() != 1) {
        }
        j12 = j11;
        jArr5 = jArr3;
        i17 = i12;
        if (zzampVarZzo.zzb == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        iArr4 = new int[zzhaoVar.zzb()];
        iArr5 = new int[zzhaoVar.zzb()];
        zzhaoVar2 = zzampVarZzo.zzj;
        zzhaoVar2.getClass();
        i18 = 0;
        i19 = 0;
        z5 = false;
        i20 = 0;
        while (i19 < zzhaoVar.zzb()) {
            iArr8 = iArr5;
            jZzc3 = zzhaoVar2.zzc(i19);
            if (jZzc3 != -1) {
                i26 = i19;
                boolean z14 = z5;
                long j23 = j12;
                j12 = j23;
                jZzw3 = zzfm.zzw(zzhaoVar.zzc(i19), j23, zzampVarZzo.zzd, RoundingMode.DOWN) + jZzc3;
                iArr4[i26] = zzfm.zzo(jArr4, jZzc3, true, true);
                iZzq = zzfm.zzq(jArr4, jZzw3, z4, false);
                i27 = iZzq - 1;
                i28 = 0;
                while (iZzq < jArr4.length) {
                    if (jArr4[iZzq] < jZzw3) {
                        i28++;
                        if (i28 > zzampVarZzo.zzg.zzr) {
                            break;
                            break;
                        }
                    } else {
                        i27 = iZzq;
                    }
                    iZzq++;
                }
                iArr8[i26] = i27 + 1;
                i29 = iArr4[i26];
                while (true) {
                    i30 = iArr4[i26];
                    if (i30 > 0) {
                        break;
                    }
                    iArr4[i26] = i30 - 1;
                }
                if (i30 == 0) {
                    z10 = false;
                    if ((r28[0] & 1) == 0) {
                        iArr4[i26] = i29;
                        while (true) {
                            i30 = iArr4[i26];
                            if (i30 >= iArr8[i26]) {
                                break;
                            }
                            break;
                            break;
                            iArr4[i26] = i30 + 1;
                        }
                    }
                } else {
                    z10 = false;
                }
                int i512 = iArr8[i26];
                i18 += i512 - i30;
                if (i20 != i30) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                i20 = i512;
                z5 = z14 | z11;
            } else {
                i26 = i19;
            }
            i19 = i26 + 1;
            arrayList = arrayList;
            iArr5 = iArr8;
            z4 = z4;
        }
        iArr6 = iArr5;
        boolean z15 = z5;
        arrayList2 = arrayList;
        i21 = 0;
        if (i18 != i17) {
            z6 = true;
        } else {
            z6 = false;
        }
        z7 = z15 | z6;
        if (z7) {
            jArr6 = new long[i18];
        } else {
            jArr6 = jArr5;
        }
        if (z7) {
            iArr7 = new int[i18];
        } else {
            iArr7 = iArr3;
        }
        if (true == z7) {
            i16 = 0;
        }
        if (z7) {
            r9 = new int[i18];
        } else {
            r9 = r28;
        }
        if (z7) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = arrayList2;
        }
        jArr7 = new long[i18];
        i22 = 0;
        z8 = false;
        jZzc = 0;
        while (i22 < zzhaoVar.zzb()) {
            jZzc2 = zzhaoVar2.zzc(i22);
            i23 = iArr4[i22];
            zzhao zzhaoVar6 = zzhaoVar2;
            i24 = iArr6[i22];
            jArr8 = jArr7;
            if (z7) {
                int i513 = i24 - i23;
                System.arraycopy(jArr5, i23, jArr6, i21, i513);
                System.arraycopy(iArr3, i23, iArr7, i21, i513);
                System.arraycopy(r28, i23, r9, i21, i513);
            }
            i25 = i16;
            while (i23 < i24) {
                int i514 = i21;
                int i515 = i24;
                long jZzw10 = zzfm.zzw(jZzc, 1000000L, zzampVarZzo.zzd, RoundingMode.DOWN);
                jZzw2 = zzfm.zzw(jArr4[i23] - jZzc2, 1000000L, j12, RoundingMode.DOWN);
                if (jZzw2 < 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                z8 = (!z9) | z8;
                jArr8[i514] = jZzw10 + jZzw2;
                if (z7) {
                    i25 = iArr3[i23];
                }
                if (!z7) {
                }
                i21 = i514 + 1;
                i23++;
                i24 = i515;
            }
            jZzc += zzhaoVar.zzc(i22);
            i22++;
            i21 = i21;
            i16 = i25;
            zzhaoVar2 = zzhaoVar6;
            jArr7 = jArr8;
        }
        long[] jArr12 = jArr7;
        long jZzw11 = zzfm.zzw(jZzc, 1000000L, zzampVarZzo.zzd, RoundingMode.DOWN);
        if (z8) {
            zzt zztVarZza5 = zzampVarZzo.zzg.zza();
            zztVarZza5.zzu(true);
            zzv zzvVarZzP5 = zztVarZza5.zzP();
            zzamo zzamoVar5 = new zzamo(zzampVarZzo, null);
            zzamoVar5.zzg(zzvVarZzP5);
            zzampVarZzo = zzamoVar5.zzo();
        }
        return new zzams(zzampVarZzo, jArr6, iArr7, i16, jArr12, r9, zzhaq.zzf(arrayList3), r30, jZzw11, jArr6.length);
    }

    static zzap zzh(zzeu zzeuVar) {
        try {
            zzeuVar.zzk(5);
            int iZzB = zzeuVar.zzB();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < iZzB; i++) {
                long jZzD = zzeuVar.zzD() / WorkRequest.MIN_BACKOFF_MILLIS;
                if (jZzD < 0) {
                    jZzD = -9223372036854775807L;
                }
                String strZzK = zzeuVar.zzK(zzeuVar.zzs(), StandardCharsets.UTF_8);
                zzaiy zzaiyVar = new zzaiy();
                zzaiyVar.zza(jZzD);
                zzaiyVar.zzd(new zzx(null, strZzK));
                arrayList.add(zzaiyVar.zze());
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new zzap(arrayList);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    private static zzap zzi(zzeu zzeuVar) {
        short sZzv = zzeuVar.zzv();
        zzeuVar.zzk(2);
        String strZzK = zzeuVar.zzK(sZzv, StandardCharsets.UTF_8);
        int iMax = Math.max(strZzK.lastIndexOf(43), strZzK.lastIndexOf(45));
        try {
            return new zzap(-9223372036854775807L, new zzgc(Float.parseFloat(strZzK.substring(0, iMax)), Float.parseFloat(strZzK.substring(iMax, strZzK.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static int zzj(zzeu zzeuVar) {
        zzeuVar.zzh(16);
        return zzeuVar.zzB();
    }

    private static zzalh zzk(zzeu zzeuVar) {
        long j;
        String str;
        zzeuVar.zzh(8);
        int iZza = zza(zzeuVar.zzB());
        zzeuVar.zzk(iZza == 0 ? 8 : 16);
        long jZzz = zzeuVar.zzz();
        int iZzg = zzeuVar.zzg();
        int i = 0;
        while (true) {
            int i2 = iZza == 0 ? 4 : 8;
            if (i >= i2) {
                zzeuVar.zzk(i2);
            } else {
                if (zzeuVar.zzi()[iZzg + i] != -1) {
                    long jZzz2 = iZza == 0 ? zzeuVar.zzz() : zzeuVar.zzJ();
                    if (jZzz2 != 0) {
                        long jZzw = zzfm.zzw(jZzz2, 1000000L, jZzz, RoundingMode.DOWN);
                        jZzz = jZzz;
                        j = jZzw;
                        break;
                    }
                    break;
                }
                i++;
            }
            j = -9223372036854775807L;
            break;
        }
        int iZzt = zzeuVar.zzt();
        char[] cArr = {(char) (((iZzt >> 10) & 31) + 96), (char) (((iZzt >> 5) & 31) + 96), (char) ((iZzt & 31) + 96)};
        for (int i3 = 0; i3 < 3; i3++) {
            char c = cArr[i3];
            str = null;
            if (c < 'a' || c > 'z') {
                return new zzalh(jZzz, j, str);
            }
        }
        str = new String(cArr);
        return new zzalh(jZzz, j, str);
    }

    private static String zzl(byte[] bArr, int i, int i2) {
        zzgtr.zzi(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i3 = 0; i3 < bArr.length - 3; i3 += 4) {
            int iZze = zzhaq.zze(bArr[i3], bArr[i3 + 1], bArr[i3 + 2], bArr[i3 + 3]);
            String str = zzfm.zza;
            int i4 = ((iZze >> 8) & 255) - 128;
            int i5 = (iZze >> 16) & 255;
            int i6 = (iZze & 255) - 128;
            arrayList.add(String.format("%06x", Integer.valueOf(Math.max(0, Math.min(i5 + ((i6 * 17790) / 10000), 255)) | (Math.max(0, Math.min(((i4 * 14075) / 10000) + i5, 255)) << 16) | (Math.max(0, Math.min((i5 - ((i6 * 3455) / 10000)) - ((i4 * 7169) / 10000), 255)) << 8))));
        }
        String strZzd = zzgtl.zzd(arrayList, ", ");
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 7 + String.valueOf(i2).length() + 10 + strZzd.length() + 1);
        sb.append("size: ");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("\npalette: ");
        sb.append(strZzd);
        sb.append("\n");
        return sb.toString();
    }

    private static zzi zzm(zzeu zzeuVar) {
        zzh zzhVar = new zzh();
        byte[] bArrZzi = zzeuVar.zzi();
        zzet zzetVar = new zzet(bArrZzi, bArrZzi.length);
        zzetVar.zzf(zzeuVar.zzg() * 8);
        zzetVar.zzo(1);
        int iZzj = zzetVar.zzj(8);
        for (int i = 0; i < iZzj; i++) {
            zzetVar.zzo(1);
            int iZzj2 = zzetVar.zzj(8);
            for (int i2 = 0; i2 < iZzj2; i2++) {
                zzetVar.zzh(6);
                boolean zZzi = zzetVar.zzi();
                zzetVar.zzg();
                zzetVar.zzo(11);
                zzetVar.zzh(4);
                int iZzj3 = zzetVar.zzj(4) + 8;
                zzhVar.zze(iZzj3);
                zzhVar.zzf(iZzj3);
                zzetVar.zzo(1);
                if (zZzi) {
                    int iZzj4 = zzetVar.zzj(8);
                    int iZzj5 = zzetVar.zzj(8);
                    zzetVar.zzo(1);
                    boolean zZzi2 = zzetVar.zzi();
                    zzhVar.zza(zzi.zzb(iZzj4));
                    zzhVar.zzb(true != zZzi2 ? 2 : 1);
                    zzhVar.zzc(zzi.zzc(iZzj5));
                }
            }
        }
        return zzhVar.zzg();
    }

    private static ByteBuffer zzn() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static Pair zzo(zzfz zzfzVar) {
        zzga zzgaVarZzc = zzfzVar.zzc(1701606260);
        if (zzgaVarZzc == null) {
            return null;
        }
        zzeu zzeuVar = zzgaVarZzc.zza;
        zzeuVar.zzh(8);
        int iZza = zza(zzeuVar.zzB());
        int iZzH = zzeuVar.zzH();
        zzhan zzhanVarZza = zzhao.zza(iZzH);
        zzhan zzhanVarZza2 = zzhao.zza(iZzH);
        for (int i = 0; i < iZzH; i++) {
            zzhanVarZza.zza(iZza == 1 ? zzeuVar.zzJ() : zzeuVar.zzz());
            zzhanVarZza2.zza(iZza == 1 ? zzeuVar.zzD() : zzeuVar.zzB());
            if (zzeuVar.zzv() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            zzeuVar.zzk(2);
        }
        return Pair.create(zzhanVarZza.zzb(), zzhanVarZza2.zzb());
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0141  */
    private static void zzp(zzeu zzeuVar, int i, int i2, int i3, int i4, String str, boolean z, zzq zzqVar, zzalk zzalkVar, int i5) throws zzat {
        int iZzt;
        int iZzB;
        int iZzH;
        int iRound;
        int iZzC;
        String strZza;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i3;
        zzq zzqVarZzb = zzqVar;
        zzeuVar.zzh(i2 + 16);
        if (z) {
            iZzt = zzeuVar.zzt();
            zzeuVar.zzk(6);
        } else {
            zzeuVar.zzk(8);
            iZzt = 0;
        }
        int i10 = 2;
        if (iZzt == 0 || iZzt == 1) {
            int iZzt2 = zzeuVar.zzt();
            zzeuVar.zzk(6);
            int iZzF = zzeuVar.zzF();
            zzeuVar.zzh(zzeuVar.zzg() - 4);
            iZzB = zzeuVar.zzB();
            if (iZzt == 1) {
                zzeuVar.zzk(16);
            }
            iZzH = iZzt2;
            iRound = iZzF;
            iZzC = -1;
        } else {
            if (iZzt != 2) {
                return;
            }
            zzeuVar.zzk(16);
            iRound = (int) Math.round(Double.longBitsToDouble(zzeuVar.zzD()));
            iZzH = zzeuVar.zzH();
            zzeuVar.zzk(4);
            int iZzH2 = zzeuVar.zzH();
            int iZzH3 = zzeuVar.zzH();
            int i11 = iZzH3 & 1;
            int i12 = iZzH3 & 2;
            if (i11 != 0) {
                iZzC = zzfm.zzD(iZzH2, i12 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            } else {
                iZzC = zzfm.zzC(iZzH2, i12 != 0 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            }
            if (iZzC == 0) {
                iZzC = -1;
            }
            zzeuVar.zzk(8);
            iZzB = 0;
        }
        if (i8 == 1767992678) {
            iRound = -1;
            iZzH = -1;
        } else {
            if (i8 == 1935764850) {
                iRound = 8000;
            } else if (i8 == 1935767394) {
                iRound = 16000;
                i8 = 1935767394;
            }
            iZzH = 1;
        }
        int iZzg = zzeuVar.zzg();
        int iIntValue = 1701733217;
        if (i8 == 1701733217) {
            Pair pairZzs = zzs(zzeuVar, i2, i9);
            if (pairZzs != null) {
                iIntValue = ((Integer) pairZzs.first).intValue();
                zzqVarZzb = zzqVarZzb == null ? null : zzqVarZzb.zzb(((zzamq) pairZzs.second).zzb);
                zzalkVar.zza[i5] = (zzamq) pairZzs.second;
            }
            i8 = iIntValue;
            zzeuVar.zzh(iZzg);
        }
        String str2 = "audio/mhm1";
        if (i8 == 1633889587) {
            strZza = "audio/ac3";
        } else if (i8 == 1700998451) {
            strZza = "audio/eac3";
        } else if (i8 == 1633889588) {
            strZza = "audio/ac4";
        } else if (i8 == 1685353315) {
            strZza = "audio/vnd.dts";
        } else if (i8 == 1685353320 || i8 == 1685353324) {
            strZza = "audio/vnd.dts.hd";
        } else if (i8 == 1685353317) {
            strZza = "audio/vnd.dts.hd;profile=lbr";
        } else if (i8 == 1685353336) {
            strZza = "audio/vnd.dts.uhd;profile=p2";
        } else if (i8 == 1935764850) {
            strZza = "audio/3gpp";
        } else if (i8 == 1935767394) {
            strZza = "audio/amr-wb";
        } else if (i8 != 1936684916) {
            if (i8 == 1953984371) {
                iZzC = 268435456;
            } else if (i8 == 1819304813) {
                if (iZzC == -1) {
                    iZzC = i10;
                }
            } else if (i8 == 778924082 || i8 == 778924083) {
                strZza = "audio/mpeg";
            } else if (i8 == 1835557169) {
                strZza = "audio/mha1";
            } else if (i8 == 1835560241) {
                strZza = "audio/mhm1";
            } else if (i8 == 1634492771) {
                strZza = "audio/alac";
            } else if (i8 == 1634492791) {
                strZza = "audio/g711-alaw";
            } else if (i8 == 1970037111) {
                strZza = "audio/g711-mlaw";
            } else if (i8 == 1332770163) {
                strZza = "audio/opus";
            } else if (i8 == 1716281667) {
                strZza = "audio/flac";
            } else if (i8 == 1835823201) {
                strZza = "audio/true-hd";
            } else if (i8 == 1767992678) {
                strZza = "audio/iamf";
                i8 = 1767992678;
            } else {
                strZza = null;
            }
            strZza = "audio/raw";
        } else {
            iZzC = i10;
            strZza = "audio/raw";
        }
        int iZzD = iZzC;
        List listZzj = null;
        String string = null;
        zzalf zzalfVarZzq = null;
        zzald zzaldVarZzr = null;
        while (iZzg - i2 < i9) {
            zzeuVar.zzh(iZzg);
            int iZzB2 = zzeuVar.zzB();
            String str3 = string;
            String str4 = "childAtomSize must be positive";
            zzage.zza(iZzB2 > 0, "childAtomSize must be positive");
            int iZzB3 = zzeuVar.zzB();
            iRound = iRound;
            if (iZzB3 == 1835557187) {
                zzeuVar.zzh(iZzg + 8);
                zzeuVar.zzk(1);
                int iZzs = zzeuVar.zzs();
                zzeuVar.zzk(1);
                String str5 = Objects.equals(strZza, str2) ? String.format("mhm1.%02X", Integer.valueOf(iZzs)) : String.format("mha1.%02X", Integer.valueOf(iZzs));
                int iZzt3 = zzeuVar.zzt();
                byte[] bArr = new byte[iZzt3];
                str3 = str5;
                zzeuVar.zzm(bArr, 0, iZzt3);
                if (listZzj == null) {
                    listZzj = zzgwt.zzj(bArr);
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    iRound = iRound;
                    string = str3;
                } else {
                    listZzj = zzgwt.zzk(bArr, (byte[]) listZzj.get(0));
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    string = str3;
                    iRound = iRound;
                }
            } else if (iZzB3 == 1835557200) {
                zzeuVar.zzh(iZzg + 8);
                int iZzs2 = zzeuVar.zzs();
                if (iZzs2 > 0) {
                    byte[] bArr2 = new byte[iZzs2];
                    zzeuVar.zzm(bArr2, 0, iZzs2);
                    if (listZzj == null) {
                        listZzj = zzgwt.zzj(bArr2);
                        iZzD = iZzD;
                        iZzB2 = iZzB2;
                        iZzB = iZzB;
                        str2 = str2;
                        string = str3;
                        iRound = iRound;
                    } else {
                        listZzj = zzgwt.zzk((byte[]) listZzj.get(0), bArr2);
                        iZzB2 = iZzB2;
                        iZzB = iZzB;
                        str2 = str2;
                        string = str3;
                        iRound = iRound;
                    }
                } else {
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    iRound = iRound;
                    string = str3;
                }
            } else {
                if (iZzB3 == 1702061171) {
                    i6 = iZzg;
                    i7 = -1;
                } else if (z && iZzB3 == 2002876005) {
                    int iZzg2 = zzeuVar.zzg();
                    zzage.zza(iZzg2 >= iZzg, null);
                    int i13 = iZzg2;
                    while (true) {
                        if (i13 - iZzg >= iZzB2) {
                            i6 = -1;
                            i7 = -1;
                            break;
                        }
                        zzeuVar.zzh(i13);
                        int iZzB4 = zzeuVar.zzB();
                        zzage.zza(iZzB4 > 0, str4);
                        String str6 = str4;
                        if (zzeuVar.zzB() == 1702061171) {
                            i6 = i13;
                            i7 = -1;
                            break;
                        } else {
                            i13 += iZzB4;
                            str4 = str6;
                        }
                    }
                } else if (iZzB3 == 1651798644) {
                    zzaldVarZzr = zzr(zzeuVar, iZzg);
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    string = str3;
                    iRound = iRound;
                } else {
                    if (iZzB3 == 1684103987) {
                        zzeuVar.zzh(iZzg + 8);
                        zzalkVar.zzb = zzafa.zza(zzeuVar, Integer.toString(i4), str, zzqVarZzb);
                    } else if (iZzB3 == 1684366131) {
                        zzeuVar.zzh(iZzg + 8);
                        zzalkVar.zzb = zzafa.zzb(zzeuVar, Integer.toString(i4), str, zzqVarZzb);
                    } else if (iZzB3 == 1684103988) {
                        zzeuVar.zzh(iZzg + 8);
                        zzalkVar.zzb = zzafd.zza(zzeuVar, Integer.toString(i4), str, zzqVarZzb);
                    } else {
                        if (iZzB3 != 1684892784) {
                            if (iZzB3 == 1684305011 || iZzB3 == 1969517683) {
                                iZzB2 = iZzB2;
                                iZzB = iZzB;
                                str2 = str2;
                                zzt zztVar = new zzt();
                                zztVar.zzb(i4);
                                zztVar.zzo(strZza);
                                zztVar.zzG(iZzH);
                                iRound = iRound;
                                zztVar.zzI(iRound);
                                zztVar.zzs(zzqVarZzb);
                                zztVar.zze(str);
                                zzalkVar.zzb = zztVar.zzP();
                            } else {
                                if (iZzB3 == 1682927731) {
                                    int i14 = iZzB2 - 8;
                                    byte[] bArr3 = zzb;
                                    int length = bArr3.length;
                                    iZzB2 = iZzB2;
                                    byte[] bArrCopyOf = Arrays.copyOf(bArr3, length + i14);
                                    zzeuVar.zzh(iZzg + 8);
                                    zzeuVar.zzm(bArrCopyOf, length, i14);
                                    listZzj = zzgx.zza(bArrCopyOf);
                                } else {
                                    iZzB2 = iZzB2;
                                    if (iZzB3 == 1684425825) {
                                        byte[] bArr4 = new byte[iZzB2 - 8];
                                        bArr4[0] = 102;
                                        bArr4[1] = 76;
                                        bArr4[i10] = 97;
                                        bArr4[3] = 67;
                                        zzeuVar.zzh(iZzg + 12);
                                        zzeuVar.zzm(bArr4, 4, iZzB2 - 12);
                                        listZzj = zzgwt.zzj(bArr4);
                                    } else if (iZzB3 == 1634492771) {
                                        int i15 = iZzB2 - 12;
                                        byte[] bArr5 = new byte[i15];
                                        zzeuVar.zzh(iZzg + 12);
                                        zzeuVar.zzm(bArr5, 0, i15);
                                        int i16 = zzdr.zza;
                                        zzeu zzeuVar2 = new zzeu(bArr5);
                                        zzeuVar2.zzh(5);
                                        int iZzs3 = zzeuVar2.zzs();
                                        zzeuVar2.zzh(9);
                                        int iZzs4 = zzeuVar2.zzs();
                                        zzeuVar2.zzh(20);
                                        int[] iArr = {zzeuVar2.zzH(), iZzs4, iZzs3};
                                        int i17 = iArr[0];
                                        int i18 = iArr[1];
                                        int iZzC2 = zzfm.zzC(iZzs3, ByteOrder.LITTLE_ENDIAN);
                                        if (iZzC2 == 0) {
                                            iZzC2 = -1;
                                        }
                                        iZzH = i18;
                                        listZzj = zzgwt.zzj(bArr5);
                                        iZzD = iZzC2;
                                        iRound = i17;
                                        iZzB = iZzB;
                                    } else {
                                        if (iZzB3 == 1767990114) {
                                            zzeuVar.zzh(iZzg + 9);
                                            int iZza = zzhaq.zza(zzeuVar.zzP());
                                            byte[] bArr6 = new byte[iZza];
                                            zzeuVar.zzm(bArr6, 0, iZza);
                                            int i19 = zzdr.zza;
                                            zzeu zzeuVar3 = new zzeu(bArr6);
                                            String str7 = null;
                                            String str8 = null;
                                            while (zzeuVar3.zzd() > 0 && (str7 == null || str8 == null)) {
                                                int iZzs5 = zzeuVar3.zzs();
                                                int i20 = iZzs5 >> 3;
                                                int i21 = iZzs5 & 2;
                                                int i22 = iZzs5 & 1;
                                                int iZza2 = zzhaq.zza(zzeuVar3.zzP());
                                                byte[] bArr7 = bArr6;
                                                if (i20 > 4 && i20 < 24 && i21 != 0) {
                                                    zzeuVar3.zzQ();
                                                    zzeuVar3.zzQ();
                                                }
                                                if (i22 != 0) {
                                                    zzeuVar3.zzk(zzhaq.zza(zzeuVar3.zzP()));
                                                }
                                                int iZzg3 = zzeuVar3.zzg() + iZza2;
                                                int i23 = iZzB;
                                                if (i20 == 31) {
                                                    zzeuVar3.zzk(4);
                                                    Object[] objArr = {Integer.valueOf(zzeuVar3.zzs()), Integer.valueOf(zzeuVar3.zzs())};
                                                    String str9 = zzfm.zza;
                                                    str7 = String.format(Locale.US, "iamf.%03X.%03X", objArr);
                                                } else {
                                                    if (i20 == 0) {
                                                        zzeuVar3.zzQ();
                                                        String strZzK = zzeuVar3.zzK(4, StandardCharsets.UTF_8);
                                                        if (strZzK.equals("mp4a")) {
                                                            zzeuVar3.zzQ();
                                                            zzeuVar3.zzk(i10);
                                                            zzet zzetVar = new zzet();
                                                            zzetVar.zza(zzeuVar3);
                                                            int iZzj = zzetVar.zzj(5);
                                                            if (iZzj == 31) {
                                                                iZzj = zzetVar.zzj(6) + 32;
                                                            }
                                                            StringBuilder sb = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
                                                            sb.append(strZzK);
                                                            sb.append(".40.");
                                                            sb.append(iZzj);
                                                            strZzK = sb.toString();
                                                        }
                                                        str8 = strZzK;
                                                    }
                                                    zzeuVar3.zzh(iZzg3);
                                                    iZzB = i23;
                                                    str2 = str2;
                                                    bArr6 = bArr7;
                                                    i10 = 2;
                                                }
                                                str2 = str2;
                                                zzeuVar3.zzh(iZzg3);
                                                iZzB = i23;
                                                str2 = str2;
                                                bArr6 = bArr7;
                                                i10 = 2;
                                            }
                                            byte[] bArr8 = bArr6;
                                            iZzB = iZzB;
                                            str2 = str2;
                                            if (str7 == null || str8 == null) {
                                                string = null;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder(str7.length() + 1 + str8.length());
                                                sb2.append(str7);
                                                sb2.append(".");
                                                sb2.append(str8);
                                                string = sb2.toString();
                                            }
                                            listZzj = zzgwt.zzj(bArr8);
                                            iZzD = iZzD;
                                        } else {
                                            iZzB = iZzB;
                                            str2 = str2;
                                            if (iZzB3 == 1885564227) {
                                                zzeuVar.zzh(iZzg + 12);
                                                ByteOrder byteOrder = (zzeuVar.zzs() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                                int iZzs6 = zzeuVar.zzs();
                                                if (i8 == 1768973165) {
                                                    iZzD = zzfm.zzC(iZzs6, byteOrder);
                                                } else {
                                                    iZzD = i8 == 1718641517 ? zzfm.zzD(iZzs6, byteOrder) : iZzD;
                                                }
                                                if (iZzD == 0) {
                                                    iZzD = -1;
                                                }
                                                if (iZzD != -1) {
                                                    strZza = "audio/raw";
                                                }
                                                string = str3;
                                            } else {
                                                iRound = iRound;
                                            }
                                        }
                                        iRound = iRound;
                                    }
                                }
                                iZzB = iZzB;
                                str2 = str2;
                                string = str3;
                                iRound = iRound;
                            }
                            string = str3;
                        } else {
                            if (iZzB <= 0) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(iZzB).length() + 49);
                                sb3.append("Invalid sample rate for Dolby TrueHD MLP stream: ");
                                sb3.append(iZzB);
                                throw zzat.zzb(sb3.toString(), null);
                            }
                            iZzD = iZzD;
                            iZzB2 = iZzB2;
                            iRound = iZzB;
                            iZzB = iRound;
                            iZzH = i10;
                        }
                        string = str3;
                    }
                    iZzB2 = iZzB2;
                    iZzB = iZzB;
                    str2 = str2;
                    iRound = iRound;
                    string = str3;
                }
                if (i6 != i7) {
                    zzalfVarZzq = zzq(zzeuVar, i6);
                    strZza = zzalfVarZzq.zza();
                    byte[] bArrZzb = zzalfVarZzq.zzb();
                    if (bArrZzb != null) {
                        if ("audio/vorbis".equals(strZza)) {
                            int i24 = zzaho.zza;
                            zzeu zzeuVar4 = new zzeu(bArrZzb);
                            int i25 = 1;
                            zzeuVar4.zzk(1);
                            int i26 = 0;
                            while (zzeuVar4.zzd() > 0 && zzeuVar4.zzn() == 255) {
                                zzeuVar4.zzk(i25);
                                i26 += 255;
                                i25 = 1;
                            }
                            int iZzs7 = i26 + zzeuVar4.zzs();
                            int i27 = 0;
                            while (zzeuVar4.zzd() > 0 && zzeuVar4.zzn() == 255) {
                                zzeuVar4.zzk(1);
                                i27 += 255;
                            }
                            int iZzs8 = i27 + zzeuVar4.zzs();
                            byte[] bArr9 = new byte[iZzs7];
                            int iZzg4 = zzeuVar4.zzg();
                            System.arraycopy(bArrZzb, iZzg4, bArr9, 0, iZzs7);
                            int i28 = iZzg4 + iZzs7 + iZzs8;
                            int length2 = bArrZzb.length - i28;
                            byte[] bArr10 = new byte[length2];
                            System.arraycopy(bArrZzb, i28, bArr10, 0, length2);
                            listZzj = zzgwt.zzk(bArr9, bArr10);
                        } else {
                            if ("audio/mp4a-latm".equals(strZza)) {
                                zzaex zzaexVarZza = zzaey.zza(bArrZzb);
                                iRound = zzaexVarZza.zza;
                                iZzH = zzaexVarZza.zzb;
                                string = zzaexVarZza.zzc;
                            } else {
                                string = str3;
                            }
                            listZzj = zzgwt.zzj(bArrZzb);
                        }
                        iZzD = iZzD;
                    }
                    string = str3;
                    iZzD = iZzD;
                } else {
                    string = str3;
                }
            }
            iZzg += iZzB2;
            iZzD = iZzD;
            iZzB = iZzB;
            str2 = str2;
            i10 = 2;
            i9 = i3;
        }
        String str10 = string;
        if (zzalkVar.zzb != null || strZza == null) {
            return;
        }
        zzt zztVar2 = new zzt();
        zztVar2.zzb(i4);
        zztVar2.zzo(strZza);
        zztVar2.zzk(str10);
        zztVar2.zzG(iZzH);
        zztVar2.zzI(iRound);
        zztVar2.zzJ(iZzD);
        zztVar2.zzr(listZzj);
        zztVar2.zzs(zzqVarZzb);
        zztVar2.zze(str);
        if (zzalfVarZzq != null) {
            zztVar2.zzi(zzhaq.zzb(zzalfVarZzq.zzc()));
            zztVar2.zzj(zzhaq.zzb(zzalfVarZzq.zzd()));
        } else if (zzaldVarZzr != null) {
            zztVar2.zzi(zzhaq.zzb(zzaldVarZzr.zza()));
            zztVar2.zzj(zzhaq.zzb(zzaldVarZzr.zzb()));
        }
        zzalkVar.zzb = zztVar2.zzP();
    }

    private static zzalf zzq(zzeu zzeuVar, int i) {
        zzeuVar.zzh(i + 12);
        zzeuVar.zzk(1);
        zzt(zzeuVar);
        zzeuVar.zzk(2);
        int iZzs = zzeuVar.zzs();
        if ((iZzs & 128) != 0) {
            zzeuVar.zzk(2);
        }
        if ((iZzs & 64) != 0) {
            zzeuVar.zzk(zzeuVar.zzs());
        }
        if ((iZzs & 32) != 0) {
            zzeuVar.zzk(2);
        }
        zzeuVar.zzk(1);
        zzt(zzeuVar);
        String strZze = zzas.zze(zzeuVar.zzs());
        if ("audio/mpeg".equals(strZze) || "audio/vnd.dts".equals(strZze) || "audio/vnd.dts.hd".equals(strZze)) {
            return new zzalf(strZze, null, -1L, -1L);
        }
        zzeuVar.zzk(4);
        long jZzz = zzeuVar.zzz();
        long jZzz2 = zzeuVar.zzz();
        zzeuVar.zzk(1);
        int iZzt = zzt(zzeuVar);
        long j = jZzz2;
        byte[] bArr = new byte[iZzt];
        zzeuVar.zzm(bArr, 0, iZzt);
        if (j <= 0) {
            j = -1;
        }
        return new zzalf(strZze, bArr, j, jZzz > 0 ? jZzz : -1L);
    }

    private static zzald zzr(zzeu zzeuVar, int i) {
        zzeuVar.zzh(i + 8);
        zzeuVar.zzk(4);
        return new zzald(zzeuVar.zzz(), zzeuVar.zzz());
    }

    private static Pair zzs(zzeu zzeuVar, int i, int i2) throws zzat {
        zzamq zzamqVar;
        Pair pairCreate;
        int i3;
        int i4;
        int iZzg = zzeuVar.zzg();
        while (iZzg - i < i2) {
            zzeuVar.zzh(iZzg);
            int iZzB = zzeuVar.zzB();
            zzage.zza(iZzB > 0, "childAtomSize must be positive");
            if (zzeuVar.zzB() == 1936289382) {
                int i5 = iZzg + 8;
                int i6 = 0;
                int i7 = -1;
                Integer numValueOf = null;
                String strZzK = null;
                while (i5 - iZzg < iZzB) {
                    zzeuVar.zzh(i5);
                    int iZzB2 = zzeuVar.zzB();
                    int iZzB3 = zzeuVar.zzB();
                    if (iZzB3 == 1718775137) {
                        numValueOf = Integer.valueOf(zzeuVar.zzB());
                    } else if (iZzB3 == 1935894637) {
                        zzeuVar.zzk(4);
                        strZzK = zzeuVar.zzK(4, StandardCharsets.UTF_8);
                    } else if (iZzB3 == 1935894633) {
                        i7 = i5;
                        i6 = iZzB2;
                    }
                    i5 += iZzB2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strZzK) || "cbc1".equals(strZzK) || "cens".equals(strZzK) || "cbcs".equals(strZzK)) {
                    zzage.zza(numValueOf != null, "frma atom is mandatory");
                    zzage.zza(i7 != -1, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 >= i6) {
                            zzamqVar = null;
                            break;
                        }
                        zzeuVar.zzh(i8);
                        int iZzB4 = zzeuVar.zzB();
                        if (zzeuVar.zzB() == 1952804451) {
                            int iZza = zza(zzeuVar.zzB());
                            zzeuVar.zzk(1);
                            if (iZza == 0) {
                                zzeuVar.zzk(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iZzs = zzeuVar.zzs();
                                i3 = iZzs & 15;
                                i4 = (iZzs & 240) >> 4;
                            }
                            boolean z = zzeuVar.zzs() == 1;
                            int iZzs2 = zzeuVar.zzs();
                            byte[] bArr2 = new byte[16];
                            zzeuVar.zzm(bArr2, 0, 16);
                            if (z && iZzs2 == 0) {
                                int iZzs3 = zzeuVar.zzs();
                                byte[] bArr3 = new byte[iZzs3];
                                zzeuVar.zzm(bArr3, 0, iZzs3);
                                bArr = bArr3;
                            }
                            zzamqVar = new zzamq(z, strZzK, iZzs2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i8 += iZzB4;
                    }
                    zzage.zza(zzamqVar != null, "tenc atom is mandatory");
                    String str = zzfm.zza;
                    pairCreate = Pair.create(numValueOf, zzamqVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iZzg += iZzB;
        }
        return null;
    }

    private static int zzt(zzeu zzeuVar) {
        int iZzs = zzeuVar.zzs();
        int i = iZzs & WorkQueueKt.MASK;
        while ((iZzs & 128) == 128) {
            iZzs = zzeuVar.zzs();
            i = (i << 7) | (iZzs & WorkQueueKt.MASK);
        }
        return i;
    }
}
