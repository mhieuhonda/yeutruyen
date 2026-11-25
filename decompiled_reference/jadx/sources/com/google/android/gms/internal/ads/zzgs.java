package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgs {
    private final boolean zza;

    /* JADX WARN: Code duplicated, block: B:13:0x004b  */
    private zzgs(zzgv zzgvVar, zzgu zzguVar) throws zzgt {
        int i = zzguVar.zza;
        boolean z = false;
        zzgtr.zza(i == 6 || i == 3);
        int iMin = Math.min(4, zzguVar.zzb.remaining());
        byte[] bArr = new byte[iMin];
        zzguVar.zzb.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, iMin);
        zzgw.zzb(zzgvVar.zza);
        if (!zzetVar.zzi()) {
            int iZzj = zzetVar.zzj(2);
            boolean zZzi = zzetVar.zzi();
            zzgw.zzb(zzgvVar.zzb);
            if (zZzi) {
                boolean zZzi2 = (iZzj == 3 || iZzj == 0) ? true : zzetVar.zzi();
                zzetVar.zzg();
                zzgw.zzb(!zzgvVar.zzd);
                if (zzetVar.zzi()) {
                    zzgw.zzb(!zzgvVar.zze);
                    zzetVar.zzg();
                }
                zzgw.zzb(zzgvVar.zzc);
                if (iZzj != 3) {
                    zzetVar.zzg();
                }
                zzetVar.zzh(zzgvVar.zzf);
                if (iZzj != 2 && iZzj != 0 && !zZzi2) {
                    zzetVar.zzh(3);
                }
                if (iZzj == 3 || iZzj == 0 || zzetVar.zzj(8) != 0) {
                    z = true;
                }
            } else {
                z = true;
            }
        }
        this.zza = z;
    }

    public static zzgs zzb(zzgv zzgvVar, zzgu zzguVar) {
        try {
            return new zzgs(zzgvVar, zzguVar);
        } catch (zzgt unused) {
            return null;
        }
    }

    public final boolean zza() {
        return this.zza;
    }
}
