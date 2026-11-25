package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbmo;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzces;
import com.google.android.gms.internal.ads.zzcet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcm extends zzbel implements zzco {
    zzcm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzb(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvj zzbvjVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzc(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvj zzbvjVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbq zzd(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i) throws RemoteException {
        zzbq zzboVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmp zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, iObjectWrapper2);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbmp zzbmpVarZzdG = zzbmo.zzdG(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbmpVarZzdG;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcbz zzf(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzi zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(8, parcelZza);
        zzbzi zzbziVarZzI = zzbzh.zzI(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbziVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch zzh(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) throws RemoteException {
        zzch zzcfVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(18, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcfVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcfVar = iInterfaceQueryLocalInterface instanceof zzch ? (zzch) iInterfaceQueryLocalInterface : new zzcf(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcfVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy zzi(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcy zzcwVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(9, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcwVar = iInterfaceQueryLocalInterface instanceof zzcy ? (zzcy) iInterfaceQueryLocalInterface : new zzcw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzj(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbmu zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzccp zzl(IObjectWrapper iObjectWrapper, String str, zzbvj zzbvjVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(12, parcelZza);
        zzccp zzccpVarZzt = zzcco.zzt(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzccpVarZzt;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbu zzm(IObjectWrapper iObjectWrapper, zzr zzrVar, String str, zzbvj zzbvjVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzrVar);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(13, parcelZza);
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcet zzn(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(14, parcelZza);
        zzcet zzcetVarZzb = zzces.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzcetVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbzb zzo(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        zzbzb zzbzbVarZzb = zzbza.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbzbVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbra zzp(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i, zzbqx zzbqxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        zzben.zze(parcelZza, zzbqxVar);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        zzbra zzbraVarZzb = zzbqz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbraVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt zzq(IObjectWrapper iObjectWrapper, zzbvj zzbvjVar, int i) throws RemoteException {
        zzdt zzdrVar;
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbvjVar);
        parcelZza.writeInt(261710000);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = iInterfaceQueryLocalInterface instanceof zzdt ? (zzdt) iInterfaceQueryLocalInterface : new zzdr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdrVar;
    }
}
