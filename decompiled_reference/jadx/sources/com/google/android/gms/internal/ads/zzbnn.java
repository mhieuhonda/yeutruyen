package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbnn extends zzbel implements zzbnp {
    zzbnn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnp
    public final void zze(zzbnc zzbncVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbncVar);
        zzda(1, parcelZza);
    }
}
