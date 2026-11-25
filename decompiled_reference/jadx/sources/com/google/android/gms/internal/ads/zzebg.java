package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzebg {
    private final zzbqx zza;

    zzebg(zzbqx zzbqxVar) {
        this.zza = zzbqxVar;
    }

    private final void zzs(zzebf zzebfVar) throws RemoteException {
        String strZza = zzebfVar.zza();
        String strConcat = "Dispatching AFMA event on publisher webview: ".concat(strZza);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strConcat);
        this.zza.zzb(strZza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzebf("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("creation", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("nativeObjectCreated");
        zzs(zzebfVar);
    }

    public final void zzc(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("creation", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("nativeObjectNotCreated");
        zzs(zzebfVar);
    }

    public final void zzd(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebfVar);
    }

    public final void zze(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onAdLoaded");
        zzs(zzebfVar);
    }

    public final void zzf(long j, int i) throws RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onAdFailedToLoad");
        zzebfVar.zzd(Integer.valueOf(i));
        zzs(zzebfVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onAdOpened");
        zzs(zzebfVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onAdClicked");
        this.zza.zzb(zzebfVar.zza());
    }

    public final void zzi(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("interstitial", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onAdClosed");
        zzs(zzebfVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzebfVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onRewardedAdLoaded");
        zzs(zzebfVar);
    }

    public final void zzl(long j, int i) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onRewardedAdFailedToLoad");
        zzebfVar.zzd(Integer.valueOf(i));
        zzs(zzebfVar);
    }

    public final void zzm(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onRewardedAdOpened");
        zzs(zzebfVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onRewardedAdFailedToShow");
        zzebfVar.zzd(Integer.valueOf(i));
        zzs(zzebfVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onRewardedAdClosed");
        zzs(zzebfVar);
    }

    public final void zzp(long j, zzccm zzccmVar) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onUserEarnedReward");
        zzebfVar.zze(zzccmVar.zze());
        zzebfVar.zzf(Integer.valueOf(zzccmVar.zzf()));
        zzs(zzebfVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onAdImpression");
        zzs(zzebfVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzebf zzebfVar = new zzebf("rewarded", null);
        zzebfVar.zzb(Long.valueOf(j));
        zzebfVar.zzc("onAdClicked");
        zzs(zzebfVar);
    }
}
