package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgs extends zzbem implements zzbgt {
    public zzbgs() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzbgt zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof zzbgt ? (zzbgt) iInterfaceQueryLocalInterface : new zzbgr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgq zzbgoVar;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbgoVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbgoVar = iInterfaceQueryLocalInterface instanceof zzbgq ? (zzbgq) iInterfaceQueryLocalInterface : new zzbgo(strongBinder);
            }
            zzben.zzh(parcel);
            zzb(zzbgoVar);
        } else if (i == 2) {
            int i3 = parcel.readInt();
            zzben.zzh(parcel);
            zzc(i3);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.zzh(parcel);
            zzd(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
