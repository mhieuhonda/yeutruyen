package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbrb extends zzbel implements zzbrd {
    zzbrb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbra zze(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i, zzbqx zzbqxVar) throws RemoteException {
        zzbra zzbqyVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        zzben.zze(parcelZza, zzbqxVar);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbqyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqyVar = iInterfaceQueryLocalInterface instanceof zzbra ? (zzbra) iInterfaceQueryLocalInterface : new zzbqy(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbqyVar;
    }
}
