package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcnt implements zzimz {
    private final zzini zza;

    private zzcnt(zzcns zzcnsVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcnt zzc(zzcns zzcnsVar, zzini zziniVar) {
        return new zzcnt(zzcnsVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.zzg zzb() {
        return ((zzcfk) this.zza.zzb()).zzp();
    }
}
