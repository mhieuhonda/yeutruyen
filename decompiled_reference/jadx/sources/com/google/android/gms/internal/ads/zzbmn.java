package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbmn extends zzbel implements zzbmp {
    zzbmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzdE(zzbmi zzbmiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbmiVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zze() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbmp
    public final void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        zzda(5, parcelZza);
    }
}
