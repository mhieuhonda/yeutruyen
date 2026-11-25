package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbns extends zzbem implements zzbnt {
    public zzbns() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbnt zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbnt ? (zzbnt) iInterfaceQueryLocalInterface : new zzbnr(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzbu zzbuVarZzZ = com.google.android.gms.ads.internal.client.zzbt.zzZ(parcel.readStrongBinder());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        zzben.zzh(parcel);
        zze(zzbuVarZzZ, iObjectWrapperAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
