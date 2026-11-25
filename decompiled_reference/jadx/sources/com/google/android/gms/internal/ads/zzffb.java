package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffb implements zzimz {
    private final zzfex zza;

    private zzffb(zzfex zzfexVar) {
        this.zza = zzfexVar;
    }

    public static zzffb zzc(zzfex zzfexVar) {
        return new zzffb(zzfexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Boolean zzb() {
        return Boolean.valueOf(this.zza.zzg());
    }
}
