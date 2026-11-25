package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpb implements zzimz {
    private final zzini zza;

    private zzdpb(zzdox zzdoxVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdpb zzc(zzdox zzdoxVar, zzini zziniVar) {
        return new zzdpb(zzdoxVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdqj zzb() {
        zzdov zzdovVar = (zzdov) this.zza.zzb();
        zzinh.zzb(zzdovVar);
        return zzdovVar;
    }
}
