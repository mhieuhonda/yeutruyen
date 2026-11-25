package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbbw implements Runnable {
    final /* synthetic */ zzbbz zza;

    zzbbw(zzbbz zzbbzVar) {
        Objects.requireNonNull(zzbbzVar);
        this.zza = zzbbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzr();
    }
}
