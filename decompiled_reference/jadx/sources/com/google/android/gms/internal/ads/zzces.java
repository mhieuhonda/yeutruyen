package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzces extends zzbem implements zzcet {
    public zzces() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzcet zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzcet ? (zzcet) iInterfaceQueryLocalInterface : new zzcer(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzceq zzceoVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcex zzcexVar = (zzcex) zzben.zzb(parcel, zzcex.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzceoVar = iInterfaceQueryLocalInterface instanceof zzceq ? (zzceq) iInterfaceQueryLocalInterface : new zzceo(strongBinder);
                }
                zzben.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzcexVar, zzceoVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzf(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzg(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbzxVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb2 = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzh(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbzxVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcaa zzcaaVar = (zzcaa) zzben.zzb(parcel, zzcaa.CREATOR);
                zzben.zzh(parcel);
                zzi(zzcaaVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzj(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb3 = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzk(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbzxVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbzx zzbzxVarZzb4 = zzbzw.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzl(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbzxVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                IObjectWrapper iObjectWrapperZzm = zzm(iObjectWrapperAsInterface8, iObjectWrapperAsInterface9, string, iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                zzben.zze(parcel2, iObjectWrapperZzm);
                return true;
            default:
                return false;
        }
    }
}
