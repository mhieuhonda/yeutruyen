package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdu extends zzbel implements IInterface {
    zzdu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final zzdt zze(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdrVar;
    }
}
