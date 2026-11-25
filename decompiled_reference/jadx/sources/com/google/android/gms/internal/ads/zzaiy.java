package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzaiy {
    private long zza = -9223372036854775807L;
    private long zzb = -9223372036854775807L;
    private boolean zzc;
    private zzx zzd;

    public final zzaiy zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzaiy zzb(long j) {
        this.zzb = j;
        return this;
    }

    public final zzaiy zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzaiy zzd(zzx zzxVar) {
        this.zzd = zzxVar;
        return this;
    }

    public final zzaiz zze() {
        return new zzaja(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
