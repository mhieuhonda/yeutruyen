package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzedk implements com.google.android.gms.ads.internal.overlay.zzr, zzcmx {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzecz zzc;
    private zzclb zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private com.google.android.gms.ads.internal.client.zzdk zzh;
    private boolean zzi;

    zzedk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzq(com.google.android.gms.ads.internal.client.zzdk zzdkVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkv)).booleanValue()) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                zzdkVar.zze(zzfmi.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdkVar.zze(zzfmi.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() >= this.zzg + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzky)).intValue())) {
                return true;
            }
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector cannot be opened because it is already open.");
        try {
            zzdkVar.zze(zzfmi.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcmx
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzn();
            return;
        }
        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Ad inspector failed to load.");
        try {
            zzcfk zzcfkVarZzh = com.google.android.gms.ads.internal.zzt.zzh();
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb.append("Failed to load UI. Error code: ");
            sb.append(i);
            sb.append(", Description: ");
            sb.append(str);
            sb.append(", Failing URL: ");
            sb.append(str2);
            zzcfkVarZzh.zzh(new Exception(sb.toString()), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzh;
            if (zzdkVar != null) {
                zzdkVar.zze(zzfmi.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdU(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.zzh;
            if (zzdkVar != null) {
                try {
                    zzdkVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzh() {
        this.zzf = true;
        zzn();
    }

    public final void zzl(zzecz zzeczVar) {
        this.zzc = zzeczVar;
    }

    public final synchronized void zzm(com.google.android.gms.ads.internal.client.zzdk zzdkVar, zzbqs zzbqsVar, zzbql zzbqlVar, zzbpy zzbpyVar) {
        if (zzq(zzdkVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzclb zzclbVarZza = zzclr.zza(this.zza, zzcnl.zzb(), "", false, false, null, null, this.zzb, null, null, null, zzbhw.zza(), null, null, null, null, null);
                this.zzd = zzclbVarZza;
                zzcmz zzcmzVarZzP = zzclbVarZza.zzP();
                if (zzcmzVarZzP == null) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdkVar.zze(zzfmi.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdkVar;
                Context context = this.zza;
                zzcmzVarZzP.zzab(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbqsVar, null, new zzbqr(context), zzbqlVar, zzbpyVar, null, null, null, null);
                zzcmzVarZzP.zzG(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzkw));
                com.google.android.gms.ads.internal.zzt.zzb();
                com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            } catch (zzclq e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to obtain a web view for the ad inspector", e2);
                try {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "InspectorUi.openInspector 0");
                    zzdkVar.zze(zzfmi.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzn() {
        if (this.zze && this.zzf) {
            zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedj
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzp();
                }
            });
        }
    }

    public final Activity zzo() {
        zzclb zzclbVar = this.zzd;
        if (zzclbVar == null || zzclbVar.zzX()) {
            return null;
        }
        return this.zzd.zzj();
    }

    final /* synthetic */ void zzp() {
        this.zzd.zzc("window.inspectorInfo", this.zzc.zzr().toString());
    }
}
