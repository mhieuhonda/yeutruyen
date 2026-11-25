package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzack implements zzacl {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzdu zzb;

    zzack(Executor executor, zzdu zzduVar) {
        this.zza = executor;
        this.zzb = zzduVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzacl
    public final void zza() {
        this.zzb.zza(this.zza);
    }
}
