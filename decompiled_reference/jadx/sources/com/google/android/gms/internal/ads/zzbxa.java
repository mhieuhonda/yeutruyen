package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbxa extends zzbel implements zzbxc {
    zzbxa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zze(zzbvy zzbvyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbvyVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxc
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
