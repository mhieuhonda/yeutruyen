package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcqd implements zzehy {
    private final zzege zza;
    private final zzcpe zzb;

    zzcqd(zzcpe zzcpeVar, zzcqb zzcqbVar, zzege zzegeVar) {
        this.zzb = zzcpeVar;
        this.zza = zzegeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehy
    public final zzegf zza() {
        zzcpe zzcpeVar = this.zzb;
        return zzegg.zza(zzcnz.zzd(zzcpeVar.zzI()), zzcop.zzd(zzcpeVar.zzI()), this.zza, zzcao.zza());
    }
}
