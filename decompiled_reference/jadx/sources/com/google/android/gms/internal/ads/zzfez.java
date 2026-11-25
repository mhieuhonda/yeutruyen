package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfez implements zzimz {
    private final zzfex zza;

    private zzfez(zzfex zzfexVar) {
        this.zza = zzfexVar;
    }

    public static zzfez zzc(zzfex zzfexVar) {
        return new zzfez(zzfexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzf());
    }
}
