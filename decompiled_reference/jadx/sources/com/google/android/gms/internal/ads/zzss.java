package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzss {
    private final AudioTrack zza;
    private final zzso zzb;
    private final Handler zzc;
    private AudioRouting.OnRoutingChangedListener zzd;

    /* synthetic */ zzss(AudioTrack audioTrack, zzso zzsoVar, byte[] bArr) {
        this.zza = audioTrack;
        this.zzb = zzsoVar;
        Handler handlerZzd = zzfm.zzd(null);
        this.zzc = handlerZzd;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzsr
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final /* synthetic */ void onRoutingChanged(AudioRouting audioRouting) {
                this.zza.zza(audioRouting);
            }
        };
        this.zzd = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerZzd);
    }

    final /* synthetic */ void zza(final AudioRouting audioRouting) {
        if (this.zzd == null) {
            return;
        }
        zzdi.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(audioRouting);
            }
        });
    }

    final /* synthetic */ void zzb(AudioRouting audioRouting) {
        final AudioDeviceInfo routedDevice = audioRouting.getRoutedDevice();
        if (routedDevice != null) {
            this.zzc.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(routedDevice);
                }
            });
        }
    }

    final /* synthetic */ void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (this.zzd == null) {
            return;
        }
        zztg zztgVar = ((zztf) this.zzb).zza;
        if (zztgVar.zzj() != null) {
            zztgVar.zzj().zzc(audioDeviceInfo);
        }
    }

    final /* synthetic */ void zzd() {
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzd;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzd = null;
    }
}
