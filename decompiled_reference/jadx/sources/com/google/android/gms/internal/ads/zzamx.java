package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzamx extends zzang {
    private zzagn zza;
    private zzamw zzb;

    zzamx() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzang
    protected final long zzb(zzeu zzeuVar) {
        if (!zzd(zzeuVar.zzi())) {
            return -1L;
        }
        int i = (zzeuVar.zzi()[2] & 255) >> 4;
        if (i == 6) {
            zzeuVar.zzk(4);
            zzeuVar.zzO();
        } else if (i == 7) {
            i = 7;
            zzeuVar.zzk(4);
            zzeuVar.zzO();
        }
        int iZzc = zzagi.zzc(zzeuVar, i);
        zzeuVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzang
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(zzeu zzeuVar, long j, zzane zzaneVar) {
        byte[] bArrZzi = zzeuVar.zzi();
        zzagn zzagnVar = this.zza;
        if (zzagnVar == null) {
            zzagn zzagnVar2 = new zzagn(bArrZzi, 17);
            this.zza = zzagnVar2;
            zzt zztVarZza = zzagnVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzeuVar.zze()), null).zza();
            zztVarZza.zzn("audio/ogg");
            zzaneVar.zza = zztVarZza.zzP();
            return true;
        }
        if ((bArrZzi[0] & 127) == 3) {
            zzagm zzagmVarZzc = zzagk.zzc(zzeuVar);
            zzagn zzagnVarZze = zzagnVar.zze(zzagmVarZzc);
            this.zza = zzagnVarZze;
            this.zzb = new zzamw(zzagnVarZze, zzagmVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzamw zzamwVar = this.zzb;
        if (zzamwVar != null) {
            zzamwVar.zzd(j);
            zzaneVar.zzb = this.zzb;
        }
        zzaneVar.zza.getClass();
        return false;
    }
}
