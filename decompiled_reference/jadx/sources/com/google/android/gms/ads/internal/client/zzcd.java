package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcd extends zzbem implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdx zzdvVar;
        if (i == 1) {
            String string = parcel.readString();
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzdvVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
                zzdvVar = iInterfaceQueryLocalInterface instanceof zzdx ? (zzdx) iInterfaceQueryLocalInterface : new zzdv(strongBinder);
            }
            zzben.zzh(parcel);
            zze(string, zzdvVar);
        } else if (i == 2) {
            String string2 = parcel.readString();
            zzben.zzh(parcel);
            zzf(string2);
        } else {
            if (i != 3) {
                return false;
            }
            String string3 = parcel.readString();
            zze zzeVar = (zze) zzben.zzb(parcel, zze.CREATOR);
            zzben.zzh(parcel);
            zzg(string3, zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
