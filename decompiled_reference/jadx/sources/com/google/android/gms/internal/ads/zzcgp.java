package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcgp implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcgy zzb;

    zzcgp(zzcgy zzcgyVar, MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        Objects.requireNonNull(zzcgyVar);
        this.zzb = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zzb;
        zzcgyVar.zzs(this.zza);
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zzb();
        }
    }
}
