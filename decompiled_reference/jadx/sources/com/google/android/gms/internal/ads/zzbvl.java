package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbvl extends zzbem implements zzbvm {
    public zzbvl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvp zzbvnVar;
        zzbvp zzbvnVar2;
        zzbvp zzbvnVar3;
        zzbvp zzbvnVar4;
        zzbvp zzbvnVar5;
        zzbvp zzbvnVar6;
        zzbvp zzbvnVar7;
        zzbvp zzbvnVar8;
        zzbvp zzbvnVar9 = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbvnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar = iInterfaceQueryLocalInterface instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface : new zzbvn(strongBinder);
                }
                zzben.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzrVar, zzmVar, string, zzbvnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperZzf = zzf();
                parcel2.writeNoException();
                zzben.zze(parcel2, iObjectWrapperZzf);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbvnVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar2 = iInterfaceQueryLocalInterface2 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface2 : new zzbvn(strongBinder2);
                }
                zzben.zzh(parcel);
                zzg(iObjectWrapperAsInterface2, zzmVar2, string2, zzbvnVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbvnVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar3 = iInterfaceQueryLocalInterface3 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface3 : new zzbvn(strongBinder3);
                }
                zzben.zzh(parcel);
                zzj(iObjectWrapperAsInterface3, zzrVar2, zzmVar3, string3, string4, zzbvnVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbvnVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar4 = iInterfaceQueryLocalInterface4 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface4 : new zzbvn(strongBinder4);
                }
                zzben.zzh(parcel);
                zzk(iObjectWrapperAsInterface4, zzmVar4, string5, string6, zzbvnVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string7 = parcel.readString();
                zzcch zzcchVarZzb = zzccg.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzben.zzh(parcel);
                zzn(iObjectWrapperAsInterface5, zzmVar5, string7, zzcchVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string9 = parcel.readString();
                zzben.zzh(parcel);
                zzo(zzmVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i3 = zzben.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zzbvnVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar5 = iInterfaceQueryLocalInterface5 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface5 : new zzbvn(strongBinder5);
                }
                zzbma zzbmaVar = (zzbma) zzben.zzb(parcel, zzbma.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzben.zzh(parcel);
                zzr(iObjectWrapperAsInterface6, zzmVar7, string10, string11, zzbvnVar5, zzbmaVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzben.zze(parcel2, null);
                return true;
            case 17:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzs);
                return true;
            case 18:
                Bundle bundleZzt = zzt();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzt);
                return true;
            case 19:
                Bundle bundleZzu = zzu();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzu);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzben.zzh(parcel);
                zzv(zzmVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzw(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzben.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzcch zzcchVarZzb2 = zzccg.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzben.zzh(parcel);
                zzy(iObjectWrapperAsInterface8, zzcchVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbnc zzbncVarZzz = zzz();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbncVarZzz);
                return true;
            case 25:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzA(zZza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzea zzeaVarZzB = zzB();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzeaVarZzB);
                return true;
            case 27:
                zzbvy zzbvyVarZzC = zzC();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbvyVarZzC);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    zzbvnVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar6 = iInterfaceQueryLocalInterface6 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface6 : new zzbvn(strongBinder6);
                }
                zzben.zzh(parcel);
                zzD(iObjectWrapperAsInterface9, zzmVar9, string14, zzbvnVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzE(iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsa zzbsaVarZzb = zzbrz.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbsg.CREATOR);
                zzben.zzh(parcel);
                zzF(iObjectWrapperAsInterface11, zzbsaVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    zzbvnVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar7 = iInterfaceQueryLocalInterface7 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface7 : new zzbvn(strongBinder7);
                }
                zzben.zzh(parcel);
                zzG(iObjectWrapperAsInterface12, zzmVar10, string15, zzbvnVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbxx zzbxxVarZzH = zzH();
                parcel2.writeNoException();
                zzben.zzd(parcel2, zzbxxVarZzH);
                return true;
            case 34:
                zzbxx zzbxxVarZzI = zzI();
                parcel2.writeNoException();
                zzben.zzd(parcel2, zzbxxVarZzI);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    zzbvnVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar8 = iInterfaceQueryLocalInterface8 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface8 : new zzbvn(strongBinder8);
                }
                zzben.zzh(parcel);
                zzJ(iObjectWrapperAsInterface13, zzrVar3, zzmVar11, string16, string17, zzbvnVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbvs zzbvsVarZzK = zzK();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbvsVarZzK);
                return true;
            case 37:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzL(iObjectWrapperAsInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzben.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbvnVar9 = iInterfaceQueryLocalInterface9 instanceof zzbvp ? (zzbvp) iInterfaceQueryLocalInterface9 : new zzbvn(strongBinder9);
                }
                zzben.zzh(parcel);
                zzM(iObjectWrapperAsInterface15, zzmVar12, string18, zzbvnVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzN(iObjectWrapperAsInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
