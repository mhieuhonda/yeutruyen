package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdi extends zzccv {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcdj zzb;

    public zzcdi(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcdj zzcdjVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() {
        zzcdj zzcdjVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzcdjVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzcdjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
