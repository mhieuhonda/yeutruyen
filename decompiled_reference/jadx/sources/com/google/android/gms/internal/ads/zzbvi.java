package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvi extends zzbem implements zzbvj {
    public zzbvi() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbvj zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof zzbvj ? (zzbvj) iInterfaceQueryLocalInterface : new zzbvh(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            zzben.zzh(parcel);
            zzbvm zzbvmVarZzb = zzb(string);
            parcel2.writeNoException();
            zzben.zze(parcel2, zzbvmVarZzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzben.zzh(parcel);
            boolean zZzc = zzc(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzc ? 1 : 0);
        } else if (i == 3) {
            String string3 = parcel.readString();
            zzben.zzh(parcel);
            zzbxi zzbxiVarZze = zze(string3);
            parcel2.writeNoException();
            zzben.zze(parcel2, zzbxiVarZze);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            zzben.zzh(parcel);
            boolean zZzd = zzd(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zZzd ? 1 : 0);
        }
        return true;
    }
}
