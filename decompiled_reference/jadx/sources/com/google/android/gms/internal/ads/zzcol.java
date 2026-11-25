package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcol implements zzimz {
    private final zzini zza;

    private zzcol(zzcns zzcnsVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcol zzc(zzcns zzcnsVar, zzini zziniVar) {
        return new zzcol(zzcnsVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcrx zzb() {
        zzcnq zzcnqVar = (zzcnq) this.zza.zzb();
        zzinh.zzb(zzcnqVar);
        return zzcnqVar;
    }
}
