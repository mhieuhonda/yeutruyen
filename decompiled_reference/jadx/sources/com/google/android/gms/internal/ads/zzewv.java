package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewv implements zzimz {
    private final zzini zza;

    private zzewv(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzewv zzc(zzini zziniVar) {
        return new zzewv(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzewt zzb() {
        return new zzewt(((zzdcq) this.zza).zza());
    }
}
