package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbxj extends zzbel implements zzbxl {
    zzbxj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzf(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
