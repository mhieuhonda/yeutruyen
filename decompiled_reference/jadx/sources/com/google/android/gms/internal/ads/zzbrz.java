package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbrz extends zzbem implements zzbsa {
    public zzbrz() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbsa zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof zzbsa ? (zzbsa) iInterfaceQueryLocalInterface : new zzbry(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zze();
        } else {
            if (i != 3) {
                return false;
            }
            String string = parcel.readString();
            zzben.zzh(parcel);
            zzf(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
