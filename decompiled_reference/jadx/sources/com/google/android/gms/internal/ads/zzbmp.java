package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbmp extends IInterface {
    void zzb(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzc(String str) throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdB(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdC(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdD(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzdE(zzbmi zzbmiVar) throws RemoteException;

    void zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
