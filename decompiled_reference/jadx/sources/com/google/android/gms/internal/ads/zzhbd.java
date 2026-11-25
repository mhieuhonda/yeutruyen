package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbd extends zzhbe {
    zzhbd(ListenableFuture listenableFuture, zzgti zzgtiVar) {
        super(listenableFuture, zzgtiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    final /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        return ((zzgti) obj).apply(obj2);
    }
}
