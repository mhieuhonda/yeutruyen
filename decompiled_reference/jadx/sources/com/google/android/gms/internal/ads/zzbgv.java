package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgv extends zzbel implements zzbgx {
    zzbgv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzc() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzd() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzf() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzg() throws RemoteException {
        zzda(5, zza());
    }
}
