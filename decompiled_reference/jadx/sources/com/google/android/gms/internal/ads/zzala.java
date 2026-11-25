package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzala {
    public final zzagx zza;
    public final long zzb;
    public final long zzc;
    public final zzakw zzd;
    public final int zze;
    public final int zzf;
    public final long[] zzg;

    private zzala(zzagx zzagxVar, long j, long j2, long[] jArr, zzakw zzakwVar, int i, int i2) {
        this.zza = new zzagx(zzagxVar);
        this.zzb = j;
        this.zzc = j2;
        this.zzg = jArr;
        this.zzd = zzakwVar;
        this.zze = i;
        this.zzf = i2;
    }

    public static zzala zza(zzagx zzagxVar, zzeu zzeuVar) {
        long[] jArr;
        int i;
        int i2;
        int iZzB = zzeuVar.zzB();
        int iZzH = (iZzB & 1) != 0 ? zzeuVar.zzH() : -1;
        long jZzz = (iZzB & 2) != 0 ? zzeuVar.zzz() : -1L;
        zzakw zzakwVarZzb = null;
        if ((iZzB & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i3 = 0; i3 < 100; i3++) {
                jArr2[i3] = zzeuVar.zzs();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iZzB & 8) != 0) {
            zzeuVar.zzk(4);
        }
        if (zzeuVar.zzd() >= 24) {
            zzeuVar.zzk(11);
            zzakwVarZzb = zzakw.zzb(Float.intBitsToFloat(zzeuVar.zzB()), zzeuVar.zzt(), zzeuVar.zzt());
            zzeuVar.zzk(2);
            int iZzx = zzeuVar.zzx();
            i2 = iZzx & 4095;
            i = iZzx >> 12;
        } else {
            i = -1;
            i2 = -1;
        }
        return new zzala(zzagxVar, iZzH, jZzz, jArr, zzakwVarZzb, i, i2);
    }

    public final long zzb() {
        long j = this.zzb;
        if (j == -1 || j == 0) {
            return -9223372036854775807L;
        }
        zzagx zzagxVar = this.zza;
        return zzfm.zzu((j * ((long) zzagxVar.zzg)) - 1, zzagxVar.zzd);
    }
}
