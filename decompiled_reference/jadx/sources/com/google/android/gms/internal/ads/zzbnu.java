package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbnu extends zzbel implements zzbnw {
    zzbnu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zze(zzboc zzbocVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbocVar);
        zzda(1, parcelZza);
    }
}
