package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccp;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcf extends zzbel implements zzch {
    zzcf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zze(List list, zzcb zzcbVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        zzben.zze(parcelZza, zzcbVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzccp zzg(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        zzccp zzccpVarZzt = zzcco.zzt(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzccpVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzh(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgq zzi(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbgq zzbgqVarZzb = zzbgp.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbgqVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzk(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(7, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzl(zzbvj zzbvjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbvjVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzm(String str, zzfp zzfpVar, zzce zzceVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zzc(parcelZza, zzfpVar);
        zzben.zze(parcelZza, zzceVar);
        Parcel parcelZzcZ = zzcZ(9, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzn(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbu zzo(String str) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(11, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzbgq zzp(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(12, parcelZza);
        zzbgq zzbgqVarZzb = zzbgp.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbgqVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzccp zzq(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(13, parcelZza);
        zzccp zzccpVarZzt = zzcco.zzt(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzccpVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final zzfp zzr(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(14, parcelZza);
        zzfp zzfpVar = (zzfp) zzben.zzb(parcelZzcZ, zzfp.CREATOR);
        parcelZzcZ.recycle();
        return zzfpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final Bundle zzs(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        Bundle bundle = (Bundle) zzben.zzb(parcelZzcZ, Bundle.CREATOR);
        parcelZzcZ.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final int zzt(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        int i2 = parcelZzcZ.readInt();
        parcelZzcZ.recycle();
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final boolean zzu(int i, String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzch
    public final void zzv(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(18, parcelZza);
    }
}
