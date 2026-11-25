package com.google.android.gms.internal.ads;

import io.flutter.embedding.android.KeyboardMap;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajr {
    public static final zzajo zza = zzajp.zza;

    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:52:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0119 A[SYNTHETIC] */
    public static final zzap zza(byte[] bArr, int i, zzajo zzajoVar, zzajc zzajcVar) {
        boolean z;
        zzajq zzajqVar;
        int i2;
        boolean zZzb;
        int iZzc;
        zzajs zzajsVarZzc;
        ArrayList arrayList = new ArrayList();
        zzeu zzeuVar = new zzeu(bArr, i);
        boolean z2 = false;
        if (zzeuVar.zzd() < 10) {
            zzeh.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int iZzx = zzeuVar.zzx();
            if (iZzx == 4801587) {
                int iZzs = zzeuVar.zzs();
                zzeuVar.zzk(1);
                int iZzs2 = zzeuVar.zzs();
                int iZzG = zzeuVar.zzG();
                if (iZzs != 2) {
                    if (iZzs == 3) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzB = zzeuVar.zzB();
                            zzeuVar.zzk(iZzB);
                            iZzG -= iZzB + 4;
                        }
                    } else if (iZzs == 4) {
                        if ((iZzs2 & 64) != 0) {
                            int iZzG2 = zzeuVar.zzG();
                            zzeuVar.zzk(iZzG2 - 4);
                            iZzG -= iZzG2;
                        }
                        if ((iZzs2 & 16) != 0) {
                            iZzG -= 10;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzs).length() + 46);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(iZzs);
                        zzeh.zzc("Id3Decoder", sb.toString());
                    }
                    if (iZzs < 4) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zzajqVar = new zzajq(iZzs, z, iZzG);
                } else if ((iZzs2 & 64) != 0) {
                    zzeh.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                } else {
                    if (iZzs < 4 || (iZzs2 & 128) == 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zzajqVar = new zzajq(iZzs, z, iZzG);
                }
                if (zzajqVar == null) {
                    return null;
                }
                int iZzg = zzeuVar.zzg();
                i2 = zzajqVar.zza() == 2 ? 6 : 10;
                zZzb = zzajqVar.zzb();
                iZzc = zzajqVar.zzc();
                if (zZzb) {
                    iZzc = zze(zzeuVar, zzajqVar.zzc());
                }
                zzeuVar.zzf(iZzg + iZzc);
                if (!zzb(zzeuVar, zzajqVar.zza(), i2, false)) {
                    if (zzajqVar.zza() == 4 || !zzb(zzeuVar, 4, i2, true)) {
                        int iZza = zzajqVar.zza();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 45);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(iZza);
                        zzeh.zzc("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z2 = true;
                }
                while (zzeuVar.zzd() >= i2) {
                    zzajsVarZzc = zzc(zzajqVar.zza(), zzeuVar, z2, i2, zzajoVar);
                    if (zzajsVarZzc != null) {
                        arrayList.add(zzajsVarZzc);
                    }
                }
                return new zzap(arrayList);
            }
            String str = String.format("%06X", Integer.valueOf(iZzx));
            String.valueOf(str);
            zzeh.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(str)));
        }
        zzajqVar = null;
        if (zzajqVar == null) {
            return null;
        }
        int iZzg2 = zzeuVar.zzg();
        if (zzajqVar.zza() == 2) {
        }
        zZzb = zzajqVar.zzb();
        iZzc = zzajqVar.zzc();
        if (zZzb) {
            iZzc = zze(zzeuVar, zzajqVar.zzc());
        }
        zzeuVar.zzf(iZzg2 + iZzc);
        if (!zzb(zzeuVar, zzajqVar.zza(), i2, false)) {
            if (zzajqVar.zza() == 4) {
            }
            int iZza2 = zzajqVar.zza();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZza2).length() + 45);
            sb3.append("Failed to validate ID3 tag with majorVersion=");
            sb3.append(iZza2);
            zzeh.zzc("Id3Decoder", sb3.toString());
            return null;
        }
        while (zzeuVar.zzd() >= i2) {
            zzajsVarZzc = zzc(zzajqVar.zza(), zzeuVar, z2, i2, zzajoVar);
            if (zzajsVarZzc != null) {
                arrayList.add(zzajsVarZzc);
            }
        }
        return new zzap(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0086  */
    /* JADX WARN: Code duplicated, block: B:37:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:3:0x0008, B:7:0x0015, B:18:0x003d, B:21:0x0048, B:23:0x006a, B:27:0x0070, B:39:0x008c, B:40:0x008e, B:43:0x0094, B:46:0x009e, B:29:0x007a, B:33:0x0081, B:8:0x0022), top: B:53:0x0008 }] */
    private static boolean zzb(zzeu zzeuVar, int i, int i2, boolean z) {
        boolean z2;
        int iZzx;
        long jZzx;
        int iZzt;
        int i3;
        int iZzg = zzeuVar.zzg();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i4 = 1;
                int i5 = 1;
                if (zzeuVar.zzd() >= i2) {
                    if (i >= 3) {
                        iZzx = zzeuVar.zzB();
                        jZzx = zzeuVar.zzz();
                        iZzt = zzeuVar.zzt();
                    } else {
                        iZzx = zzeuVar.zzx();
                        jZzx = zzeuVar.zzx();
                        iZzt = 0;
                    }
                    if (iZzx != 0 || jZzx != 0 || iZzt != 0) {
                        if (i != 4 || z) {
                            if (i == 4) {
                                if ((iZzt & 64) != 0) {
                                    i4 = 0;
                                }
                                int i6 = i4;
                                i5 = iZzt & 1;
                                i3 = i6;
                            } else if (i == 3) {
                                if ((iZzt & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jZzx >= i3 && zzeuVar.zzd() >= jZzx) {
                                zzeuVar.zzk((int) jZzx);
                            }
                        } else if ((8421504 & jZzx) == 0) {
                            long j = ((jZzx >> 16) & 255) << 14;
                            jZzx = ((jZzx >> 24) << 21) | j | (jZzx & 255) | (((jZzx >> 8) & 255) << 7);
                            if (i == 4) {
                                if ((iZzt & 64) != 0) {
                                    i4 = 0;
                                }
                                int i7 = i4;
                                i5 = iZzt & 1;
                                i3 = i7;
                            } else if (i == 3) {
                                if ((iZzt & 32) != 0) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                if ((iZzt & 128) != 0) {
                                    i5 = 0;
                                }
                            } else {
                                i3 = 0;
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                i3 += 4;
                            }
                            if (jZzx >= i3) {
                                zzeuVar.zzk((int) jZzx);
                            }
                        }
                        z2 = false;
                        break;
                    }
                    break;
                }
                break;
            } catch (Throwable th) {
                zzeuVar.zzh(iZzg);
                throw th;
            }
        }
        zzeuVar.zzh(iZzg);
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0272  */
    /* JADX WARN: Code duplicated, block: B:144:0x0276  */
    /* JADX WARN: Code duplicated, block: B:148:0x027d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x029d A[Catch: all -> 0x015f, Exception -> 0x0310, OutOfMemoryError -> 0x0313, TRY_LEAVE, TryCatch #8 {all -> 0x015f, blocks: (B:82:0x0108, B:84:0x0134, B:87:0x0142, B:104:0x0180, B:108:0x01b4, B:117:0x01e1, B:130:0x0213, B:132:0x022a, B:153:0x0289, B:155:0x029d, B:157:0x02a4, B:165:0x02e9, B:161:0x02c2, B:163:0x02dc, B:181:0x032c, B:188:0x036f, B:191:0x0398, B:194:0x03a7, B:197:0x03b8, B:198:0x03c0, B:200:0x03c6, B:202:0x03cd, B:204:0x03d2, B:211:0x03f6, B:215:0x0421, B:217:0x042c, B:218:0x0461, B:219:0x046e, B:221:0x0474, B:223:0x047b, B:224:0x047f, B:228:0x0495, B:236:0x04a7, B:238:0x04d1, B:239:0x04e0, B:241:0x04ec), top: B:257:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:159:0x02be  */
    /* JADX WARN: Code duplicated, block: B:161:0x02c2 A[Catch: all -> 0x015f, Exception -> 0x0506, OutOfMemoryError -> 0x0508, TryCatch #8 {all -> 0x015f, blocks: (B:82:0x0108, B:84:0x0134, B:87:0x0142, B:104:0x0180, B:108:0x01b4, B:117:0x01e1, B:130:0x0213, B:132:0x022a, B:153:0x0289, B:155:0x029d, B:157:0x02a4, B:165:0x02e9, B:161:0x02c2, B:163:0x02dc, B:181:0x032c, B:188:0x036f, B:191:0x0398, B:194:0x03a7, B:197:0x03b8, B:198:0x03c0, B:200:0x03c6, B:202:0x03cd, B:204:0x03d2, B:211:0x03f6, B:215:0x0421, B:217:0x042c, B:218:0x0461, B:219:0x046e, B:221:0x0474, B:223:0x047b, B:224:0x047f, B:228:0x0495, B:236:0x04a7, B:238:0x04d1, B:239:0x04e0, B:241:0x04ec), top: B:257:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02dc A[Catch: all -> 0x015f, Exception -> 0x0506, OutOfMemoryError -> 0x0508, TryCatch #8 {all -> 0x015f, blocks: (B:82:0x0108, B:84:0x0134, B:87:0x0142, B:104:0x0180, B:108:0x01b4, B:117:0x01e1, B:130:0x0213, B:132:0x022a, B:153:0x0289, B:155:0x029d, B:157:0x02a4, B:165:0x02e9, B:161:0x02c2, B:163:0x02dc, B:181:0x032c, B:188:0x036f, B:191:0x0398, B:194:0x03a7, B:197:0x03b8, B:198:0x03c0, B:200:0x03c6, B:202:0x03cd, B:204:0x03d2, B:211:0x03f6, B:215:0x0421, B:217:0x042c, B:218:0x0461, B:219:0x046e, B:221:0x0474, B:223:0x047b, B:224:0x047f, B:228:0x0495, B:236:0x04a7, B:238:0x04d1, B:239:0x04e0, B:241:0x04ec), top: B:257:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:164:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:170:0x0316  */
    /* JADX WARN: Code duplicated, block: B:172:0x031c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0363 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x0365  */
    /* JADX WARN: Code duplicated, block: B:205:0x03ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:229:0x0499 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x049b  */
    /* JADX WARN: Code duplicated, block: B:251:0x050f  */
    /* JADX WARN: Code duplicated, block: B:86:0x013a  */
    private static zzajs zzc(int i, zzeu zzeuVar, boolean z, int i2, zzajo zzajoVar) {
        int iZzH;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        zzajs zzajsVar;
        int i5;
        zzajs zzajjVar;
        zzajs zzajvVar;
        zzajs zzajmVar;
        byte[] bArr;
        int iZzi;
        String strZza;
        String strConcat;
        int iZzs = zzeuVar.zzs();
        int iZzs2 = zzeuVar.zzs();
        int iZzs3 = zzeuVar.zzs();
        int i6 = 0;
        int iZzs4 = i >= 3 ? zzeuVar.zzs() : 0;
        if (i == 4) {
            iZzH = zzeuVar.zzH();
            if (!z) {
                iZzH = ((iZzH >> 24) << 21) | (iZzH & 255) | (((iZzH >> 8) & 255) << 7) | (((iZzH >> 16) & 255) << 14);
            }
        } else {
            iZzH = i == 3 ? zzeuVar.zzH() : zzeuVar.zzx();
        }
        int iZzt = i >= 3 ? zzeuVar.zzt() : 0;
        if (iZzs == 0 && iZzs2 == 0 && iZzs3 == 0 && iZzs4 == 0 && iZzH == 0 && iZzt == 0) {
            zzeuVar.zzh(zzeuVar.zze());
            return null;
        }
        int iZzg = zzeuVar.zzg() + iZzH;
        String str = "Id3Decoder";
        if (iZzg > zzeuVar.zze()) {
            zzeh.zzc("Id3Decoder", "Frame size exceeds remaining tag data");
            zzeuVar.zzh(zzeuVar.zze());
            return null;
        }
        if (zzajoVar != null) {
            zzeuVar.zzh(iZzg);
            return null;
        }
        if (i == 3) {
            int i7 = iZzt & 64;
            i3 = (iZzt & 128) != 0 ? 1 : 0;
            iZzs = 0;
            z3 = i7 != 0;
            z2 = (iZzt & 32) != 0;
            i4 = i3;
        } else if (i == 4) {
            boolean z4 = (iZzt & 64) != 0;
            int i8 = (iZzt & 8) != 0 ? 1 : 0;
            z3 = (iZzt & 4) != 0;
            iZzs = (iZzt & 2) != 0 ? 1 : 0;
            i4 = iZzt & 1;
            int i9 = i8;
            z2 = z4;
            i3 = i9;
        } else {
            i3 = 0;
            i4 = 0;
            z2 = false;
            z3 = false;
            iZzs = 0;
        }
        if (i3 != 0 || z3) {
            zzeh.zzc("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzeuVar.zzh(iZzg);
            return null;
        }
        if (z2) {
            zzeuVar.zzk(1);
            iZzH--;
        }
        if (i4 != 0) {
            zzeuVar.zzk(4);
            iZzH -= 4;
        }
        if (iZzs != 0) {
            iZzH = zze(zzeuVar, iZzH);
        }
        try {
            try {
                if (iZzs == 84 && iZzs2 == 88 && iZzs3 == 88 && (i == 2 || iZzs4 == 88)) {
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzajmVar = null;
                    } else {
                        int iZzs5 = zzeuVar.zzs();
                        int i10 = iZzH - 1;
                        byte[] bArr2 = new byte[i10];
                        zzeuVar.zzm(bArr2, 0, i10);
                        int iZzh = zzh(bArr2, 0, iZzs5);
                        zzajmVar = new zzajx("TXXX", new String(bArr2, 0, iZzh, zzf(iZzs5)), zzd(bArr2, iZzs5, iZzh + zzj(iZzs5)));
                        str = "Id3Decoder";
                    }
                } else if (iZzs == 84) {
                    String strZzg = zzg(i, 84, iZzs2, iZzs3, iZzs4);
                    if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzajmVar = null;
                    } else {
                        int iZzs6 = zzeuVar.zzs();
                        int i11 = iZzH - 1;
                        byte[] bArr3 = new byte[i11];
                        zzeuVar.zzm(bArr3, 0, i11);
                        zzajmVar = new zzajx(strZzg, null, zzd(bArr3, iZzs6, 0));
                        str = "Id3Decoder";
                    }
                } else {
                    if (iZzs != 87) {
                        i5 = iZzs;
                    } else if (iZzs2 != 88 || iZzs3 != 88 || (i != 2 && iZzs4 != 88)) {
                        i5 = 87;
                    } else if (iZzH <= 0) {
                        iZzs = iZzs;
                        str = "Id3Decoder";
                        zzajmVar = null;
                    } else {
                        int iZzs7 = zzeuVar.zzs();
                        int i12 = iZzH - 1;
                        byte[] bArr4 = new byte[i12];
                        zzeuVar.zzm(bArr4, 0, i12);
                        int iZzh2 = zzh(bArr4, 0, iZzs7);
                        String str2 = new String(bArr4, 0, iZzh2, zzf(iZzs7));
                        int iZzj = iZzh2 + zzj(iZzs7);
                        zzajmVar = new zzajy("WXXX", str2, zzl(bArr4, iZzj, zzi(bArr4, iZzj), StandardCharsets.ISO_8859_1));
                        str = "Id3Decoder";
                    }
                    if (i5 == 87) {
                        String strZzg2 = zzg(i, 87, iZzs2, iZzs3, iZzs4);
                        byte[] bArr5 = new byte[iZzH];
                        zzeuVar.zzm(bArr5, 0, iZzH);
                        zzajmVar = new zzajy(strZzg2, null, new String(bArr5, 0, zzi(bArr5, 0), StandardCharsets.ISO_8859_1));
                    } else {
                        if (i5 == 80) {
                            if (iZzs2 == 82 && iZzs3 == 73 && iZzs4 == 86) {
                                byte[] bArr6 = new byte[iZzH];
                                zzeuVar.zzm(bArr6, 0, iZzH);
                                int iZzi2 = zzi(bArr6, 0);
                                zzajmVar = new zzajw(new String(bArr6, 0, iZzi2, StandardCharsets.ISO_8859_1), zzk(bArr6, iZzi2 + 1, iZzH));
                            } else {
                                i5 = 80;
                            }
                        }
                        try {
                            if (i5 != 71) {
                                try {
                                    if (i != 2) {
                                        if (i5 != 65 && iZzs2 == 80 && iZzs3 == 73 && iZzs4 == 67) {
                                            int iZzs8 = zzeuVar.zzs();
                                            Charset charsetZzf = zzf(iZzs8);
                                            int i13 = iZzH - 1;
                                            bArr = new byte[i13];
                                            zzeuVar.zzm(bArr, 0, i13);
                                            if (i == 2) {
                                                iZzs = iZzs;
                                                String strZza2 = zzgsz.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
                                                String.valueOf(strZza2);
                                                strConcat = "image/".concat(String.valueOf(strZza2));
                                                if ("image/jpg".equals(strConcat)) {
                                                    strConcat = "image/jpeg";
                                                }
                                                iZzi = 2;
                                            } else {
                                                iZzs = iZzs;
                                                iZzi = zzi(bArr, 0);
                                                strZza = zzgsz.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                                if (strZza.indexOf(47) == -1) {
                                                    String.valueOf(strZza);
                                                    strConcat = "image/".concat(String.valueOf(strZza));
                                                } else {
                                                    strConcat = strZza;
                                                }
                                            }
                                            int i14 = bArr[iZzi + 1] & 255;
                                            int i15 = iZzi + 2;
                                            int iZzh3 = zzh(bArr, i15, iZzs8);
                                            zzajjVar = new zzaji(strConcat, new String(bArr, i15, iZzh3 - i15, charsetZzf), i14, zzk(bArr, iZzh3 + zzj(iZzs8), i13));
                                        } else {
                                            iZzs = iZzs;
                                            if (i5 == 67) {
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 77) {
                                                        }
                                                        String strZzg3 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr7 = new byte[iZzH];
                                                        zzeuVar.zzm(bArr7, 0, iZzH);
                                                        zzajjVar = new zzajj(strZzg3, bArr7);
                                                    } else {
                                                        if (i5 != 77) {
                                                        }
                                                        String strZzg4 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr8 = new byte[iZzH];
                                                        zzeuVar.zzm(bArr8, 0, iZzH);
                                                        zzajjVar = new zzajj(strZzg4, bArr8);
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strZzg5 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr9 = new byte[iZzH];
                                                    zzeuVar.zzm(bArr9, 0, iZzH);
                                                    zzajjVar = new zzajj(strZzg5, bArr9);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strZzg6 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr10 = new byte[iZzH];
                                                    zzeuVar.zzm(bArr10, 0, iZzH);
                                                    zzajjVar = new zzajj(strZzg6, bArr10);
                                                }
                                                zzajmVar = zzajvVar;
                                            } else {
                                                if (i5 != 67) {
                                                    if (i5 != 67) {
                                                        if (i5 != 77) {
                                                        }
                                                        String strZzg7 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr11 = new byte[iZzH];
                                                        zzeuVar.zzm(bArr11, 0, iZzH);
                                                        zzajjVar = new zzajj(strZzg7, bArr11);
                                                    } else {
                                                        if (i5 != 77) {
                                                        }
                                                        String strZzg8 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                        byte[] bArr12 = new byte[iZzH];
                                                        zzeuVar.zzm(bArr12, 0, iZzH);
                                                        zzajjVar = new zzajj(strZzg8, bArr12);
                                                    }
                                                } else if (i5 != 67) {
                                                    if (i5 != 77) {
                                                    }
                                                    String strZzg9 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr13 = new byte[iZzH];
                                                    zzeuVar.zzm(bArr13, 0, iZzH);
                                                    zzajjVar = new zzajj(strZzg9, bArr13);
                                                } else {
                                                    if (i5 != 77) {
                                                    }
                                                    String strZzg10 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                    byte[] bArr14 = new byte[iZzH];
                                                    zzeuVar.zzm(bArr14, 0, iZzH);
                                                    zzajjVar = new zzajj(strZzg10, bArr14);
                                                }
                                                zzajmVar = zzajvVar;
                                            }
                                        }
                                        zzajmVar = zzajjVar;
                                    } else if (i5 != 80 && iZzs2 == 73 && iZzs3 == 67) {
                                        int iZzs9 = zzeuVar.zzs();
                                        Charset charsetZzf2 = zzf(iZzs9);
                                        int i16 = iZzH - 1;
                                        bArr = new byte[i16];
                                        zzeuVar.zzm(bArr, 0, i16);
                                        if (i == 2) {
                                            iZzs = iZzs;
                                            String strZza3 = zzgsz.zza(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
                                            String.valueOf(strZza3);
                                            strConcat = "image/".concat(String.valueOf(strZza3));
                                            if ("image/jpg".equals(strConcat)) {
                                                strConcat = "image/jpeg";
                                            }
                                            iZzi = 2;
                                        } else {
                                            iZzs = iZzs;
                                            iZzi = zzi(bArr, 0);
                                            strZza = zzgsz.zza(new String(bArr, 0, iZzi, StandardCharsets.ISO_8859_1));
                                            if (strZza.indexOf(47) == -1) {
                                                String.valueOf(strZza);
                                                strConcat = "image/".concat(String.valueOf(strZza));
                                            } else {
                                                strConcat = strZza;
                                            }
                                        }
                                        int i17 = bArr[iZzi + 1] & 255;
                                        int i18 = iZzi + 2;
                                        int iZzh4 = zzh(bArr, i18, iZzs9);
                                        zzajjVar = new zzaji(strConcat, new String(bArr, i18, iZzh4 - i18, charsetZzf2), i17, zzk(bArr, iZzh4 + zzj(iZzs9), i16));
                                        zzajmVar = zzajjVar;
                                    } else {
                                        iZzs = iZzs;
                                        if (i5 == 67 || iZzs2 != 79 || iZzs3 != 77 || (iZzs4 != 77 && i != 2)) {
                                            if (i5 != 67 && iZzs2 == 72 && iZzs3 == 65 && iZzs4 == 80) {
                                                int iZzg2 = zzeuVar.zzg();
                                                int iZzi3 = zzi(zzeuVar.zzi(), iZzg2);
                                                String str3 = new String(zzeuVar.zzi(), iZzg2, iZzi3 - iZzg2, StandardCharsets.ISO_8859_1);
                                                zzeuVar.zzh(iZzi3 + 1);
                                                int iZzB = zzeuVar.zzB();
                                                int iZzB2 = zzeuVar.zzB();
                                                if (iZzB > iZzB2) {
                                                    zzajmVar = null;
                                                } else {
                                                    long jZzz = zzeuVar.zzz();
                                                    if (jZzz == KeyboardMap.kValueMask) {
                                                        jZzz = -1;
                                                    }
                                                    long j = jZzz;
                                                    long jZzz2 = zzeuVar.zzz();
                                                    if (jZzz2 == KeyboardMap.kValueMask) {
                                                        jZzz2 = -1;
                                                    }
                                                    long j2 = jZzz2;
                                                    ArrayList arrayList = new ArrayList();
                                                    int i19 = iZzg2 + iZzH;
                                                    while (zzeuVar.zzg() < i19) {
                                                        zzajs zzajsVarZzc = zzc(i, zzeuVar, z, i2, null);
                                                        if (zzajsVarZzc != null) {
                                                            arrayList.add(zzajsVarZzc);
                                                        }
                                                        i6 = 0;
                                                    }
                                                    zzajvVar = new zzajk(str3, iZzB, iZzB2, j, j2, (zzajs[]) arrayList.toArray(new zzajs[i6]));
                                                }
                                            } else if (i5 != 67 && iZzs2 == 84 && iZzs3 == 79 && iZzs4 == 67) {
                                                int iZzg3 = zzeuVar.zzg();
                                                int iZzi4 = zzi(zzeuVar.zzi(), iZzg3);
                                                String str4 = new String(zzeuVar.zzi(), iZzg3, iZzi4 - iZzg3, StandardCharsets.ISO_8859_1);
                                                zzeuVar.zzh(iZzi4 + 1);
                                                int iZzs10 = zzeuVar.zzs();
                                                boolean z5 = (iZzs10 & 2) != 0;
                                                int i20 = iZzs10 & 1;
                                                int iZzs11 = zzeuVar.zzs();
                                                String[] strArr = new String[iZzs11];
                                                int i21 = 0;
                                                while (i21 < iZzs11) {
                                                    int iZzg4 = zzeuVar.zzg();
                                                    int i22 = iZzg3;
                                                    int iZzi5 = zzi(zzeuVar.zzi(), iZzg4);
                                                    String[] strArr2 = strArr;
                                                    strArr2[i21] = new String(zzeuVar.zzi(), iZzg4, iZzi5 - iZzg4, StandardCharsets.ISO_8859_1);
                                                    zzeuVar.zzh(iZzi5 + 1);
                                                    i21++;
                                                    iZzg3 = i22;
                                                    iZzs11 = iZzs11;
                                                    str4 = str4;
                                                    strArr = strArr2;
                                                }
                                                int i23 = iZzg3;
                                                String str5 = str4;
                                                String[] strArr3 = strArr;
                                                ArrayList arrayList2 = new ArrayList();
                                                int i24 = i23 + iZzH;
                                                while (zzeuVar.zzg() < i24) {
                                                    zzajs zzajsVarZzc2 = zzc(i, zzeuVar, z, i2, null);
                                                    if (zzajsVarZzc2 != null) {
                                                        arrayList2.add(zzajsVarZzc2);
                                                    }
                                                }
                                                zzajvVar = new zzajl(str5, z5, 1 == i20, strArr3, (zzajs[]) arrayList2.toArray(new zzajs[0]));
                                            } else if (i5 != 77 && iZzs2 == 76 && iZzs3 == 76 && iZzs4 == 84) {
                                                int iZzt2 = zzeuVar.zzt();
                                                int iZzx = zzeuVar.zzx();
                                                int iZzx2 = zzeuVar.zzx();
                                                int iZzs12 = zzeuVar.zzs();
                                                int iZzs13 = zzeuVar.zzs();
                                                zzet zzetVar = new zzet();
                                                zzetVar.zza(zzeuVar);
                                                int i25 = ((iZzH - 10) * 8) / (iZzs12 + iZzs13);
                                                int[] iArr = new int[i25];
                                                int[] iArr2 = new int[i25];
                                                for (int i26 = 0; i26 < i25; i26++) {
                                                    int iZzj2 = zzetVar.zzj(iZzs12);
                                                    int iZzj3 = zzetVar.zzj(iZzs13);
                                                    iArr[i26] = iZzj2;
                                                    iArr2[i26] = iZzj3;
                                                }
                                                zzajvVar = new zzajv(iZzt2, iZzx, iZzx2, iArr, iArr2);
                                            } else {
                                                String strZzg11 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr15 = new byte[iZzH];
                                                zzeuVar.zzm(bArr15, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg11, bArr15);
                                                zzajmVar = zzajjVar;
                                            }
                                            zzajmVar = zzajvVar;
                                        } else if (iZzH < 4) {
                                            zzajmVar = null;
                                        } else {
                                            int iZzs14 = zzeuVar.zzs();
                                            Charset charsetZzf3 = zzf(iZzs14);
                                            byte[] bArr16 = new byte[3];
                                            zzeuVar.zzm(bArr16, 0, 3);
                                            String str6 = new String(bArr16, 0, 3);
                                            int i27 = iZzH - 4;
                                            byte[] bArr17 = new byte[i27];
                                            zzeuVar.zzm(bArr17, 0, i27);
                                            int iZzh5 = zzh(bArr17, 0, iZzs14);
                                            String str7 = new String(bArr17, 0, iZzh5, charsetZzf3);
                                            int iZzj4 = iZzh5 + zzj(iZzs14);
                                            zzajmVar = new zzajm(str6, str7, zzl(bArr17, iZzj4, zzh(bArr17, iZzj4, iZzs14), charsetZzf3));
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    zzeuVar.zzh(iZzg);
                                    zzajsVar = null;
                                } catch (OutOfMemoryError e2) {
                                    e = e2;
                                    zzeuVar.zzh(iZzg);
                                    zzajsVar = null;
                                }
                                if (zzajsVar == null) {
                                    String strZzg12 = zzg(i, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb = new StringBuilder(String.valueOf(strZzg12).length() + 39 + String.valueOf(iZzH).length());
                                    sb.append("Failed to decode frame: id=");
                                    sb.append(strZzg12);
                                    sb.append(", frameSize=");
                                    sb.append(iZzH);
                                    zzeh.zzd(str, sb.toString(), e);
                                }
                                return zzajsVar;
                            }
                            if (iZzs2 != 69 || iZzs3 != 79) {
                                i5 = 71;
                                if (i != 2) {
                                    if (i5 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg13 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr18 = new byte[iZzH];
                                                zzeuVar.zzm(bArr18, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg13, bArr18);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg14 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr19 = new byte[iZzH];
                                                zzeuVar.zzm(bArr19, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg14, bArr19);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg15 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr110 = new byte[iZzH];
                                            zzeuVar.zzm(bArr110, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg15, bArr110);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg16 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr111 = new byte[iZzH];
                                            zzeuVar.zzm(bArr111, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg16, bArr111);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    } else {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg17 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr112 = new byte[iZzH];
                                                zzeuVar.zzm(bArr112, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg17, bArr112);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg18 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr113 = new byte[iZzH];
                                                zzeuVar.zzm(bArr113, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg18, bArr113);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg19 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr114 = new byte[iZzH];
                                            zzeuVar.zzm(bArr114, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg19, bArr114);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg110 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr115 = new byte[iZzH];
                                            zzeuVar.zzm(bArr115, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg110, bArr115);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    }
                                } else {
                                    if (i5 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg111 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr116 = new byte[iZzH];
                                                zzeuVar.zzm(bArr116, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg111, bArr116);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg112 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr117 = new byte[iZzH];
                                                zzeuVar.zzm(bArr117, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg112, bArr117);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg113 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr118 = new byte[iZzH];
                                            zzeuVar.zzm(bArr118, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg113, bArr118);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg114 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr119 = new byte[iZzH];
                                            zzeuVar.zzm(bArr119, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg114, bArr119);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    } else {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg115 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1110 = new byte[iZzH];
                                                zzeuVar.zzm(bArr1110, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg115, bArr1110);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg116 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1111 = new byte[iZzH];
                                                zzeuVar.zzm(bArr1111, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg116, bArr1111);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg117 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1112 = new byte[iZzH];
                                            zzeuVar.zzm(bArr1112, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg117, bArr1112);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg118 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1113 = new byte[iZzH];
                                            zzeuVar.zzm(bArr1113, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg118, bArr1113);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    }
                                }
                                if (zzajsVar == null) {
                                    String strZzg119 = zzg(i, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strZzg119).length() + 39 + String.valueOf(iZzH).length());
                                    sb2.append("Failed to decode frame: id=");
                                    sb2.append(strZzg119);
                                    sb2.append(", frameSize=");
                                    sb2.append(iZzH);
                                    zzeh.zzd(str, sb2.toString(), e);
                                }
                                return zzajsVar;
                            }
                            if (iZzs4 != 66 && i != 2) {
                                i5 = 71;
                                if (i != 2) {
                                    if (i5 != 80) {
                                    }
                                    iZzs = iZzs;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg1110 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1114 = new byte[iZzH];
                                                zzeuVar.zzm(bArr1114, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg1110, bArr1114);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg1111 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1115 = new byte[iZzH];
                                                zzeuVar.zzm(bArr1115, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg1111, bArr1115);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg1112 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1116 = new byte[iZzH];
                                            zzeuVar.zzm(bArr1116, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg1112, bArr1116);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg1113 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr1117 = new byte[iZzH];
                                            zzeuVar.zzm(bArr1117, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg1113, bArr1117);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    } else {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg1114 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1118 = new byte[iZzH];
                                                zzeuVar.zzm(bArr1118, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg1114, bArr1118);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg1115 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr1119 = new byte[iZzH];
                                                zzeuVar.zzm(bArr1119, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg1115, bArr1119);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg1116 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11110 = new byte[iZzH];
                                            zzeuVar.zzm(bArr11110, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg1116, bArr11110);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg1117 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11111 = new byte[iZzH];
                                            zzeuVar.zzm(bArr11111, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg1117, bArr11111);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    }
                                } else {
                                    if (i5 != 65) {
                                    }
                                    iZzs = iZzs;
                                    if (i5 == 67) {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg1118 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11112 = new byte[iZzH];
                                                zzeuVar.zzm(bArr11112, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg1118, bArr11112);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg1119 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11113 = new byte[iZzH];
                                                zzeuVar.zzm(bArr11113, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg1119, bArr11113);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg11110 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11114 = new byte[iZzH];
                                            zzeuVar.zzm(bArr11114, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg11110, bArr11114);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg11111 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11115 = new byte[iZzH];
                                            zzeuVar.zzm(bArr11115, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg11111, bArr11115);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    } else {
                                        if (i5 != 67) {
                                            if (i5 != 67) {
                                                if (i5 != 77) {
                                                }
                                                String strZzg11112 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11116 = new byte[iZzH];
                                                zzeuVar.zzm(bArr11116, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg11112, bArr11116);
                                                zzajmVar = zzajjVar;
                                            } else {
                                                if (i5 != 77) {
                                                }
                                                String strZzg11113 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                                byte[] bArr11117 = new byte[iZzH];
                                                zzeuVar.zzm(bArr11117, 0, iZzH);
                                                zzajjVar = new zzajj(strZzg11113, bArr11117);
                                                zzajmVar = zzajjVar;
                                            }
                                        } else if (i5 != 67) {
                                            if (i5 != 77) {
                                            }
                                            String strZzg11114 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11118 = new byte[iZzH];
                                            zzeuVar.zzm(bArr11118, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg11114, bArr11118);
                                            zzajmVar = zzajjVar;
                                        } else {
                                            if (i5 != 77) {
                                            }
                                            String strZzg11115 = zzg(i, i5, iZzs2, iZzs3, iZzs4);
                                            byte[] bArr11119 = new byte[iZzH];
                                            zzeuVar.zzm(bArr11119, 0, iZzH);
                                            zzajjVar = new zzajj(strZzg11115, bArr11119);
                                            zzajmVar = zzajjVar;
                                        }
                                        zzajmVar = zzajvVar;
                                    }
                                }
                                if (zzajsVar == null) {
                                    String strZzg1120 = zzg(i, iZzs, iZzs2, iZzs3, iZzs4);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(strZzg1120).length() + 39 + String.valueOf(iZzH).length());
                                    sb3.append("Failed to decode frame: id=");
                                    sb3.append(strZzg1120);
                                    sb3.append(", frameSize=");
                                    sb3.append(iZzH);
                                    zzeh.zzd(str, sb3.toString(), e);
                                }
                                return zzajsVar;
                            }
                            try {
                                int iZzs15 = zzeuVar.zzs();
                                Charset charsetZzf4 = zzf(iZzs15);
                                int i28 = iZzH - 1;
                                byte[] bArr20 = new byte[i28];
                                zzeuVar.zzm(bArr20, 0, i28);
                                int iZzi6 = zzi(bArr20, 0);
                                str = "Id3Decoder";
                                String strZzh = zzas.zzh(new String(bArr20, 0, iZzi6, StandardCharsets.ISO_8859_1));
                                int i29 = iZzi6 + 1;
                                int iZzh6 = zzh(bArr20, i29, iZzs15);
                                String strZzl = zzl(bArr20, i29, iZzh6, charsetZzf4);
                                int iZzj5 = iZzh6 + zzj(iZzs15);
                                int iZzh7 = zzh(bArr20, iZzj5, iZzs15);
                                iZzs = iZzs;
                                zzajmVar = new zzajn(strZzh, strZzl, zzl(bArr20, iZzj5, iZzh7, charsetZzf4), zzk(bArr20, iZzh7 + zzj(iZzs15), i28));
                            } catch (Exception e3) {
                                e = e3;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzeuVar.zzh(iZzg);
                                zzajsVar = null;
                            } catch (OutOfMemoryError e4) {
                                e = e4;
                                str = "Id3Decoder";
                                iZzs = iZzs;
                                zzeuVar.zzh(iZzg);
                                zzajsVar = null;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        } catch (OutOfMemoryError e6) {
                            e = e6;
                        }
                    }
                    str = "Id3Decoder";
                }
                zzeuVar.zzh(iZzg);
                zzajsVar = zzajmVar;
                e = null;
            } catch (Throwable th) {
                zzeuVar.zzh(iZzg);
                throw th;
            }
        } catch (Exception e7) {
            e = e7;
            iZzs = iZzs;
            str = "Id3Decoder";
            zzeuVar.zzh(iZzg);
            zzajsVar = null;
            if (zzajsVar == null) {
                String strZzg1121 = zzg(i, iZzs, iZzs2, iZzs3, iZzs4);
                StringBuilder sb4 = new StringBuilder(String.valueOf(strZzg1121).length() + 39 + String.valueOf(iZzH).length());
                sb4.append("Failed to decode frame: id=");
                sb4.append(strZzg1121);
                sb4.append(", frameSize=");
                sb4.append(iZzH);
                zzeh.zzd(str, sb4.toString(), e);
            }
            return zzajsVar;
        } catch (OutOfMemoryError e8) {
            e = e8;
            iZzs = iZzs;
            str = "Id3Decoder";
            zzeuVar.zzh(iZzg);
            zzajsVar = null;
            if (zzajsVar == null) {
                String strZzg1122 = zzg(i, iZzs, iZzs2, iZzs3, iZzs4);
                StringBuilder sb5 = new StringBuilder(String.valueOf(strZzg1122).length() + 39 + String.valueOf(iZzH).length());
                sb5.append("Failed to decode frame: id=");
                sb5.append(strZzg1122);
                sb5.append(", frameSize=");
                sb5.append(iZzH);
                zzeh.zzd(str, sb5.toString(), e);
            }
            return zzajsVar;
        }
        if (zzajsVar == null) {
            String strZzg1123 = zzg(i, iZzs, iZzs2, iZzs3, iZzs4);
            StringBuilder sb6 = new StringBuilder(String.valueOf(strZzg1123).length() + 39 + String.valueOf(iZzH).length());
            sb6.append("Failed to decode frame: id=");
            sb6.append(strZzg1123);
            sb6.append(", frameSize=");
            sb6.append(iZzH);
            zzeh.zzd(str, sb6.toString(), e);
        }
        return zzajsVar;
    }

    private static zzgwt zzd(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzgwt.zzj("");
        }
        int i3 = zzgwt.zzd;
        zzgwq zzgwqVar = new zzgwq();
        int iZzh = zzh(bArr, i2, i);
        while (i2 < iZzh) {
            zzgwqVar.zzf(new String(bArr, i2, iZzh - i2, zzf(i)));
            i2 = zzj(i) + iZzh;
            iZzh = zzh(bArr, i2, i);
        }
        zzgwt zzgwtVarZzi = zzgwqVar.zzi();
        return zzgwtVarZzi.isEmpty() ? zzgwt.zzj("") : zzgwtVarZzi;
    }

    private static int zze(zzeu zzeuVar, int i) {
        byte[] bArrZzi = zzeuVar.zzi();
        int iZzg = zzeuVar.zzg();
        int i2 = iZzg;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iZzg + i) {
                return i;
            }
            if ((bArrZzi[i2] & 255) == 255 && bArrZzi[i3] == 0) {
                System.arraycopy(bArrZzi, i2 + 2, bArrZzi, i3, (i - (i2 - iZzg)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String zzg(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int zzh(byte[] bArr, int i, int i2) {
        int iZzi = zzi(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return iZzi;
        }
        while (true) {
            int length = bArr.length;
            if (iZzi >= length - 1) {
                return length;
            }
            int i3 = iZzi + 1;
            if ((iZzi - i) % 2 == 0 && bArr[i3] == 0) {
                return iZzi;
            }
            iZzi = zzi(bArr, i3);
        }
    }

    private static int zzi(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zzj(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzfm.zzb : Arrays.copyOfRange(bArr, i, i2);
    }

    private static String zzl(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static Charset zzf(int i) {
        if (i == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i != 2) {
            return i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }
}
