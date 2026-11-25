package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsl implements zzimz {
    private final zzini zza;

    private zzdsl(zzdsf zzdsfVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdsl zza(zzdsf zzdsfVar, zzini zziniVar) {
        return new zzdsl(zzdsfVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzgxd.zzi(new zzdky((zzdsd) this.zza.zzb(), zzcfy.zzh));
    }
}
