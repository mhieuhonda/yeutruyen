package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbem;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbni;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnl;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbno;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbns;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsq;
import com.google.android.gms.internal.ads.zzbsr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbp extends zzbem implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzbem
    protected final boolean zzdd(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbh zzbfVar = null;
        zzcp zzcpVar = null;
        switch (i) {
            case 1:
                zzbn zzbnVarZze = zze();
                parcel2.writeNoException();
                zzben.zze(parcel2, zzbnVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbfVar = iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbf(strongBinder);
                }
                zzben.zzh(parcel);
                zzf(zzbfVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbng zzbngVarZzb = zzbnf.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzg(zzbngVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbnj zzbnjVarZzb = zzbni.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzh(zzbnjVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbnp zzbnpVarZzb = zzbno.zzb(parcel.readStrongBinder());
                zzbnm zzbnmVarZzb = zzbnl.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzi(string, zzbnpVarZzb, zzbnmVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbma zzbmaVar = (zzbma) zzben.zzb(parcel, zzbma.CREATOR);
                zzben.zzh(parcel);
                zzj(zzbmaVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcpVar = iInterfaceQueryLocalInterface2 instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface2 : new zzcp(strongBinder2);
                }
                zzben.zzh(parcel);
                zzq(zzcpVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbnt zzbntVarZzb = zzbns.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzben.zzb(parcel, zzr.CREATOR);
                zzben.zzh(parcel);
                zzk(zzbntVarZzb, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzben.zzb(parcel, PublisherAdViewOptions.CREATOR);
                zzben.zzh(parcel);
                zzl(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbnw zzbnwVarZzb = zzbnv.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzm(zzbnwVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbsi zzbsiVar = (zzbsi) zzben.zzb(parcel, zzbsi.CREATOR);
                zzben.zzh(parcel);
                zzn(zzbsiVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbsr zzbsrVarZzb = zzbsq.zzb(parcel.readStrongBinder());
                zzben.zzh(parcel);
                zzo(zzbsrVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzben.zzb(parcel, AdManagerAdViewOptions.CREATOR);
                zzben.zzh(parcel);
                zzp(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
