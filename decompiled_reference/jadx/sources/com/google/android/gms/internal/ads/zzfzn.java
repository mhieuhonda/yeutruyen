package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfzn extends zzbel implements zzfzp {
    zzfzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zze() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzf(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzg(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzh(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzi(int i) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zzj(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzda(8, parcelZza);
    }
}
