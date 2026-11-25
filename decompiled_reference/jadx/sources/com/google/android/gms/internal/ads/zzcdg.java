package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdg extends zzccl {
    private final String zza;
    private final int zzb;

    public zzcdg(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzccm
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzcdg(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
