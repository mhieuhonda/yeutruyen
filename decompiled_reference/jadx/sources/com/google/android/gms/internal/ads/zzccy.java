package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzccy extends RewardedAd {
    private final AtomicReference zza;
    private final zzccp zzb;
    private final Context zzc;
    private final zzcdh zzd;
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;
    private final long zzh;
    private final AtomicLong zzi;

    public zzccy(Context context, zzccp zzccpVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference();
        this.zzb = zzccpVar;
        this.zzd = new zzcdh();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                return zzccpVar.zzg();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        String strZzn;
        String str;
        AtomicReference atomicReference = this.zza;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzn = this.zzb.zzn();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                strZzn = null;
            }
            AtomicReference atomicReference2 = this.zza;
            if (strZzn == null) {
                atomicReference2.set("");
            } else {
                atomicReference2.set(strZzn);
            }
            str = (String) this.zza.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzi;
        long jZzq = 0;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                zzccp zzccpVar = this.zzb;
                if (zzccpVar != null) {
                    jZzq = zzccpVar.zzq();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
            AtomicLong atomicLong2 = this.zzi;
            atomicLong2.set(jZzq);
            j = atomicLong2.get();
        }
        return j;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzm = null;
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzdxVarZzm = zzccpVar.zzm();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzc(zzdxVarZzm);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            zzccp zzccpVar = this.zzb;
            zzccm zzccmVarZzl = zzccpVar != null ? zzccpVar.zzl() : null;
            return zzccmVarZzl == null ? RewardItem.DEFAULT_REWARD : new zzccz(zzccmVarZzl);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzp(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzf(new com.google.android.gms.ads.internal.client.zzfn(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzo(new com.google.android.gms.ads.internal.client.zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setPlacementId(long j) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zzr(j);
                this.zzi.set(j);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzccp zzccpVar = this.zzb;
                if (zzccpVar != null) {
                    zzccpVar.zzh(new zzcdd(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        zzcdh zzcdhVar = this.zzd;
        zzcdhVar.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzccpVar.zze(zzcdhVar);
                zzccpVar.zzb(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzeh zzehVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzccp zzccpVar = this.zzb;
            if (zzccpVar != null) {
                zzehVar.zzp(this.zzh);
                zzccpVar.zzc(com.google.android.gms.ads.internal.client.zzq.zza.zza(this.zzc, zzehVar), new zzcdc(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzccy(Context context, String str) {
        this(context, str, com.google.android.gms.ads.internal.client.zzay.zzb().zzf(context, str, new zzbvf()));
    }

    public zzccy(Context context, String str, zzccp zzccpVar) {
        this.zzh = System.currentTimeMillis();
        this.zzi = new AtomicLong();
        this.zzc = context.getApplicationContext();
        this.zza = new AtomicReference(str);
        this.zzb = zzccpVar;
        this.zzd = new zzcdh();
    }
}
