package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcep extends zzbem implements zzceq {
    public zzcep() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzben.zzh(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            zzben.zzh(parcel);
            zzb(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
            zzben.zzh(parcel);
            zzc(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
