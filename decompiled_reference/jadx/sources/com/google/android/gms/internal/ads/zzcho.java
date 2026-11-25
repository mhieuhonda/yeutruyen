package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcho {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzaw)).longValue());
    private boolean zzc = true;

    zzcho() {
    }

    public final void zza() {
        this.zzc = true;
    }

    public final void zzb(SurfaceTexture surfaceTexture, final zzcgz zzcgzVar) {
        if (zzcgzVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            long j = timestamp - this.zzb;
            if (Math.abs(j) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        zzgax zzgaxVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcgzVar);
        zzgaxVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgzVar.zzi();
            }
        });
    }
}
