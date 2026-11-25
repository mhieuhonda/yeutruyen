package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbc extends zzbel implements IInterface {
    zzcbc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(String str, zzcat zzcatVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zzc(parcelZza, zzcatVar);
        zzda(1, parcelZza);
    }

    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbaVar);
        zzda(2, parcelZza);
    }
}
