package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzccn extends zzbel implements zzccp {
    zzccn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, zzccwVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, zzccwVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze(zzccs zzccsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzccsVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzdnVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final Bundle zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzh(zzcdd zzcddVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzcddVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final boolean zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final zzccm zzl() throws RemoteException {
        zzccm zzcckVar;
        Parcel parcelZzcZ = zzcZ(11, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcckVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzcckVar = iInterfaceQueryLocalInterface instanceof zzccm ? (zzccm) iInterfaceQueryLocalInterface : new zzcck(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcckVar;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final com.google.android.gms.ads.internal.client.zzdx zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzb = com.google.android.gms.ads.internal.client.zzdw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(16, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzdqVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzp(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzben.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final long zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(17, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzr(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzs(zzccx zzccxVar) throws RemoteException {
        throw null;
    }
}
