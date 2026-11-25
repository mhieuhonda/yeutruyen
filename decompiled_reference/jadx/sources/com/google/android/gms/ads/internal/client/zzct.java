package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzct extends zzbel implements zzcv {
    zzct(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzbvj getAdapterCreator() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbvj zzbvjVarZzf = zzbvi.zzf(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbvjVarZzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final zzez getLiteSdkVersion() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(1, zza());
        zzez zzezVar = (zzez) zzben.zzb(parcelZzcZ, zzez.CREATOR);
        parcelZzcZ.recycle();
        return zzezVar;
    }
}
