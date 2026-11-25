package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbk implements zzimz {
    private final zzini zza;

    private zzdbk(zzdbi zzdbiVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdbk zza(zzdbi zzdbiVar, zzini zziniVar) {
        return new zzdbk(zzdbiVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdal) this.zza.zzb(), zzcfy.zzh);
    }
}
