package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdmt implements zzimz {
    private final zzini zza;

    private zzdmt(zzdml zzdmlVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdmt zza(zzdml zzdmlVar, zzini zziniVar) {
        return new zzdmt(zzdmlVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdme) this.zza.zzb(), zzcfy.zzf);
    }
}
