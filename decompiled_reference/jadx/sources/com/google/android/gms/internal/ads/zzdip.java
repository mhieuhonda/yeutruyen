package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdip implements zzimz {
    private final zzini zza;

    private zzdip(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdip zza(zzini zziniVar) {
        return new zzdip(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdio(((zzinl) this.zza).zzb());
    }
}
