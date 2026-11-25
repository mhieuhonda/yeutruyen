package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbvk extends zzbel implements zzbvm {
    zzbvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzA(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzben.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final com.google.android.gms.ads.internal.client.zzea zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvy zzC() throws RemoteException {
        zzbvy zzbvwVar;
        Parcel parcelZzcZ = zzcZ(27, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbvwVar = iInterfaceQueryLocalInterface instanceof zzbvy ? (zzbvy) iInterfaceQueryLocalInterface : new zzbvw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzF(IObjectWrapper iObjectWrapper, zzbsa zzbsaVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbsaVar);
        parcelZza.writeTypedList(list);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbxx zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(33, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbxx zzI() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzrVar);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvs zzK() throws RemoteException {
        zzbvs zzbvqVar;
        Parcel parcelZzcZ = zzcZ(36, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbvqVar = iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvq(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvu zzO() throws RemoteException {
        zzbvu zzbvuVar;
        Parcel parcelZzcZ = zzcZ(15, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbvuVar = iInterfaceQueryLocalInterface instanceof zzbvu ? (zzbvu) iInterfaceQueryLocalInterface : new zzbvu(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvv zzP() throws RemoteException {
        zzbvv zzbvvVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbvvVar = iInterfaceQueryLocalInterface instanceof zzbvv ? (zzbvv) iInterfaceQueryLocalInterface : new zzbvv(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final IObjectWrapper zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbvp zzbvpVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzrVar);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzm() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzcch zzcchVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(null);
        zzben.zze(parcelZza, zzcchVar);
        parcelZza.writeString(str2);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzp() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbvp zzbvpVar, zzbma zzbmaVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, zzbmaVar);
        parcelZza.writeStringList(list);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final boolean zzx() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzy(IObjectWrapper iObjectWrapper, zzcch zzcchVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzcchVar);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbnc zzz() throws RemoteException {
        throw null;
    }
}
