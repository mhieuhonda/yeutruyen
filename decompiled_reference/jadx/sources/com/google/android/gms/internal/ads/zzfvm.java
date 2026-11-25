package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvm implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzfvn zzb;

    zzfvm(zzfvn zzfvnVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzfvnVar);
        this.zzb = zzfvnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
