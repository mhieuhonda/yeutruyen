package com.google.android.gms.internal.ads;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzigc<T> implements zzigr<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzihk.zzr();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzifz zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzihd zzm;
    private final zziea zzn;

    private zzigc(int[] iArr, Object[] objArr, int i, int i2, zzifz zzifzVar, boolean z, int[] iArr2, int i3, int i4, zzigf zzigfVar, zzifl zziflVar, zzihd zzihdVar, zziea zzieaVar, zzifu zzifuVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzifzVar instanceof zziep;
        boolean z2 = false;
        if (zzieaVar != null && (zzifzVar instanceof zziel)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzihdVar;
        this.zzn = zzieaVar;
        this.zzg = zzifzVar;
    }

    private final int zzA(int i) {
        return this.zzc[i + 1];
    }

    private final int zzB(int i) {
        return this.zzc[i + 2];
    }

    private static int zzC(int i) {
        return (i >>> 20) & 255;
    }

    private static boolean zzD(int i) {
        return (i & 536870912) != 0;
    }

    private static boolean zzE(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zziep) {
            return ((zziep) obj).zzaX();
        }
        return true;
    }

    private static void zzF(Object obj) {
        if (zzE(obj)) {
            return;
        }
        String strValueOf = String.valueOf(obj);
        String.valueOf(strValueOf);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(strValueOf)));
    }

    private static int zzG(Object obj, long j) {
        return ((Integer) zzihk.zzm(obj, j)).intValue();
    }

    private static long zzH(Object obj, long j) {
        return ((Long) zzihk.zzm(obj, j)).longValue();
    }

    private final boolean zzI(Object obj, Object obj2, int i) {
        return zzK(obj, i) == zzK(obj2, i);
    }

    private final boolean zzJ(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzK(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private final boolean zzK(Object obj, int i) {
        int iZzB = zzB(i);
        long j = iZzB & 1048575;
        if (j != 1048575) {
            return (zzihk.zzc(obj, j) & (1 << (iZzB >>> 20))) != 0;
        }
        int iZzA = zzA(i);
        long j2 = iZzA & 1048575;
        switch (zzC(iZzA)) {
            case 0:
                return Double.doubleToRawLongBits(zzihk.zzk(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzihk.zzi(obj, j2)) != 0;
            case 2:
                return zzihk.zze(obj, j2) != 0;
            case 3:
                return zzihk.zze(obj, j2) != 0;
            case 4:
                return zzihk.zzc(obj, j2) != 0;
            case 5:
                return zzihk.zze(obj, j2) != 0;
            case 6:
                return zzihk.zzc(obj, j2) != 0;
            case 7:
                return zzihk.zzg(obj, j2);
            case 8:
                Object objZzm = zzihk.zzm(obj, j2);
                if (objZzm instanceof String) {
                    return !((String) objZzm).isEmpty();
                }
                if (objZzm instanceof zzidl) {
                    return !zzidl.zza.equals(objZzm);
                }
                return zzR();
            case 9:
                return zzihk.zzm(obj, j2) != null;
            case 10:
                return !zzidl.zza.equals(zzihk.zzm(obj, j2));
            case 11:
                return zzihk.zzc(obj, j2) != 0;
            case 12:
                return zzihk.zzc(obj, j2) != 0;
            case 13:
                return zzihk.zzc(obj, j2) != 0;
            case 14:
                return zzihk.zze(obj, j2) != 0;
            case 15:
                return zzihk.zzc(obj, j2) != 0;
            case 16:
                return zzihk.zze(obj, j2) != 0;
            case 17:
                return zzihk.zzm(obj, j2) != null;
            default:
                return zzR();
        }
    }

    private final void zzL(Object obj, int i) {
        int iZzB = zzB(i);
        long j = 1048575 & iZzB;
        if (j == 1048575) {
            return;
        }
        zzihk.zzd(obj, j, (1 << (iZzB >>> 20)) | zzihk.zzc(obj, j));
    }

    private final boolean zzM(Object obj, int i, int i2) {
        return zzihk.zzc(obj, (long) (zzB(i2) & 1048575)) == i;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        long jZzB = zzB(i) & 1048575;
        return zzihk.zzc(obj, jZzB) == zzihk.zzc(obj2, jZzB);
    }

    private final void zzO(Object obj, int i, int i2) {
        zzihk.zzd(obj, zzB(i2) & 1048575, i);
    }

    private final int zzP(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzQ(i, 0);
    }

    private final int zzQ(int i, int i2) {
        int[] iArr = this.zzc;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private boolean zzR() {
        throw new IllegalArgumentException();
    }

    private static final int zzS(byte[] bArr, int i, int i2, zzihq zzihqVar, Class cls, zzicz zziczVar) throws IOException {
        zzihq zzihqVar2 = zzihq.DOUBLE;
        switch (zzihqVar) {
            case DOUBLE:
                int i3 = i + 8;
                zziczVar.zzc = Double.valueOf(Double.longBitsToDouble(zzida.zze(bArr, i)));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                zziczVar.zzc = Float.valueOf(Float.intBitsToFloat(zzida.zzd(bArr, i)));
                return i4;
            case INT64:
            case UINT64:
                int iZzc = zzida.zzc(bArr, i, zziczVar);
                zziczVar.zzc = Long.valueOf(zziczVar.zzb);
                return iZzc;
            case INT32:
            case UINT32:
            case ENUM:
                int iZza = zzida.zza(bArr, i, zziczVar);
                zziczVar.zzc = Integer.valueOf(zziczVar.zza);
                return iZza;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                zziczVar.zzc = Long.valueOf(zzida.zze(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                zziczVar.zzc = Integer.valueOf(zzida.zzd(bArr, i));
                return i6;
            case BOOL:
                int iZzc2 = zzida.zzc(bArr, i, zziczVar);
                zziczVar.zzc = Boolean.valueOf(zziczVar.zzb != 0);
                return iZzc2;
            case STRING:
                return zzida.zzf(bArr, i, zziczVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return zzida.zzh(zzigj.zza().zzb(cls), bArr, i, i2, zziczVar);
            case BYTES:
                return zzida.zzg(bArr, i, zziczVar);
            case SINT32:
                int iZza2 = zzida.zza(bArr, i, zziczVar);
                zziczVar.zzc = Integer.valueOf(zzidp.zzM(zziczVar.zza));
                return iZza2;
            case SINT64:
                int iZzc3 = zzida.zzc(bArr, i, zziczVar);
                zziczVar.zzc = Long.valueOf(zzidp.zzN(zziczVar.zzb));
                return iZzc3;
        }
    }

    private static final void zzT(int i, Object obj, zzihs zzihsVar) throws IOException {
        if (obj instanceof String) {
            zzihsVar.zzm(i, (String) obj);
        } else {
            zzihsVar.zzn(i, (zzidl) obj);
        }
    }

    static zzihe zzh(Object obj) {
        zziep zziepVar = (zziep) obj;
        zzihe zziheVar = zziepVar.zzt;
        if (zziheVar != zzihe.zza()) {
            return zziheVar;
        }
        zzihe zziheVarZzb = zzihe.zzb();
        zziepVar.zzt = zziheVarZzb;
        return zziheVarZzb;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0260  */
    /* JADX WARN: Code duplicated, block: B:126:0x0263  */
    /* JADX WARN: Code duplicated, block: B:129:0x0283  */
    /* JADX WARN: Code duplicated, block: B:130:0x0286  */
    /* JADX WARN: Code duplicated, block: B:169:0x0342  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:192:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:194:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:195:0x03bf  */
    static zzigc zzm(Class cls, zzifw zzifwVar, zzigf zzigfVar, zzifl zziflVar, zzihd zzihdVar, zziea zzieaVar, zzifu zzifuVar) {
        int i;
        int iCharAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char cCharAt;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        char cCharAt3;
        int i12;
        char cCharAt4;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        char cCharAt7;
        int i16;
        int i17;
        int i18;
        int i19;
        int iObjectFieldOffset;
        int i20;
        char c;
        int i21;
        int i22;
        int i23;
        int i24;
        Field fieldZzn;
        int iObjectFieldOffset2;
        int i25;
        char cCharAt8;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        Object obj;
        Field fieldZzn2;
        int i35;
        Object obj2;
        Field fieldZzn3;
        int i36;
        char cCharAt9;
        int i37;
        char cCharAt10;
        int i38;
        char cCharAt11;
        int i39;
        char cCharAt12;
        if (!(zzifwVar instanceof zzigl)) {
            throw null;
        }
        zzigl zziglVar = (zzigl) zzifwVar;
        String strZzd = zziglVar.zzd();
        int length = strZzd.length();
        char c2 = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i40 = 1;
            while (true) {
                i = i40 + 1;
                if (strZzd.charAt(i40) < 55296) {
                    break;
                }
                i40 = i;
            }
        } else {
            i = 1;
        }
        int i41 = i + 1;
        int iCharAt2 = strZzd.charAt(i);
        if (iCharAt2 >= 55296) {
            int i42 = iCharAt2 & 8191;
            int i43 = 13;
            while (true) {
                i39 = i41 + 1;
                cCharAt12 = strZzd.charAt(i41);
                if (cCharAt12 < 55296) {
                    break;
                }
                i42 |= (cCharAt12 & 8191) << i43;
                i43 += 13;
                i41 = i39;
            }
            iCharAt2 = i42 | (cCharAt12 << i43);
            i41 = i39;
        }
        if (iCharAt2 == 0) {
            i6 = 0;
            i4 = 0;
            iCharAt = 0;
            i5 = 0;
            i3 = 0;
            i7 = 0;
            iArr = zza;
            i2 = 0;
        } else {
            int i44 = i41 + 1;
            int iCharAt3 = strZzd.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i15 = i44 + 1;
                    cCharAt7 = strZzd.charAt(i44);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i15;
                }
                iCharAt3 = i45 | (cCharAt7 << i46);
                i44 = i15;
            }
            int i47 = i44 + 1;
            int iCharAt4 = strZzd.charAt(i44);
            if (iCharAt4 >= 55296) {
                int i48 = iCharAt4 & 8191;
                int i49 = 13;
                while (true) {
                    i14 = i47 + 1;
                    cCharAt6 = strZzd.charAt(i47);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i14;
                }
                iCharAt4 = i48 | (cCharAt6 << i49);
                i47 = i14;
            }
            int i50 = i47 + 1;
            int iCharAt5 = strZzd.charAt(i47);
            if (iCharAt5 >= 55296) {
                int i51 = iCharAt5 & 8191;
                int i52 = 13;
                while (true) {
                    i13 = i50 + 1;
                    cCharAt5 = strZzd.charAt(i50);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i13;
                }
                iCharAt5 = i51 | (cCharAt5 << i52);
                i50 = i13;
            }
            int i53 = i50 + 1;
            int iCharAt6 = strZzd.charAt(i50);
            if (iCharAt6 >= 55296) {
                int i54 = iCharAt6 & 8191;
                int i55 = 13;
                while (true) {
                    i12 = i53 + 1;
                    cCharAt4 = strZzd.charAt(i53);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i12;
                }
                iCharAt6 = i54 | (cCharAt4 << i55);
                i53 = i12;
            }
            int i56 = i53 + 1;
            iCharAt = strZzd.charAt(i53);
            if (iCharAt >= 55296) {
                int i57 = iCharAt & 8191;
                int i58 = 13;
                while (true) {
                    i11 = i56 + 1;
                    cCharAt3 = strZzd.charAt(i56);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i11;
                }
                iCharAt = i57 | (cCharAt3 << i58);
                i56 = i11;
            }
            int i59 = i56 + 1;
            int iCharAt7 = strZzd.charAt(i56);
            if (iCharAt7 >= 55296) {
                int i60 = iCharAt7 & 8191;
                int i61 = 13;
                while (true) {
                    i10 = i59 + 1;
                    cCharAt2 = strZzd.charAt(i59);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i60 |= (cCharAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i10;
                }
                iCharAt7 = i60 | (cCharAt2 << i61);
                i59 = i10;
            }
            int i62 = i59 + 1;
            if (strZzd.charAt(i59) >= 55296) {
                while (true) {
                    i9 = i62 + 1;
                    if (strZzd.charAt(i62) < 55296) {
                        break;
                    }
                    i62 = i9;
                }
                i62 = i9;
            }
            int i63 = i62 + 1;
            int iCharAt8 = strZzd.charAt(i62);
            if (iCharAt8 >= 55296) {
                int i64 = iCharAt8 & 8191;
                int i65 = 13;
                while (true) {
                    i8 = i63 + 1;
                    cCharAt = strZzd.charAt(i63);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i64 |= (cCharAt & 8191) << i65;
                    i65 += 13;
                    i63 = i8;
                }
                iCharAt8 = i64 | (cCharAt << i65);
                i63 = i8;
            }
            int i66 = iCharAt3 + iCharAt3 + iCharAt4;
            int[] iArr2 = new int[iCharAt8 + iCharAt7 + iCharAt3];
            i2 = iCharAt3;
            i41 = i63;
            i3 = iCharAt6;
            i4 = i66;
            iArr = iArr2;
            int i67 = iCharAt7;
            i5 = iCharAt5;
            i6 = i67;
            i7 = iCharAt8;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zziglVar.zze();
        Class<?> cls2 = zziglVar.zzb().getClass();
        int i68 = i7 + i6;
        int i69 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i69];
        int i70 = i7;
        int i71 = i68;
        int i72 = 0;
        int i73 = 0;
        while (i41 < length) {
            int i74 = i41 + 1;
            int iCharAt9 = strZzd.charAt(i41);
            if (iCharAt9 >= c2) {
                int i75 = iCharAt9 & 8191;
                int i76 = i74;
                int i77 = 13;
                while (true) {
                    i38 = i76 + 1;
                    cCharAt11 = strZzd.charAt(i76);
                    if (cCharAt11 < c2) {
                        break;
                    }
                    i75 |= (cCharAt11 & 8191) << i77;
                    i77 += 13;
                    i76 = i38;
                }
                iCharAt9 = i75 | (cCharAt11 << i77);
                i16 = i38;
            } else {
                i16 = i74;
            }
            int i78 = i16 + 1;
            int iCharAt10 = strZzd.charAt(i16);
            if (iCharAt10 >= c2) {
                int i79 = iCharAt10 & 8191;
                int i80 = i78;
                int i81 = 13;
                while (true) {
                    i37 = i80 + 1;
                    cCharAt10 = strZzd.charAt(i80);
                    if (cCharAt10 < c2) {
                        break;
                    }
                    i79 |= (cCharAt10 & 8191) << i81;
                    i81 += 13;
                    i80 = i37;
                }
                iCharAt10 = i79 | (cCharAt10 << i81);
                i17 = i37;
            } else {
                i17 = i78;
            }
            if ((iCharAt10 & 1024) != 0) {
                iArr[i72] = i73;
                i72++;
            }
            int i82 = iCharAt10 & 255;
            zzigl zziglVar2 = zziglVar;
            int i83 = iCharAt10 & 2048;
            if (i82 >= 51) {
                int i84 = i17 + 1;
                int iCharAt11 = strZzd.charAt(i17);
                char c3 = 55296;
                if (iCharAt11 >= 55296) {
                    int i85 = iCharAt11 & 8191;
                    int i86 = i84;
                    int i87 = 13;
                    while (true) {
                        i36 = i86 + 1;
                        cCharAt9 = strZzd.charAt(i86);
                        if (cCharAt9 < c3) {
                            break;
                        }
                        i85 |= (cCharAt9 & 8191) << i87;
                        i87 += 13;
                        i86 = i36;
                        c3 = 55296;
                    }
                    iCharAt11 = i85 | (cCharAt9 << i87);
                    i31 = i36;
                } else {
                    i31 = i84;
                }
                i21 = i31;
                int i88 = i82 - 51;
                i18 = length;
                if (i88 == 9 || i88 == 17) {
                    i32 = i4 + 1;
                    int i89 = i73 / 3;
                    objArr[i89 + i89 + 1] = objArrZze[i4];
                } else {
                    if (i88 != 12) {
                        i33 = i83;
                    } else if (zziglVar2.zzc() == 1 || i83 != 0) {
                        i32 = i4 + 1;
                        int i90 = i73 / 3;
                        objArr[i90 + i90 + 1] = objArrZze[i4];
                    } else {
                        i33 = 0;
                    }
                    i34 = iCharAt11 + iCharAt11;
                    obj = objArrZze[i34];
                    i83 = i33;
                    if (obj instanceof Field) {
                        fieldZzn2 = (Field) obj;
                    } else {
                        fieldZzn2 = zzn(cls2, (String) obj);
                        objArrZze[i34] = fieldZzn2;
                        iArr[i71] = i73;
                        i71++;
                    }
                    int i91 = i2;
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzn2);
                    i35 = i34 + 1;
                    obj2 = objArrZze[i35];
                    i19 = i91;
                    if (obj2 instanceof Field) {
                        fieldZzn3 = (Field) obj2;
                    } else {
                        fieldZzn3 = zzn(cls2, (String) obj2);
                        objArrZze[i35] = fieldZzn3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                    strZzd = strZzd;
                    i23 = iObjectFieldOffset3;
                    i24 = 0;
                    c = 55296;
                }
                i4 = i32;
                i33 = i83;
                i34 = iCharAt11 + iCharAt11;
                obj = objArrZze[i34];
                i83 = i33;
                if (obj instanceof Field) {
                    fieldZzn2 = (Field) obj;
                } else {
                    fieldZzn2 = zzn(cls2, (String) obj);
                    objArrZze[i34] = fieldZzn2;
                    iArr[i71] = i73;
                    i71++;
                }
                int i92 = i2;
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzn2);
                i35 = i34 + 1;
                obj2 = objArrZze[i35];
                i19 = i92;
                if (obj2 instanceof Field) {
                    fieldZzn3 = (Field) obj2;
                } else {
                    fieldZzn3 = zzn(cls2, (String) obj2);
                    objArrZze[i35] = fieldZzn3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn3);
                strZzd = strZzd;
                i23 = iObjectFieldOffset4;
                i24 = 0;
                c = 55296;
            } else {
                i18 = length;
                i19 = i2;
                int i93 = i4 + 1;
                Field fieldZzn4 = zzn(cls2, (String) objArrZze[i4]);
                if (i82 == 9 || i82 == 17) {
                    int i94 = i73 / 3;
                    objArr[i94 + i94 + 1] = fieldZzn4.getType();
                } else {
                    if (i82 != 27) {
                        if (i82 == 49) {
                            i4 += 2;
                            i26 = 1;
                        } else if (i82 == 12 || i82 == 30 || i82 == 44) {
                            if (zziglVar2.zzc() == 1 || i83 != 0) {
                                i4 += 2;
                                int i95 = i73 / 3;
                                objArr[i95 + i95 + 1] = objArrZze[i93];
                            } else {
                                i4 = i93;
                                i83 = 0;
                            }
                        } else if (i82 == 50) {
                            int i96 = i4 + 2;
                            int i97 = i70 + 1;
                            iArr[i70] = i73;
                            int i98 = i73 / 3;
                            int i99 = i98 + i98;
                            objArr[i99] = objArrZze[i93];
                            if (i83 != 0) {
                                objArr[i99 + 1] = objArrZze[i96];
                                i4 += 3;
                                i70 = i97;
                            } else {
                                i4 = i96;
                                i70 = i97;
                                i83 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                        i20 = 1048575;
                        if ((iCharAt10 & 4096) != 0 || i82 > 17) {
                            c = 55296;
                            i21 = i17;
                            i22 = i83;
                            i23 = iObjectFieldOffset;
                            i24 = 0;
                        } else {
                            int i100 = i17 + 1;
                            int iCharAt12 = strZzd.charAt(i17);
                            if (iCharAt12 >= 55296) {
                                int i101 = iCharAt12 & 8191;
                                int i102 = 13;
                                while (true) {
                                    i25 = i100 + 1;
                                    cCharAt8 = strZzd.charAt(i100);
                                    if (cCharAt8 < 55296) {
                                        break;
                                    }
                                    i101 |= (cCharAt8 & 8191) << i102;
                                    i102 += 13;
                                    i100 = i25;
                                }
                                iCharAt12 = i101 | (cCharAt8 << i102);
                                i100 = i25;
                            }
                            int i103 = i19 + i19 + (iCharAt12 / 32);
                            Object obj3 = objArrZze[i103];
                            int i104 = i100;
                            if (obj3 instanceof Field) {
                                fieldZzn = (Field) obj3;
                            } else {
                                fieldZzn = zzn(cls2, (String) obj3);
                                objArrZze[i103] = fieldZzn;
                            }
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzn);
                            i23 = iObjectFieldOffset;
                            i21 = i104;
                            c = 55296;
                            i24 = iCharAt12 % 32;
                        }
                        int i105 = i73 + 1;
                        iArr3[i73] = iCharAt9;
                        int i106 = i73 + 2;
                        i27 = i22;
                        if ((iCharAt10 & 512) != 0) {
                            i28 = 536870912;
                        } else {
                            i28 = 0;
                        }
                        if ((iCharAt10 & 256) != 0) {
                            i29 = 268435456;
                        } else {
                            i29 = 0;
                        }
                        if (i27 != 0) {
                            i30 = Integer.MIN_VALUE;
                        } else {
                            i30 = 0;
                        }
                        iArr3[i105] = i28 | i29 | i30 | (i82 << 20) | i23;
                        i73 += 3;
                        iArr3[i106] = (i24 << 20) | i20;
                        strZzd = strZzd;
                        c2 = c;
                        zziglVar = zziglVar2;
                        i41 = i21;
                        length = i18;
                        i2 = i19;
                    } else {
                        i26 = 1;
                        i4 += 2;
                    }
                    int i107 = i73 / 3;
                    objArr[i107 + i107 + i26] = objArrZze[i93];
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                    i20 = 1048575;
                    if ((iCharAt10 & 4096) != 0) {
                    }
                    c = 55296;
                    i21 = i17;
                    i22 = i83;
                    i23 = iObjectFieldOffset;
                    i24 = 0;
                    int i108 = i73 + 1;
                    iArr3[i73] = iCharAt9;
                    int i109 = i73 + 2;
                    i27 = i22;
                    if ((iCharAt10 & 512) != 0) {
                        i28 = 536870912;
                    } else {
                        i28 = 0;
                    }
                    if ((iCharAt10 & 256) != 0) {
                        i29 = 268435456;
                    } else {
                        i29 = 0;
                    }
                    if (i27 != 0) {
                        i30 = Integer.MIN_VALUE;
                    } else {
                        i30 = 0;
                    }
                    iArr3[i108] = i28 | i29 | i30 | (i82 << 20) | i23;
                    i73 += 3;
                    iArr3[i109] = (i24 << 20) | i20;
                    strZzd = strZzd;
                    c2 = c;
                    zziglVar = zziglVar2;
                    i41 = i21;
                    length = i18;
                    i2 = i19;
                }
                i4 = i93;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzn4);
                i20 = 1048575;
                if ((iCharAt10 & 4096) != 0) {
                }
                c = 55296;
                i21 = i17;
                i22 = i83;
                i23 = iObjectFieldOffset;
                i24 = 0;
                int i1010 = i73 + 1;
                iArr3[i73] = iCharAt9;
                int i1011 = i73 + 2;
                i27 = i22;
                if ((iCharAt10 & 512) != 0) {
                    i28 = 536870912;
                } else {
                    i28 = 0;
                }
                if ((iCharAt10 & 256) != 0) {
                    i29 = 268435456;
                } else {
                    i29 = 0;
                }
                if (i27 != 0) {
                    i30 = Integer.MIN_VALUE;
                } else {
                    i30 = 0;
                }
                iArr3[i1010] = i28 | i29 | i30 | (i82 << 20) | i23;
                i73 += 3;
                iArr3[i1011] = (i24 << 20) | i20;
                strZzd = strZzd;
                c2 = c;
                zziglVar = zziglVar2;
                i41 = i21;
                length = i18;
                i2 = i19;
            }
            i20 = iObjectFieldOffset2;
            i22 = i83;
            int i1012 = i73 + 1;
            iArr3[i73] = iCharAt9;
            int i1013 = i73 + 2;
            i27 = i22;
            if ((iCharAt10 & 512) != 0) {
                i28 = 536870912;
            } else {
                i28 = 0;
            }
            if ((iCharAt10 & 256) != 0) {
                i29 = 268435456;
            } else {
                i29 = 0;
            }
            if (i27 != 0) {
                i30 = Integer.MIN_VALUE;
            } else {
                i30 = 0;
            }
            iArr3[i1012] = i28 | i29 | i30 | (i82 << 20) | i23;
            i73 += 3;
            iArr3[i1013] = (i24 << 20) | i20;
            strZzd = strZzd;
            c2 = c;
            zziglVar = zziglVar2;
            i41 = i21;
            length = i18;
            i2 = i19;
        }
        return new zzigc(iArr3, objArr, i5, i3, zziglVar.zzb(), false, iArr, i7, i68, zzigfVar, zziflVar, zzihdVar, zzieaVar, zzifuVar);
    }

    private static Field zzn(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(name).length() + 29 + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    private final void zzo(Object obj, Object obj2, int i) {
        if (zzK(obj2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.zzc[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzigr zzigrVarZzq = zzq(i);
            if (!zzK(obj, i)) {
                if (zzE(object)) {
                    Object objZza = zzigrVarZzq.zza();
                    zzigrVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzL(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzigrVarZzq.zza();
                zzigrVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzigrVarZzq.zzd(object2, object);
        }
    }

    private final void zzp(Object obj, Object obj2, int i) {
        int[] iArr = this.zzc;
        int i2 = iArr[i];
        if (zzM(obj2, i2, i)) {
            int iZzA = zzA(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzA;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + string.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(string);
                throw new IllegalStateException(sb.toString());
            }
            zzigr zzigrVarZzq = zzq(i);
            if (!zzM(obj, i2, i)) {
                if (zzE(object)) {
                    Object objZza = zzigrVarZzq.zza();
                    zzigrVarZzq.zzd(objZza, object);
                    unsafe.putObject(obj, j, objZza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzO(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzE(object2)) {
                Object objZza2 = zzigrVarZzq.zza();
                zzigrVarZzq.zzd(objZza2, object2);
                unsafe.putObject(obj, j, objZza2);
                object2 = objZza2;
            }
            zzigrVarZzq.zzd(object2, object);
        }
    }

    private final zzigr zzq(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzigr zzigrVar = (zzigr) objArr[i3];
        if (zzigrVar != null) {
            return zzigrVar;
        }
        zzigr zzigrVarZzb = zzigj.zza().zzb((Class) objArr[i3 + 1]);
        objArr[i3] = zzigrVarZzb;
        return zzigrVarZzb;
    }

    private final Object zzr(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private final zziev zzs(int i) {
        int i2 = i / 3;
        return (zziev) this.zzd[i2 + i2 + 1];
    }

    private final Object zzt(Object obj, int i) {
        zzigr zzigrVarZzq = zzq(i);
        int iZzA = zzA(i) & 1048575;
        if (!zzK(obj, i)) {
            return zzigrVarZzq.zza();
        }
        Object object = zzb.getObject(obj, iZzA);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzigrVarZzq.zza();
        if (object != null) {
            zzigrVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzu(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzA(i) & 1048575, obj2);
        zzL(obj, i);
    }

    private final Object zzv(Object obj, int i, int i2) {
        zzigr zzigrVarZzq = zzq(i2);
        if (!zzM(obj, i, i2)) {
            return zzigrVarZzq.zza();
        }
        Object object = zzb.getObject(obj, zzA(i2) & 1048575);
        if (zzE(object)) {
            return object;
        }
        Object objZza = zzigrVarZzq.zza();
        if (object != null) {
            zzigrVarZzq.zzd(objZza, object);
        }
        return objZza;
    }

    private final void zzw(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzA(i2) & 1048575, obj2);
        zzO(obj, i, i2);
    }

    private final Object zzx(Object obj, int i, Object obj2, zzihd zzihdVar, Object obj3) {
        zziev zzievVarZzs;
        int i2 = this.zzc[i];
        Object objZzm = zzihk.zzm(obj, zzA(i) & 1048575);
        if (objZzm == null || (zzievVarZzs = zzs(i)) == null) {
            return obj2;
        }
        zzifr zzifrVarZze = ((zzifs) zzr(i)).zze();
        Iterator it = ((zzift) objZzm).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzievVarZzs.zza(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = zzihdVar.zzh(obj3);
                }
                int iZzc = zzifs.zzc(zzifrVarZze, entry.getKey(), entry.getValue());
                zzidl zzidlVar = zzidl.zza;
                byte[] bArr = new byte[iZzc];
                int i3 = zzidu.zzb;
                zzidr zzidrVar = new zzidr(bArr, 0, iZzc);
                try {
                    zzifs.zzb(zzidrVar, zzifrVarZze, entry.getKey(), entry.getValue());
                    zzihdVar.zzd(obj2, i2, zzidh.zza(zzidrVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static boolean zzy(Object obj, int i, zzigr zzigrVar) {
        return zzigrVar.zzl(zzihk.zzm(obj, i & 1048575));
    }

    private final void zzz(Object obj, int i, zzigm zzigmVar) throws IOException {
        long j = i & 1048575;
        if (zzD(i)) {
            zzihk.zzn(obj, j, zzigmVar.zzn());
        } else if (this.zzi) {
            zzihk.zzn(obj, j, zzigmVar.zzm());
        } else {
            zzihk.zzn(obj, j, zzigmVar.zzq());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final Object zza() {
        return ((zziep) this.zzg).zzbg();
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final boolean zzb(Object obj, Object obj2) {
        boolean zZzF;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzA = zzA(i);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j = iZzA & 1048575;
                switch (iZzC) {
                    case 0:
                        if (!zzI(obj, obj2, i) || Double.doubleToLongBits(zzihk.zzk(obj, j)) != Double.doubleToLongBits(zzihk.zzk(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 1:
                        if (!zzI(obj, obj2, i) || Float.floatToIntBits(zzihk.zzi(obj, j)) != Float.floatToIntBits(zzihk.zzi(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 2:
                        if (!zzI(obj, obj2, i) || zzihk.zze(obj, j) != zzihk.zze(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 3:
                        if (!zzI(obj, obj2, i) || zzihk.zze(obj, j) != zzihk.zze(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 4:
                        if (!zzI(obj, obj2, i) || zzihk.zzc(obj, j) != zzihk.zzc(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 5:
                        if (!zzI(obj, obj2, i) || zzihk.zze(obj, j) != zzihk.zze(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 6:
                        if (!zzI(obj, obj2, i) || zzihk.zzc(obj, j) != zzihk.zzc(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 7:
                        if (!zzI(obj, obj2, i) || zzihk.zzg(obj, j) != zzihk.zzg(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 8:
                        if (!zzI(obj, obj2, i) || !zzigs.zzF(zzihk.zzm(obj, j), zzihk.zzm(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 9:
                        if (!zzI(obj, obj2, i) || !zzigs.zzF(zzihk.zzm(obj, j), zzihk.zzm(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 10:
                        if (!zzI(obj, obj2, i) || !zzigs.zzF(zzihk.zzm(obj, j), zzihk.zzm(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 11:
                        if (!zzI(obj, obj2, i) || zzihk.zzc(obj, j) != zzihk.zzc(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 12:
                        if (!zzI(obj, obj2, i) || zzihk.zzc(obj, j) != zzihk.zzc(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 13:
                        if (!zzI(obj, obj2, i) || zzihk.zzc(obj, j) != zzihk.zzc(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 14:
                        if (!zzI(obj, obj2, i) || zzihk.zze(obj, j) != zzihk.zze(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 15:
                        if (!zzI(obj, obj2, i) || zzihk.zzc(obj, j) != zzihk.zzc(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 16:
                        if (!zzI(obj, obj2, i) || zzihk.zze(obj, j) != zzihk.zze(obj2, j)) {
                            return false;
                        }
                        continue;
                        break;
                    case 17:
                        if (!zzI(obj, obj2, i) || !zzigs.zzF(zzihk.zzm(obj, j), zzihk.zzm(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zZzF = zzigs.zzF(zzihk.zzm(obj, j), zzihk.zzm(obj2, j));
                        break;
                    case 50:
                        zZzF = zzigs.zzF(zzihk.zzm(obj, j), zzihk.zzm(obj2, j));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 62:
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    case 64:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    case 68:
                        if (!zzN(obj, obj2, i) || !zzigs.zzF(zzihk.zzm(obj, j), zzihk.zzm(obj2, j))) {
                            return false;
                        }
                        continue;
                        break;
                    default:
                        continue;
                }
                if (!zZzF) {
                    return false;
                }
            }
        }
        int i2 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i2 >= iArr.length) {
                if (!((zziep) obj).zzt.equals(((zziep) obj2).zzt)) {
                    return false;
                }
                if (this.zzh) {
                    return ((zziel) obj).zza.equals(((zziel) obj2).zza);
                }
                return true;
            }
            int i3 = iArr[i2];
            if (!zzN(obj, obj2, i3)) {
                return false;
            }
            if (!zzM(obj, 0, i3)) {
                long jZzA = zzA(i3) & 1048575;
                if (!zzigs.zzF(zzihk.zzm(obj, jZzA), zzihk.zzm(obj2, jZzA))) {
                    return false;
                }
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final int zzc(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int iHashCode = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzA = zzA(i3);
            int iZzC = zzC(iZzA);
            if (iZzC <= 50 || iZzC >= 69) {
                long j = iZzA & 1048575;
                int iHashCode2 = 37;
                switch (iZzC) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzihk.zzk(obj, j));
                        byte[] bArr = zzifc.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzihk.zzi(obj, j));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j);
                        byte[] bArr2 = zzifc.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j);
                        byte[] bArr3 = zzifc.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzc(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j);
                        byte[] bArr4 = zzifc.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzc(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzifc.zzb(zzihk.zzg(obj, j));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iFloatToIntBits = ((String) zzihk.zzm(obj, j)).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 9:
                        i2 = iHashCode * 53;
                        Object objZzm = zzihk.zzm(obj, j);
                        if (objZzm != null) {
                            iHashCode2 = objZzm.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzm(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzc(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzc(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzc(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j);
                        byte[] bArr5 = zzifc.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzc(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = zzihk.zze(obj, j);
                        byte[] bArr6 = zzifc.zza;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 17:
                        i2 = iHashCode * 53;
                        Object objZzm2 = zzihk.zzm(obj, j);
                        if (objZzm2 != null) {
                            iHashCode2 = objZzm2.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzm(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 50:
                        i = iHashCode * 53;
                        iFloatToIntBits = zzihk.zzm(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                }
            }
        }
        int i4 = this.zzl;
        while (true) {
            int[] iArr = this.zzj;
            if (i4 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((zziep) obj).zzt.hashCode();
                return this.zzh ? (iHashCode3 * 53) + ((zziel) obj).zza.zza.hashCode() : iHashCode3;
            }
            int i5 = iArr[i4];
            if (!zzM(obj, 0, i5)) {
                iHashCode = (iHashCode * 53) + zzihk.zzm(obj, zzA(i5) & 1048575).hashCode();
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzd(Object obj, Object obj2) {
        zzF(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.zzc;
            if (i >= iArr.length) {
                zzigs.zzH(this.zzm, obj, obj2);
                if (this.zzh) {
                    zzigs.zzG(this.zzn, obj, obj2);
                    return;
                }
                return;
            }
            int iZzA = zzA(i);
            int i2 = 1048575 & iZzA;
            int iZzC = zzC(iZzA);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzC) {
                case 0:
                    if (zzK(obj2, i)) {
                        zzihk.zzl(obj, j, zzihk.zzk(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 1:
                    if (zzK(obj2, i)) {
                        zzihk.zzj(obj, j, zzihk.zzi(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 2:
                    if (zzK(obj2, i)) {
                        zzihk.zzf(obj, j, zzihk.zze(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 3:
                    if (zzK(obj2, i)) {
                        zzihk.zzf(obj, j, zzihk.zze(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 4:
                    if (zzK(obj2, i)) {
                        zzihk.zzd(obj, j, zzihk.zzc(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 5:
                    if (zzK(obj2, i)) {
                        zzihk.zzf(obj, j, zzihk.zze(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 6:
                    if (zzK(obj2, i)) {
                        zzihk.zzd(obj, j, zzihk.zzc(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 7:
                    if (zzK(obj2, i)) {
                        zzihk.zzh(obj, j, zzihk.zzg(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 8:
                    if (zzK(obj2, i)) {
                        zzihk.zzn(obj, j, zzihk.zzm(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 9:
                    zzo(obj, obj2, i);
                    break;
                case 10:
                    if (zzK(obj2, i)) {
                        zzihk.zzn(obj, j, zzihk.zzm(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 11:
                    if (zzK(obj2, i)) {
                        zzihk.zzd(obj, j, zzihk.zzc(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 12:
                    if (zzK(obj2, i)) {
                        zzihk.zzd(obj, j, zzihk.zzc(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 13:
                    if (zzK(obj2, i)) {
                        zzihk.zzd(obj, j, zzihk.zzc(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 14:
                    if (zzK(obj2, i)) {
                        zzihk.zzf(obj, j, zzihk.zze(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 15:
                    if (zzK(obj2, i)) {
                        zzihk.zzd(obj, j, zzihk.zzc(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 16:
                    if (zzK(obj2, i)) {
                        zzihk.zzf(obj, j, zzihk.zze(obj2, j));
                        zzL(obj, i);
                    }
                    break;
                case 17:
                    zzo(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzifb zzifbVarZzh = (zzifb) zzihk.zzm(obj, j);
                    zzifb zzifbVar = (zzifb) zzihk.zzm(obj2, j);
                    int size = zzifbVarZzh.size();
                    int size2 = zzifbVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzifbVarZzh.zza()) {
                            zzifbVarZzh = zzifbVarZzh.zzh(size2 + size);
                        }
                        zzifbVarZzh.addAll(zzifbVar);
                    }
                    if (size > 0) {
                        zzifbVar = zzifbVarZzh;
                    }
                    zzihk.zzn(obj, j, zzifbVar);
                    break;
                case 50:
                    int i4 = zzigs.zza;
                    zzihk.zzn(obj, j, zzifu.zzb(zzihk.zzm(obj, j), zzihk.zzm(obj2, j)));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzM(obj2, i3, i)) {
                        zzihk.zzn(obj, j, zzihk.zzm(obj2, j));
                        zzO(obj, i3, i);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzp(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzM(obj2, i3, i)) {
                        zzihk.zzn(obj, j, zzihk.zzm(obj2, j));
                        zzO(obj, i3, i);
                    }
                    break;
                case 68:
                    zzp(obj, obj2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:140:0x039e  */
    /* JADX WARN: Code duplicated, block: B:206:0x0559  */
    @Override // com.google.android.gms.internal.ads.zzigr
    public final int zze(Object obj) {
        int i;
        int iZzF;
        int iZzF2;
        int iZzG;
        int iZzF3;
        int iZzF4;
        int iZzF5;
        int iZzc;
        int iZzF6;
        int iZzF7;
        int iZzaT;
        int iZzF8;
        int iZzD;
        int iZzs;
        int size;
        int iZzt;
        int iZzF9;
        int iZzc2;
        int iZzF10;
        int iZzc3;
        int iZzF11;
        int iZzF12;
        int iZzF13;
        int iZzG2;
        int iZzB;
        int iZzF14;
        int iZzF15;
        int iZzD2;
        int iZzF16;
        int iZzF17;
        zzigc<T> zzigcVar = this;
        Unsafe unsafe = zzb;
        int i2 = 0;
        int i3 = 0;
        int iZzF18 = 0;
        int i4 = 1048575;
        while (true) {
            int[] iArr = zzigcVar.zzc;
            if (i2 >= iArr.length) {
                int iZzi = iZzF18 + ((zziep) obj).zzt.zzi();
                if (!zzigcVar.zzh) {
                    return iZzi;
                }
                zzigx zzigxVar = ((zziel) obj).zza.zza;
                int iZzc4 = zzigxVar.zzc();
                int iZzj = 0;
                for (int i5 = 0; i5 < iZzc4; i5++) {
                    Map.Entry entryZzd = zzigxVar.zzd(i5);
                    iZzj += zziee.zzj((zzied) ((zzigu) entryZzd).zza(), entryZzd.getValue());
                }
                for (Map.Entry entry : zzigxVar.zze()) {
                    iZzj += zziee.zzj((zzied) entry.getKey(), entry.getValue());
                }
                return iZzi + iZzj;
            }
            int iZzA = zzigcVar.zzA(i2);
            int iZzC = zzC(iZzA);
            int i6 = iArr[i2];
            int i7 = iArr[i2 + 2];
            int i8 = i7 & 1048575;
            if (iZzC <= 17) {
                if (i8 != i4) {
                    i3 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i4 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            int i9 = iZzA & 1048575;
            if (iZzC >= zzief.DOUBLE_LIST_PACKED.zza()) {
                zzief.SINT64_LIST_PACKED.zza();
            }
            long j = i9;
            switch (iZzC) {
                case 0:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzF18 += zzidu.zzF(i6 << 3) + 8;
                    }
                    break;
                case 1:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzF = zzidu.zzF(i6 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 2:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzF2 = zzidu.zzF(i6 << 3);
                        iZzG = zzidu.zzG(j2);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 3:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzF2 = zzidu.zzF(i6 << 3);
                        iZzG = zzidu.zzG(j3);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 4:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzF2 = zzidu.zzF(i6 << 3);
                        iZzG = zzidu.zzG(j4);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 5:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzF3 = zzidu.zzF(i6 << 3);
                        iZzF4 = iZzF3 + 8;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 6:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzF = zzidu.zzF(i6 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 7:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzF4 = zzidu.zzF(i6 << 3) + 1;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 8:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        int i10 = i6 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzidl) {
                            iZzF5 = zzidu.zzF(i10);
                            iZzc = ((zzidl) object).zzb();
                            iZzF6 = zzidu.zzF(iZzc);
                        } else {
                            iZzF5 = zzidu.zzF(i10);
                            iZzc = zzihp.zzc((String) object);
                            iZzF6 = zzidu.zzF(iZzc);
                        }
                        iZzF4 = iZzF5 + iZzF6 + iZzc;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 9:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        int i11 = i6 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        zzigr zzigrVarZzq = zzigcVar.zzq(i2);
                        int i12 = zzigs.zza;
                        iZzF7 = zzidu.zzF(i11);
                        iZzaT = ((zzicu) object2).zzaT(zzigrVarZzq);
                        iZzF8 = zzidu.zzF(iZzaT);
                        iZzD = iZzF7 + iZzF8 + iZzaT;
                        iZzF18 += iZzD;
                    }
                    break;
                case 10:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        zzidl zzidlVar = (zzidl) unsafe.getObject(obj, j);
                        iZzF5 = zzidu.zzF(i6 << 3);
                        iZzc = zzidlVar.zzb();
                        iZzF6 = zzidu.zzF(iZzc);
                        iZzF4 = iZzF5 + iZzF6 + iZzc;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 11:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzF2 = zzidu.zzF(i6 << 3);
                        iZzG = zzidu.zzF(i13);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 12:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzF2 = zzidu.zzF(i6 << 3);
                        iZzG = zzidu.zzG(j5);
                        iZzF4 = iZzF2 + iZzG;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 13:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzF = zzidu.zzF(i6 << 3);
                        iZzF4 = iZzF + 4;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 14:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzF3 = zzidu.zzF(i6 << 3);
                        iZzF4 = iZzF3 + 8;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 15:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        int i14 = unsafe.getInt(obj, j);
                        iZzF2 = zzidu.zzF(i6 << 3);
                        iZzG = zzidu.zzF((i14 >> 31) ^ (i14 + i14));
                        iZzF4 = iZzF2 + iZzG;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 16:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzF2 = zzidu.zzF(i6 << 3);
                        iZzG = zzidu.zzG((j6 >> 63) ^ (j6 + j6));
                        iZzF4 = iZzF2 + iZzG;
                        iZzF18 += iZzF4;
                    }
                    zzigcVar = this;
                    break;
                case 17:
                    if (zzigcVar.zzJ(obj, i2, i4, i3, i)) {
                        iZzD = zzigs.zzD(i6, (zzifz) unsafe.getObject(obj, j), zzigcVar.zzq(i2));
                        iZzF18 += iZzD;
                    }
                    break;
                case 18:
                    iZzD = zzigs.zzC(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF18 += iZzD;
                    break;
                case 19:
                    iZzD = zzigs.zzA(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF18 += iZzD;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i15 = zzigs.zza;
                    if (list.size() == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzigs.zzs(list) + (list.size() * zzidu.zzF(i6 << 3));
                    }
                    iZzF18 += iZzs;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i16 = zzigs.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigs.zzt(list2);
                        iZzF9 = zzidu.zzF(i6 << 3);
                        iZzG2 = size * iZzF9;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF18 += iZzD;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i17 = zzigs.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigs.zzw(list3);
                        iZzF9 = zzidu.zzF(i6 << 3);
                        iZzG2 = size * iZzF9;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF18 += iZzD;
                    break;
                case 23:
                    iZzD = zzigs.zzC(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF18 += iZzD;
                    break;
                case 24:
                    iZzD = zzigs.zzA(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF18 += iZzD;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i18 = zzigs.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzD = 0;
                    } else {
                        iZzD = size2 * (zzidu.zzF(i6 << 3) + 1);
                    }
                    iZzF18 += iZzD;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i19 = zzigs.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzs = 0;
                    } else {
                        iZzs = zzidu.zzF(i6 << 3) * size3;
                        if (list5 instanceof zzifk) {
                            zzifk zzifkVar = (zzifk) list5;
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object objZzc = zzifkVar.zzc();
                                if (objZzc instanceof zzidl) {
                                    iZzc3 = ((zzidl) objZzc).zzb();
                                    iZzF11 = zzidu.zzF(iZzc3);
                                } else {
                                    iZzc3 = zzihp.zzc((String) objZzc);
                                    iZzF11 = zzidu.zzF(iZzc3);
                                }
                                iZzs += iZzF11 + iZzc3;
                            }
                        } else {
                            for (int i21 = 0; i21 < size3; i21++) {
                                Object obj2 = list5.get(i21);
                                if (obj2 instanceof zzidl) {
                                    iZzc2 = ((zzidl) obj2).zzb();
                                    iZzF10 = zzidu.zzF(iZzc2);
                                } else {
                                    iZzc2 = zzihp.zzc((String) obj2);
                                    iZzF10 = zzidu.zzF(iZzc2);
                                }
                                iZzs += iZzF10 + iZzc2;
                            }
                        }
                    }
                    iZzF18 += iZzs;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzigr zzigrVarZzq2 = zzigcVar.zzq(i2);
                    int i22 = zzigs.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzF12 = 0;
                    } else {
                        iZzF12 = zzidu.zzF(i6 << 3) * size4;
                        for (int i23 = 0; i23 < size4; i23++) {
                            int iZzaT2 = ((zzicu) list6.get(i23)).zzaT(zzigrVarZzq2);
                            iZzF12 += zzidu.zzF(iZzaT2) + iZzaT2;
                        }
                    }
                    iZzF18 += iZzF12;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i24 = zzigs.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzF13 = 0;
                    } else {
                        iZzF13 = size5 * zzidu.zzF(i6 << 3);
                        for (int i25 = 0; i25 < list7.size(); i25++) {
                            int iZzb = ((zzidl) list7.get(i25)).zzb();
                            iZzF13 += zzidu.zzF(iZzb) + iZzb;
                        }
                    }
                    iZzF18 += iZzF13;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i26 = zzigs.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigs.zzx(list8);
                        iZzF9 = zzidu.zzF(i6 << 3);
                        iZzG2 = size * iZzF9;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF18 += iZzD;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i27 = zzigs.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigs.zzv(list9);
                        iZzF9 = zzidu.zzF(i6 << 3);
                        iZzG2 = size * iZzF9;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF18 += iZzD;
                    break;
                case 31:
                    iZzD = zzigs.zzA(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF18 += iZzD;
                    break;
                case 32:
                    iZzD = zzigs.zzC(i6, (List) unsafe.getObject(obj, j), false);
                    iZzF18 += iZzD;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i28 = zzigs.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigs.zzy(list10);
                        iZzF9 = zzidu.zzF(i6 << 3);
                        iZzG2 = size * iZzF9;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF18 += iZzD;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i29 = zzigs.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzD = 0;
                    } else {
                        iZzt = zzigs.zzu(list11);
                        iZzF9 = zzidu.zzF(i6 << 3);
                        iZzG2 = size * iZzF9;
                        iZzD = iZzt + iZzG2;
                    }
                    iZzF18 += iZzD;
                    break;
                case 35:
                    iZzB = zzigs.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 36:
                    iZzB = zzigs.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 37:
                    iZzB = zzigs.zzs((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 38:
                    iZzB = zzigs.zzt((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 39:
                    iZzB = zzigs.zzw((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 40:
                    iZzB = zzigs.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 41:
                    iZzB = zzigs.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i30 = zzigs.zza;
                    iZzB = list12.size();
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 43:
                    iZzB = zzigs.zzx((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 44:
                    iZzB = zzigs.zzv((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 45:
                    iZzB = zzigs.zzz((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 46:
                    iZzB = zzigs.zzB((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case 47:
                    iZzB = zzigs.zzy((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZzB = zzigs.zzu((List) unsafe.getObject(obj, j));
                    if (iZzB > 0) {
                        iZzF14 = zzidu.zzF(i6 << 3);
                        iZzF15 = zzidu.zzF(iZzB);
                        iZzF13 = iZzF14 + iZzF15 + iZzB;
                        iZzF18 += iZzF13;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzigr zzigrVarZzq3 = zzigcVar.zzq(i2);
                    int i31 = zzigs.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzD2 = 0;
                    } else {
                        iZzD2 = 0;
                        for (int i32 = 0; i32 < size6; i32++) {
                            iZzD2 += zzigs.zzD(i6, (zzifz) list13.get(i32), zzigrVarZzq3);
                        }
                    }
                    iZzF18 += iZzD2;
                    break;
                case 50:
                    zzift zziftVar = (zzift) unsafe.getObject(obj, j);
                    zzifs zzifsVar = (zzifs) zzigcVar.zzr(i2);
                    if (zziftVar.isEmpty()) {
                        iZzs = 0;
                    } else {
                        iZzs = 0;
                        for (Map.Entry entry2 : zziftVar.entrySet()) {
                            iZzs += zzifsVar.zzd(i6, entry2.getKey(), entry2.getValue());
                        }
                    }
                    iZzF18 += iZzs;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzF16 = zzidu.zzF(i6 << 3);
                        iZzD = iZzF16 + 8;
                        iZzF18 += iZzD;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzF17 = zzidu.zzF(i6 << 3);
                        iZzD = iZzF17 + 4;
                        iZzF18 += iZzD;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        long jZzH = zzH(obj, j);
                        iZzt = zzidu.zzF(i6 << 3);
                        iZzG2 = zzidu.zzG(jZzH);
                        iZzD = iZzt + iZzG2;
                        iZzF18 += iZzD;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        long jZzH2 = zzH(obj, j);
                        iZzt = zzidu.zzF(i6 << 3);
                        iZzG2 = zzidu.zzG(jZzH2);
                        iZzD = iZzt + iZzG2;
                        iZzF18 += iZzD;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        long jZzG = zzG(obj, j);
                        iZzt = zzidu.zzF(i6 << 3);
                        iZzG2 = zzidu.zzG(jZzG);
                        iZzD = iZzt + iZzG2;
                        iZzF18 += iZzD;
                    }
                    break;
                case 56:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzF16 = zzidu.zzF(i6 << 3);
                        iZzD = iZzF16 + 8;
                        iZzF18 += iZzD;
                    }
                    break;
                case 57:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzF17 = zzidu.zzF(i6 << 3);
                        iZzD = iZzF17 + 4;
                        iZzF18 += iZzD;
                    }
                    break;
                case 58:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzD = zzidu.zzF(i6 << 3) + 1;
                        iZzF18 += iZzD;
                    }
                    break;
                case 59:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        int i33 = i6 << 3;
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof zzidl) {
                            iZzF7 = zzidu.zzF(i33);
                            iZzaT = ((zzidl) object3).zzb();
                            iZzF8 = zzidu.zzF(iZzaT);
                        } else {
                            iZzF7 = zzidu.zzF(i33);
                            iZzaT = zzihp.zzc((String) object3);
                            iZzF8 = zzidu.zzF(iZzaT);
                        }
                        iZzD = iZzF7 + iZzF8 + iZzaT;
                        iZzF18 += iZzD;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        int i34 = i6 << 3;
                        Object object4 = unsafe.getObject(obj, j);
                        zzigr zzigrVarZzq4 = zzigcVar.zzq(i2);
                        int i35 = zzigs.zza;
                        iZzF7 = zzidu.zzF(i34);
                        iZzaT = ((zzicu) object4).zzaT(zzigrVarZzq4);
                        iZzF8 = zzidu.zzF(iZzaT);
                        iZzD = iZzF7 + iZzF8 + iZzaT;
                        iZzF18 += iZzD;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        zzidl zzidlVar2 = (zzidl) unsafe.getObject(obj, j);
                        iZzF7 = zzidu.zzF(i6 << 3);
                        iZzaT = zzidlVar2.zzb();
                        iZzF8 = zzidu.zzF(iZzaT);
                        iZzD = iZzF7 + iZzF8 + iZzaT;
                        iZzF18 += iZzD;
                    }
                    break;
                case 62:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        int iZzG3 = zzG(obj, j);
                        iZzt = zzidu.zzF(i6 << 3);
                        iZzG2 = zzidu.zzF(iZzG3);
                        iZzD = iZzt + iZzG2;
                        iZzF18 += iZzD;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        long jZzG2 = zzG(obj, j);
                        iZzt = zzidu.zzF(i6 << 3);
                        iZzG2 = zzidu.zzG(jZzG2);
                        iZzD = iZzt + iZzG2;
                        iZzF18 += iZzD;
                    }
                    break;
                case 64:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzF17 = zzidu.zzF(i6 << 3);
                        iZzD = iZzF17 + 4;
                        iZzF18 += iZzD;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzF16 = zzidu.zzF(i6 << 3);
                        iZzD = iZzF16 + 8;
                        iZzF18 += iZzD;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        int iZzG4 = zzG(obj, j);
                        iZzt = zzidu.zzF(i6 << 3);
                        iZzG2 = zzidu.zzF((iZzG4 >> 31) ^ (iZzG4 + iZzG4));
                        iZzD = iZzt + iZzG2;
                        iZzF18 += iZzD;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        long jZzH3 = zzH(obj, j);
                        iZzt = zzidu.zzF(i6 << 3);
                        iZzG2 = zzidu.zzG((jZzH3 >> 63) ^ (jZzH3 + jZzH3));
                        iZzD = iZzt + iZzG2;
                        iZzF18 += iZzD;
                    }
                    break;
                case 68:
                    if (zzigcVar.zzM(obj, i6, i2)) {
                        iZzD = zzigs.zzD(i6, (zzifz) unsafe.getObject(obj, j), zzigcVar.zzq(i2));
                        iZzF18 += iZzD;
                    }
                    break;
            }
            i2 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzf(Object obj, zzihs zzihsVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        boolean z;
        int i;
        int i2;
        int i3;
        zzigc<T> zzigcVar = this;
        if (zzigcVar.zzh) {
            zziee zzieeVar = ((zziel) obj).zza;
            if (zzieeVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzc = zzieeVar.zzc();
                entry = (Map.Entry) itZzc.next();
                it = itZzc;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = zzigcVar.zzc;
        Unsafe unsafe = zzb;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < iArr.length) {
            int iZzA = zzigcVar.zzA(i6);
            int iZzC = zzC(iZzA);
            int i8 = iArr[i6];
            if (iZzC <= 17) {
                int i9 = iArr[i6 + 2];
                z = true;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i7;
                i3 = 1 << (i9 >>> 20);
            } else {
                z = true;
                i = i5;
                i2 = i7;
                i3 = 0;
            }
            while (true) {
                if (entry != null) {
                    zziea zzieaVar = zzigcVar.zzn;
                    i4 = i4;
                    if (((zziem) entry.getKey()).zza <= i8) {
                        zzieaVar.zzb(zzihsVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                } else {
                    i4 = i4;
                }
            }
            long j = iZzA & i4;
            switch (iZzC) {
                case 0:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzf(i8, zzihk.zzk(obj, j));
                    }
                    break;
                case 1:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zze(i8, zzihk.zzi(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 2:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzc(i8, unsafe.getLong(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 3:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzh(i8, unsafe.getLong(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 4:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzi(i8, unsafe.getInt(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 5:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzj(i8, unsafe.getLong(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 6:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzk(i8, unsafe.getInt(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 7:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzl(i8, zzihk.zzg(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 8:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzT(i8, unsafe.getObject(obj, j), zzihsVar);
                    }
                    zzigcVar = this;
                    break;
                case 9:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzr(i8, unsafe.getObject(obj, j), zzigcVar.zzq(i6));
                    }
                    break;
                case 10:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzn(i8, (zzidl) unsafe.getObject(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 11:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzo(i8, unsafe.getInt(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 12:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzg(i8, unsafe.getInt(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 13:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzb(i8, unsafe.getInt(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 14:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzd(i8, unsafe.getLong(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 15:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzp(i8, unsafe.getInt(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 16:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzq(i8, unsafe.getLong(obj, j));
                    }
                    zzigcVar = this;
                    break;
                case 17:
                    if (zzigcVar.zzJ(obj, i6, i, i2, i3)) {
                        zzihsVar.zzs(i8, unsafe.getObject(obj, j), zzigcVar.zzq(i6));
                    }
                    break;
                case 18:
                    zzigs.zza(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 19:
                    zzigs.zzb(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 20:
                    zzigs.zzc(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 21:
                    zzigs.zzd(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 22:
                    zzigs.zzh(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 23:
                    zzigs.zzf(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 24:
                    zzigs.zzk(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 25:
                    zzigs.zzn(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 26:
                    zzigs.zzo(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar);
                    break;
                case 27:
                    zzigs.zzq(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, zzigcVar.zzq(i6));
                    break;
                case 28:
                    zzigs.zzp(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar);
                    break;
                case 29:
                    zzigs.zzi(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 30:
                    zzigs.zzm(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 31:
                    zzigs.zzl(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 32:
                    zzigs.zzg(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 33:
                    zzigs.zzj(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 34:
                    zzigs.zze(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, false);
                    break;
                case 35:
                    zzigs.zza(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 36:
                    zzigs.zzb(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 37:
                    zzigs.zzc(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 38:
                    zzigs.zzd(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 39:
                    zzigs.zzh(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 40:
                    zzigs.zzf(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 41:
                    zzigs.zzk(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 42:
                    zzigs.zzn(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 43:
                    zzigs.zzi(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 44:
                    zzigs.zzm(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 45:
                    zzigs.zzl(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 46:
                    zzigs.zzg(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case 47:
                    zzigs.zzj(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzigs.zze(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, z);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzigs.zzr(iArr[i6], (List) unsafe.getObject(obj, j), zzihsVar, zzigcVar.zzq(i6));
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        zzihsVar.zzM(i8, ((zzifs) zzigcVar.zzr(i6)).zze(), (zzift) object);
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzf(i8, ((Double) zzihk.zzm(obj, j)).doubleValue());
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zze(i8, ((Float) zzihk.zzm(obj, j)).floatValue());
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzc(i8, zzH(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzh(i8, zzH(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzi(i8, zzG(obj, j));
                    }
                    break;
                case 56:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzj(i8, zzH(obj, j));
                    }
                    break;
                case 57:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzk(i8, zzG(obj, j));
                    }
                    break;
                case 58:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzl(i8, ((Boolean) zzihk.zzm(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzT(i8, unsafe.getObject(obj, j), zzihsVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzr(i8, unsafe.getObject(obj, j), zzigcVar.zzq(i6));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzn(i8, (zzidl) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzo(i8, zzG(obj, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzg(i8, zzG(obj, j));
                    }
                    break;
                case 64:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzb(i8, zzG(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzd(i8, zzH(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzp(i8, zzG(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzq(i8, zzH(obj, j));
                    }
                    break;
                case 68:
                    if (zzigcVar.zzM(obj, i8, i6)) {
                        zzihsVar.zzs(i8, unsafe.getObject(obj, j), zzigcVar.zzq(i6));
                    }
                    break;
                default:
                    break;
            }
            i6 += 3;
            i7 = i2;
            i4 = i4;
            i5 = i;
            entry = entry;
        }
        while (entry != null) {
            zzigcVar.zzn.zzb(zzihsVar, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        ((zziep) obj).zzt.zzg(zzihsVar);
    }

    /* JADX WARN: Code duplicated, block: B:179:0x057c A[LOOP:3: B:177:0x0578->B:179:0x057c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:181:0x058c  */
    /* JADX WARN: Code duplicated, block: B:192:0x05a1 A[LOOP:1: B:190:0x059d->B:192:0x05a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:202:0x056a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzg(Object obj, zzigm zzigmVar, zzidz zzidzVar) throws Throwable {
        zzigc<T> zzigcVar;
        Object obj2;
        Throwable th;
        int i;
        Object objZzx;
        zzihd zzihdVar;
        Object objZzx2;
        Object obj3;
        int i2;
        zzidzVar.getClass();
        zzF(obj);
        zzihd zzihdVar2 = this.zzm;
        Object objZzh = null;
        while (true) {
            try {
                int iZzb = zzigmVar.zzb();
                int iZzP = zzP(iZzb);
                if (iZzP >= 0) {
                    obj3 = obj;
                    zzigcVar = this;
                    try {
                        int iZzA = zzA(iZzP);
                        try {
                            switch (zzC(iZzA)) {
                                case 0:
                                    obj2 = obj3;
                                    zzihk.zzl(obj2, iZzA & 1048575, zzigmVar.zze());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 1:
                                    obj2 = obj3;
                                    zzihk.zzj(obj2, iZzA & 1048575, zzigmVar.zzf());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 2:
                                    obj2 = obj3;
                                    zzihk.zzf(obj2, iZzA & 1048575, zzigmVar.zzh());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 3:
                                    obj2 = obj3;
                                    zzihk.zzf(obj2, iZzA & 1048575, zzigmVar.zzg());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 4:
                                    obj2 = obj3;
                                    zzihk.zzd(obj2, iZzA & 1048575, zzigmVar.zzi());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 5:
                                    obj2 = obj3;
                                    zzihk.zzf(obj2, iZzA & 1048575, zzigmVar.zzj());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 6:
                                    obj2 = obj3;
                                    zzihk.zzd(obj2, iZzA & 1048575, zzigmVar.zzk());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 7:
                                    obj2 = obj3;
                                    zzihk.zzh(obj2, iZzA & 1048575, zzigmVar.zzl());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 8:
                                    obj2 = obj3;
                                    zzz(obj2, iZzA, zzigmVar);
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 9:
                                    obj2 = obj3;
                                    zzifz zzifzVar = (zzifz) zzt(obj2, iZzP);
                                    zzigmVar.zzo(zzifzVar, zzq(iZzP), zzidzVar);
                                    zzu(obj2, iZzP, zzifzVar);
                                    obj = obj2;
                                    break;
                                case 10:
                                    obj2 = obj3;
                                    zzihk.zzn(obj2, iZzA & 1048575, zzigmVar.zzq());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 11:
                                    obj2 = obj3;
                                    zzihk.zzd(obj2, iZzA & 1048575, zzigmVar.zzr());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 12:
                                    obj2 = obj3;
                                    int iZzs = zzigmVar.zzs();
                                    zziev zzievVarZzs = zzs(iZzP);
                                    if (zzievVarZzs == null || zzievVarZzs.zza(iZzs)) {
                                        zzihk.zzd(obj2, iZzA & 1048575, iZzs);
                                        zzL(obj2, iZzP);
                                    } else {
                                        objZzh = zzigs.zzJ(obj2, iZzb, iZzs, objZzh, zzihdVar2);
                                    }
                                    obj = obj2;
                                    break;
                                case 13:
                                    obj2 = obj3;
                                    zzihk.zzd(obj2, iZzA & 1048575, zzigmVar.zzt());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 14:
                                    obj2 = obj3;
                                    zzihk.zzf(obj2, iZzA & 1048575, zzigmVar.zzu());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 15:
                                    obj2 = obj3;
                                    zzihk.zzd(obj2, iZzA & 1048575, zzigmVar.zzv());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 16:
                                    obj2 = obj3;
                                    zzihk.zzf(obj2, iZzA & 1048575, zzigmVar.zzw());
                                    zzL(obj2, iZzP);
                                    obj = obj2;
                                    break;
                                case 17:
                                    obj2 = obj3;
                                    zzifz zzifzVar2 = (zzifz) zzt(obj2, iZzP);
                                    zzigmVar.zzp(zzifzVar2, zzq(iZzP), zzidzVar);
                                    zzu(obj2, iZzP, zzifzVar2);
                                    obj = obj2;
                                    break;
                                case 18:
                                    obj2 = obj3;
                                    zzigmVar.zzx(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 19:
                                    obj2 = obj3;
                                    zzigmVar.zzy(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 20:
                                    obj2 = obj3;
                                    zzigmVar.zzA(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 21:
                                    obj2 = obj3;
                                    zzigmVar.zzz(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 22:
                                    obj2 = obj3;
                                    zzigmVar.zzB(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 23:
                                    obj2 = obj3;
                                    zzigmVar.zzC(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 24:
                                    obj2 = obj3;
                                    zzigmVar.zzD(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 25:
                                    obj2 = obj3;
                                    zzigmVar.zzE(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 26:
                                    obj2 = obj3;
                                    if (zzD(iZzA)) {
                                        ((zzidq) zzigmVar).zzF(zzifl.zza(obj2, iZzA & 1048575), true);
                                    } else {
                                        ((zzidq) zzigmVar).zzF(zzifl.zza(obj2, iZzA & 1048575), false);
                                    }
                                    obj = obj2;
                                    break;
                                case 27:
                                    obj2 = obj3;
                                    zzigmVar.zzG(zzifl.zza(obj2, iZzA & 1048575), zzq(iZzP), zzidzVar);
                                    obj = obj2;
                                    break;
                                case 28:
                                    obj2 = obj3;
                                    zzigmVar.zzI(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 29:
                                    obj2 = obj3;
                                    zzigmVar.zzJ(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 30:
                                    List listZza = zzifl.zza(obj3, iZzA & 1048575);
                                    zzigmVar.zzK(listZza);
                                    objZzh = zzigs.zzI(obj3, iZzb, listZza, zzs(iZzP), objZzh, zzihdVar2);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 31:
                                    obj2 = obj3;
                                    zzigmVar.zzL(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 32:
                                    obj2 = obj3;
                                    zzigmVar.zzM(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 33:
                                    obj2 = obj3;
                                    zzigmVar.zzN(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 34:
                                    obj2 = obj3;
                                    zzigmVar.zzO(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 35:
                                    obj2 = obj3;
                                    zzigmVar.zzx(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 36:
                                    obj2 = obj3;
                                    zzigmVar.zzy(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 37:
                                    obj2 = obj3;
                                    zzigmVar.zzA(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 38:
                                    obj2 = obj3;
                                    zzigmVar.zzz(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 39:
                                    obj2 = obj3;
                                    zzigmVar.zzB(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 40:
                                    obj2 = obj3;
                                    zzigmVar.zzC(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 41:
                                    obj2 = obj3;
                                    zzigmVar.zzD(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 42:
                                    obj2 = obj3;
                                    zzigmVar.zzE(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 43:
                                    obj2 = obj3;
                                    zzigmVar.zzJ(zzifl.zza(obj2, iZzA & 1048575));
                                    obj = obj2;
                                    break;
                                case 44:
                                    try {
                                        List listZza2 = zzifl.zza(obj3, iZzA & 1048575);
                                        zzigmVar.zzK(listZza2);
                                        try {
                                            objZzh = zzigs.zzI(obj3, iZzb, listZza2, zzs(iZzP), objZzh, zzihdVar2);
                                            obj2 = obj3;
                                        } catch (zzifg unused) {
                                            obj2 = obj3;
                                            if (objZzh == null) {
                                                try {
                                                    objZzh = zzihdVar2.zzh(obj2);
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    th = th;
                                                    i = zzigcVar.zzk;
                                                    objZzx = objZzh;
                                                    while (i < zzigcVar.zzl) {
                                                        zzihd zzihdVar3 = zzihdVar2;
                                                        objZzx = zzigcVar.zzx(obj2, zzigcVar.zzj[i], objZzx, zzihdVar3, obj2);
                                                        i++;
                                                        zzigcVar = this;
                                                        zzihdVar2 = zzihdVar3;
                                                    }
                                                    zzihdVar = zzihdVar2;
                                                    if (objZzx == null) {
                                                        throw th;
                                                    }
                                                    zzihdVar.zzi(obj2, objZzx);
                                                    throw th;
                                                }
                                            }
                                            if (!zzihdVar2.zzk(objZzh, zzigmVar, 0)) {
                                                objZzx2 = objZzh;
                                                for (i2 = zzigcVar.zzk; i2 < zzigcVar.zzl; i2++) {
                                                    zzihd zzihdVar4 = zzihdVar2;
                                                    objZzx2 = zzigcVar.zzx(obj2, zzigcVar.zzj[i2], objZzx2, zzihdVar4, obj2);
                                                    zzihdVar2 = zzihdVar4;
                                                }
                                                if (objZzx2 != null) {
                                                    zzihdVar2.zzi(obj2, objZzx2);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            obj2 = obj3;
                                            th = th;
                                            zzigcVar = zzigcVar;
                                            i = zzigcVar.zzk;
                                            objZzx = objZzh;
                                            while (i < zzigcVar.zzl) {
                                                zzihd zzihdVar5 = zzihdVar2;
                                                objZzx = zzigcVar.zzx(obj2, zzigcVar.zzj[i], objZzx, zzihdVar5, obj2);
                                                i++;
                                                zzigcVar = this;
                                                zzihdVar2 = zzihdVar5;
                                            }
                                            zzihdVar = zzihdVar2;
                                            if (objZzx == null) {
                                                throw th;
                                            }
                                            zzihdVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                        obj = obj2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj3;
                                    }
                                    break;
                                case 45:
                                    zzigmVar.zzL(zzifl.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 46:
                                    zzigmVar.zzM(zzifl.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 47:
                                    zzigmVar.zzN(zzifl.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                    zzigmVar.zzO(zzifl.zza(obj3, iZzA & 1048575));
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                    zzigmVar.zzH(zzifl.zza(obj3, iZzA & 1048575), zzq(iZzP), zzidzVar);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 50:
                                    Object objZzr = zzr(iZzP);
                                    long jZzA = zzA(iZzP) & 1048575;
                                    Object objZzm = zzihk.zzm(obj3, jZzA);
                                    if (objZzm == null) {
                                        objZzm = zzift.zza().zzc();
                                        zzihk.zzn(obj3, jZzA, objZzm);
                                    } else if (zzifu.zza(objZzm)) {
                                        Object objZzc = zzift.zza().zzc();
                                        zzifu.zzb(objZzc, objZzm);
                                        zzihk.zzn(obj3, jZzA, objZzc);
                                        objZzm = objZzc;
                                    }
                                    zzigmVar.zzP((zzift) objZzm, ((zzifs) objZzr).zze(), zzidzVar);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Double.valueOf(zzigmVar.zze()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Float.valueOf(zzigmVar.zzf()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigmVar.zzh()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigmVar.zzg()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigmVar.zzi()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 56:
                                    zzihk.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigmVar.zzj()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 57:
                                    zzihk.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigmVar.zzk()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 58:
                                    zzihk.zzn(obj3, iZzA & 1048575, Boolean.valueOf(zzigmVar.zzl()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 59:
                                    zzz(obj3, iZzA, zzigmVar);
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                    zzifz zzifzVar3 = (zzifz) zzv(obj3, iZzb, iZzP);
                                    zzigmVar.zzo(zzifzVar3, zzq(iZzP), zzidzVar);
                                    zzw(obj3, iZzb, iZzP, zzifzVar3);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, zzigmVar.zzq());
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 62:
                                    zzihk.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigmVar.zzr()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                    int iZzs2 = zzigmVar.zzs();
                                    zziev zzievVarZzs2 = zzs(iZzP);
                                    if (zzievVarZzs2 != null && !zzievVarZzs2.zza(iZzs2)) {
                                        objZzh = zzigs.zzJ(obj3, iZzb, iZzs2, objZzh, zzihdVar2);
                                        obj = obj3;
                                    }
                                    zzihk.zzn(obj3, iZzA & 1048575, Integer.valueOf(iZzs2));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 64:
                                    zzihk.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigmVar.zzt()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigmVar.zzu()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Integer.valueOf(zzigmVar.zzv()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                    zzihk.zzn(obj3, iZzA & 1048575, Long.valueOf(zzigmVar.zzw()));
                                    zzO(obj3, iZzb, iZzP);
                                    obj2 = obj3;
                                    obj = obj2;
                                    break;
                                case 68:
                                    try {
                                        zzifz zzifzVar4 = (zzifz) zzv(obj3, iZzb, iZzP);
                                        zzigmVar.zzp(zzifzVar4, zzq(iZzP), zzidzVar);
                                        zzw(obj3, iZzb, iZzP, zzifzVar4);
                                        obj2 = obj3;
                                        obj = obj2;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        zzigcVar = zzigcVar;
                                        obj2 = obj3;
                                        i = zzigcVar.zzk;
                                        objZzx = objZzh;
                                        while (i < zzigcVar.zzl) {
                                            zzihd zzihdVar6 = zzihdVar2;
                                            objZzx = zzigcVar.zzx(obj2, zzigcVar.zzj[i], objZzx, zzihdVar6, obj2);
                                            i++;
                                            zzigcVar = this;
                                            zzihdVar2 = zzihdVar6;
                                        }
                                        zzihdVar = zzihdVar2;
                                        if (objZzx == null) {
                                            throw th;
                                        }
                                        zzihdVar.zzi(obj2, objZzx);
                                        throw th;
                                    }
                                    break;
                                default:
                                    obj2 = obj3;
                                    if (objZzh == null) {
                                        try {
                                            try {
                                                objZzh = zzihdVar2.zzh(obj2);
                                            } catch (zzifg unused2) {
                                                if (objZzh == null) {
                                                    objZzh = zzihdVar2.zzh(obj2);
                                                }
                                                if (!zzihdVar2.zzk(objZzh, zzigmVar, 0)) {
                                                    objZzx2 = objZzh;
                                                    while (i2 < zzigcVar.zzl) {
                                                        zzihd zzihdVar7 = zzihdVar2;
                                                        objZzx2 = zzigcVar.zzx(obj2, zzigcVar.zzj[i2], objZzx2, zzihdVar7, obj2);
                                                        zzihdVar2 = zzihdVar7;
                                                    }
                                                    if (objZzx2 != null) {
                                                        zzihdVar2.zzi(obj2, objZzx2);
                                                    }
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th = th;
                                            zzigcVar = zzigcVar;
                                            i = zzigcVar.zzk;
                                            objZzx = objZzh;
                                            while (i < zzigcVar.zzl) {
                                                zzihd zzihdVar8 = zzihdVar2;
                                                objZzx = zzigcVar.zzx(obj2, zzigcVar.zzj[i], objZzx, zzihdVar8, obj2);
                                                i++;
                                                zzigcVar = this;
                                                zzihdVar2 = zzihdVar8;
                                            }
                                            zzihdVar = zzihdVar2;
                                            if (objZzx == null) {
                                                throw th;
                                            }
                                            zzihdVar.zzi(obj2, objZzx);
                                            throw th;
                                        }
                                    }
                                    try {
                                        if (zzihdVar2.zzk(objZzh, zzigmVar, 0)) {
                                            obj = obj2;
                                        } else {
                                            objZzx2 = objZzh;
                                            for (int i3 = zzigcVar.zzk; i3 < zzigcVar.zzl; i3++) {
                                                zzihd zzihdVar9 = zzihdVar2;
                                                objZzx2 = zzigcVar.zzx(obj2, zzigcVar.zzj[i3], objZzx2, zzihdVar9, obj2);
                                                zzihdVar2 = zzihdVar9;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        zzigcVar = zzigcVar;
                                        th = th;
                                        i = zzigcVar.zzk;
                                        objZzx = objZzh;
                                        while (i < zzigcVar.zzl) {
                                            zzihd zzihdVar10 = zzihdVar2;
                                            objZzx = zzigcVar.zzx(obj2, zzigcVar.zzj[i], objZzx, zzihdVar10, obj2);
                                            i++;
                                            zzigcVar = this;
                                            zzihdVar2 = zzihdVar10;
                                        }
                                        zzihdVar = zzihdVar2;
                                        if (objZzx == null) {
                                            throw th;
                                        }
                                        zzihdVar.zzi(obj2, objZzx);
                                        throw th;
                                    }
                                    break;
                            }
                        } catch (zzifg unused3) {
                            obj2 = obj3;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        zzigcVar = zzigcVar;
                        obj2 = obj3;
                    }
                } else if (iZzb == Integer.MAX_VALUE) {
                    objZzx2 = objZzh;
                    for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                        zzihd zzihdVar11 = zzihdVar2;
                        objZzx2 = zzx(obj, this.zzj[i4], objZzx2, zzihdVar11, obj);
                        zzihdVar2 = zzihdVar11;
                    }
                    obj2 = obj;
                } else {
                    zzigcVar = this;
                    try {
                        if ((!zzigcVar.zzh ? null : zzidzVar.zzd(zzigcVar.zzg, iZzb)) != null) {
                            obj3 = obj;
                            zzigcVar = zzigcVar;
                            throw null;
                        }
                        if (objZzh == null) {
                            try {
                                objZzh = zzihdVar2.zzh(obj);
                            } catch (Throwable th9) {
                                th = th9;
                                obj2 = obj;
                                i = zzigcVar.zzk;
                                objZzx = objZzh;
                                while (i < zzigcVar.zzl) {
                                    zzihd zzihdVar12 = zzihdVar2;
                                    objZzx = zzigcVar.zzx(obj2, zzigcVar.zzj[i], objZzx, zzihdVar12, obj2);
                                    i++;
                                    zzigcVar = this;
                                    zzihdVar2 = zzihdVar12;
                                }
                                zzihdVar = zzihdVar2;
                                if (objZzx == null) {
                                    throw th;
                                }
                                zzihdVar.zzi(obj2, objZzx);
                                throw th;
                            }
                        }
                        if (zzihdVar2.zzk(objZzh, zzigmVar, 0)) {
                            obj3 = obj;
                            obj = obj3;
                        } else {
                            int i5 = zzigcVar.zzk;
                            objZzx2 = objZzh;
                            while (i5 < zzigcVar.zzl) {
                                zzihd zzihdVar13 = zzihdVar2;
                                Object obj4 = obj;
                                objZzx2 = zzigcVar.zzx(obj4, zzigcVar.zzj[i5], objZzx2, zzihdVar13, obj);
                                zzihdVar2 = zzihdVar13;
                                i5++;
                                obj = obj4;
                            }
                            obj2 = obj;
                        }
                    } catch (Throwable th10) {
                        obj3 = obj;
                        th = th10;
                        obj2 = obj3;
                        i = zzigcVar.zzk;
                        objZzx = objZzh;
                        while (i < zzigcVar.zzl) {
                            zzihd zzihdVar14 = zzihdVar2;
                            objZzx = zzigcVar.zzx(obj2, zzigcVar.zzj[i], objZzx, zzihdVar14, obj2);
                            i++;
                            zzigcVar = this;
                            zzihdVar2 = zzihdVar14;
                        }
                        zzihdVar = zzihdVar2;
                        if (objZzx == null) {
                            throw th;
                        }
                        zzihdVar.zzi(obj2, objZzx);
                        throw th;
                    }
                }
            } catch (Throwable th11) {
                th = th11;
                zzigcVar = this;
                obj2 = obj;
            }
        }
        if (objZzx2 != null) {
            zzihdVar2.zzi(obj2, objZzx2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 36661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzi(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.ads.zzicz r40) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 3666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzigc.zzi(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzicz):int");
    }

    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzj(Object obj, byte[] bArr, int i, int i2, zzicz zziczVar) throws IOException {
        zzi(obj, bArr, i, i2, 0, zziczVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigr
    public final void zzk(Object obj) {
        if (zzE(obj)) {
            if (obj instanceof zziep) {
                zziep zziepVar = (zziep) obj;
                zziepVar.zzbq();
                zziepVar.zzbb();
                zziepVar.zzaY();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzA = zzA(i);
                int i2 = 1048575 & iZzA;
                int iZzC = zzC(iZzA);
                long j = i2;
                if (iZzC != 9) {
                    if (iZzC != 60 && iZzC != 68) {
                        switch (iZzC) {
                            case 17:
                                if (zzK(obj, i)) {
                                    zzq(i).zzk(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                ((zzifb) zzihk.zzm(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzift) object).zzd();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzM(obj, iArr[i], i)) {
                        zzq(i).zzk(zzb.getObject(obj, j));
                    }
                } else if (zzK(obj, i)) {
                    zzq(i).zzk(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzj(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e3 A[LOOP:2: B:52:0x00d2->B:57:0x00e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzigr
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        List list;
        zzigr zzigrVarZzq;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i4 < this.zzk) {
            int i7 = this.zzj[i4];
            int iZzA = zzA(i7);
            int[] iArr = this.zzc;
            int i8 = iArr[i7 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i6) {
                if (i9 != 1048575) {
                    i5 = zzb.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i6;
                i2 = i5;
            }
            Object obj2 = obj;
            if ((268435456 & iZzA) != 0 && !zzJ(obj2, i7, i, i2, i10)) {
                return false;
            }
            int iZzC = zzC(iZzA);
            if (iZzC == 9 || iZzC == 17) {
                if (zzJ(obj2, i7, i, i2, i10) && !zzy(obj2, iZzA, zzq(i7))) {
                    return false;
                }
            } else if (iZzC == 27) {
                list = (List) zzihk.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzigrVarZzq = zzq(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzigrVarZzq.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzC == 60 || iZzC == 68) {
                if (zzM(obj2, iArr[i7], i7) && !zzy(obj2, iZzA, zzq(i7))) {
                    return false;
                }
            } else if (iZzC == 49) {
                list = (List) zzihk.zzm(obj2, iZzA & 1048575);
                if (list.isEmpty()) {
                    zzigrVarZzq = zzq(i7);
                    while (i3 < list.size()) {
                        if (!zzigrVarZzq.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzC != 50) {
                continue;
            } else {
                zzift zziftVar = (zzift) zzihk.zzm(obj2, iZzA & 1048575);
                if (!zziftVar.isEmpty() && ((zzifs) zzr(i7)).zze().zzc.zza() == zzihr.MESSAGE) {
                    zzigr zzigrVarZzb = null;
                    for (Object obj3 : zziftVar.values()) {
                        if (zzigrVarZzb == null) {
                            zzigrVarZzb = zzigj.zza().zzb(obj3.getClass());
                        }
                        if (!zzigrVarZzb.zzl(obj3)) {
                            return false;
                        }
                    }
                }
            }
            i4++;
            obj = obj2;
            i6 = i;
            i5 = i2;
        }
        return !this.zzh || ((zziel) obj).zza.zze();
    }
}
