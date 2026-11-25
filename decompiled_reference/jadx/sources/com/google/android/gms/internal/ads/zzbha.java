package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbha implements Runnable {
    final /* synthetic */ zzbhe zza;

    zzbha(zzbhe zzbheVar) {
        Objects.requireNonNull(zzbheVar);
        this.zza = zzbheVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzg();
    }
}
