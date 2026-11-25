package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdr extends zzbel implements zzdt {
    zzdr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, iObjectWrapper2);
        zzda(1, parcelZza);
    }
}
