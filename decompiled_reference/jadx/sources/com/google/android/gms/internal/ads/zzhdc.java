package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhdc extends zzhcm {
    final /* synthetic */ zzhde zza;
    private final zzhbm zzb;

    zzhdc(zzhde zzhdeVar, zzhbm zzhbmVar) {
        Objects.requireNonNull(zzhdeVar);
        this.zza = zzhdeVar;
        this.zzb = zzhbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzhbm zzhbmVar = this.zzb;
        ListenableFuture listenableFutureZza = zzhbmVar.zza();
        zzgtr.zzl(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbmVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
