package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeso extends com.google.android.gms.ads.internal.client.zzbt implements zzdfv {
    private final Context zza;
    private final zzfha zzb;
    private final String zzc;
    private final zzetk zzd;
    private com.google.android.gms.ads.internal.client.zzr zze;
    private final zzflf zzf;
    private final VersionInfoParcel zzg;
    private final zzdzt zzh;
    private zzcvs zzi;

    public zzeso(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzfha zzfhaVar, zzetk zzetkVar, VersionInfoParcel versionInfoParcel, zzdzt zzdztVar) {
        this.zza = context;
        this.zzb = zzfhaVar;
        this.zze = zzrVar;
        this.zzc = str;
        this.zzd = zzetkVar;
        this.zzf = zzfhaVar.zzg();
        this.zzg = versionInfoParcel;
        this.zzh = zzdztVar;
        zzfhaVar.zzi(this);
    }

    private final synchronized void zzO(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzflf zzflfVar = this.zzf;
        zzflfVar.zzc(zzrVar);
        zzflfVar.zze(this.zze.zzn);
    }

    private final synchronized boolean zzV(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        if (zzW()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        if (!com.google.android.gms.ads.internal.util.zzs.zzK(context) || zzmVar.zzs != null) {
            zzfmd.zzb(context, zzmVar.zzf);
            return this.zzb.zza(zzmVar, this.zzc, null, new zzesn(this));
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to load the ad because app ID is missing.");
        zzetk zzetkVar = this.zzd;
        if (zzetkVar != null) {
            zzetkVar.zzdJ(zzfmi.zzd(4, null, null));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private final boolean zzW() {
        boolean z;
        if (((Boolean) zzbkv.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmO)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmP)).intValue() || !z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzA() {
        zzcvs zzcvsVar = this.zzi;
        return zzcvsVar != null && zzcvsVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzB() {
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(zzccc zzcccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzea zzF() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null) {
            return null;
        }
        return zzcvsVar.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzG(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzi(zzfwVar);
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
    public final void zzK(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final synchronized void zzL() throws ExecutionException, InterruptedException {
        zzfha zzfhaVar = this.zzb;
        if (zzfhaVar.zzh()) {
            zzfhaVar.zzc();
        } else {
            zzfhaVar.zzk();
        }
    }

    final /* synthetic */ zzcvs zzM() {
        return this.zzi;
    }

    final /* synthetic */ void zzN(zzcvs zzcvsVar) {
        this.zzi = zzcvsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdqVar.zzf()) {
                this.zzh.zzb();
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzp(zzdqVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzT(long j) {
        this.zzf.zzx(j);
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzo() == null) {
            return;
        }
        zzcvsVar.zzo().zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized long zzU() {
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzo() == null) {
            return this.zzf.zzw();
        }
        return zzcvsVar.zzo().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzY(com.google.android.gms.ads.internal.client.zzcp zzcpVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzab(zzcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfv
    public final synchronized void zza() {
        if (!this.zzb.zzh()) {
            this.zzb.zzj();
            return;
        }
        zzflf zzflfVar = this.zzf;
        com.google.android.gms.ads.internal.client.zzr zzrVarZzf = zzflfVar.zzf();
        if (this.zzi != null && zzflfVar.zzD()) {
            zzrVarZzf = zzflm.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
        }
        zzO(zzrVarZzf);
        zzflfVar.zzd(true);
        try {
            zzV(zzflfVar.zzb());
        } catch (RemoteException unused) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to refresh the banner ad.");
        }
        this.zzf.zzd(false);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzb() {
        if (zzW()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x0047, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzc() {
        if (((Boolean) zzbkv.zze.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmL)).booleanValue()) {
                if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmQ)).intValue()) {
                    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
        } else {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        }
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            zzcvsVar.zzd();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzl(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzO(this.zze);
        return zzV(zzmVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzf() {
        if (((Boolean) zzbkv.zzg.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmM)).booleanValue()) {
                if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmQ)).intValue()) {
                    Preconditions.checkMainThread("pause must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
        } else {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
        }
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            zzcvsVar.zzl().zza(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037 A[Catch: all -> 0x004c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:10:0x003c, B:12:0x0040, B:9:0x0037), top: B:20:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzg() {
        if (((Boolean) zzbkv.zzh.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmK)).booleanValue()) {
                if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzmQ)).intValue()) {
                    Preconditions.checkMainThread("resume must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
        } else {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
        }
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            zzcvsVar.zzl().zzb(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzcl zzclVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzo(zzclVar);
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
    public final void zzl() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzm() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            zzcvsVar.zzi();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzr zzn() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            return zzflm.zza(this.zza, Collections.singletonList(zzcvsVar.zze()));
        }
        return this.zzf.zzf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzc(zzrVar);
        this.zze = zzrVar;
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar != null) {
            zzcvsVar.zzb(this.zzb.zzd(), zzrVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(zzbzr zzbzrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzbzu zzbzuVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzn() == null) {
            return null;
        }
        return zzcvsVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzs() {
        zzcvs zzcvsVar = this.zzi;
        if (zzcvsVar == null || zzcvsVar.zzn() == null) {
            return null;
        }
        return zzcvsVar.zzn().zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzdx zzt() {
        zzcvs zzcvsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhO)).booleanValue() && (zzcvsVar = this.zzi) != null) {
            return zzcvsVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzu() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzv() {
        return this.zzd.zzk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzw() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx(zzbjs zzbjsVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zze(zzbjsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (zzW()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzf(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz(boolean z) {
        if (zzW()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzk(z);
    }
}
