package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcer extends zzbel implements zzcet {
    zzcer(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zze(IObjectWrapper iObjectWrapper, zzcex zzcexVar, zzceq zzceqVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zzc(parcelZza, zzcexVar);
        zzben.zze(parcelZza, zzceqVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzi(zzcaa zzcaaVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbzx zzbzxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzcet
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzben.zze(parcelZza, iObjectWrapper3);
        Parcel parcelZzcZ = zzcZ(11, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }
}
