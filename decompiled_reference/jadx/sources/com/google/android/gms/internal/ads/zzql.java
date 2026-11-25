package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzql extends AudioDeviceCallback {
    final /* synthetic */ zzqp zza;

    /* synthetic */ zzql(zzqp zzqpVar, byte[] bArr) {
        Objects.requireNonNull(zzqpVar);
        this.zza = zzqpVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.zza.zzi();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfm.zza;
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            zzqp zzqpVar = this.zza;
            if (Objects.equals(audioDeviceInfo, zzqpVar.zzj())) {
                zzqpVar.zzk(null);
                break;
            }
        }
        this.zza.zzi();
    }
}
