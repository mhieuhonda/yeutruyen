package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcaz extends zzbel implements zzcbb {
    zzcaz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, parcelFileDescriptor);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzbaVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcbb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzcbk zzcbkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, parcelFileDescriptor);
        zzben.zzc(parcelZza, zzcbkVar);
        zzda(3, parcelZza);
    }
}
