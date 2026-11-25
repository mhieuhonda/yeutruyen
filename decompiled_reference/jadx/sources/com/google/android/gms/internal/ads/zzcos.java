package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcos implements zzimz {
    private final zzini zza;

    private zzcos(zzcns zzcnsVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcos zzc(zzcns zzcnsVar, zzini zziniVar) {
        return new zzcos(zzcnsVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcfp zzb() {
        return ((zzcfk) this.zza.zzb()).zzs();
    }
}
