package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbwu extends zzbel implements zzbww {
    zzbwu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzh(zzbvs zzbvsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbvsVar);
        zzda(4, parcelZza);
    }
}
