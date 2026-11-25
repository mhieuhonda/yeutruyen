package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcrd implements zzimz {
    private final zzini zza;

    private zzcrd(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcrd zza(zzini zziniVar) {
        return new zzcrd(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new com.google.android.gms.ads.internal.util.zzbl(((zzcnz) this.zza).zza());
    }
}
