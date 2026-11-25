package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdog implements zzimz {
    private final zzdof zza;

    private zzdog(zzdof zzdofVar) {
        this.zza = zzdofVar;
    }

    public static zzdog zzc(zzdof zzdofVar) {
        return new zzdog(zzdofVar);
    }

    public final com.google.android.gms.ads.internal.client.zzbh zza() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return this.zza.zzb();
    }
}
