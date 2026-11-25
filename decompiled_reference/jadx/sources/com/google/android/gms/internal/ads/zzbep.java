package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbep extends zzbem implements zzbeq {
    public static zzbeq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof zzbeq ? (zzbeq) iInterfaceQueryLocalInterface : new zzbeo(iBinder);
    }
}
