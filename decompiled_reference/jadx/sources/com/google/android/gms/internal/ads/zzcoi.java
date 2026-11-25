package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcoi implements zzimz {
    private final zzini zza;

    private zzcoi(zzcns zzcnsVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzcoi zza(zzcns zzcnsVar, zzini zziniVar) {
        return new zzcoi(zzcnsVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeof((zzdxk) this.zza.zzb());
    }
}
