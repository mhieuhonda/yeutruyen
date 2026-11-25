package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxh extends zzbem implements zzbxi {
    public zzbxh() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzbxi zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        return iInterfaceQueryLocalInterface instanceof zzbxi ? (zzbxi) iInterfaceQueryLocalInterface : new zzbxg(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.zzbxh] */
    /* JADX WARN: Type inference failed for: r5v11, types: [com.google.android.gms.internal.ads.zzbwz] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.google.android.gms.internal.ads.zzbxf] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.google.android.gms.internal.ads.zzbxc] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.google.android.gms.internal.ads.zzbxf] */
    /* JADX WARN: Type inference failed for: r5v20, types: [com.google.android.gms.internal.ads.zzbww] */
    /* JADX WARN: Type inference failed for: r5v24, types: [com.google.android.gms.internal.ads.zzbxc] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.google.android.gms.internal.ads.zzbwt] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.android.gms.internal.ads.zzbww] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.zzbxl] */
    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzbwrVar = null;
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String string = parcel.readString();
            Bundle bundle = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzben.zzb(parcel, Bundle.CREATOR);
            com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                zzbwrVar = iInterfaceQueryLocalInterface instanceof zzbxl ? (zzbxl) iInterfaceQueryLocalInterface : new zzbxj(strongBinder);
            }
            zzben.zzh(parcel);
            zze(iObjectWrapperAsInterface, string, bundle, bundle2, zzrVar, zzbwrVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzbxx zzbxxVarZzf = zzf();
            parcel2.writeNoException();
            zzben.zzd(parcel2, zzbxxVarZzf);
        } else if (i == 3) {
            zzbxx zzbxxVarZzg = zzg();
            parcel2.writeNoException();
            zzben.zzd(parcel2, zzbxxVarZzg);
        } else if (i == 5) {
            com.google.android.gms.ads.internal.client.zzea zzeaVarZzh = zzh();
            parcel2.writeNoException();
            zzben.zze(parcel2, zzeaVarZzh);
        } else if (i == 10) {
            IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzben.zzh(parcel);
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface2 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface2 : new zzbwu(strongBinder2);
                    }
                    zzbvp zzbvpVarZzb = zzbvo.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzben.zzh(parcel);
                    zzi(string2, string3, zzmVar, iObjectWrapperAsInterface2, zzbwrVar, zzbvpVarZzb, zzrVar2);
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface3 instanceof zzbwz ? (zzbwz) iInterfaceQueryLocalInterface3 : new zzbwx(strongBinder3);
                    }
                    zzbvp zzbvpVarZzb2 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzj(string4, string5, zzmVar2, iObjectWrapperAsInterface3, zzbwrVar, zzbvpVarZzb2);
                    parcel2.writeNoException();
                    break;
                case 15:
                    IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    boolean zZzk = zzk(iObjectWrapperAsInterface4);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzk ? 1 : 0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface4 instanceof zzbxf ? (zzbxf) iInterfaceQueryLocalInterface4 : new zzbxd(strongBinder4);
                    }
                    ?? r5 = zzbwrVar;
                    zzbvp zzbvpVarZzb3 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzl(string6, string7, zzmVar3, iObjectWrapperAsInterface5, r5, zzbvpVarZzb3);
                    parcel2.writeNoException();
                    break;
                case 17:
                    IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    boolean zZzm = zzm(iObjectWrapperAsInterface6);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzm ? 1 : 0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface5 instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface5 : new zzbxa(strongBinder5);
                    }
                    zzbvp zzbvpVarZzb4 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzn(string8, string9, zzmVar4, iObjectWrapperAsInterface7, zzbwrVar, zzbvpVarZzb4);
                    parcel2.writeNoException();
                    break;
                case 19:
                    String string10 = parcel.readString();
                    zzben.zzh(parcel);
                    zzo(string10);
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface6 instanceof zzbxf ? (zzbxf) iInterfaceQueryLocalInterface6 : new zzbxd(strongBinder6);
                    }
                    ?? r6 = zzbwrVar;
                    zzbvp zzbvpVarZzb5 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzp(string11, string12, zzmVar5, iObjectWrapperAsInterface8, r6, zzbvpVarZzb5);
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string13 = parcel.readString();
                    String string14 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface7 instanceof zzbww ? (zzbww) iInterfaceQueryLocalInterface7 : new zzbwu(strongBinder7);
                    }
                    zzbvp zzbvpVarZzb6 = zzbvo.zzb(parcel.readStrongBinder());
                    com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    zzben.zzh(parcel);
                    zzq(string13, string14, zzmVar6, iObjectWrapperAsInterface9, zzbwrVar, zzbvpVarZzb6, zzrVar3);
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface8 instanceof zzbxc ? (zzbxc) iInterfaceQueryLocalInterface8 : new zzbxa(strongBinder8);
                    }
                    zzbvp zzbvpVarZzb7 = zzbvo.zzb(parcel.readStrongBinder());
                    zzbma zzbmaVar = (zzbma) zzben.zzb(parcel, zzbma.CREATOR);
                    zzben.zzh(parcel);
                    zzr(string15, string16, zzmVar7, iObjectWrapperAsInterface10, zzbwrVar, zzbvpVarZzb7, zzbmaVar);
                    parcel2.writeNoException();
                    break;
                case 23:
                    String string17 = parcel.readString();
                    String string18 = parcel.readString();
                    com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder strongBinder9 = parcel.readStrongBinder();
                    if (strongBinder9 != null) {
                        IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IAppOpenCallback");
                        zzbwrVar = iInterfaceQueryLocalInterface9 instanceof zzbwt ? (zzbwt) iInterfaceQueryLocalInterface9 : new zzbwr(strongBinder9);
                    }
                    zzbvp zzbvpVarZzb8 = zzbvo.zzb(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    zzs(string17, string18, zzmVar8, iObjectWrapperAsInterface11, zzbwrVar, zzbvpVarZzb8);
                    parcel2.writeNoException();
                    break;
                case 24:
                    IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    zzben.zzh(parcel);
                    boolean zZzt = zzt(iObjectWrapperAsInterface12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zZzt ? 1 : 0);
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            zzben.zzh(parcel);
            parcel2.writeNoException();
        }
        return true;
    }
}
