package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbc extends zzhbe {
    zzhbc(ListenableFuture listenableFuture, zzhbn zzhbnVar) {
        super(listenableFuture, zzhbnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzhbn zzhbnVar = (zzhbn) obj;
        ListenableFuture listenableFutureZza = zzhbnVar.zza(obj2);
        zzgtr.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbnVar);
        return listenableFutureZza;
    }
}
