package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdv extends zzbel implements zzdx {
    zzdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final List zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzv.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final zzv zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        zzv zzvVar = (zzv) zzben.zzb(parcelZzcZ, zzv.CREATOR);
        parcelZzcZ.recycle();
        return zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final Bundle zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdx
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }
}
