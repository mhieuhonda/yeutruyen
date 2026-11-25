package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcgs implements Runnable {
    final /* synthetic */ zzcgy zza;

    zzcgs(zzcgy zzcgyVar) {
        Objects.requireNonNull(zzcgyVar);
        this.zza = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar.zzt() != null) {
            zzcgyVar.zzt().zza();
        }
    }
}
