package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdvp extends VideoController.VideoLifecycleCallbacks {
    private final zzdqb zza;

    public zzdvp(zzdqb zzdqbVar) {
        this.zza = zzdqbVar;
    }

    private static com.google.android.gms.ads.internal.client.zzed zza(zzdqb zzdqbVar) {
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzy = zzdqbVar.zzy();
        if (zzeaVarZzy == null) {
            return null;
        }
        try {
            return zzeaVarZzy.zzo();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        com.google.android.gms.ads.internal.client.zzed zzedVarZza = zza(this.zza);
        if (zzedVarZza == null) {
            return;
        }
        try {
            zzedVarZza.zzh();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        com.google.android.gms.ads.internal.client.zzed zzedVarZza = zza(this.zza);
        if (zzedVarZza == null) {
            return;
        }
        try {
            zzedVarZza.zzg();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        com.google.android.gms.ads.internal.client.zzed zzedVarZza = zza(this.zza);
        if (zzedVarZza == null) {
            return;
        }
        try {
            zzedVarZza.zze();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to call onVideoEnd()", e);
        }
    }
}
