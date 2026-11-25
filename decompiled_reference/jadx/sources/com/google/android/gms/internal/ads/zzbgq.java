package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbgq extends IInterface {
    com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException;

    void zzf(IObjectWrapper iObjectWrapper, zzbgx zzbgxVar) throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdx zzg() throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) throws RemoteException;

    String zzj() throws RemoteException;

    long zzk() throws RemoteException;

    void zzl(long j) throws RemoteException;
}
