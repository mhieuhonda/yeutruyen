package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbrw;
import com.google.android.gms.internal.ads.zzbsd;
import com.google.android.gms.internal.ads.zzbvj;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcw extends zzbel implements zzcy {
    zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zze() throws RemoteException {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzf(float f) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzg(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzh(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzben.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzi(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzj(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzben.zze(parcelZza, iObjectWrapper);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final float zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(7, zza());
        float f = parcelZzcZ.readFloat();
        parcelZzcZ.recycle();
        return f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final boolean zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(8, zza());
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final String zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(9, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzo(zzbvj zzbvjVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbvjVar);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzp(zzbsd zzbsdVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzbsdVar);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final List zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzcZ.createTypedArrayList(zzbrw.CREATOR);
        parcelZzcZ.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzr(zzfr zzfrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zzc(parcelZza, zzfrVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzs() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzt(zzdk zzdkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, zzdkVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzu(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzben.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(17, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzv(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public final void zzw() throws RemoteException {
        zzda(19, zza());
    }
}
