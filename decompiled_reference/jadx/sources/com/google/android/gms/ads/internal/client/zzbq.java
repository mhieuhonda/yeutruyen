package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbng;
import com.google.android.gms.internal.ads.zzbnj;
import com.google.android.gms.internal.ads.zzbnm;
import com.google.android.gms.internal.ads.zzbnp;
import com.google.android.gms.internal.ads.zzbnt;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsr;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbh zzbhVar) throws RemoteException;

    void zzg(zzbng zzbngVar) throws RemoteException;

    void zzh(zzbnj zzbnjVar) throws RemoteException;

    void zzi(String str, zzbnp zzbnpVar, zzbnm zzbnmVar) throws RemoteException;

    void zzj(zzbma zzbmaVar) throws RemoteException;

    void zzk(zzbnt zzbntVar, zzr zzrVar) throws RemoteException;

    void zzl(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzm(zzbnw zzbnwVar) throws RemoteException;

    void zzn(zzbsi zzbsiVar) throws RemoteException;

    void zzo(zzbsr zzbsrVar) throws RemoteException;

    void zzp(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzq(zzcp zzcpVar) throws RemoteException;
}
