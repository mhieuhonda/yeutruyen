package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzccm;
import com.google.android.gms.internal.ads.zzcco;
import com.google.android.gms.internal.ads.zzccs;
import com.google.android.gms.internal.ads.zzccw;
import com.google.android.gms.internal.ads.zzccx;
import com.google.android.gms.internal.ads.zzcdd;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfm extends zzcco {
    private static void zzu(final zzccw zzccwVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzccw zzccwVar2 = zzccwVar;
                if (zzccwVar2 != null) {
                    try {
                        zzccwVar2.zzf(1);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzc(zzm zzmVar, zzccw zzccwVar) throws RemoteException {
        zzu(zzccwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzd(zzm zzmVar, zzccw zzccwVar) throws RemoteException {
        zzu(zzccwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze(zzccs zzccsVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(zzdn zzdnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final Bundle zzg() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzh(zzcdd zzcddVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final boolean zzi() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzj() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzk(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final zzccm zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final zzdx zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzo(zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzp(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final long zzq() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzr(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzs(zzccx zzccxVar) throws RemoteException {
    }
}
