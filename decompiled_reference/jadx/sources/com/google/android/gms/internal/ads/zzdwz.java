package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwz implements zzimz {
    private final zzini zza;

    private zzdwz(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdwz zzc(zzini zziniVar) {
        return new zzdwz(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzdwy zzb() {
        return new zzdwy((zzclb) this.zza.zzb());
    }
}
