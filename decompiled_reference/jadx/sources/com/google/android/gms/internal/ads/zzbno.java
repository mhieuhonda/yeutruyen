package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbno extends zzbem implements zzbnp {
    public zzbno() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static zzbnp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof zzbnp ? (zzbnp) iInterfaceQueryLocalInterface : new zzbnn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbnc zzbnaVar;
        if (i != 1) {
            return false;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbnaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbnaVar = iInterfaceQueryLocalInterface instanceof zzbnc ? (zzbnc) iInterfaceQueryLocalInterface : new zzbna(strongBinder);
        }
        zzben.zzh(parcel);
        zze(zzbnaVar);
        parcel2.writeNoException();
        return true;
    }
}
