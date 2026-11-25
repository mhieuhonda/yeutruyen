package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgv {
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    public final boolean zze;
    public final int zzf;
    public final int zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final boolean zzj;
    public final boolean zzk;
    public final byte zzl;
    public final byte zzm;

    /* JADX WARN: Code duplicated, block: B:68:0x011f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    private zzgv(zzgu zzguVar) throws zzgt {
        byte bZzj;
        boolean zZzi = false;
        zzgtr.zza(zzguVar.zza == 1);
        int iRemaining = zzguVar.zzb.remaining();
        byte[] bArr = new byte[iRemaining];
        zzguVar.zzb.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, iRemaining);
        this.zzg = zzetVar.zzj(3);
        zzetVar.zzg();
        boolean zZzi2 = zzetVar.zzi();
        this.zza = zZzi2;
        if (zZzi2) {
            zzetVar.zzj(5);
            this.zzb = false;
            this.zzh = false;
        } else {
            if (zzetVar.zzi()) {
                zzetVar.zzh(64);
                if (zzetVar.zzi()) {
                    int i = 0;
                    while (!zzetVar.zzi()) {
                        i++;
                    }
                    if (i < 32) {
                        zzetVar.zzh(i);
                    }
                }
                boolean zZzi3 = zzetVar.zzi();
                this.zzb = zZzi3;
                if (zZzi3) {
                    zzetVar.zzh(47);
                }
            } else {
                this.zzb = false;
            }
            this.zzh = zzetVar.zzi();
            int iZzj = zzetVar.zzj(5);
            for (int i2 = 0; i2 <= iZzj; i2++) {
                zzetVar.zzh(12);
                if (i2 == 0) {
                    if (zzetVar.zzj(5) > 7) {
                        zzetVar.zzi();
                    }
                } else if (zzetVar.zzj(5) > 7) {
                    zzetVar.zzg();
                }
                if (this.zzb) {
                    zzetVar.zzg();
                }
                if (this.zzh && zzetVar.zzi()) {
                    if (i2 == 0) {
                        zzetVar.zzj(4);
                    } else {
                        zzetVar.zzh(4);
                    }
                }
            }
        }
        int iZzj2 = zzetVar.zzj(4);
        int iZzj3 = zzetVar.zzj(4);
        zzetVar.zzh(iZzj2 + 1);
        zzetVar.zzh(iZzj3 + 1);
        if (this.zza) {
            this.zzc = false;
        } else {
            boolean zZzi4 = zzetVar.zzi();
            this.zzc = zZzi4;
            if (zZzi4) {
                zzetVar.zzh(4);
                zzetVar.zzh(3);
            }
        }
        zzetVar.zzh(3);
        if (this.zza) {
            this.zze = true;
            this.zzd = true;
            this.zzf = 0;
        } else {
            zzetVar.zzh(4);
            boolean zZzi5 = zzetVar.zzi();
            if (zZzi5) {
                zzetVar.zzh(2);
            }
            if (zzetVar.zzi()) {
                this.zzd = true;
            } else {
                boolean zZzi6 = zzetVar.zzi();
                this.zzd = zZzi6;
                if (!zZzi6) {
                    this.zze = true;
                }
                if (zZzi5) {
                    this.zzf = zzetVar.zzj(3) + 1;
                } else {
                    this.zzf = 0;
                }
            }
            if (zzetVar.zzi()) {
                this.zze = true;
            } else {
                this.zze = zzetVar.zzi();
            }
            if (zZzi5) {
                this.zzf = zzetVar.zzj(3) + 1;
            } else {
                this.zzf = 0;
            }
        }
        zzetVar.zzh(3);
        boolean zZzi7 = zzetVar.zzi();
        if (this.zzg == 2 && zZzi7) {
            this.zzi = zzetVar.zzi();
        } else {
            this.zzi = false;
        }
        if (this.zzg != 1) {
            this.zzj = zzetVar.zzi();
        } else {
            this.zzj = false;
        }
        if (zzetVar.zzi()) {
            this.zzl = (byte) zzetVar.zzj(8);
            this.zzm = (byte) zzetVar.zzj(8);
            bZzj = (byte) zzetVar.zzj(8);
        } else {
            this.zzl = (byte) 0;
            this.zzm = (byte) 0;
            bZzj = 0;
        }
        if (this.zzj) {
            zzetVar.zzg();
            this.zzk = false;
        } else if (this.zzl == 1 && this.zzm == 13 && bZzj == 0) {
            this.zzk = false;
        } else {
            zzetVar.zzg();
            int i3 = this.zzg;
            if (i3 == 0) {
                this.zzk = true;
                zZzi = true;
            } else if (i3 == 1) {
                this.zzk = false;
            } else if (this.zzi) {
                boolean zZzi8 = zzetVar.zzi();
                this.zzk = zZzi8;
                if (zZzi8) {
                    zZzi = zzetVar.zzi();
                }
            } else {
                this.zzk = true;
            }
            if (this.zzk && zZzi) {
                zzetVar.zzj(2);
            }
        }
        zzetVar.zzg();
    }

    public static zzgv zza(zzgu zzguVar) {
        try {
            return new zzgv(zzguVar);
        } catch (zzgt unused) {
            return null;
        }
    }
}
