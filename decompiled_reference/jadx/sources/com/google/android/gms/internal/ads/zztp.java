package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztp {
    private final zzcp[] zza;
    private final zzuc zzb;
    private final zzcv zzc;

    public zztp(zzcp... zzcpVarArr) {
        zzuc zzucVar = new zzuc();
        zzcv zzcvVar = new zzcv();
        zzcp[] zzcpVarArr2 = {zzucVar, zzcvVar};
        this.zza = zzcpVarArr2;
        System.arraycopy(zzcpVarArr, 0, zzcpVarArr2, 0, 0);
        this.zzb = zzucVar;
        this.zzc = zzcvVar;
    }

    public final zzcp[] zza() {
        return this.zza;
    }

    public final zzav zzb(zzav zzavVar) {
        zzcv zzcvVar = this.zzc;
        zzcvVar.zzk(zzavVar.zzb);
        zzcvVar.zzl(zzavVar.zzc);
        return zzavVar;
    }

    public final boolean zzc(boolean z) {
        this.zzb.zzq(z);
        return z;
    }

    public final long zzd(long j) {
        zzcv zzcvVar = this.zzc;
        return zzcvVar.zzc() ? zzcvVar.zzm(j) : j;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
