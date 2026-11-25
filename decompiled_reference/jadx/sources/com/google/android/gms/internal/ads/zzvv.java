package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvv {
    private static final zzvv zza = new zzvv(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false);
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final zzfi zze;
    private boolean zzf;
    private long zzg;

    private zzvv(long j, long j2, long j3, long j4, boolean z) {
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = new zzfi(10);
        this.zzg = -9223372036854775807L;
    }

    /* synthetic */ zzvv(long j, long j2, long j3, long j4, boolean z, byte[] bArr) {
        this(j, j2, j3, j4, false);
    }

    final /* synthetic */ long zzb() {
        return this.zzb;
    }

    final /* synthetic */ long zzc() {
        return this.zzc;
    }

    final /* synthetic */ long zzd() {
        return this.zzd;
    }

    final /* synthetic */ zzfi zze() {
        return this.zze;
    }

    final /* synthetic */ boolean zzf() {
        return this.zzf;
    }

    final /* synthetic */ void zzg(boolean z) {
        this.zzf = z;
    }

    final /* synthetic */ long zzh() {
        return this.zzg;
    }

    final /* synthetic */ void zzi(long j) {
        this.zzg = j;
    }
}
