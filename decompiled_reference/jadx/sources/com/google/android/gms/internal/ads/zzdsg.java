package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdsg implements zzimz {
    private final zzini zza;

    private zzdsg(zzdsf zzdsfVar, zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdsg zza(zzdsf zzdsfVar, zzini zziniVar) {
        return new zzdsg(zzdsfVar, zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdsd zzdsdVar = (zzdsd) this.zza.zzb();
        zzinh.zzb(zzdsdVar);
        return zzdsdVar;
    }
}
