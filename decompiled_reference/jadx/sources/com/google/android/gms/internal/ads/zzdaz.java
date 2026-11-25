package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdaz implements zzimz {
    private final zzini zza;

    private zzdaz(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzdaz zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdaz(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdyy) this.zza.zzb(), zzfoi.zzc());
    }
}
