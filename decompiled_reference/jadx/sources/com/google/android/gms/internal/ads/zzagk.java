package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzagk {
    public static boolean zzb(zzagb zzagbVar, zzagj zzagjVar) throws IOException {
        zzagbVar.zzl();
        zzet zzetVar = new zzet(new byte[4], 4);
        zzagbVar.zzi(zzetVar.zza, 0, 4);
        boolean zZzi = zzetVar.zzi();
        int iZzj = zzetVar.zzj(7);
        int iZzj2 = zzetVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzagbVar.zzc(bArr, 0, 38);
            zzagjVar.zza = new zzagn(bArr, 4);
            return zZzi;
        }
        zzagn zzagnVar = zzagjVar.zza;
        if (zzagnVar == null) {
            throw new IllegalArgumentException();
        }
        if (iZzj == 3) {
            zzeu zzeuVar = new zzeu(iZzj2);
            zzagbVar.zzc(zzeuVar.zzi(), 0, iZzj2);
            zzagjVar.zza = zzagnVar.zze(zzc(zzeuVar));
            return zZzi;
        }
        if (iZzj == 4) {
            zzeu zzeuVar2 = new zzeu(iZzj2);
            zzagbVar.zzc(zzeuVar2.zzi(), 0, iZzj2);
            zzeuVar2.zzk(4);
            zzagjVar.zza = new zzagn(zzagnVar.zza, zzagnVar.zzb, zzagnVar.zzc, zzagnVar.zzd, zzagnVar.zze, zzagnVar.zzg, zzagnVar.zzh, zzagnVar.zzj, zzagnVar.zzk, zzagnVar.zzd(zzaho.zzb(Arrays.asList(zzhg.zzb(zzeuVar2, false, false).zza))));
            return zZzi;
        }
        if (iZzj != 6) {
            zzagbVar.zzf(iZzj2);
            return zZzi;
        }
        zzeu zzeuVar3 = new zzeu(iZzj2);
        zzagbVar.zzc(zzeuVar3.zzi(), 0, iZzj2);
        zzeuVar3.zzk(4);
        zzagjVar.zza = new zzagn(zzagnVar.zza, zzagnVar.zzb, zzagnVar.zzc, zzagnVar.zzd, zzagnVar.zze, zzagnVar.zzg, zzagnVar.zzh, zzagnVar.zzj, zzagnVar.zzk, zzagnVar.zzd(new zzap(zzgwt.zzj(zzajg.zzb(zzeuVar3)))));
        return zZzi;
    }

    public static zzagm zzc(zzeu zzeuVar) {
        zzeuVar.zzk(1);
        int iZzx = zzeuVar.zzx();
        long jZzg = zzeuVar.zzg();
        long j = iZzx;
        int i = iZzx / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jZzD = zzeuVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jZzD;
            jArrCopyOf2[i2] = zzeuVar.zzD();
            zzeuVar.zzk(2);
        }
        zzeuVar.zzk((int) ((jZzg + j) - ((long) zzeuVar.zzg())));
        return new zzagm(jArrCopyOf, jArrCopyOf2);
    }

    public static zzap zza(zzagb zzagbVar, boolean z) throws IOException {
        zzap zzapVarZza = new zzagv().zza(zzagbVar, z ? null : zzajr.zza, 0);
        if (zzapVarZza == null || zzapVarZza.zza() == 0) {
            return null;
        }
        return zzapVarZza;
    }
}
