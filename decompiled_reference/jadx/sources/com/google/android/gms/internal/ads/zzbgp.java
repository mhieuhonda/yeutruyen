package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbgp extends zzbem implements zzbgq {
    public zzbgp() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public static zzbgq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        return iInterfaceQueryLocalInterface instanceof zzbgq ? (zzbgq) iInterfaceQueryLocalInterface : new zzbgo(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgx zzbgvVar;
        switch (i) {
            case 2:
                com.google.android.gms.ads.internal.client.zzbu zzbuVarZze = zze();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbuVarZze);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (iInterfaceQueryLocalInterface instanceof zzbgu) {
                    }
                }
                zzben.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbgvVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzbgvVar = iInterfaceQueryLocalInterface2 instanceof zzbgx ? (zzbgx) iInterfaceQueryLocalInterface2 : new zzbgv(strongBinder2);
                }
                zzben.zzh(parcel);
                zzf(iObjectWrapperAsInterface, zzbgvVar);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarZzg = zzg();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzdxVarZzg);
                return true;
            case 6:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzi(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 9:
                long jZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j = parcel.readLong();
                zzben.zzh(parcel);
                zzl(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
