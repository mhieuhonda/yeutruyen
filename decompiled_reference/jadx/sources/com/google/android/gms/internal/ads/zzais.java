package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzais {
    public static boolean zza(zzagb zzagbVar, boolean z) throws IOException {
        int i;
        zzeu zzeuVar = new zzeu(16);
        boolean z2 = true;
        while (true) {
            zzeuVar.zza(8);
            if (!zzagbVar.zzh(zzeuVar.zzi(), 0, 8, true)) {
                return false;
            }
            long jZzz = zzeuVar.zzz();
            int iZzB = zzeuVar.zzB();
            if (jZzz != 1) {
                i = 8;
            } else {
                if (!zzagbVar.zzh(zzeuVar.zzi(), 8, 8, true)) {
                    return false;
                }
                jZzz = zzeuVar.zzJ();
                i = 16;
            }
            long j = i;
            if (jZzz < j) {
                return false;
            }
            int i2 = (int) (jZzz - j);
            if (z2) {
                if (iZzB != 1718909296 || i2 < 8) {
                    return false;
                }
                zzeuVar.zza(4);
                zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
                if (zzeuVar.zzB() != 1751476579) {
                    return false;
                }
                if (!z) {
                    return true;
                }
                zzagbVar.zzk(i2 - 4);
            } else {
                if (iZzB == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    zzagbVar.zzk(i2);
                }
            }
            z2 = false;
        }
    }
}
