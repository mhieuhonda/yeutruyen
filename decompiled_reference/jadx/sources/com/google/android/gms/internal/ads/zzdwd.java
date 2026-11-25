package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwd implements zzimz {
    private final zzini zza;

    private zzdwd(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdwd zza(zzini zziniVar) {
        return new zzdwd(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdcq) this.zza).zza().zzp.zza == 3 ? "rewarded_interstitial" : "rewarded";
    }
}
