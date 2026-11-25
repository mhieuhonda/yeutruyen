package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbxi extends IInterface {
    void zze(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzr zzrVar, zzbxl zzbxlVar) throws RemoteException;

    zzbxx zzf() throws RemoteException;

    zzbxx zzg() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzea zzh() throws RemoteException;

    void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbww zzbwwVar, zzbvp zzbvpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException;

    void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwz zzbwzVar, zzbvp zzbvpVar) throws RemoteException;

    boolean zzk(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException;

    boolean zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxc zzbxcVar, zzbvp zzbvpVar) throws RemoteException;

    void zzo(String str) throws RemoteException;

    void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException;

    void zzq(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbww zzbwwVar, zzbvp zzbvpVar, com.google.android.gms.ads.internal.client.zzr zzrVar) throws RemoteException;

    void zzr(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbxc zzbxcVar, zzbvp zzbvpVar, zzbma zzbmaVar) throws RemoteException;

    void zzs(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbwt zzbwtVar, zzbvp zzbvpVar) throws RemoteException;

    boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
