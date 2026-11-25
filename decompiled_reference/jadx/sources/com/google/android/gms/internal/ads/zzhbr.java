package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbr extends zzhbs {
    final /* synthetic */ zzhbt zza;
    private final Callable zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhbr(zzhbt zzhbtVar, Callable callable, Executor executor) {
        super(zzhbtVar, executor);
        Objects.requireNonNull(zzhbtVar);
        this.zza = zzhbtVar;
        this.zzc = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final Object zza() throws Exception {
        return this.zzc.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    final void zzb(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final String zzc() {
        return this.zzc.toString();
    }
}
