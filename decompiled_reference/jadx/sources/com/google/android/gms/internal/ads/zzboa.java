package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzboa extends zzbel implements zzboc {
    zzboa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final boolean zzA() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(24, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzB(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzdgVar);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzC(com.google.android.gms.ads.internal.client.zzdc zzdcVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzdcVar);
        zzda(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzD() throws RemoteException {
        zzda(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzE() throws RemoteException {
        zzda(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbmi zzF() throws RemoteException {
        zzbmi zzbmgVar;
        Parcel parcelZzcZ = zzcZ(29, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbmgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbmgVar = iInterfaceQueryLocalInterface instanceof zzbmi ? (zzbmi) iInterfaceQueryLocalInterface : new zzbmg(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final boolean zzG() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(30, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final com.google.android.gms.ads.internal.client.zzdx zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(31, zza());
        com.google.android.gms.ads.internal.client.zzdx zzdxVarZzb = com.google.android.gms.ads.internal.client.zzdw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzdxVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzI(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzdqVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzJ(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, bundle);
        zzda(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final long zzK() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        long j = parcelZzcZ.readLong();
        parcelZzcZ.recycle();
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzL(long j) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zze() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final List zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzf = zzben.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbml zzh() throws RemoteException {
        zzbml zzbmjVar;
        Parcel parcelZzcZ = zzcZ(5, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbmjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbmjVar = iInterfaceQueryLocalInterface instanceof zzbml ? (zzbml) iInterfaceQueryLocalInterface : new zzbmj(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbmjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(6, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzj() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final double zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        double d = parcelZzcZ.readDouble();
        parcelZzcZ.recycle();
        return d;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(10, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final com.google.android.gms.ads.internal.client.zzea zzn() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final String zzo() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzp() throws RemoteException {
        zzda(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final zzbme zzq() throws RemoteException {
        zzbme zzbmcVar;
        Parcel parcelZzcZ = zzcZ(14, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbmcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbmcVar = iInterfaceQueryLocalInterface instanceof zzbme ? (zzbme) iInterfaceQueryLocalInterface : new zzbmc(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbmcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzr(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, bundle);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final boolean zzs(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzt(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, bundle);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final IObjectWrapper zzu() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(18, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final IObjectWrapper zzv() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(19, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final Bundle zzw() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(20, zza());
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzx(zzbnz zzbnzVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbnzVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final void zzy() throws RemoteException {
        zzda(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzboc
    public final List zzz() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        ArrayList arrayListZzf = zzben.zzf(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzf;
    }
}
