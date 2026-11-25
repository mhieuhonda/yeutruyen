package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfzo extends zzbem implements zzfzp {
    public zzfzo() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzben.zzh(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                zzben.zzh(parcel);
                break;
            case 5:
                parcel.createByteArray();
                zzben.zzh(parcel);
                break;
            case 6:
                parcel.readInt();
                zzben.zzh(parcel);
                break;
            case 7:
                parcel.readInt();
                zzben.zzh(parcel);
                break;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzben.zzh(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
