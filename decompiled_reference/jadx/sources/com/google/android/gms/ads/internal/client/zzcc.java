package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcc extends zzbel implements zzce {
    zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(String str, zzdx zzdxVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, zzdxVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzg(String str, zze zzeVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zzc(parcelZza, zzeVar);
        zzda(3, parcelZza);
    }
}
