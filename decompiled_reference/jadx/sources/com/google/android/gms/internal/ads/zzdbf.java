package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdbf implements zzimz {
    private final zzini zza;

    private zzdbf(zzdan zzdanVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdbf zza(zzdan zzdanVar, zzini zziniVar) {
        return new zzdbf(zzdanVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdky((zzdbx) this.zza.zzb(), zzcfy.zzh);
    }
}
