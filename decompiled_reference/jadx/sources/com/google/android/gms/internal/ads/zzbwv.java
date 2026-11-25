package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbwv extends zzbem implements zzbww {
    public zzbwv() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zze(iObjectWrapperAsInterface);
        } else if (i == 2) {
            String string = parcel.readString();
            zzben.zzh(parcel);
            zzf(string);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzben.zzh(parcel);
            zzg(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            zzbvs zzbvsVarZzb = zzbvr.zzb(parcel.readStrongBinder());
            zzben.zzh(parcel);
            zzh(zzbvsVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
