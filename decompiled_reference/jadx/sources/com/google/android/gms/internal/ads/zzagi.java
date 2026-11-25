package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagi {
    public static boolean zza(zzeu zzeuVar, zzagn zzagnVar, int i, zzagh zzaghVar) {
        int iZzg = zzeuVar.zzg();
        long jZzz = zzeuVar.zzz();
        long j = jZzz >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        long j2 = jZzz >> 12;
        long j3 = jZzz >> 8;
        long j4 = jZzz >> 4;
        long j5 = jZzz >> 1;
        long j6 = jZzz & 1;
        int i2 = (int) (j4 & 15);
        if (i2 <= 7) {
            if (i2 != zzagnVar.zzg - 1) {
                return false;
            }
        } else if (i2 > 10 || zzagnVar.zzg != 2) {
            return false;
        }
        int i3 = (int) (j5 & 7);
        if ((i3 != 0 && i3 != zzagnVar.zzi) || j6 == 1 || !zzd(zzeuVar, zzagnVar, z, zzaghVar)) {
            return false;
        }
        long j7 = zzaghVar.zza;
        int iZzc = zzc(zzeuVar, (int) (j2 & 15));
        long j8 = zzagnVar.zzj;
        boolean z2 = j8 == 0 || j7 + ((long) iZzc) >= j8;
        if (iZzc == -1) {
            return false;
        }
        if ((!z2 && iZzc < zzagnVar.zza) || iZzc > zzagnVar.zzb) {
            return false;
        }
        int i4 = zzagnVar.zze;
        int i5 = (int) (j3 & 15);
        if (i5 != 0) {
            if (i5 <= 11) {
                if (i5 != zzagnVar.zzf) {
                    return false;
                }
            } else if (i5 == 12) {
                if (zzeuVar.zzs() * 1000 != i4) {
                    return false;
                }
            } else {
                if (i5 > 14) {
                    return false;
                }
                int iZzt = zzeuVar.zzt();
                if (i5 == 14) {
                    iZzt *= 10;
                }
                if (iZzt != i4) {
                    return false;
                }
            }
        }
        if (zzeuVar.zzs() != zzfm.zzN(zzeuVar.zzi(), iZzg, zzeuVar.zzg() - 1, 0)) {
            return false;
        }
        if (zzeuVar.zzd() != 0) {
            int iZzn = zzeuVar.zzn();
            if ((iZzn & 128) != 0) {
                return false;
            }
            int i6 = (iZzn & 126) >> 1;
            if ((i6 >= 2 && i6 <= 7) || (i6 >= 13 && i6 <= 31)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 57);
                sb.append("Ignoring frame where first subframe has a reserved type: ");
                sb.append(i6);
                zzeh.zzb("FlacFrameReader", sb.toString());
                return false;
            }
        }
        return true;
    }

    public static long zzb(zzagb zzagbVar, zzagn zzagnVar) throws IOException {
        zzagbVar.zzl();
        zzagbVar.zzk(1);
        byte[] bArr = new byte[1];
        zzagbVar.zzi(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzagbVar.zzk(2);
        int i2 = 1 != i ? 6 : 7;
        zzeu zzeuVar = new zzeu(i2);
        zzeuVar.zzf(zzage.zzb(zzagbVar, zzeuVar.zzi(), 0, i2));
        zzagbVar.zzl();
        zzagh zzaghVar = new zzagh();
        if (zzd(zzeuVar, zzagnVar, z, zzaghVar)) {
            return zzaghVar.zza;
        }
        throw zzat.zzb(null, null);
    }

    public static int zzc(zzeu zzeuVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzeuVar.zzs() + 1;
            case 7:
                return zzeuVar.zzt() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean zzd(zzeu zzeuVar, zzagn zzagnVar, boolean z, zzagh zzaghVar) {
        try {
            long jZzO = zzeuVar.zzO();
            if (!z) {
                jZzO *= (long) zzagnVar.zzb;
            }
            long j = zzagnVar.zzj;
            if (j != 0 && jZzO > j) {
                return false;
            }
            zzaghVar.zza = jZzO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
