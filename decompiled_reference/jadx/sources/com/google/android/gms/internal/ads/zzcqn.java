package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcqn implements zzimz {
    private final zzcqm zza;

    private zzcqn(zzcqm zzcqmVar) {
        this.zza = zzcqmVar;
    }

    public static zzcqn zzc(zzcqm zzcqmVar) {
        return new zzcqn(zzcqmVar);
    }

    public static com.google.android.gms.ads.internal.zza zzd(zzcqm zzcqmVar) {
        return new com.google.android.gms.ads.internal.zza(new zzcir(), new zzchm());
    }

    public final com.google.android.gms.ads.internal.zza zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
