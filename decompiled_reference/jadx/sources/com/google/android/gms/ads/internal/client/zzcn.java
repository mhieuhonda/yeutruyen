package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmu;
import com.google.android.gms.internal.ads.zzbqw;
import com.google.android.gms.internal.ads.zzbqx;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbzb;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzcet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcn extends zzbem implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzben.zzb(parcel, zzr.CREATOR);
                String string = parcel.readString();
                zzbvj zzbvjVarZzf = zzbvi.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzben.zzh(parcel);
                zzbu zzbuVarZzb = zzb(iObjectWrapperAsInterface, zzrVar, string, zzbvjVarZzf, i3);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbuVarZzb);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar2 = (zzr) zzben.zzb(parcel, zzr.CREATOR);
                String string2 = parcel.readString();
                zzbvj zzbvjVarZzf2 = zzbvi.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzben.zzh(parcel);
                zzbu zzbuVarZzc = zzc(iObjectWrapperAsInterface2, zzrVar2, string2, zzbvjVarZzf2, i4);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbuVarZzc);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbvj zzbvjVarZzf3 = zzbvi.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzben.zzh(parcel);
                zzbq zzbqVarZzd = zzd(iObjectWrapperAsInterface3, string3, zzbvjVarZzf3, i5);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbqVarZzd);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzbmp zzbmpVarZze = zze(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmpVarZze);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf4 = zzbvi.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzben.zzh(parcel);
                zzcbz zzcbzVarZzf = zzf(iObjectWrapperAsInterface6, zzbvjVarZzf4, i6);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzcbzVarZzf);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzbzi zzbziVarZzg = zzg(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbziVarZzg);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzben.zzh(parcel);
                zzcy zzcyVarZzi = zzi(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzcyVarZzi);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar3 = (zzr) zzben.zzb(parcel, zzr.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzben.zzh(parcel);
                zzbu zzbuVarZzj = zzj(iObjectWrapperAsInterface9, zzrVar3, string4, i8);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbuVarZzj);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzbmu zzbmuVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbmuVarZzk);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbvj zzbvjVarZzf5 = zzbvi.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzben.zzh(parcel);
                zzccp zzccpVarZzl = zzl(iObjectWrapperAsInterface13, string5, zzbvjVarZzf5, i9);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzccpVarZzl);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzr zzrVar4 = (zzr) zzben.zzb(parcel, zzr.CREATOR);
                String string6 = parcel.readString();
                zzbvj zzbvjVarZzf6 = zzbvi.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzben.zzh(parcel);
                zzbu zzbuVarZzm = zzm(iObjectWrapperAsInterface14, zzrVar4, string6, zzbvjVarZzf6, i10);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbuVarZzm);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf7 = zzbvi.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzben.zzh(parcel);
                zzcet zzcetVarZzn = zzn(iObjectWrapperAsInterface15, zzbvjVarZzf7, i11);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzcetVarZzn);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf8 = zzbvi.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzben.zzh(parcel);
                zzbzb zzbzbVarZzo = zzo(iObjectWrapperAsInterface16, zzbvjVarZzf8, i12);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbzbVarZzo);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf9 = zzbvi.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbqx zzbqxVarZzc = zzbqw.zzc(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzbra zzbraVarZzp = zzp(iObjectWrapperAsInterface17, zzbvjVarZzf9, i13, zzbqxVarZzc);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbraVarZzp);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf10 = zzbvi.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzben.zzh(parcel);
                zzdt zzdtVarZzq = zzq(iObjectWrapperAsInterface18, zzbvjVarZzf10, i14);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzdtVarZzq);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbvj zzbvjVarZzf11 = zzbvi.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzben.zzh(parcel);
                zzch zzchVarZzh = zzh(iObjectWrapperAsInterface19, zzbvjVarZzf11, i15);
                parcel2.writeNoException();
                zzben.zze(parcel2, zzchVarZzh);
                return true;
            default:
                return false;
        }
    }
}
