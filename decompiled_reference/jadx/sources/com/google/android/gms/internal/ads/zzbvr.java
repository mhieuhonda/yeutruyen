package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvr extends zzbem implements zzbvs {
    public zzbvr() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbvs zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof zzbvs ? (zzbvs) iInterfaceQueryLocalInterface : new zzbvq(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper iObjectWrapperZze = zze();
            parcel2.writeNoException();
            zzben.zze(parcel2, iObjectWrapperZze);
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            int i3 = zzben.zza;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
