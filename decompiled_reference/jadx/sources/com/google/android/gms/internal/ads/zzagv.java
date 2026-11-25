package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagv {
    private final zzeu zza = new zzeu(10);

    private final boolean zzb(zzagb zzagbVar, int i) throws IOException {
        int i2;
        int i3 = 0;
        do {
            int i4 = i3 % 10;
            if (i4 == 0) {
                if (i3 != 0) {
                    zzeu zzeuVar = this.zza;
                    System.arraycopy(zzeuVar.zzi(), 10, zzeuVar.zzi(), 0, 9);
                }
                i2 = 0;
            } else {
                i2 = i4;
            }
            int i5 = i3 != 0 ? 1 : 10;
            try {
                zzeu zzeuVar2 = this.zza;
                int i6 = i4 + 10;
                zzagbVar.zzi(zzeuVar2.zzi(), i6 - i5, i5);
                zzeuVar2.zzh(i2);
                zzeuVar2.zzf(i6);
                if (zzeuVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzagy.zza(zzeuVar2.zzr()) != -1) {
                    return false;
                }
                if (i3 == 0) {
                    zzeuVar2.zzc(20);
                }
                i3++;
            } catch (EOFException unused) {
            }
        } while (i3 <= i);
        return false;
    }

    public final zzap zza(zzagb zzagbVar, zzajo zzajoVar, int i) throws IOException {
        zzap zzapVarZza = null;
        int i2 = 0;
        while (zzb(zzagbVar, i)) {
            zzeu zzeuVar = this.zza;
            int iZzg = zzeuVar.zzg();
            zzeuVar.zzk(6);
            int iZzG = zzeuVar.zzG();
            int i3 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i3];
                System.arraycopy(zzeuVar.zzi(), iZzg, bArr, 0, 10);
                zzagbVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzajr.zza(bArr, i3, zzajoVar, new zzajc());
            } else {
                zzagbVar.zzk(iZzG);
            }
            i2 += i3;
        }
        zzagbVar.zzl();
        zzagbVar.zzk(i2);
        return zzapVarZza;
    }
}
