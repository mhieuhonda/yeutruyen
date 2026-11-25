package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbls extends zzbel implements IInterface {
    zzbls(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzcal zzcalVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzcalVar);
        zzda(1, parcelZza);
    }
}
