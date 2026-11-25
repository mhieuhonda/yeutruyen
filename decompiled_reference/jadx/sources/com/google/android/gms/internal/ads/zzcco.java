package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcco extends zzbem implements zzccp {
    public zzcco() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzccp zzt(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof zzccp ? (zzccp) iInterfaceQueryLocalInterface : new zzccn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzccw zzccuVar = null;
        zzccw zzccuVar2 = null;
        zzccx zzccxVar = null;
        zzccs zzccqVar = null;
        switch (i) {
            case 1:
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccuVar = iInterfaceQueryLocalInterface instanceof zzccw ? (zzccw) iInterfaceQueryLocalInterface : new zzccu(strongBinder);
                }
                zzben.zzh(parcel);
                zzc(zzmVar, zzccuVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zzccqVar = iInterfaceQueryLocalInterface2 instanceof zzccs ? (zzccs) iInterfaceQueryLocalInterface2 : new zzccq(strongBinder2);
                }
                zzben.zzh(parcel);
                zze(zzccqVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzi = zzi();
                parcel2.writeNoException();
                int i3 = zzben.zza;
                parcel2.writeInt(zZzi ? 1 : 0);
                return true;
            case 4:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzb(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    zzccxVar = iInterfaceQueryLocalInterface3 instanceof zzccx ? (zzccx) iInterfaceQueryLocalInterface3 : new zzccx(strongBinder3);
                }
                zzben.zzh(parcel);
                zzs(zzccxVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzcdd zzcddVar = (zzcdd) zzben.zzb(parcel, zzcdd.CREATOR);
                zzben.zzh(parcel);
                zzh(zzcddVar);
                parcel2.writeNoException();
                return true;
            case 8:
                com.google.android.gms.ads.internal.client.zzdn zzdnVarZzb = com.google.android.gms.ads.internal.client.zzdm.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzf(zzdnVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzg);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzk(iObjectWrapperAsInterface2, zZza);
                parcel2.writeNoException();
                return true;
            case 11:
                zzccm zzccmVarZzl = zzl();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzccmVarZzl);
                return true;
            case 12:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarZzm = zzm();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzdxVarZzm);
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzo(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    zzccuVar2 = iInterfaceQueryLocalInterface4 instanceof zzccw ? (zzccw) iInterfaceQueryLocalInterface4 : new zzccu(strongBinder4);
                }
                zzben.zzh(parcel);
                zzd(zzmVar2, zzccuVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean zZza2 = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzp(zZza2);
                parcel2.writeNoException();
                return true;
            case 16:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 17:
                long jZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeLong(jZzq);
                return true;
            case 18:
                long j = parcel.readLong();
                zzben.zzh(parcel);
                zzr(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
