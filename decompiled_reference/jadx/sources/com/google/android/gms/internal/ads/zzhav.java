package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhav extends zzhax {
    zzhav(ListenableFuture listenableFuture, Class cls, zzhbn zzhbnVar) {
        super(listenableFuture, cls, zzhbnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhax
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhax
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzhbn zzhbnVar = (zzhbn) obj;
        ListenableFuture listenableFutureZza = zzhbnVar.zza(th);
        zzgtr.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbnVar);
        return listenableFutureZza;
    }
}
