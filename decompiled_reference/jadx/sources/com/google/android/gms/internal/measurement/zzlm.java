package com.google.android.gms.internal.measurement;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzlj zzljVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i) {
        int i2 = i / 3;
        return (zzkg) this.zzd[i2 + i2 + 1];
    }

    private final zzlu zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzluVarZzb = zzlr.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzluVarZzb;
        return zzluVarZzb;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzH(Object obj, Object obj2, int i) {
        long jZzB = zzB(i) & 1048575;
        if (zzO(obj2, i)) {
            Object objZzf = zzmv.zzf(obj, jZzB);
            Object objZzf2 = zzmv.zzf(obj2, jZzB);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, jZzB, zzkk.zzg(objZzf, objZzf2));
                zzJ(obj, i);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, jZzB, objZzf2);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int iZzB = zzB(i);
        int i2 = this.zzc[i];
        long j = iZzB & 1048575;
        if (zzR(obj2, i2, i)) {
            Object objZzf = zzR(obj, i2, i) ? zzmv.zzf(obj, j) : null;
            Object objZzf2 = zzmv.zzf(obj2, j);
            if (objZzf != null && objZzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(objZzf, objZzf2));
                zzK(obj, i2, i);
            } else if (objZzf2 != null) {
                zzmv.zzs(obj, j, objZzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int iZzy = zzy(i);
        long j = 1048575 & iZzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (iZzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmv.zzq(obj, zzy(i2) & 1048575, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i;
        boolean z;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int iZzB = zzB(i4);
            int[] iArr = this.zzc;
            int i6 = iArr[i4];
            int iZzA = zzA(iZzB);
            if (iZzA <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = iZzB & i2;
            switch (iZzA) {
                case 0:
                    if ((i5 & i) != 0) {
                        zzndVar.zzf(i6, zzmv.zza(obj, j));
                    }
                    break;
                case 1:
                    if ((i5 & i) != 0) {
                        zzndVar.zzo(i6, zzmv.zzb(obj, j));
                    }
                    break;
                case 2:
                    if ((i5 & i) != 0) {
                        zzndVar.zzt(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 3:
                    if ((i5 & i) != 0) {
                        zzndVar.zzJ(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 4:
                    if ((i5 & i) != 0) {
                        zzndVar.zzr(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 5:
                    if ((i5 & i) != 0) {
                        zzndVar.zzm(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 6:
                    if ((i5 & i) != 0) {
                        zzndVar.zzk(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 7:
                    if ((i5 & i) != 0) {
                        zzndVar.zzb(i6, zzmv.zzw(obj, j));
                    }
                    break;
                case 8:
                    if ((i5 & i) != 0) {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case 9:
                    if ((i5 & i) != 0) {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 10:
                    if ((i5 & i) != 0) {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 11:
                    if ((i5 & i) != 0) {
                        zzndVar.zzH(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 12:
                    if ((i5 & i) != 0) {
                        zzndVar.zzi(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 13:
                    if ((i5 & i) != 0) {
                        zzndVar.zzw(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 14:
                    if ((i5 & i) != 0) {
                        zzndVar.zzy(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 15:
                    if ((i5 & i) != 0) {
                        zzndVar.zzA(i6, unsafe.getInt(obj, j));
                    }
                    break;
                case 16:
                    if ((i5 & i) != 0) {
                        zzndVar.zzC(i6, unsafe.getLong(obj, j));
                    }
                    break;
                case 17:
                    if ((i5 & i) != 0) {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case 18:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 28:
                    zzlw.zzI(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar);
                    break;
                case 29:
                    z = false;
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 30:
                    z = false;
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 31:
                    z = false;
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 32:
                    z = false;
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 33:
                    z = false;
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 34:
                    z = false;
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzlw.zzV(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzlw.zzO(this.zzc[i4], (List) unsafe.getObject(obj, j), zzndVar, zzE(i4));
                    break;
                case 50:
                    zzM(zzndVar, i6, unsafe.getObject(obj, j), i4);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzf(i6, zzn(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzo(i6, zzo(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzt(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzJ(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzr(i6, zzr(obj, j));
                    }
                    break;
                case 56:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzm(i6, zzC(obj, j));
                    }
                    break;
                case 57:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzk(i6, zzr(obj, j));
                    }
                    break;
                case 58:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzb(i6, zzS(obj, j));
                    }
                    break;
                case 59:
                    if (zzR(obj, i6, i4)) {
                        zzT(i6, unsafe.getObject(obj, j), zzndVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzH(i6, zzr(obj, j));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzi(i6, zzr(obj, j));
                    }
                    break;
                case 64:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzw(i6, zzr(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzy(i6, zzC(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzA(i6, zzr(obj, j));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzC(i6, zzC(obj, j));
                    }
                    break;
                case 68:
                    if (zzR(obj, i6, i4)) {
                        zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i4));
                    }
                    break;
                default:
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    private final void zzM(zznd zzndVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int iZzy = zzy(i);
        long j = iZzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (iZzy >>> 20))) != 0;
        }
        int iZzB = zzB(i);
        long j2 = iZzB & 1048575;
        switch (zzA(iZzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j2)) != 0;
            case 2:
                return zzmv.zzd(obj, j2) != 0;
            case 3:
                return zzmv.zzd(obj, j2) != 0;
            case 4:
                return zzmv.zzc(obj, j2) != 0;
            case 5:
                return zzmv.zzd(obj, j2) != 0;
            case 6:
                return zzmv.zzc(obj, j2) != 0;
            case 7:
                return zzmv.zzw(obj, j2);
            case 8:
                Object objZzf = zzmv.zzf(obj, j2);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzjb) {
                    return !zzjb.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmv.zzf(obj, j2) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j2));
            case 11:
                return zzmv.zzc(obj, j2) != 0;
            case 12:
                return zzmv.zzc(obj, j2) != 0;
            case 13:
                return zzmv.zzc(obj, j2) != 0;
            case 14:
                return zzmv.zzd(obj, j2) != 0;
            case 15:
                return zzmv.zzc(obj, j2) != 0;
            case 16:
                return zzmv.zzd(obj, j2) != 0;
            case 17:
                return zzmv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzmv.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i, (String) obj);
        } else {
            zzndVar.zzd(i, (zzjb) obj);
        }
    }

    static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar != zzmm.zzc()) {
            return zzmmVar;
        }
        zzmm zzmmVarZze = zzmm.zze();
        zzkcVar.zzc = zzmmVarZze;
        return zzmmVarZze;
    }

    static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:127:0x0279  */
    /* JADX WARN: Code duplicated, block: B:128:0x027c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0373  */
    /* JADX WARN: Code duplicated, block: B:182:0x0388  */
    static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int iCharAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        int i5;
        char cCharAt;
        int i6;
        char cCharAt2;
        int i7;
        char cCharAt3;
        int i8;
        char cCharAt4;
        int i9;
        char cCharAt5;
        int i10;
        char cCharAt6;
        int i11;
        char cCharAt7;
        int i12;
        char cCharAt8;
        int i13;
        int i14;
        int i15;
        int iObjectFieldOffset;
        int i16;
        int i17;
        int i18;
        Field fieldZzG;
        char cCharAt9;
        int i19;
        int i20;
        int i21;
        Object obj;
        Field fieldZzG2;
        int i22;
        Object obj2;
        Field fieldZzG3;
        int i23;
        char cCharAt10;
        int i24;
        int i25;
        char cCharAt11;
        int i26;
        char cCharAt12;
        int i27;
        char cCharAt13;
        boolean z = zzltVar.zzc() == 2;
        String strZzd = zzltVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i28 = 1;
            while (true) {
                i = i28 + 1;
                if (strZzd.charAt(i28) < 55296) {
                    break;
                }
                i28 = i;
            }
        } else {
            i = 1;
        }
        int i29 = i + 1;
        int iCharAt5 = strZzd.charAt(i);
        if (iCharAt5 >= 55296) {
            int i30 = iCharAt5 & 8191;
            int i31 = 13;
            while (true) {
                i27 = i29 + 1;
                cCharAt13 = strZzd.charAt(i29);
                if (cCharAt13 < 55296) {
                    break;
                }
                i30 |= (cCharAt13 & 8191) << i31;
                i31 += 13;
                i29 = i27;
            }
            iCharAt5 = i30 | (cCharAt13 << i31);
            i29 = i27;
        }
        if (iCharAt5 == 0) {
            iCharAt = 0;
            iCharAt2 = 0;
            iCharAt3 = 0;
            i3 = 0;
            iCharAt4 = 0;
            i2 = 0;
            iArr = zza;
            i4 = 0;
        } else {
            int i32 = i29 + 1;
            int iCharAt6 = strZzd.charAt(i29);
            if (iCharAt6 >= 55296) {
                int i33 = iCharAt6 & 8191;
                int i34 = 13;
                while (true) {
                    i12 = i32 + 1;
                    cCharAt8 = strZzd.charAt(i32);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i33 |= (cCharAt8 & 8191) << i34;
                    i34 += 13;
                    i32 = i12;
                }
                iCharAt6 = i33 | (cCharAt8 << i34);
                i32 = i12;
            }
            int i35 = i32 + 1;
            int iCharAt7 = strZzd.charAt(i32);
            if (iCharAt7 >= 55296) {
                int i36 = iCharAt7 & 8191;
                int i37 = 13;
                while (true) {
                    i11 = i35 + 1;
                    cCharAt7 = strZzd.charAt(i35);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i36 |= (cCharAt7 & 8191) << i37;
                    i37 += 13;
                    i35 = i11;
                }
                iCharAt7 = i36 | (cCharAt7 << i37);
                i35 = i11;
            }
            int i38 = i35 + 1;
            iCharAt = strZzd.charAt(i35);
            if (iCharAt >= 55296) {
                int i39 = iCharAt & 8191;
                int i40 = 13;
                while (true) {
                    i10 = i38 + 1;
                    cCharAt6 = strZzd.charAt(i38);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt6 & 8191) << i40;
                    i40 += 13;
                    i38 = i10;
                }
                iCharAt = i39 | (cCharAt6 << i40);
                i38 = i10;
            }
            int i41 = i38 + 1;
            iCharAt2 = strZzd.charAt(i38);
            if (iCharAt2 >= 55296) {
                int i42 = iCharAt2 & 8191;
                int i43 = 13;
                while (true) {
                    i9 = i41 + 1;
                    cCharAt5 = strZzd.charAt(i41);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt5 & 8191) << i43;
                    i43 += 13;
                    i41 = i9;
                }
                iCharAt2 = i42 | (cCharAt5 << i43);
                i41 = i9;
            }
            int i44 = i41 + 1;
            iCharAt3 = strZzd.charAt(i41);
            if (iCharAt3 >= 55296) {
                int i45 = iCharAt3 & 8191;
                int i46 = 13;
                while (true) {
                    i8 = i44 + 1;
                    cCharAt4 = strZzd.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i8;
                }
                iCharAt3 = i45 | (cCharAt4 << i46);
                i44 = i8;
            }
            int i47 = i44 + 1;
            int iCharAt8 = strZzd.charAt(i44);
            if (iCharAt8 >= 55296) {
                int i48 = iCharAt8 & 8191;
                int i49 = 13;
                while (true) {
                    i7 = i47 + 1;
                    cCharAt3 = strZzd.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i7;
                }
                iCharAt8 = i48 | (cCharAt3 << i49);
                i47 = i7;
            }
            int i50 = i47 + 1;
            int iCharAt9 = strZzd.charAt(i47);
            if (iCharAt9 >= 55296) {
                int i51 = iCharAt9 & 8191;
                int i52 = 13;
                while (true) {
                    i6 = i50 + 1;
                    cCharAt2 = strZzd.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i6;
                }
                iCharAt9 = i51 | (cCharAt2 << i52);
                i50 = i6;
            }
            int i53 = i50 + 1;
            iCharAt4 = strZzd.charAt(i50);
            if (iCharAt4 >= 55296) {
                int i54 = iCharAt4 & 8191;
                int i55 = 13;
                while (true) {
                    i5 = i53 + 1;
                    cCharAt = strZzd.charAt(i53);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i53 = i5;
                }
                iCharAt4 = i54 | (cCharAt << i55);
                i53 = i5;
            }
            int[] iArr2 = new int[iCharAt4 + iCharAt8 + iCharAt9];
            i2 = iCharAt6 + iCharAt6 + iCharAt7;
            i3 = iCharAt8;
            iArr = iArr2;
            i4 = iCharAt6;
            i29 = i53;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzltVar.zze();
        Class<?> cls = zzltVar.zza().getClass();
        int[] iArr3 = new int[iCharAt3 * 3];
        Object[] objArr = new Object[iCharAt3 + iCharAt3];
        int i56 = i3 + iCharAt4;
        int i57 = i56;
        int i58 = iCharAt4;
        int i59 = 0;
        int i60 = 0;
        while (i29 < length) {
            int i61 = i29 + 1;
            int iCharAt10 = strZzd.charAt(i29);
            if (iCharAt10 >= c) {
                int i62 = iCharAt10 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i26 = i63 + 1;
                    cCharAt12 = strZzd.charAt(i63);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i62 |= (cCharAt12 & 8191) << i64;
                    i64 += 13;
                    i63 = i26;
                }
                iCharAt10 = i62 | (cCharAt12 << i64);
                i13 = i26;
            } else {
                i13 = i61;
            }
            int i65 = i13 + 1;
            int iCharAt11 = strZzd.charAt(i13);
            if (iCharAt11 >= c) {
                int i66 = iCharAt11 & 8191;
                int i67 = i65;
                int i68 = 13;
                while (true) {
                    i25 = i67 + 1;
                    cCharAt11 = strZzd.charAt(i67);
                    i14 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i66 |= (cCharAt11 & 8191) << i68;
                    i68 += 13;
                    i67 = i25;
                    length = i14;
                }
                iCharAt11 = i66 | (cCharAt11 << i68);
                i15 = i25;
            } else {
                i14 = length;
                i15 = i65;
            }
            int i69 = iCharAt11 & 255;
            int[] iArr4 = iArr3;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i60] = i59;
                i60++;
            }
            if (i69 >= 51) {
                int i70 = i15 + 1;
                int iCharAt12 = strZzd.charAt(i15);
                if (iCharAt12 >= 55296) {
                    int i71 = iCharAt12 & 8191;
                    int i72 = i70;
                    int i73 = 13;
                    while (true) {
                        i23 = i72 + 1;
                        cCharAt10 = strZzd.charAt(i72);
                        i24 = i71;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i71 = i24 | ((cCharAt10 & 8191) << i73);
                        i73 += 13;
                        i72 = i23;
                    }
                    iCharAt12 = i24 | (cCharAt10 << i73);
                    i19 = i23;
                } else {
                    i19 = i70;
                }
                int i74 = iCharAt12;
                int i75 = i69 - 51;
                int i76 = i19;
                if (i75 == 9 || i75 == 17) {
                    int i77 = i59 / 3;
                    i20 = i2 + 1;
                    objArr[i77 + i77 + 1] = objArrZze[i2];
                } else {
                    if (i75 == 12 && !z) {
                        int i78 = i59 / 3;
                        i20 = i2 + 1;
                        objArr[i78 + i78 + 1] = objArrZze[i2];
                    }
                    i21 = i74 + i74;
                    obj = objArrZze[i21];
                    if (obj instanceof Field) {
                        fieldZzG2 = (Field) obj;
                    } else {
                        fieldZzG2 = zzG(cls, (String) obj);
                        objArrZze[i21] = fieldZzG2;
                    }
                    int iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzG2);
                    i22 = i21 + 1;
                    obj2 = objArrZze[i22];
                    if (obj2 instanceof Field) {
                        fieldZzG3 = (Field) obj2;
                    } else {
                        fieldZzG3 = zzG(cls, (String) obj2);
                        objArrZze[i22] = fieldZzG3;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG3);
                    i17 = iObjectFieldOffset2;
                    strZzd = strZzd;
                    i29 = i76;
                    i16 = 0;
                }
                i2 = i20;
                i21 = i74 + i74;
                obj = objArrZze[i21];
                if (obj instanceof Field) {
                    fieldZzG2 = (Field) obj;
                } else {
                    fieldZzG2 = zzG(cls, (String) obj);
                    objArrZze[i21] = fieldZzG2;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzG2);
                i22 = i21 + 1;
                obj2 = objArrZze[i22];
                if (obj2 instanceof Field) {
                    fieldZzG3 = (Field) obj2;
                } else {
                    fieldZzG3 = zzG(cls, (String) obj2);
                    objArrZze[i22] = fieldZzG3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG3);
                i17 = iObjectFieldOffset3;
                strZzd = strZzd;
                i29 = i76;
                i16 = 0;
            } else {
                int i79 = i2 + 1;
                Field fieldZzG4 = zzG(cls, (String) objArrZze[i2]);
                if (i69 == 9 || i69 == 17) {
                    int i80 = i59 / 3;
                    objArr[i80 + i80 + 1] = fieldZzG4.getType();
                } else {
                    if (i69 == 27 || i69 == 49) {
                        int i81 = i59 / 3;
                        i2 += 2;
                        objArr[i81 + i81 + 1] = objArrZze[i79];
                    } else if (i69 == 12 || i69 == 30 || i69 == 44) {
                        if (!z) {
                            int i82 = i59 / 3;
                            i2 += 2;
                            objArr[i82 + i82 + 1] = objArrZze[i79];
                        }
                    } else if (i69 == 50) {
                        int i83 = i58 + 1;
                        iArr[i58] = i59;
                        int i84 = i59 / 3;
                        int i85 = i84 + i84;
                        int i86 = i2 + 2;
                        objArr[i85] = objArrZze[i79];
                        if ((iCharAt11 & 2048) != 0) {
                            objArr[i85 + 1] = objArrZze[i86];
                            i2 += 3;
                        } else {
                            i2 = i86;
                        }
                        i58 = i83;
                    }
                    int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzG4);
                    iObjectFieldOffset = 1048575;
                    if ((iCharAt11 & 4096) == 4096 || i69 > 17) {
                        i29 = i15;
                        i16 = 0;
                    } else {
                        int i87 = i15 + 1;
                        int iCharAt13 = strZzd.charAt(i15);
                        if (iCharAt13 >= 55296) {
                            int i88 = iCharAt13 & 8191;
                            int i89 = 13;
                            while (true) {
                                i18 = i87 + 1;
                                cCharAt9 = strZzd.charAt(i87);
                                if (cCharAt9 < 55296) {
                                    break;
                                }
                                i88 |= (cCharAt9 & 8191) << i89;
                                i89 += 13;
                                i87 = i18;
                            }
                            iCharAt13 = i88 | (cCharAt9 << i89);
                        } else {
                            i18 = i87;
                        }
                        int i90 = i4 + i4 + (iCharAt13 / 32);
                        Object obj3 = objArrZze[i90];
                        if (obj3 instanceof Field) {
                            fieldZzG = (Field) obj3;
                        } else {
                            fieldZzG = zzG(cls, (String) obj3);
                            objArrZze[i90] = fieldZzG;
                        }
                        i16 = iCharAt13 % 32;
                        int i91 = i18;
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzG);
                        i29 = i91;
                    }
                    if (i69 < 18 && i69 <= 49) {
                        iArr[i57] = iObjectFieldOffset4;
                        i57++;
                    }
                    i17 = iObjectFieldOffset4;
                }
                i2 = i79;
                int iObjectFieldOffset5 = (int) unsafe.objectFieldOffset(fieldZzG4);
                iObjectFieldOffset = 1048575;
                if ((iCharAt11 & 4096) == 4096) {
                    i29 = i15;
                    i16 = 0;
                } else {
                    i29 = i15;
                    i16 = 0;
                }
                if (i69 < 18) {
                }
                i17 = iObjectFieldOffset5;
            }
            int i92 = i59 + 1;
            iArr4[i59] = iCharAt10;
            int i93 = i59 + 2;
            int i94 = i16;
            iArr4[i92] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i69 << 20) | i17;
            i59 += 3;
            iArr4[i93] = (i94 << 20) | iObjectFieldOffset;
            iArr3 = iArr4;
            length = i14;
            strZzd = strZzd;
            c = 55296;
        }
        return new zzlm(iArr3, objArr, iCharAt, iCharAt2, zzltVar.zza(), z, false, iArr, iCharAt4, i56, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

    private final int zzp(Object obj) {
        int i;
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i2;
        Unsafe unsafe = zzb;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int iZzB2 = zzB(i6);
            int[] iArr = this.zzc;
            int i7 = iArr[i6];
            int iZzA9 = zzA(iZzB2);
            if (iZzA9 <= 17) {
                int i8 = iArr[i6 + 2];
                int i9 = i8 & 1048575;
                i = 1 << (i8 >>> 20);
                if (i9 != i5) {
                    i4 = unsafe.getInt(obj, i9);
                    i5 = i9;
                }
            } else {
                i = 0;
            }
            long j = iZzB2 & 1048575;
            switch (iZzA9) {
                case 0:
                    if ((i4 & i) != 0) {
                        iZzA = zzjj.zzA(i7 << 3);
                        iZzo = iZzA + 8;
                        i3 += iZzo;
                    }
                    break;
                case 1:
                    if ((i4 & i) != 0) {
                        iZzA2 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA2 + 4;
                        i3 += iZzo;
                    }
                    break;
                case 2:
                    if ((i4 & i) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzA3 = zzjj.zzA(i7 << 3);
                        iZzB = zzjj.zzB(j2);
                        i3 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if ((i4 & i) != 0) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzA3 = zzjj.zzA(i7 << 3);
                        iZzB = zzjj.zzB(j3);
                        i3 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if ((i4 & i) != 0) {
                        int i10 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzv(i10);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 5:
                    if ((i4 & i) != 0) {
                        iZzA = zzjj.zzA(i7 << 3);
                        iZzo = iZzA + 8;
                        i3 += iZzo;
                    }
                    break;
                case 6:
                    if ((i4 & i) != 0) {
                        iZzA2 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA2 + 4;
                        i3 += iZzo;
                    }
                    break;
                case 7:
                    if ((i4 & i) != 0) {
                        iZzA5 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA5 + 1;
                        i3 += iZzo;
                    }
                    break;
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i7 << 3);
                            iZzd = ((zzjb) object).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i2 = iZzA6 + iZzA7 + iZzd;
                            i3 += i2;
                        } else {
                            iZzA4 = zzjj.zzA(i7 << 3);
                            iZzv = zzjj.zzy((String) object);
                            i2 = iZzA4 + iZzv;
                            i3 += i2;
                        }
                    }
                    break;
                case 9:
                    if ((i4 & i) != 0) {
                        iZzo = zzlw.zzo(i7, unsafe.getObject(obj, j), zzE(i6));
                        i3 += iZzo;
                    }
                    break;
                case 10:
                    if ((i4 & i) != 0) {
                        zzjb zzjbVar = (zzjb) unsafe.getObject(obj, j);
                        iZzA6 = zzjj.zzA(i7 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i2 = iZzA6 + iZzA7 + iZzd;
                        i3 += i2;
                    }
                    break;
                case 11:
                    if ((i4 & i) != 0) {
                        int i11 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzA(i11);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 12:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzv(i12);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 13:
                    if ((i4 & i) != 0) {
                        iZzA2 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA2 + 4;
                        i3 += iZzo;
                    }
                    break;
                case 14:
                    if ((i4 & i) != 0) {
                        iZzA = zzjj.zzA(i7 << 3);
                        iZzo = iZzA + 8;
                        i3 += iZzo;
                    }
                    break;
                case 15:
                    if ((i4 & i) != 0) {
                        int i13 = unsafe.getInt(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzA((i13 >> 31) ^ (i13 + i13));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 16:
                    if ((i & i4) != 0) {
                        long j4 = unsafe.getLong(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzB((j4 >> 63) ^ (j4 + j4));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 17:
                    if ((i4 & i) != 0) {
                        iZzo = zzjj.zzu(i7, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        i3 += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzlw.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 21:
                    iZzo = zzlw.zzx(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i7, (List) unsafe.getObject(obj, j));
                    i3 += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i7, (List) unsafe.getObject(obj, j), zzE(i6));
                    i3 += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i7, (List) unsafe.getObject(obj, j));
                    i3 += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i7, (List) unsafe.getObject(obj, j), false);
                    i3 += iZzo;
                    break;
                case 35:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 36:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 37:
                    iZzv = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 38:
                    iZzv = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 39:
                    iZzv = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 40:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 41:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 42:
                    iZzv = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 43:
                    iZzv = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 44:
                    iZzv = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 45:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 46:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 47:
                    iZzv = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZzv = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i7);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzo = zzlw.zzj(i7, (List) unsafe.getObject(obj, j), zzE(i6));
                    i3 += iZzo;
                    break;
                case 50:
                    zzle.zza(i7, unsafe.getObject(obj, j), zzF(i6));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i7, i6)) {
                        iZzA = zzjj.zzA(i7 << 3);
                        iZzo = iZzA + 8;
                        i3 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i7, i6)) {
                        iZzA2 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA2 + 4;
                        i3 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i7, i6)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i7 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        i3 += iZzA3 + iZzB;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i7, i6)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i7 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        i3 += iZzA3 + iZzB;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i7, i6)) {
                        int iZzr = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzv(iZzr);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 56:
                    if (zzR(obj, i7, i6)) {
                        iZzA = zzjj.zzA(i7 << 3);
                        iZzo = iZzA + 8;
                        i3 += iZzo;
                    }
                    break;
                case 57:
                    if (zzR(obj, i7, i6)) {
                        iZzA2 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA2 + 4;
                        i3 += iZzo;
                    }
                    break;
                case 58:
                    if (zzR(obj, i7, i6)) {
                        iZzA5 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA5 + 1;
                        i3 += iZzo;
                    }
                    break;
                case 59:
                    if (zzR(obj, i7, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i7 << 3);
                            iZzd = ((zzjb) object2).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i2 = iZzA6 + iZzA7 + iZzd;
                            i3 += i2;
                        } else {
                            iZzA4 = zzjj.zzA(i7 << 3);
                            iZzv = zzjj.zzy((String) object2);
                            i2 = iZzA4 + iZzv;
                            i3 += i2;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i7, i6)) {
                        iZzo = zzlw.zzo(i7, unsafe.getObject(obj, j), zzE(i6));
                        i3 += iZzo;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i7, i6)) {
                        zzjb zzjbVar2 = (zzjb) unsafe.getObject(obj, j);
                        iZzA6 = zzjj.zzA(i7 << 3);
                        iZzd = zzjbVar2.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i2 = iZzA6 + iZzA7 + iZzd;
                        i3 += i2;
                    }
                    break;
                case 62:
                    if (zzR(obj, i7, i6)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzA(iZzr2);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i7, i6)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 64:
                    if (zzR(obj, i7, i6)) {
                        iZzA2 = zzjj.zzA(i7 << 3);
                        iZzo = iZzA2 + 4;
                        i3 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i7, i6)) {
                        iZzA = zzjj.zzA(i7 << 3);
                        iZzo = iZzA + 8;
                        i3 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i7, i6)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i7, i6)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA4 = zzjj.zzA(i7 << 3);
                        iZzv = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i2 = iZzA4 + iZzv;
                        i3 += i2;
                    }
                    break;
                case 68:
                    if (zzR(obj, i7, i6)) {
                        iZzo = zzjj.zzu(i7, (zzlj) unsafe.getObject(obj, j), zzE(i6));
                        i3 += iZzo;
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        int iZza = i3 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (!this.zzh) {
            return iZza;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final int zzq(Object obj) {
        int iZzA;
        int iZzA2;
        int iZzA3;
        int iZzB;
        int iZzA4;
        int iZzv;
        int iZzA5;
        int iZzA6;
        int iZzd;
        int iZzA7;
        int iZzo;
        int iZzz;
        int iZzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int iZzB2 = zzB(i3);
            int iZzA9 = zzA(iZzB2);
            int i4 = this.zzc[i3];
            long j = iZzB2 & 1048575;
            if (iZzA9 >= zzju.DOUBLE_LIST_PACKED.zza() && iZzA9 <= zzju.SINT64_LIST_PACKED.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (iZzA9) {
                case 0:
                    if (zzO(obj, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 1:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 2:
                    if (zzO(obj, i3)) {
                        long jZzd = zzmv.zzd(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzd);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 3:
                    if (zzO(obj, i3)) {
                        long jZzd2 = zzmv.zzd(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzd2);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case 4:
                    if (zzO(obj, i3)) {
                        int iZzc = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzc);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 5:
                    if (zzO(obj, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 6:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 7:
                    if (zzO(obj, i3)) {
                        iZzA5 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                    }
                    break;
                case 8:
                    if (zzO(obj, i3)) {
                        Object objZzf = zzmv.zzf(obj, j);
                        if (objZzf instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i4 << 3);
                            iZzd = ((zzjb) objZzf).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                        } else {
                            iZzA4 = zzjj.zzA(i4 << 3);
                            iZzv = zzjj.zzy((String) objZzf);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case 9:
                    if (zzO(obj, i3)) {
                        iZzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
                case 10:
                    if (zzO(obj, i3)) {
                        zzjb zzjbVar = (zzjb) zzmv.zzf(obj, j);
                        iZzA6 = zzjj.zzA(i4 << 3);
                        iZzd = zzjbVar.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                    }
                    break;
                case 11:
                    if (zzO(obj, i3)) {
                        int iZzc2 = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA(iZzc2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 12:
                    if (zzO(obj, i3)) {
                        int iZzc3 = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzc3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 13:
                    if (zzO(obj, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 14:
                    if (zzO(obj, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 15:
                    if (zzO(obj, i3)) {
                        int iZzc4 = zzmv.zzc(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA((iZzc4 >> 31) ^ (iZzc4 + iZzc4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 16:
                    if (zzO(obj, i3)) {
                        long jZzd3 = zzmv.zzd(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzB((jZzd3 >> 63) ^ (jZzd3 + jZzd3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 17:
                    if (zzO(obj, i3)) {
                        iZzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
                case 18:
                    iZzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 19:
                    iZzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 20:
                    iZzo = zzlw.zzm(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 21:
                    iZzo = zzlw.zzx(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 22:
                    iZzo = zzlw.zzk(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 23:
                    iZzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 24:
                    iZzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 25:
                    iZzo = zzlw.zza(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 26:
                    iZzo = zzlw.zzu(i4, (List) zzmv.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case 27:
                    iZzo = zzlw.zzp(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case 28:
                    iZzo = zzlw.zzc(i4, (List) zzmv.zzf(obj, j));
                    i2 += iZzo;
                    break;
                case 29:
                    iZzo = zzlw.zzv(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 30:
                    iZzo = zzlw.zzd(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 31:
                    iZzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 32:
                    iZzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 33:
                    iZzo = zzlw.zzq(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 34:
                    iZzo = zzlw.zzs(i4, (List) zzmv.zzf(obj, j), false);
                    i2 += iZzo;
                    break;
                case 35:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 36:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 37:
                    iZzv = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 38:
                    iZzv = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 39:
                    iZzv = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 40:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 41:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 42:
                    iZzv = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 43:
                    iZzv = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 44:
                    iZzv = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 45:
                    iZzv = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 46:
                    iZzv = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 47:
                    iZzv = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    iZzv = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (iZzv > 0) {
                        iZzz = zzjj.zzz(i4);
                        iZzA8 = zzjj.zzA(iZzv);
                        iZzA4 = iZzz + iZzA8;
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    iZzo = zzlw.zzj(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    i2 += iZzo;
                    break;
                case 50:
                    zzle.zza(i4, zzmv.zzf(obj, j), zzF(i3));
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i4, i3)) {
                        long jZzC = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzC);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i4, i3)) {
                        long jZzC2 = zzC(obj, j);
                        iZzA3 = zzjj.zzA(i4 << 3);
                        iZzB = zzjj.zzB(jZzC2);
                        i2 += iZzA3 + iZzB;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i4, i3)) {
                        int iZzr = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzr);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 56:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case 57:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case 58:
                    if (zzR(obj, i4, i3)) {
                        iZzA5 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA5 + 1;
                        i2 += iZzo;
                    }
                    break;
                case 59:
                    if (zzR(obj, i4, i3)) {
                        Object objZzf2 = zzmv.zzf(obj, j);
                        if (objZzf2 instanceof zzjb) {
                            iZzA6 = zzjj.zzA(i4 << 3);
                            iZzd = ((zzjb) objZzf2).zzd();
                            iZzA7 = zzjj.zzA(iZzd);
                            i = iZzA6 + iZzA7 + iZzd;
                            i2 += i;
                        } else {
                            iZzA4 = zzjj.zzA(i4 << 3);
                            iZzv = zzjj.zzy((String) objZzf2);
                            i = iZzA4 + iZzv;
                            i2 += i;
                        }
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i4, i3)) {
                        iZzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i4, i3)) {
                        zzjb zzjbVar2 = (zzjb) zzmv.zzf(obj, j);
                        iZzA6 = zzjj.zzA(i4 << 3);
                        iZzd = zzjbVar2.zzd();
                        iZzA7 = zzjj.zzA(iZzd);
                        i = iZzA6 + iZzA7 + iZzd;
                        i2 += i;
                    }
                    break;
                case 62:
                    if (zzR(obj, i4, i3)) {
                        int iZzr2 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA(iZzr2);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i4, i3)) {
                        int iZzr3 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzv(iZzr3);
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 64:
                    if (zzR(obj, i4, i3)) {
                        iZzA2 = zzjj.zzA(i4 << 3);
                        iZzo = iZzA2 + 4;
                        i2 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i4, i3)) {
                        iZzA = zzjj.zzA(i4 << 3);
                        iZzo = iZzA + 8;
                        i2 += iZzo;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i4, i3)) {
                        int iZzr4 = zzr(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzA((iZzr4 >> 31) ^ (iZzr4 + iZzr4));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i4, i3)) {
                        long jZzC3 = zzC(obj, j);
                        iZzA4 = zzjj.zzA(i4 << 3);
                        iZzv = zzjj.zzB((jZzC3 >> 63) ^ (jZzC3 + jZzC3));
                        i = iZzA4 + iZzv;
                        i2 += i;
                    }
                    break;
                case 68:
                    if (zzR(obj, i4, i3)) {
                        iZzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        i2 += iZzo;
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        return i2 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object objZzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzldVarZzb = zzld.zza().zzb();
            zzle.zzb(zzldVarZzb, object);
            unsafe.putObject(obj, j, zzldVarZzb);
        }
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzio zzioVar) throws IOException {
        Object object;
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i))));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzm = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                unsafe.putInt(obj, j2, i4);
                return iZzm;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int iZzj = zzip.zzj(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                unsafe.putInt(obj, j2, i4);
                return iZzj;
            case 56:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 8;
            case 57:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i)));
                unsafe.putInt(obj, j2, i4);
                return i + 4;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int iZzm2 = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                unsafe.putInt(obj, j2, i4);
                return iZzm2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int iZzj2 = zzip.zzj(bArr, i, zzioVar);
                int i9 = zzioVar.zza;
                if (i9 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0 && !zzna.zzf(bArr, iZzj2, iZzj2 + i9)) {
                        throw zzkm.zzc();
                    }
                    unsafe.putObject(obj, j, new String(bArr, iZzj2, i9, zzkk.zzb));
                    iZzj2 += i9;
                }
                unsafe.putInt(obj, j2, i4);
                return iZzj2;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 != 2) {
                    return i;
                }
                int iZzd = zzip.zzd(zzE(i8), bArr, i, i2, zzioVar);
                object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                if (object == null) {
                    unsafe.putObject(obj, j, zzioVar.zzc);
                } else {
                    unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                }
                unsafe.putInt(obj, j2, i4);
                return iZzd;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 != 2) {
                    return i;
                }
                int iZza = zzip.zza(bArr, i, zzioVar);
                unsafe.putObject(obj, j, zzioVar.zzc);
                unsafe.putInt(obj, j2, i4);
                return iZza;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzj3 = zzip.zzj(bArr, i, zzioVar);
                int i10 = zzioVar.zza;
                zzkg zzkgVarZzD = zzD(i8);
                if (zzkgVarZzD != null && !zzkgVarZzD.zza(i10)) {
                    zzd(obj).zzh(i3, Long.valueOf(i10));
                    return iZzj3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i10));
                unsafe.putInt(obj, j2, i4);
                return iZzj3;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzj4 = zzip.zzj(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                unsafe.putInt(obj, j2, i4);
                return iZzj4;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i5 != 0) {
                    return i;
                }
                int iZzm3 = zzip.zzm(bArr, i, zzioVar);
                unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                unsafe.putInt(obj, j2, i4);
                return iZzm3;
            case 68:
                if (i5 == 3) {
                    int iZzc = zzip.zzc(zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzioVar);
                    object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return iZzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0080. Please report as an issue. */
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        this = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i13 = i2;
        zzioVar = zzioVar;
        Unsafe unsafe2 = zzb;
        int i14 = -1;
        int iZzm = i;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (iZzm < i13) {
            int iZzk = iZzm + 1;
            int i19 = bArr2[iZzm];
            if (i19 < 0) {
                iZzk = zzip.zzk(i19, bArr2, iZzk, zzioVar);
                i19 = zzioVar.zza;
            }
            int i20 = iZzk;
            int i21 = i19 >>> 3;
            int i22 = i19 & 7;
            int iZzx = i21 > i15 ? this.zzx(i21, i16 / 3) : this.zzw(i21);
            if (iZzx == i14) {
                unsafe = unsafe2;
                i3 = i19;
                i4 = i14;
                i5 = i21;
                i6 = 0;
                obj = obj2;
            } else {
                int[] iArr = this.zzc;
                int i23 = iArr[iZzx + 1];
                int iZzA = zzA(i23);
                int i24 = i19;
                int i25 = iZzx;
                long j = i23 & 1048575;
                if (iZzA <= 17) {
                    int i26 = iArr[i25 + 2];
                    int i27 = 1 << (i26 >>> 20);
                    int i28 = i26 & 1048575;
                    if (i28 != i18) {
                        int i29 = 1048575;
                        if (i18 != 1048575) {
                            unsafe2.putInt(obj2, i18, i17);
                            i29 = 1048575;
                        }
                        if (i28 != i29) {
                            i17 = unsafe2.getInt(obj2, i28);
                        }
                        i18 = i28;
                    }
                    switch (iZzA) {
                        case 0:
                            i12 = i25;
                            if (i22 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                zzmv.zzo(obj2, j, Double.longBitsToDouble(zzip.zzn(bArr2, i20)));
                                iZzm = i20 + 8;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 1:
                            i12 = i25;
                            if (i22 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                zzmv.zzp(obj2, j, Float.intBitsToFloat(zzip.zzb(bArr2, i20)));
                                iZzm = i20 + 4;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 2:
                        case 3:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                int iZzm2 = zzip.zzm(bArr2, i20, zzioVar);
                                Unsafe unsafe3 = unsafe2;
                                Object obj3 = obj2;
                                unsafe3.putLong(obj3, j, zzioVar.zzb);
                                unsafe2 = unsafe3;
                                obj2 = obj3;
                                i17 |= i27;
                                iZzm = iZzm2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                                i13 = i2;
                            }
                            break;
                        case 4:
                        case 11:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                int iZzj = zzip.zzj(bArr2, i20, zzioVar);
                                unsafe2.putInt(obj2, j, zzioVar.zza);
                                i17 |= i27;
                                i13 = i2;
                                iZzm = iZzj;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 5:
                        case 14:
                            i12 = i25;
                            if (i22 != 1) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                Unsafe unsafe4 = unsafe2;
                                Object obj4 = obj2;
                                unsafe4.putLong(obj4, j, zzip.zzn(bArr2, i20));
                                unsafe2 = unsafe4;
                                obj2 = obj4;
                                iZzm = i20 + 8;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 6:
                        case 13:
                            i12 = i25;
                            if (i22 != 5) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                unsafe2.putInt(obj2, j, zzip.zzb(bArr2, i20));
                                iZzm = i20 + 4;
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 7:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzip.zzm(bArr2, i20, zzioVar);
                                zzmv.zzm(obj2, j, zzioVar.zzb != 0);
                                i17 |= i27;
                                i13 = i2;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 8:
                            i12 = i25;
                            if (i22 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = (536870912 & i23) == 0 ? zzip.zzg(bArr2, i20, zzioVar) : zzip.zzh(bArr2, i20, zzioVar);
                                unsafe2.putObject(obj2, j, zzioVar.zzc);
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 9:
                            i12 = i25;
                            if (i22 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzip.zzd(this.zzE(i12), bArr2, i20, i13, zzioVar);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, zzioVar.zzc);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkk.zzg(object, zzioVar.zzc));
                                }
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 10:
                            i12 = i25;
                            if (i22 != 2) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzip.zza(bArr2, i20, zzioVar);
                                unsafe2.putObject(obj2, j, zzioVar.zzc);
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 12:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzip.zzj(bArr2, i20, zzioVar);
                                unsafe2.putInt(obj2, j, zzioVar.zza);
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 15:
                            i12 = i25;
                            if (i22 != 0) {
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                iZzm = zzip.zzj(bArr2, i20, zzioVar);
                                unsafe2.putInt(obj2, j, zzjf.zzb(zzioVar.zza));
                                i17 |= i27;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        case 16:
                            if (i22 != 0) {
                                i12 = i25;
                                obj = obj2;
                                unsafe = unsafe2;
                                i5 = i21;
                                i6 = i12;
                                i4 = -1;
                                i3 = i24 == true ? 1 : 0;
                            } else {
                                int iZzm3 = zzip.zzm(bArr2, i20, zzioVar);
                                Unsafe unsafe5 = unsafe2;
                                Object obj5 = obj2;
                                i12 = i25;
                                unsafe5.putLong(obj5, j, zzjf.zzc(zzioVar.zzb));
                                unsafe2 = unsafe5;
                                obj2 = obj5;
                                i17 |= i27;
                                iZzm = iZzm3;
                                i15 = i21;
                                i16 = i12;
                                i14 = -1;
                            }
                            break;
                        default:
                            i12 = i25;
                            obj = obj2;
                            unsafe = unsafe2;
                            i5 = i21;
                            i6 = i12;
                            i4 = -1;
                            i3 = i24 == true ? 1 : 0;
                            break;
                    }
                } else {
                    i6 = i25;
                    if (iZzA != 27) {
                        i7 = i20;
                        Unsafe unsafe6 = unsafe2;
                        if (iZzA <= 49) {
                            i8 = i17;
                            unsafe = unsafe6;
                            i4 = -1;
                            i10 = i18;
                            int iZzv = this.zzv(obj, bArr, i7, i2, i24 == true ? 1 : 0, i21, i22, i6, i23, iZzA, j, zzioVar);
                            i9 = i24 == true ? 1 : 0;
                            i11 = i21;
                            if (iZzv != i7) {
                                obj2 = obj;
                                iZzm = iZzv;
                                i16 = i6;
                                i15 = i11;
                                i18 = i10;
                                i14 = i4;
                                i17 = i8;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i13 = i2;
                            } else {
                                i20 = iZzv;
                                i5 = i11;
                                i3 = i9;
                            }
                        } else {
                            i8 = i17;
                            unsafe = unsafe6;
                            i4 = -1;
                            i9 = i24 == true ? 1 : 0;
                            i10 = i18;
                            i11 = i21;
                            if (iZzA == 50) {
                                if (i22 == 2) {
                                    int iZzs = zzs(obj, bArr, i7, i2, i6, j, zzioVar);
                                    i6 = i6;
                                    if (iZzs != i7) {
                                        this = this;
                                        obj2 = obj;
                                        bArr2 = bArr;
                                        zzioVar = zzioVar;
                                        iZzm = iZzs;
                                        i16 = i6;
                                        i15 = i11;
                                        i18 = i10;
                                        i14 = -1;
                                        i17 = i8;
                                        unsafe2 = unsafe;
                                        i13 = i2;
                                    } else {
                                        i20 = iZzs;
                                    }
                                } else {
                                    i6 = i6;
                                    i20 = i7;
                                }
                                i5 = i11;
                                i3 = i9;
                            } else {
                                i5 = i11;
                                int iZzt = zzt(obj, bArr, i7, i2, i9 == true ? 1 : 0, i5, i22, i23, iZzA, j, i6, zzioVar);
                                obj = obj;
                                i3 = i9 == true ? 1 : 0;
                                i6 = i6;
                                if (iZzt != i7) {
                                    i15 = i5;
                                    iZzm = iZzt;
                                    i16 = i6;
                                    obj2 = obj;
                                    i18 = i10;
                                    i14 = i4;
                                    i17 = i8;
                                    unsafe2 = unsafe;
                                    bArr2 = bArr;
                                    i13 = i2;
                                } else {
                                    i20 = iZzt;
                                }
                            }
                        }
                    } else if (i22 == 2) {
                        zzkj zzkjVarZzd = (zzkj) unsafe2.getObject(obj2, j);
                        if (!zzkjVarZzd.zzc()) {
                            int size = zzkjVarZzd.size();
                            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
                            unsafe2.putObject(obj2, j, zzkjVarZzd);
                        }
                        int iZze = zzip.zze(this.zzE(i6), i24 == true ? 1 : 0, bArr2, i20, i2, zzkjVarZzd, zzioVar);
                        bArr2 = bArr;
                        zzioVar = zzioVar;
                        iZzm = iZze;
                        i16 = i6;
                        unsafe2 = unsafe2;
                        i15 = i21;
                        i14 = -1;
                        obj2 = obj;
                        i13 = i2;
                    } else {
                        i7 = i20;
                        i10 = i18;
                        i8 = i17;
                        unsafe = unsafe2;
                        i11 = i21;
                        i4 = -1;
                        i9 = i24 == true ? 1 : 0;
                        i20 = i7;
                        i5 = i11;
                        i3 = i9;
                    }
                    i18 = i10;
                    i17 = i8;
                }
            }
            int iZzi = zzip.zzi(i3 == true ? 1 : 0, bArr, i20, i2, zzd(obj), zzioVar);
            bArr2 = bArr;
            zzioVar = zzioVar;
            i15 = i5;
            i16 = i6;
            obj2 = obj;
            i14 = i4;
            unsafe2 = unsafe;
            i13 = i2;
            iZzm = iZzi;
            this = this;
        }
        Object obj6 = obj2;
        Unsafe unsafe7 = unsafe2;
        int i30 = i13;
        int i31 = i18;
        int i32 = i17;
        if (i31 != 1048575) {
            unsafe7.putInt(obj6, i31, i32);
        }
        if (iZzm == i30) {
            return iZzm;
        }
        throw zzkm.zze();
    }

    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzio zzioVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzl;
        int iZzj = i;
        int i12 = i2;
        Unsafe unsafe = zzb;
        zzkj zzkjVarZzd = (zzkj) unsafe.getObject(obj, j2);
        if (!zzkjVarZzd.zzc()) {
            int size = zzkjVarZzd.size();
            zzkjVarZzd = zzkjVarZzd.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkjVarZzd);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVarZzd;
                    int iZzj2 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i13 = zzioVar.zza + iZzj2;
                    while (iZzj2 < i13) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj2)));
                        iZzj2 += 8;
                    }
                    if (iZzj2 == i13) {
                        return iZzj2;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVarZzd;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i)));
                    while (true) {
                        i8 = iZzj + 8;
                        if (i8 < i12) {
                            iZzj = zzip.zzj(bArr, i8, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, iZzj)));
                            }
                        }
                    }
                    return i8;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVarZzd;
                    int iZzj3 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i14 = zzioVar.zza + iZzj3;
                    while (iZzj3 < i14) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj3)));
                        iZzj3 += 4;
                    }
                    if (iZzj3 == i14) {
                        return iZzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVarZzd;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i)));
                    while (true) {
                        i9 = iZzj + 4;
                        if (i9 < i12) {
                            iZzj = zzip.zzj(bArr, i9, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, iZzj)));
                            }
                        }
                    }
                    return i9;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzky zzkyVar = (zzky) zzkjVarZzd;
                    int iZzj4 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i15 = zzioVar.zza + iZzj4;
                    while (iZzj4 < i15) {
                        iZzj4 = zzip.zzm(bArr, iZzj4, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (iZzj4 == i15) {
                        return iZzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVarZzd;
                    int iZzm = zzip.zzm(bArr, iZzj, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (iZzm < i12) {
                        int iZzj5 = zzip.zzj(bArr, iZzm, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzm;
                        }
                        iZzm = zzip.zzm(bArr, iZzj5, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return iZzm;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzip.zzf(bArr, iZzj, zzkjVarZzd, zzioVar);
                }
                if (i5 == 0) {
                    return zzip.zzl(i3, bArr, iZzj, i12, zzkjVarZzd, zzioVar);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVarZzd;
                    int iZzj6 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i16 = zzioVar.zza + iZzj6;
                    while (iZzj6 < i16) {
                        zzkyVar3.zzg(zzip.zzn(bArr, iZzj6));
                        iZzj6 += 8;
                    }
                    if (iZzj6 == i16) {
                        return iZzj6;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVarZzd;
                    zzkyVar4.zzg(zzip.zzn(bArr, i));
                    while (true) {
                        i10 = iZzj + 8;
                        if (i10 < i12) {
                            iZzj = zzip.zzj(bArr, i10, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, iZzj));
                            }
                        }
                    }
                    return i10;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkd zzkdVar = (zzkd) zzkjVarZzd;
                    int iZzj7 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i17 = zzioVar.zza + iZzj7;
                    while (iZzj7 < i17) {
                        zzkdVar.zzh(zzip.zzb(bArr, iZzj7));
                        iZzj7 += 4;
                    }
                    if (iZzj7 == i17) {
                        return iZzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVarZzd;
                    zzkdVar2.zzh(zzip.zzb(bArr, i));
                    while (true) {
                        i11 = iZzj + 4;
                        if (i11 < i12) {
                            iZzj = zzip.zzj(bArr, i11, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, iZzj));
                            }
                        }
                    }
                    return i11;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    zziq zziqVar = (zziq) zzkjVarZzd;
                    int iZzj8 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i18 = zzioVar.zza + iZzj8;
                    while (iZzj8 < i18) {
                        iZzj8 = zzip.zzm(bArr, iZzj8, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (iZzj8 == i18) {
                        return iZzj8;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVarZzd;
                    int iZzm2 = zzip.zzm(bArr, iZzj, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (iZzm2 < i12) {
                        int iZzj9 = zzip.zzj(bArr, iZzm2, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzm2;
                        }
                        iZzm2 = zzip.zzm(bArr, iZzj9, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return iZzm2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int iZzj10 = zzip.zzj(bArr, iZzj, zzioVar);
                        int i19 = zzioVar.zza;
                        if (i19 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i19 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            zzkjVarZzd.add(new String(bArr, iZzj10, i19, zzkk.zzb));
                            iZzj10 += i19;
                        }
                        while (iZzj10 < i12) {
                            int iZzj11 = zzip.zzj(bArr, iZzj10, zzioVar);
                            if (i3 != zzioVar.zza) {
                                return iZzj10;
                            }
                            iZzj10 = zzip.zzj(bArr, iZzj11, zzioVar);
                            int i20 = zzioVar.zza;
                            if (i20 < 0) {
                                throw zzkm.zzd();
                            }
                            if (i20 == 0) {
                                zzkjVarZzd.add("");
                            } else {
                                zzkjVarZzd.add(new String(bArr, iZzj10, i20, zzkk.zzb));
                                iZzj10 += i20;
                            }
                        }
                        return iZzj10;
                    }
                    int iZzj12 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i21 = zzioVar.zza;
                    if (i21 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i21 == 0) {
                        zzkjVarZzd.add("");
                    } else {
                        int i22 = iZzj12 + i21;
                        if (!zzna.zzf(bArr, iZzj12, i22)) {
                            throw zzkm.zzc();
                        }
                        zzkjVarZzd.add(new String(bArr, iZzj12, i21, zzkk.zzb));
                        iZzj12 = i22;
                    }
                    while (iZzj12 < i12) {
                        int iZzj13 = zzip.zzj(bArr, iZzj12, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzj12;
                        }
                        iZzj12 = zzip.zzj(bArr, iZzj13, zzioVar);
                        int i23 = zzioVar.zza;
                        if (i23 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i23 == 0) {
                            zzkjVarZzd.add("");
                        } else {
                            int i24 = iZzj12 + i23;
                            if (!zzna.zzf(bArr, iZzj12, i24)) {
                                throw zzkm.zzc();
                            }
                            zzkjVarZzd.add(new String(bArr, iZzj12, i23, zzkk.zzb));
                            iZzj12 = i24;
                        }
                    }
                    return iZzj12;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return zzip.zze(zzE(i6), i3, bArr, iZzj, i12, zzkjVarZzd, zzioVar);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int iZzj14 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i25 = zzioVar.zza;
                    if (i25 < 0) {
                        throw zzkm.zzd();
                    }
                    if (i25 > bArr.length - iZzj14) {
                        throw zzkm.zzf();
                    }
                    if (i25 == 0) {
                        zzkjVarZzd.add(zzjb.zzb);
                    } else {
                        zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i25));
                        iZzj14 += i25;
                    }
                    while (iZzj14 < i12) {
                        int iZzj15 = zzip.zzj(bArr, iZzj14, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzj14;
                        }
                        iZzj14 = zzip.zzj(bArr, iZzj15, zzioVar);
                        int i26 = zzioVar.zza;
                        if (i26 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i26 > bArr.length - iZzj14) {
                            throw zzkm.zzf();
                        }
                        if (i26 == 0) {
                            zzkjVarZzd.add(zzjb.zzb);
                        } else {
                            zzkjVarZzd.add(zzjb.zzl(bArr, iZzj14, i26));
                            iZzj14 += i26;
                        }
                    }
                    return iZzj14;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        iZzl = zzip.zzl(i3, bArr, iZzj, i12, zzkjVarZzd, zzioVar);
                    }
                    return i;
                }
                iZzl = zzip.zzf(bArr, iZzj, zzkjVarZzd, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object objZzC = zzlw.zzC(i4, zzkjVarZzd, zzD(i6), zzmmVar, this.zzn);
                if (objZzC == null) {
                    return iZzl;
                }
                zzkcVar.zzc = (zzmm) objZzC;
                return iZzl;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVarZzd;
                    int iZzj16 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i27 = zzioVar.zza + iZzj16;
                    while (iZzj16 < i27) {
                        iZzj16 = zzip.zzj(bArr, iZzj16, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (iZzj16 == i27) {
                        return iZzj16;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVarZzd;
                    int iZzj17 = zzip.zzj(bArr, iZzj, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (iZzj17 < i12) {
                        int iZzj18 = zzip.zzj(bArr, iZzj17, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzj17;
                        }
                        iZzj17 = zzip.zzj(bArr, iZzj18, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return iZzj17;
                }
                return i;
            case 34:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                if (i5 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVarZzd;
                    int iZzj19 = zzip.zzj(bArr, iZzj, zzioVar);
                    int i28 = zzioVar.zza + iZzj19;
                    while (iZzj19 < i28) {
                        iZzj19 = zzip.zzm(bArr, iZzj19, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (iZzj19 == i28) {
                        return iZzj19;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVarZzd;
                    int iZzm3 = zzip.zzm(bArr, iZzj, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (iZzm3 < i12) {
                        int iZzj20 = zzip.zzj(bArr, iZzm3, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzm3;
                        }
                        iZzm3 = zzip.zzm(bArr, iZzj20, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return iZzm3;
                }
                return i;
            default:
                if (i5 == 3) {
                    zzlu zzluVarZzE = zzE(i6);
                    int i29 = (i3 & (-8)) | 4;
                    int iZzc = zzip.zzc(zzluVarZzE, bArr, iZzj, i12, i29, zzioVar);
                    zzkjVarZzd.add(zzioVar.zzc);
                    while (iZzc < i12) {
                        int iZzj21 = zzip.zzj(bArr, iZzc, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return iZzc;
                        }
                        iZzc = zzip.zzc(zzluVarZzE, bArr, iZzj21, i12, i29, zzioVar);
                        zzkjVarZzd.add(zzioVar.zzc);
                        i12 = i2;
                    }
                    return iZzc;
                }
                return i;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i;
        int iZzc;
        int length = this.zzc.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int iZzB = zzB(i3);
            int i4 = this.zzc[i3];
            long j = 1048575 & iZzB;
            int iHashCode = 37;
            switch (zzA(iZzB)) {
                case 0:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i2 = i + iZzc;
                    break;
                case 1:
                    i = i2 * 53;
                    iZzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i2 = i + iZzc;
                    break;
                case 2:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 3:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 4:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 5:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 6:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 7:
                    i = i2 * 53;
                    iZzc = zzkk.zza(zzmv.zzw(obj, j));
                    i2 = i + iZzc;
                    break;
                case 8:
                    i = i2 * 53;
                    iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i2 = i + iZzc;
                    break;
                case 9:
                    Object objZzf = zzmv.zzf(obj, j);
                    if (objZzf != null) {
                        iHashCode = objZzf.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
                    break;
                case 10:
                    i = i2 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 11:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 12:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 13:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 14:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 15:
                    i = i2 * 53;
                    iZzc = zzmv.zzc(obj, j);
                    i2 = i + iZzc;
                    break;
                case 16:
                    i = i2 * 53;
                    iZzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i2 = i + iZzc;
                    break;
                case 17:
                    Object objZzf2 = zzmv.zzf(obj, j);
                    if (objZzf2 != null) {
                        iHashCode = objZzf2.hashCode();
                    }
                    i2 = (i2 * 53) + iHashCode;
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
                    i = i2 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case 50:
                    i = i2 * 53;
                    iZzc = zzmv.zzf(obj, j).hashCode();
                    i2 = i + iZzc;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i2 = i + iZzc;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = Float.floatToIntBits(zzo(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 56:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 57:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 58:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zza(zzS(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 59:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
                case 62:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case 64:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzr(obj, j);
                        i2 = i + iZzc;
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzkk.zzc(zzC(obj, j));
                        i2 = i + iZzc;
                    }
                    break;
                case 68:
                    if (zzR(obj, i4, i3)) {
                        i = i2 * 53;
                        iZzc = zzmv.zzf(obj, j).hashCode();
                        i2 = i + iZzc;
                    }
                    break;
            }
        }
        int iHashCode2 = (i2 * 53) + this.zzn.zzc(obj).hashCode();
        if (!this.zzh) {
            return iHashCode2;
        }
        this.zzo.zza(obj);
        throw null;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12181. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    final int zzc(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.zzio r34) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzio):int");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i;
        int[] iArr;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            iArr = this.zzj;
            if (i2 >= i) {
                break;
            }
            long jZzB = zzB(iArr[i2]) & 1048575;
            Object objZzf = zzmv.zzf(obj, jZzB);
            if (objZzf != null) {
                ((zzld) objZzf).zzc();
                zzmv.zzs(obj, jZzB, objZzf);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzioVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
            return;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj, i)) {
                        zzndVar.zzf(i2, zzmv.zza(obj, iZzB & 1048575));
                    }
                    break;
                case 1:
                    if (zzO(obj, i)) {
                        zzndVar.zzo(i2, zzmv.zzb(obj, iZzB & 1048575));
                    }
                    break;
                case 2:
                    if (zzO(obj, i)) {
                        zzndVar.zzt(i2, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 3:
                    if (zzO(obj, i)) {
                        zzndVar.zzJ(i2, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 4:
                    if (zzO(obj, i)) {
                        zzndVar.zzr(i2, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 5:
                    if (zzO(obj, i)) {
                        zzndVar.zzm(i2, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 6:
                    if (zzO(obj, i)) {
                        zzndVar.zzk(i2, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 7:
                    if (zzO(obj, i)) {
                        zzndVar.zzb(i2, zzmv.zzw(obj, iZzB & 1048575));
                    }
                    break;
                case 8:
                    if (zzO(obj, i)) {
                        zzT(i2, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case 9:
                    if (zzO(obj, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 10:
                    if (zzO(obj, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 11:
                    if (zzO(obj, i)) {
                        zzndVar.zzH(i2, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 12:
                    if (zzO(obj, i)) {
                        zzndVar.zzi(i2, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 13:
                    if (zzO(obj, i)) {
                        zzndVar.zzw(i2, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 14:
                    if (zzO(obj, i)) {
                        zzndVar.zzy(i2, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 15:
                    if (zzO(obj, i)) {
                        zzndVar.zzA(i2, zzmv.zzc(obj, iZzB & 1048575));
                    }
                    break;
                case 16:
                    if (zzO(obj, i)) {
                        zzndVar.zzC(i2, zzmv.zzd(obj, iZzB & 1048575));
                    }
                    break;
                case 17:
                    if (zzO(obj, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case 18:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 19:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 20:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 21:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 22:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 23:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 24:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 25:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 26:
                    zzlw.zzW(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 27:
                    zzlw.zzR(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i));
                    break;
                case 28:
                    zzlw.zzI(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    break;
                case 29:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 30:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 31:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 32:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 33:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 34:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, false);
                    break;
                case 35:
                    zzlw.zzJ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 36:
                    zzlw.zzN(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 37:
                    zzlw.zzQ(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 38:
                    zzlw.zzY(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 39:
                    zzlw.zzP(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 40:
                    zzlw.zzM(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 41:
                    zzlw.zzL(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 42:
                    zzlw.zzH(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 43:
                    zzlw.zzX(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 44:
                    zzlw.zzK(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 45:
                    zzlw.zzS(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 46:
                    zzlw.zzT(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case 47:
                    zzlw.zzU(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzlw.zzV(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, true);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzlw.zzO(i2, (List) zzmv.zzf(obj, iZzB & 1048575), zzndVar, zzE(i));
                    break;
                case 50:
                    zzM(zzndVar, i2, zzmv.zzf(obj, iZzB & 1048575), i);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzf(i2, zzn(obj, iZzB & 1048575));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzo(i2, zzo(obj, iZzB & 1048575));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzt(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzJ(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzr(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 56:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzm(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 57:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzk(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 58:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzb(i2, zzS(obj, iZzB & 1048575));
                    }
                    break;
                case 59:
                    if (zzR(obj, i2, i)) {
                        zzT(i2, zzmv.zzf(obj, iZzB & 1048575), zzndVar);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzv(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, iZzB & 1048575));
                    }
                    break;
                case 62:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzH(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzi(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case 64:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzw(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzy(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzA(i2, zzr(obj, iZzB & 1048575));
                    }
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzC(i2, zzC(obj, iZzB & 1048575));
                    }
                    break;
                case 68:
                    if (zzR(obj, i2, i)) {
                        zzndVar.zzq(i2, zzmv.zzf(obj, iZzB & 1048575), zzE(i));
                    }
                    break;
            }
        }
        zzml zzmlVar = this.zzn;
        zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zZzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int iZzB = zzB(i);
            long j = iZzB & 1048575;
            switch (zzA(iZzB)) {
                case 0:
                    if (!zzN(obj, obj2, i) || Double.doubleToLongBits(zzmv.zza(obj, j)) != Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzN(obj, obj2, i) || Float.floatToIntBits(zzmv.zzb(obj, j)) != Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzN(obj, obj2, i) || zzmv.zzw(obj, j) != zzmv.zzw(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzN(obj, obj2, i) || zzmv.zzc(obj, j) != zzmv.zzc(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzN(obj, obj2, i) || zzmv.zzd(obj, j) != zzmv.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzN(obj, obj2, i) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
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
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zZzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    long jZzy = zzy(i) & 1048575;
                    if (zzmv.zzc(obj, jZzy) != zzmv.zzc(obj2, jZzy) || !zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzZ) {
                return false;
            }
        }
        if (!this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        this.zzo.zza(obj2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8 A[LOOP:1: B:45:0x00a7->B:50:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        List list;
        zzlu zzluVarZzE;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int i7 = this.zzj[i6];
            int i8 = this.zzc[i7];
            int iZzB = zzB(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i12;
            }
            if ((268435456 & iZzB) != 0 && !zzP(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzA = zzA(iZzB);
            if (iZzA == 9 || iZzA == 17) {
                if (zzP(obj, i7, i, i2, i11) && !zzQ(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 27) {
                list = (List) zzmv.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzluVarZzE = zzE(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzluVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzA == 60 || iZzA == 68) {
                if (zzR(obj, i8, i7) && !zzQ(obj, iZzB, zzE(i7))) {
                    return false;
                }
            } else if (iZzA == 49) {
                list = (List) zzmv.zzf(obj, iZzB & 1048575);
                if (list.isEmpty()) {
                    zzluVarZzE = zzE(i7);
                    while (i3 < list.size()) {
                        if (!zzluVarZzE.zzk(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzA == 50 && !((zzld) zzmv.zzf(obj, iZzB & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzo.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzB = zzB(i);
            long j = 1048575 & iZzB;
            int i2 = this.zzc[i];
            switch (zzA(iZzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 1:
                    if (zzO(obj2, i)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 2:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 3:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 4:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 5:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 6:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 7:
                    if (zzO(obj2, i)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 8:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 11:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 12:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 13:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 14:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 15:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 16:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                    }
                    break;
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                    }
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzI(obj, obj2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT /* 65 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                    }
                    break;
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }
}
