package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.io.IOException;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzida {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    static int zza(byte[] bArr, int i, zzicz zziczVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzb(b, bArr, i2, zziczVar);
        }
        zziczVar.zza = b;
        return i2;
    }

    static int zzb(int i, byte[] bArr, int i2, zzicz zziczVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & WorkQueueKt.MASK;
        if (b >= 0) {
            zziczVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zziczVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zziczVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zziczVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zziczVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzc(byte[] bArr, int i, zzicz zziczVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zziczVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        zziczVar.zzb = j2;
        return i3;
    }

    static int zzd(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static long zze(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    static int zzf(byte[] bArr, int i, zzicz zziczVar) throws zzifh {
        int iZza = zza(bArr, i, zziczVar);
        int i2 = zziczVar.zza;
        if (i2 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            zziczVar.zzc = "";
            return iZza;
        }
        zziczVar.zzc = zzihp.zze(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zzg(byte[] bArr, int i, zzicz zziczVar) throws zzifh {
        int iZza = zza(bArr, i, zziczVar);
        int i2 = zziczVar.zza;
        if (i2 < 0) {
            throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iZza) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            zziczVar.zzc = zzidl.zza;
            return iZza;
        }
        zziczVar.zzc = zzidl.zzt(bArr, iZza, i2);
        return iZza + i2;
    }

    static int zzh(zzigr zzigrVar, byte[] bArr, int i, int i2, zzicz zziczVar) throws IOException {
        Object objZza = zzigrVar.zza();
        int iZzj = zzj(objZza, zzigrVar, bArr, i, i2, zziczVar);
        zzigrVar.zzk(objZza);
        zziczVar.zzc = objZza;
        return iZzj;
    }

    static int zzi(zzigr zzigrVar, byte[] bArr, int i, int i2, int i3, zzicz zziczVar) throws IOException {
        Object objZza = zzigrVar.zza();
        int iZzk = zzk(objZza, zzigrVar, bArr, i, i2, i3, zziczVar);
        zzigrVar.zzk(objZza);
        zziczVar.zzc = objZza;
        return iZzk;
    }

    static int zzj(Object obj, zzigr zzigrVar, byte[] bArr, int i, int i2, zzicz zziczVar) throws IOException {
        int iZzb = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iZzb = zzb(i3, bArr, iZzb, zziczVar);
            i3 = zziczVar.zza;
        }
        int i4 = iZzb;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i5 = zziczVar.zze + 1;
        zziczVar.zze = i5;
        zzq(i5);
        int i6 = i4 + i3;
        zzigrVar.zzj(obj, bArr, i4, i6, zziczVar);
        zziczVar.zze--;
        zziczVar.zzc = obj;
        return i6;
    }

    static int zzk(Object obj, zzigr zzigrVar, byte[] bArr, int i, int i2, int i3, zzicz zziczVar) throws IOException {
        int i4 = zziczVar.zze + 1;
        zziczVar.zze = i4;
        zzq(i4);
        int iZzi = ((zzigc) zzigrVar).zzi(obj, bArr, i, i2, i3, zziczVar);
        zziczVar.zze--;
        zziczVar.zzc = obj;
        return iZzi;
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzifb zzifbVar, zzicz zziczVar) {
        zzieq zzieqVar = (zzieq) zzifbVar;
        int iZza = zza(bArr, i2, zziczVar);
        zzieqVar.zzi(zziczVar.zza);
        while (iZza < i3) {
            int iZza2 = zza(bArr, iZza, zziczVar);
            if (i != zziczVar.zza) {
                break;
            }
            iZza = zza(bArr, iZza2, zziczVar);
            zzieqVar.zzi(zziczVar.zza);
        }
        return iZza;
    }

    static int zzm(byte[] bArr, int i, zzifb zzifbVar, zzicz zziczVar) throws IOException {
        zzieq zzieqVar = (zzieq) zzifbVar;
        int iZza = zza(bArr, i, zziczVar);
        int i2 = zziczVar.zza + iZza;
        while (iZza < i2) {
            iZza = zza(bArr, iZza, zziczVar);
            zzieqVar.zzi(zziczVar.zza);
        }
        if (iZza == i2) {
            return iZza;
        }
        throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static int zzn(zzigr zzigrVar, int i, byte[] bArr, int i2, int i3, zzifb zzifbVar, zzicz zziczVar) throws IOException {
        int iZzh = zzh(zzigrVar, bArr, i2, i3, zziczVar);
        zzifbVar.add(zziczVar.zzc);
        while (iZzh < i3) {
            int iZza = zza(bArr, iZzh, zziczVar);
            if (i != zziczVar.zza) {
                break;
            }
            iZzh = zzh(zzigrVar, bArr, iZza, i3, zziczVar);
            zzifbVar.add(zziczVar.zzc);
        }
        return iZzh;
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, zzihe zziheVar, zzicz zziczVar) throws zzifh {
        if ((i >>> 3) == 0) {
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iZzc = zzc(bArr, i2, zziczVar);
            zziheVar.zzk(i, Long.valueOf(zziczVar.zzb));
            return iZzc;
        }
        if (i4 == 1) {
            zziheVar.zzk(i, Long.valueOf(zze(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iZza = zza(bArr, i2, zziczVar);
            int i5 = zziczVar.zza;
            if (i5 < 0) {
                throw new zzifh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iZza) {
                throw new zzifh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                zziheVar.zzk(i, zzidl.zza);
            } else {
                zziheVar.zzk(i, zzidl.zzt(bArr, iZza, i5));
            }
            return iZza + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new zzifh("Protocol message contained an invalid tag (zero).");
            }
            zziheVar.zzk(i, Integer.valueOf(zzd(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zzihe zziheVarZzb = zzihe.zzb();
        int i7 = zziczVar.zze + 1;
        zziczVar.zze = i7;
        zzq(i7);
        int i8 = 0;
        while (i2 < i3) {
            int iZza2 = zza(bArr, i2, zziczVar);
            int i9 = zziczVar.zza;
            if (i9 == i6) {
                i8 = i9;
                i2 = iZza2;
                break;
            }
            i2 = zzo(i9, bArr, iZza2, i3, zziheVarZzb, zziczVar);
            i8 = i9;
        }
        zziczVar.zze--;
        if (i2 > i3 || i8 != i6) {
            throw new zzifh("Failed to parse the message.");
        }
        zziheVar.zzk(i, zziheVarZzb);
        return i2;
    }

    static int zzp(int i, byte[] bArr, int i2, int i3, zzicz zziczVar) throws zzifh {
        if ((i >>> 3) == 0) {
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzc(bArr, i2, zziczVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zza(bArr, i2, zziczVar) + zziczVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new zzifh("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = zziczVar.zze + 1;
        zziczVar.zze = i6;
        zzq(i6);
        int i7 = 0;
        while (i2 < i3) {
            i2 = zza(bArr, i2, zziczVar);
            i7 = zziczVar.zza;
            if (i7 == i5) {
                break;
            }
            i2 = zzp(i7, bArr, i2, i3, zziczVar);
        }
        zziczVar.zze--;
        if (i2 > i3 || i7 != i5) {
            throw new zzifh("Failed to parse the message.");
        }
        return i2;
    }

    private static void zzq(int i) throws zzifh {
        if (i >= zzb) {
            throw new zzifh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
