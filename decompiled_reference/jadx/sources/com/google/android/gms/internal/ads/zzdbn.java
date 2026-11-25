package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbn implements zzimz {
    private final zzini zza;

    private zzdbn(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
    }

    public static zzdbn zza(zzini zziniVar, zzini zziniVar2) {
        return new zzdbn(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzcts) this.zza.zzb(), zzfoi.zzc());
    }
}
