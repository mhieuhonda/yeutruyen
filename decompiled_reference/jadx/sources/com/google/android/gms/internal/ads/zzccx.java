package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccx extends zzbel implements IInterface {
    zzccx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzccm zzccmVar, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzccmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzda(2, parcelZza);
    }
}
