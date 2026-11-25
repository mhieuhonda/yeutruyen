package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbz extends zzbel implements zzcb {
    zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(zzfp zzfpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzfpVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(zzfp zzfpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzfpVar);
        zzda(2, parcelZza);
    }
}
