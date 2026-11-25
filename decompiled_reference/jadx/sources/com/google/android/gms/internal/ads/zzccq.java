package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccq extends zzbel implements zzccs {
    zzccq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzf() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzg(zzccm zzccmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzccmVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzh(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzeVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzj() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzccs
    public final void zzk() throws RemoteException {
        zzda(7, zza());
    }
}
