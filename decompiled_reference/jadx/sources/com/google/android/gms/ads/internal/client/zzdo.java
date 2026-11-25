package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdo extends zzbel implements zzdq {
    zzdo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zze(zzt zztVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zztVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
