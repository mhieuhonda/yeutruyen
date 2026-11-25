package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbrn extends zzbem implements zzbro {
    public zzbrn() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzben.zzb(parcel, ParcelFileDescriptor.CREATOR);
        zzben.zzh(parcel);
        zzb(parcelFileDescriptor);
        return true;
    }
}
