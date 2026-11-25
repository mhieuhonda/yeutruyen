package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzceu extends zzbel implements zzcew {
    zzceu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcew
    public final zzcet zze(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) throws RemoteException {
        zzcet zzcerVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcerVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcerVar = iInterfaceQueryLocalInterface instanceof zzcet ? (zzcet) iInterfaceQueryLocalInterface : new zzcer(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcerVar;
    }
}
