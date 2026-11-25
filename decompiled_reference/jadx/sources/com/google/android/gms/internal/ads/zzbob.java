package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbob extends zzbem implements zzboc {
    public zzbob() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbnz zzbnxVar;
        switch (i) {
            case 2:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 3:
                List listZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeList(listZzf);
                return true;
            case 4:
                String strZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(strZzg);
                return true;
            case 5:
                zzbml zzbmlVarZzh = zzh();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmlVarZzh);
                return true;
            case 6:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzk);
                return true;
            case 9:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzn = zzn();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzeaVarZzn);
                return true;
            case 12:
                String strZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(strZzo);
                return true;
            case 13:
                zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbme zzbmeVarZzq = zzq();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmeVarZzq);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzr(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzt(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzu = zzu();
                parcel2.writeNoException();
                zzben.zze(parcel2, iObjectWrapperZzu);
                return true;
            case 19:
                IObjectWrapper iObjectWrapperZzv = zzv();
                parcel2.writeNoException();
                zzben.zze(parcel2, iObjectWrapperZzv);
                return true;
            case 20:
                Bundle bundleZzw = zzw();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzw);
                return true;
            case 21:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbnxVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbnxVar = iInterfaceQueryLocalInterface instanceof zzbnz ? (zzbnz) iInterfaceQueryLocalInterface : new zzbnx(strongBinder);
                }
                zzben.zzh(parcel);
                zzx(zzbnxVar);
                parcel2.writeNoException();
                return true;
            case 22:
                zzy();
                parcel2.writeNoException();
                return true;
            case 23:
                List listZzz = zzz();
                parcel2.writeNoException();
                parcel2.writeList(listZzz);
                return true;
            case 24:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i3 = zzben.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdg zzdgVarZzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzB(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdc zzdcVarZzb = com.google.android.gms.ads.internal.client.zzdb.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzC(zzdcVarZzb);
                parcel2.writeNoException();
                return true;
            case 27:
                zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbmi zzbmiVarZzF = zzF();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmiVarZzF);
                return true;
            case 30:
                boolean zZzG = zzG();
                parcel2.writeNoException();
                int i4 = zzben.zza;
                parcel2.writeInt(zZzG ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdx zzdxVarZzH = zzH();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzdxVarZzH);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzb = com.google.android.gms.ads.internal.client.zzdp.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzI(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
                zzben.zzh(parcel);
                zzJ(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long jZzK = zzK();
                parcel2.writeNoException();
                parcel2.writeLong(jZzK);
                return true;
            case 35:
                long j = parcel.readLong();
                zzben.zzh(parcel);
                zzL(j);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
