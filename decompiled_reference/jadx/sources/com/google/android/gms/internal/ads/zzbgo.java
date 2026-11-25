package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgo extends zzbel implements zzbgq {
    zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzf(IObjectWrapper iObjectWrapper, zzbgx zzbgxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbgxVar);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzb = com.google.android.gms.ads.internal.client.zzdw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzben.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzdqVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final long zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(10, parcelZza);
    }
}
