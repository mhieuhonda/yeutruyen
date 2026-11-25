package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmc extends zzbel implements zzbme {
    zzbmc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final String zzb() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbme
    public final List zzc() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzben.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }
}
