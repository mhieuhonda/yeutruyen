package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcvn extends zzbgp {
    private final zzcvm zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzfgm zzc;
    private boolean zzd;
    private final zzdzt zze;

    public zzcvn(zzcvm zzcvmVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzfgm zzfgmVar, zzdzt zzdztVar) {
        this.zza = zzcvmVar;
        this.zzb = zzbuVar;
        this.zzc = zzfgmVar;
        this.zze = zzdztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbv)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.zzd = true;
        } else {
            this.zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzbw)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzf(IObjectWrapper iObjectWrapper, zzbgx zzbgxVar) {
        try {
            this.zzc.zzp(zzbgxVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbgxVar, this.zzd);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzdx zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhO)).booleanValue()) {
            return this.zza.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzh(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzi(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.zze.zzb();
                }
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzr(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzj() {
        try {
            return this.zzb.zzu();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final long zzk() {
        zzcvm zzcvmVar = this.zza;
        if (zzcvmVar == null || zzcvmVar.zzo() == null) {
            return 0L;
        }
        return zzcvmVar.zzo().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl(long j) {
        zzcvm zzcvmVar = this.zza;
        if (zzcvmVar == null || zzcvmVar.zzo() == null) {
            return;
        }
        zzcvmVar.zzo().zzb(j);
    }
}
