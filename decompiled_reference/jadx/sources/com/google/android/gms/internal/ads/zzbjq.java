package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbjq extends zzbel implements zzbjs {
    zzbjq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbjs
    public final void zze(zzbjp zzbjpVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbjpVar);
        zzda(1, parcelZza);
    }
}
