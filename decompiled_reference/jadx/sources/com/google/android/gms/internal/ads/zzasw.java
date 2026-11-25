package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzasw implements Runnable {
    final /* synthetic */ zzatl zza;
    final /* synthetic */ zzasx zzb;

    zzasw(zzasx zzasxVar, zzatl zzatlVar) {
        this.zza = zzatlVar;
        Objects.requireNonNull(zzasxVar);
        this.zzb = zzasxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
