package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzakp extends zzafq implements zzaky {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzakp(long j, long j2, int i, int i2, boolean z) {
        this(j, j2, i, i2, false, true);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzf(long j) {
        return zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaky
    public final int zzh() {
        return this.zzb;
    }

    public final zzakp zzi(long j) {
        return new zzakp(j, this.zza, this.zzb, this.zzc, false, false);
    }

    private zzakp(long j, long j2, int i, int i2, boolean z, boolean z2) {
        super(j, j2, i, i2, false, z2);
        this.zza = j2;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j == -1 ? -1L : j;
    }

    public zzakp(long j, long j2, zzagx zzagxVar, boolean z) {
        this(j, j2, zzagxVar.zzf, zzagxVar.zzc, false, true);
    }
}
