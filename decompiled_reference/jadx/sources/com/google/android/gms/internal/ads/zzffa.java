package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffa implements zzimz {
    private final zzfex zza;

    private zzffa(zzfex zzfexVar) {
        this.zza = zzfexVar;
    }

    public static zzffa zzc(zzfex zzfexVar) {
        return new zzffa(zzfexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzh());
    }
}
