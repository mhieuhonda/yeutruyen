package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxe extends zzbem implements zzbxf {
    public zzbxe() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zze();
        } else if (i == 3) {
            String string = parcel.readString();
            zzben.zzh(parcel);
            zzf(string);
        } else {
            if (i != 4) {
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
