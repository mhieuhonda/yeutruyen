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
public final class zzets extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzr zza;
    private final Context zzb;
    private final zzfiq zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzetk zzf;
    private final zzfjr zzg;
    private final zzbaw zzh;
    private final zzdzt zzi;
    private zzdmh zzj;
    private boolean zzk;

    public zzets(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfiq zzfiqVar, zzetk zzetkVar, zzfjr zzfjrVar, VersionInfoParcel versionInfoParcel, zzbaw zzbawVar, zzdzt zzdztVar) {
        this.zza = zzrVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzfiqVar;
        this.zzf = zzetkVar;
        this.zzg = zzfjrVar;
        this.zze = versionInfoParcel;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbv)).booleanValue() || Build.VERSION.SDK_INT < 35) {
            this.zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbu)).booleanValue();
        } else {
            this.zzk = true;
        }
        this.zzh = zzbawVar;
        this.zzi = zzdztVar;
    }

    private final synchronized boolean zzO() {
        zzdmh zzdmhVar = this.zzj;
        return (zzdmhVar == null || zzdmhVar.zzb()) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzccc zzcccVar) {
        this.zzg.zzn(zzcccVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(zzbgt zzbgtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzK(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    public final void zzL(zzfti zzftiVar) {
        this.zzf.zzn(zzftiVar);
    }

    final /* synthetic */ zzdmh zzM() {
        return this.zzj;
    }

    final /* synthetic */ void zzN(zzdmh zzdmhVar) {
        this.zzj = zzdmhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdqVar.zzf()) {
                this.zzi.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzp(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) throws RemoteException {
        this.zzf.zzq(zzbkVar);
        zze(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzR(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfmi.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdL)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
        this.zzf.zzr(zzcsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzT(long j) {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzo() == null) {
            return;
        }
        zzdmhVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzU() {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzo() == null) {
            return 0L;
        }
        return zzdmhVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar != null) {
            zzdmhVar.zzl().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzd() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzO();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzl(zzbhVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        boolean z;
        if (!zzmVar.zzb()) {
            if (((Boolean) zzbkv.zzi.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmO)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (this.zze.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmP)).intValue() || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zzb;
        if (com.google.android.gms.ads.internal.util.zzs.zzK(context) && zzmVar.zzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
            zzetk zzetkVar = this.zzf;
            if (zzetkVar != null) {
                zzetkVar.zzdJ(zzfmi.zzd(4, null, null));
            }
        } else if (!zzO()) {
            zzfmd.zzb(context, zzmVar.zzf);
            this.zzj = null;
            return this.zzc.zza(zzmVar, this.zzd, new zzfij(this.zza), new zzetr(this));
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar != null) {
            zzdmhVar.zzl().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzg() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar != null) {
            zzdmhVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzo(zzclVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzk() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzl() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Interstitial can not be shown before loaded.");
            this.zzf.zzj(zzfmi.zzd(9, null, null));
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdL)).booleanValue()) {
                this.zzh.zzb().zzi(new Throwable().getStackTrace());
            }
            this.zzj.zza(this.zzk, null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzbzr zzbzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzbzu zzbzuVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzn() == null) {
            return null;
        }
        return zzdmhVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzdmh zzdmhVar = this.zzj;
        if (zzdmhVar == null || zzdmhVar.zzn() == null) {
            return null;
        }
        return zzdmhVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() {
        zzdmh zzdmhVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhO)).booleanValue() && (zzdmhVar = this.zzj) != null) {
            return zzdmhVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzu() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzv() {
        return this.zzf.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzw() {
        return this.zzf.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(zzbjs zzbjsVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzc(zzbjsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z) {
    }
}
