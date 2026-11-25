package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbgs;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzccc;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbt extends zzbem implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzZ(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcs zzcqVar = null;
        zzbk zzbiVar = null;
        zzdq zzdoVar = null;
        zzby zzbwVar = null;
        zzcp zzcpVar = null;
        zzbe zzbcVar = null;
        zzcl zzcjVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperZzb = zzb();
                parcel2.writeNoException();
                zzben.zze(parcel2, iObjectWrapperZzb);
                return true;
            case 2:
                zzc();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzd = zzd();
                parcel2.writeNoException();
                int i3 = zzben.zza;
                parcel2.writeInt(zZzd ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzben.zzb(parcel, zzm.CREATOR);
                zzben.zzh(parcel);
                boolean zZze = zze(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZze ? 1 : 0);
                return true;
            case 5:
                zzf();
                parcel2.writeNoException();
                return true;
            case 6:
                zzg();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzben.zzh(parcel);
                zzdS(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcjVar = iInterfaceQueryLocalInterface2 instanceof zzcl ? (zzcl) iInterfaceQueryLocalInterface2 : new zzcj(strongBinder2);
                }
                zzben.zzh(parcel);
                zzi(zzcjVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzl();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzm();
                parcel2.writeNoException();
                return true;
            case 12:
                zzr zzrVarZzn = zzn();
                parcel2.writeNoException();
                zzben.zzd(parcel2, zzrVarZzn);
                return true;
            case 13:
                zzr zzrVar = (zzr) zzben.zzb(parcel, zzr.CREATOR);
                zzben.zzh(parcel);
                zzo(zzrVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbzr zzbzrVarZzb = zzbzq.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzp(zzbzrVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbzu zzbzuVarZzb = zzbzt.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzben.zzh(parcel);
                zzq(zzbzuVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 19:
                zzbjs zzbjsVarZzb = zzbjr.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzx(zzbjsVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbcVar = iInterfaceQueryLocalInterface3 instanceof zzbe ? (zzbe) iInterfaceQueryLocalInterface3 : new zzbc(strongBinder3);
                }
                zzben.zzh(parcel);
                zzy(zzbcVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface4 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface4 : new zzcp(strongBinder4);
                }
                zzben.zzh(parcel);
                zzY(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZza = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzz(zZza);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                int i4 = zzben.zza;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 24:
                zzccc zzcccVarZzb = zzccb.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzC(zzcccVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzben.zzh(parcel);
                zzD(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzea zzeaVarZzF = zzF();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzeaVarZzF);
                return true;
            case 29:
                zzfw zzfwVar = (zzfw) zzben.zzb(parcel, zzfw.CREATOR);
                zzben.zzh(parcel);
                zzG(zzfwVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzee zzeeVar = (zzee) zzben.zzb(parcel, zzee.CREATOR);
                zzben.zzh(parcel);
                zzH(zzeeVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 32:
                zzcl zzclVarZzv = zzv();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzclVarZzv);
                return true;
            case 33:
                zzbh zzbhVarZzw = zzw();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbhVarZzw);
                return true;
            case 34:
                boolean zZza2 = zzben.zza(parcel);
                zzben.zzh(parcel);
                zzK(zZza2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbwVar = iInterfaceQueryLocalInterface5 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface5 : new zzbw(strongBinder5);
                }
                zzben.zzh(parcel);
                zzj(zzbwVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzk = zzk();
                parcel2.writeNoException();
                zzben.zzd(parcel2, bundleZzk);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzben.zzh(parcel);
                zzE(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzx zzxVar = (zzx) zzben.zzb(parcel, zzx.CREATOR);
                zzben.zzh(parcel);
                zzI(zzxVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbgt zzbgtVarZze = zzbgs.zze(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzJ(zzbgtVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdx zzdxVarZzt = zzt();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzdxVarZzt);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdoVar = iInterfaceQueryLocalInterface6 instanceof zzdq ? (zzdq) iInterfaceQueryLocalInterface6 : new zzdo(strongBinder6);
                }
                zzben.zzh(parcel);
                zzP(zzdoVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzben.zzb(parcel, zzm.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbiVar = iInterfaceQueryLocalInterface7 instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface7 : new zzbi(strongBinder7);
                }
                zzben.zzh(parcel);
                zzQ(zzmVar2, zzbiVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzR(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcqVar = iInterfaceQueryLocalInterface8 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface8 : new zzcq(strongBinder8);
                }
                zzben.zzh(parcel);
                zzS(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                int i5 = zzben.zza;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 47:
                long jZzU = zzU();
                parcel2.writeNoException();
                parcel2.writeLong(jZzU);
                return true;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                long j = parcel.readLong();
                zzben.zzh(parcel);
                zzT(j);
                parcel2.writeNoException();
                return true;
        }
    }
}
