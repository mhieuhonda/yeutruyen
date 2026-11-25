package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcdk implements zzhcc {
    final /* synthetic */ ListenableFuture zza;

    zzcdk(zzcdp zzcdpVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
        Objects.requireNonNull(zzcdpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzcdp.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcdp.zzc.remove(this.zza);
    }
}
