package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcgt implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcgy zzc;

    zzcgt(zzcgy zzcgyVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        Objects.requireNonNull(zzcgyVar);
        this.zzc = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zzc;
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
