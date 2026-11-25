package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzafk {
    public static final zzafk zza = new zzafk(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzafk(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzafk zza(long j, long j2) {
        return new zzafk(-1, j, j2);
    }

    public static zzafk zzb(long j, long j2) {
        return new zzafk(-2, j, j2);
    }

    public static zzafk zzc(long j) {
        return new zzafk(0, -9223372036854775807L, j);
    }

    final /* synthetic */ int zzd() {
        return this.zzb;
    }

    final /* synthetic */ long zze() {
        return this.zzc;
    }

    final /* synthetic */ long zzf() {
        return this.zzd;
    }
}
