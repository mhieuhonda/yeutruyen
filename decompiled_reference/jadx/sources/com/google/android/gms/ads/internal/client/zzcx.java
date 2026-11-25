package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbsc;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcx extends zzbem implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdk zzdiVar;
        switch (i) {
            case 1:
                zze();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                zzben.zzh(parcel);
                zzf(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzben.zzh(parcel);
                zzg(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzh(zZza);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzi(iObjectWrapperAsInterface, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzj(string3, iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzk);
                return true;
            case 8:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                int i3 = zzben.zza;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            case 9:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzben.zzh(parcel);
                zzn(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbvj zzbvjVarZzf = zzbvi.zzf(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzo(zzbvjVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbsd zzbsdVarZzc = zzbsc.zzc(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzp(zzbsdVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzq);
                return true;
            case 14:
                zzfr zzfrVar = (zzfr) zzben.zzb(parcel, zzfr.CREATOR);
                zzben.zzh(parcel);
                zzr(zzfrVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzs();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdiVar = iInterfaceQueryLocalInterface instanceof zzdk ? (zzdk) iInterfaceQueryLocalInterface : new zzdi(strongBinder);
                }
                zzben.zzh(parcel);
                zzt(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZza2 = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzu(zZza2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzben.zzh(parcel);
                zzv(string5);
                parcel2.writeNoException();
                return true;
            case 19:
                zzw();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
