package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbrs implements Runnable {
    final /* synthetic */ zzbrv zza;

    zzbrs(zzbrv zzbrvVar) {
        Objects.requireNonNull(zzbrvVar);
        this.zza = zzbrvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
