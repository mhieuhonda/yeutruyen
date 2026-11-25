package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbsp extends zzbel implements zzbsr {
    zzbsp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zze(zzbsl zzbslVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbslVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzf(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsr
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
