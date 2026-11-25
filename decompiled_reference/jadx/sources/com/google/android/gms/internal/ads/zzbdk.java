package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbdk implements Runnable {
    final /* synthetic */ zzbdl zza;

    zzbdk(zzbdl zzbdlVar) {
        Objects.requireNonNull(zzbdlVar);
        this.zza = zzbdlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
