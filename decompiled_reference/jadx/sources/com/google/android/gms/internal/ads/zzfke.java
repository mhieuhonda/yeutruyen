package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfke extends zzcco {
    private final zzfka zza;
    private final zzfjr zzb;
    private final String zzc;
    private final zzfkz zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzbaw zzg;
    private final zzdzt zzh;
    private zzdvu zzi;
    private boolean zzj;

    public zzfke(String str, zzfka zzfkaVar, Context context, zzfjr zzfjrVar, zzfkz zzfkzVar, VersionInfoParcel versionInfoParcel, zzbaw zzbawVar, zzdzt zzdztVar) {
        this.zzc = str;
        this.zza = zzfkaVar;
        this.zzb = zzfjrVar;
        this.zzd = zzfkzVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbv)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbu)).booleanValue();
        } else {
            this.zzj = true;
        }
        this.zzg = zzbawVar;
        this.zzh = zzdztVar;
    }

    private final synchronized void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar, int i) throws RemoteException {
        if (!zzmVar.zzb()) {
            boolean z = false;
            if (((Boolean) zzbkv.zzk.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmO)).booleanValue()) {
                    z = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmP)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        zzfjr zzfjrVar = this.zzb;
        zzfjrVar.zzh(zzccwVar);
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzK(this.zze) && zzmVar.zzs == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzfjrVar.zzdJ(zzfmi.zzd(4, null, null));
        } else {
            if (this.zzi != null) {
                return;
            }
            zzfjt zzfjtVar = new zzfjt(null);
            zzfka zzfkaVar = this.zza;
            zzfkaVar.zzj(i);
            zzfkaVar.zza(zzmVar, this.zzc, zzfjtVar, new zzfkd(this));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzk(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzc(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) throws RemoteException {
        zzy(zzmVar, zzccwVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, zzccw zzccwVar) throws RemoteException {
        zzy(zzmVar, zzccwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze(zzccs zzccsVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzccsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        zzfjr zzfjrVar = this.zzb;
        if (zzdnVar == null) {
            zzfjrVar.zzk(null);
        } else {
            zzfjrVar.zzk(new zzfkc(this, zzdnVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final Bundle zzg() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.zzi;
        return zzdvuVar != null ? zzdvuVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzh(zzcdd zzcddVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfkz zzfkzVar = this.zzd;
        zzfkzVar.zza = zzcddVar.zza;
        zzfkzVar.zzb = zzcddVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final boolean zzi() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.zzi;
        return (zzdvuVar == null || zzdvuVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized String zzj() throws RemoteException {
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar == null || zzdvuVar.zzn() == null) {
            return null;
        }
        return zzdvuVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Rewarded can not be shown before loaded");
            this.zzb.zzj(zzfmi.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdL)).booleanValue()) {
                this.zzg.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzi.zza(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final zzccm zzl() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar != null) {
            return zzdvuVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final com.google.android.gms.ads.internal.client.zzdx zzm() {
        zzdvu zzdvuVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhO)).booleanValue() && (zzdvuVar = this.zzi) != null) {
            return zzdvuVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final String zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzo(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzl(zzdqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzp(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized long zzq() {
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar == null || zzdvuVar.zzo() == null) {
            return 0L;
        }
        return zzdvuVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final synchronized void zzr(long j) {
        zzdvu zzdvuVar = this.zzi;
        if (zzdvuVar == null || zzdvuVar.zzo() == null) {
            return;
        }
        zzdvuVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzs(zzccx zzccxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzp(zzccxVar);
    }

    public final void zzu(zzfti zzftiVar) {
        this.zzb.zzo(zzftiVar);
    }

    final /* synthetic */ zzfkz zzv() {
        return this.zzd;
    }

    final /* synthetic */ zzdvu zzw() {
        return this.zzi;
    }

    final /* synthetic */ void zzx(zzdvu zzdvuVar) {
        this.zzi = zzdvuVar;
    }
}
