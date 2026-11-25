package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzalm implements zzali {
    private final zzeu zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private int zze;

    public zzalm(zzga zzgaVar) {
        zzeu zzeuVar = zzgaVar.zza;
        this.zza = zzeuVar;
        zzeuVar.zzh(12);
        this.zzc = zzeuVar.zzH() & 255;
        this.zzb = zzeuVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzali
    public final int zzc() {
        int i = this.zzc;
        if (i == 8) {
            return this.zza.zzs();
        }
        if (i == 16) {
            return this.zza.zzt();
        }
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        if (i2 % 2 != 0) {
            return this.zze & 15;
        }
        int iZzs = this.zza.zzs();
        this.zze = iZzs;
        return (iZzs & 240) >> 4;
    }
}
