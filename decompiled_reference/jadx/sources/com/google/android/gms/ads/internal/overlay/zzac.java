package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbfr;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdlg;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzac extends zzbzh implements zzbfr {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private final boolean zzf;
    private boolean zzc = false;
    private boolean zzd = false;
    private boolean zze = false;
    private boolean zzg = false;
    private boolean zzh = false;

    /* JADX WARN: Code duplicated, block: B:10:0x004c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0064  */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:8:0x0048  */
    public zzac(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        zzc zzcVar;
        boolean z = false;
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
        if (((Boolean) zzba.zzc().zzd(zzbix.zzfQ)).booleanValue()) {
            zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null) {
                if (Build.MANUFACTURER.matches((String) zzba.zzc().zzd(zzbix.zzfT))) {
                    if (Build.MODEL.matches((String) zzba.zzc().zzd(zzbix.zzfU))) {
                        z = true;
                    }
                }
            }
        } else {
            if (((Boolean) zzba.zzc().zzd(zzbix.zzfR)).booleanValue()) {
                zzcVar = adOverlayInfoParcel.zza;
                if (zzcVar != null) {
                    if (Build.MANUFACTURER.matches((String) zzba.zzc().zzd(zzbix.zzfT))) {
                        if (Build.MODEL.matches((String) zzba.zzc().zzd(zzbix.zzfU))) {
                            z = true;
                        }
                    }
                }
            } else {
                if (((Boolean) zzba.zzc().zzd(zzbix.zzfV)).booleanValue()) {
                    zzcVar = adOverlayInfoParcel.zza;
                    if (zzcVar != null && zzcVar.zzj) {
                        if (Build.MANUFACTURER.matches((String) zzba.zzc().zzd(zzbix.zzfT))) {
                            if (Build.MODEL.matches((String) zzba.zzc().zzd(zzbix.zzfU))) {
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        this.zzf = z;
    }

    private final synchronized void zzc() {
        if (!this.zzd) {
            zzr zzrVar = this.zza.zzc;
            if (zzrVar != null) {
                zzrVar.zzdU(4);
            }
            this.zzd = true;
            if (this.zzf) {
                if (((Boolean) zzba.zzc().zzd(zzbix.zzfV)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzg().zzc(this);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzH(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    public final void zza(boolean z) {
        if (!z) {
            this.zzh = true;
        } else if (this.zzh) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Foregrounded: finishing activity from LauncherOverlay");
            this.zzb.finish();
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zzg) {
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zze() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzf() throws RemoteException {
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final boolean zzg() throws RemoteException {
        return ((Boolean) zzba.zzc().zzd(zzbix.zzfR)).booleanValue() && this.zzf && this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzh(Bundle bundle) {
        zzr zzrVar;
        if (((Boolean) zzba.zzc().zzd(zzbix.zzkt)).booleanValue() && !this.zze) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel == null) {
            this.zzb.finish();
            return;
        }
        if (z) {
            this.zzb.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdlg zzdlgVar = adOverlayInfoParcel.zzu;
            if (zzdlgVar != null) {
                zzdlgVar.zzdu();
            }
            Activity activity = this.zzb;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzh();
            }
        }
        if (this.zzf) {
            if (((Boolean) zzba.zzc().zzd(zzbix.zzfV)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this);
            }
        }
        Activity activity2 = this.zzb;
        zzc zzcVar = adOverlayInfoParcel.zza;
        zzad zzadVar = adOverlayInfoParcel.zzi;
        com.google.android.gms.ads.internal.zzt.zza();
        if (zza.zzb(activity2, zzcVar, zzadVar, zzcVar.zzi, null, "")) {
            return;
        }
        activity2.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzi() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzj() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzk() throws RemoteException {
        if (this.zzc) {
            com.google.android.gms.ads.internal.util.zze.zza("LauncherOverlay finishing activity");
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        this.zzg = true;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdx();
        }
        if (this.zzf) {
            if (((Boolean) zzba.zzc().zzd(zzbix.zzfQ)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzab
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, ((Integer) zzba.zzc().zzd(zzbix.zzfS)).intValue());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzl() throws RemoteException {
        this.zzg = false;
        zzr zzrVar = this.zza.zzc;
        if (zzrVar != null) {
            zzrVar.zzdw();
        }
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzm(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzo(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzp() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzq() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbzi
    public final void zzs() throws RemoteException {
        this.zze = true;
    }
}
