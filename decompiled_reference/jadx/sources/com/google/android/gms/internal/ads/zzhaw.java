package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhaw extends zzhax {
    zzhaw(ListenableFuture listenableFuture, Class cls, zzgti zzgtiVar) {
        super(listenableFuture, cls, zzgtiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhax
    final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhax
    final /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        return ((zzgti) obj).apply(th);
    }
}
