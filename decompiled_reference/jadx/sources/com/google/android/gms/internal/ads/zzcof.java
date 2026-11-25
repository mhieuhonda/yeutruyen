package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcof implements zzimz {
    private final zzini zza;

    private zzcof(zzcns zzcnsVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcof zzc(zzcns zzcnsVar, zzini zziniVar) {
        return new zzcof(zzcnsVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        return zzfmc.zza(((zzcnz) this.zza).zza()).zze();
    }
}
