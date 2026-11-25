package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnl {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcnl(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcnl zza(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        if (zzrVar.zzd) {
            return new zzcnl(3, 0, 0);
        }
        if (zzrVar.zzi) {
            return new zzcnl(2, 0, 0);
        }
        return zzrVar.zzh ? new zzcnl(0, 0, 0) : new zzcnl(1, zzrVar.zzf, zzrVar.zzc);
    }

    public static zzcnl zzb() {
        return new zzcnl(0, 0, 0);
    }

    public static zzcnl zzc(int i, int i2) {
        return new zzcnl(1, i, i2);
    }

    public static zzcnl zzd() {
        return new zzcnl(4, 0, 0);
    }

    public static zzcnl zze() {
        return new zzcnl(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
