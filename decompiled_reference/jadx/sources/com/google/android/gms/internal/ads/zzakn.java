package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakn {
    private final zzeu zza = new zzeu(8);
    private int zzb;

    private final long zzb(zzagb zzagbVar) throws IOException {
        int i;
        zzeu zzeuVar = this.zza;
        int i2 = 0;
        zzagbVar.zzi(zzeuVar.zzi(), 0, 1);
        int i3 = zzeuVar.zzi()[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while (true) {
            i = i5 + 1;
            if ((i3 & i4) != 0) {
                break;
            }
            i4 >>= 1;
            i5 = i;
        }
        int i6 = i3 & (~i4);
        zzagbVar.zzi(zzeuVar.zzi(), 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (zzeuVar.zzi()[i2] & 255) + (i6 << 8);
        }
        this.zzb += i;
        return i6;
    }

    public final boolean zza(zzagb zzagbVar) throws IOException {
        long jZzo = zzagbVar.zzo();
        long j = 1024;
        if (jZzo != -1 && jZzo <= 1024) {
            j = jZzo;
        }
        zzeu zzeuVar = this.zza;
        zzagbVar.zzi(zzeuVar.zzi(), 0, 4);
        this.zzb = 4;
        for (long jZzz = zzeuVar.zzz(); jZzz != 440786851; jZzz = ((jZzz << 8) & (-256)) | ((long) (zzeuVar.zzi()[0] & 255))) {
            int i = (int) j;
            int i2 = this.zzb + 1;
            this.zzb = i2;
            if (i2 == i) {
                return false;
            }
            zzagbVar.zzi(zzeuVar.zzi(), 0, 1);
        }
        long jZzb = zzb(zzagbVar);
        long j2 = this.zzb;
        if (jZzb != Long.MIN_VALUE) {
            long j3 = j2 + jZzb;
            if (jZzo == -1 || j3 < jZzo) {
                while (true) {
                    long j4 = this.zzb;
                    if (j4 < j3) {
                        if (zzb(zzagbVar) == Long.MIN_VALUE) {
                            return false;
                        }
                        long jZzb2 = zzb(zzagbVar);
                        if (jZzb2 < 0) {
                            return false;
                        }
                        if (jZzb2 != 0) {
                            int i3 = (int) jZzb2;
                            zzagbVar.zzk(i3);
                            this.zzb += i3;
                        }
                    } else if (j4 == j3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
