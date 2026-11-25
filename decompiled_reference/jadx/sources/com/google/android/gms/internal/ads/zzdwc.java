package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdwc implements zzimz {
    private final zzini zza;

    private zzdwc(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzdwc zza(zzini zziniVar) {
        return new zzdwc(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbic.zza.EnumC0012zza enumC0012zza = ((zzdcq) this.zza).zza().zzp.zza == 3 ? zzbic.zza.EnumC0012zza.REWARDED_INTERSTITIAL : zzbic.zza.EnumC0012zza.REWARD_BASED_VIDEO_AD;
        zzinh.zzb(enumC0012zza);
        return enumC0012zza;
    }
}
