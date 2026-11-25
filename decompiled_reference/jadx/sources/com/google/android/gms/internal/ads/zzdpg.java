package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdpg implements zzimz {
    private final zzini zza;

    private zzdpg(zzdox zzdoxVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdpg zza(zzdox zzdoxVar, zzini zziniVar) {
        return new zzdpg(zzdoxVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdsb) this.zza.zzb(), zzcfy.zza);
    }
}
