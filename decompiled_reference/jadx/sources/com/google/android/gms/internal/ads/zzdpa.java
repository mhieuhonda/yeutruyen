package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpa implements zzimz {
    private final zzini zza;

    private zzdpa(zzdox zzdoxVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdpa zzc(zzdox zzdoxVar, zzini zziniVar) {
        return new zzdpa(zzdoxVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdqg zzb() {
        zzdqf zzdqfVar = (zzdqf) this.zza.zzb();
        zzinh.zzb(zzdqfVar);
        return zzdqfVar;
    }
}
