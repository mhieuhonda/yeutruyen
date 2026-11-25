package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbnk extends zzbel implements zzbnm {
    zzbnk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zze(zzbnc zzbncVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbncVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
