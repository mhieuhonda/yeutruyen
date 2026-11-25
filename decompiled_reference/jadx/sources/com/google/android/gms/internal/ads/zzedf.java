package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedf implements zzimz {
    private final zzini zza;

    private zzedf(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzedf zza(zzini zziniVar) {
        return new zzedf(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeec(((zzcnz) this.zza).zza());
    }
}
