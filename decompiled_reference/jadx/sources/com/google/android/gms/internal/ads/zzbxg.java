package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbxg extends zzbel implements zzbxi {
    zzbxg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbxl zzbxlVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzben.zzc(parcelZza, bundle);
        zzben.zzc(parcelZza, bundle2);
        zzben.zzc(parcelZza, zzrVar);
        zzben.zze(parcelZza, zzbxlVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final zzbxx zzf() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(2, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final zzbxx zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        zzbxx zzbxxVar = (zzbxx) zzben.zzb(parcelZzcZ, zzbxx.CREATOR);
        parcelZzcZ.recycle();
        return zzbxxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(5, zza());
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzb = com.google.android.gms.ads.internal.client.zzdz.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzeaVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbww zzbwwVar, zzbvp zzbvpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbwwVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, zzrVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwz zzbwzVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbwzVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbxfVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxc zzbxcVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbxcVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzo(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbxfVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbww zzbwwVar, zzbvp zzbvpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbwwVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, zzrVar);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxc zzbxcVar, zzbvp zzbvpVar, zzbma zzbmaVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbxcVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzben.zzc(parcelZza, zzbmaVar);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwt zzbwtVar, zzbvp zzbvpVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzben.zzc(parcelZza, zzmVar);
        zzben.zze(parcelZza, iObjectWrapper);
        zzben.zze(parcelZza, zzbwtVar);
        zzben.zze(parcelZza, zzbvpVar);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzben.zze(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(24, parcelZza);
        boolean zZza = zzben.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }
}
