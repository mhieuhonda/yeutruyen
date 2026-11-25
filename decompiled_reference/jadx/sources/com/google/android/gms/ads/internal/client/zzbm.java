package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbm extends zzbem implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzm zzmVar = (zzm) zzben.zzb(parcel, zzm.CREATOR);
            zzben.zzh(parcel);
            zze(zzmVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else if (i == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            int i3 = zzben.zza;
            parcel2.writeInt(zZzg ? 1 : 0);
        } else if (i == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
        } else {
            if (i != 5) {
                return false;
            }
            zzm zzmVar2 = (zzm) zzben.zzb(parcel, zzm.CREATOR);
            int i4 = parcel.readInt();
            zzben.zzh(parcel);
            zzi(zzmVar2, i4);
            parcel2.writeNoException();
        }
        return true;
    }
}
