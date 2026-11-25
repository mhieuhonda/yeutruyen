package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzccv extends zzbem implements zzccw {
    public zzccv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zze();
        } else if (i == 2) {
            int i3 = parcel.readInt();
            zzben.zzh(parcel);
            zzf(i3);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.zzh(parcel);
            zzg(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
