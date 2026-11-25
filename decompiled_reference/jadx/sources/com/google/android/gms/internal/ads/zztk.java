package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztk {
    private final Context zza;
    private Boolean zzb;

    public zztk() {
        this(null);
    }

    public zztk(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }

    public final zzqu zza(zzv zzvVar, zzd zzdVar) {
        int i;
        boolean zBooleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        if (Build.VERSION.SDK_INT < 29 || (i = zzvVar.zzJ) == -1) {
            return zzqu.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = false;
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzp;
        str.getClass();
        int iZzg = zzas.zzg(str, zzvVar.zzk);
        if (iZzg == 0 || Build.VERSION.SDK_INT < zzfm.zzH(iZzg)) {
            return zzqu.zza;
        }
        int iZzF = zzfm.zzF(zzvVar);
        if (iZzF == 0) {
            return zzqu.zza;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iZzF).setEncoding(iZzg).build();
            if (Build.VERSION.SDK_INT >= 33) {
                int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(audioFormatBuild, zzdVar.zza());
                if ((directPlaybackSupport & 1) == 0) {
                    return zzqu.zza;
                }
                z = (directPlaybackSupport & 3) == 3;
                zzqt zzqtVar = new zzqt();
                zzqtVar.zza(true);
                zzqtVar.zzb(z);
                zzqtVar.zzc(zBooleanValue);
                return zzqtVar.zzd();
            }
            if (Build.VERSION.SDK_INT < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, zzdVar.zza())) {
                    return zzqu.zza;
                }
                zzqt zzqtVar2 = new zzqt();
                zzqtVar2.zza(true);
                zzqtVar2.zzc(zBooleanValue);
                return zzqtVar2.zzd();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, zzdVar.zza());
            if (playbackOffloadSupport == 0) {
                return zzqu.zza;
            }
            zzqt zzqtVar3 = new zzqt();
            if (Build.VERSION.SDK_INT > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            zzqtVar3.zza(true);
            zzqtVar3.zzb(z);
            zzqtVar3.zzc(zBooleanValue);
            return zzqtVar3.zzd();
        } catch (IllegalArgumentException unused) {
            return zzqu.zza;
        }
    }
}
