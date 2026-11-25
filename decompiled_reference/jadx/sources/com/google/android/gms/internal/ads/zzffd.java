package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffd implements zzimz {
    private final zzfex zza;

    private zzffd(zzfex zzfexVar) {
        this.zza = zzfexVar;
    }

    public static zzffd zzc(zzfex zzfexVar) {
        return new zzffd(zzfexVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Integer zzb() {
        return Integer.valueOf(this.zza.zzi());
    }
}
