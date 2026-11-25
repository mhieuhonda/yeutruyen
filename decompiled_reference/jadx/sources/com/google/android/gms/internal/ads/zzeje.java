package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeje implements zzimz {
    private final zzini zza;

    private zzeje(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzeje zzc(zzini zziniVar) {
        return new zzeje(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzejd zzb() {
        return new zzejd(((zzcnz) this.zza).zza());
    }
}
