package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbrr implements zzhbn {
    final /* synthetic */ zzbrj zza;

    zzbrr(zzbrv zzbrvVar, zzbrj zzbrjVar) {
        this.zza = zzbrjVar;
        Objects.requireNonNull(zzbrvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzcgd zzcgdVar = new zzcgd();
        ((zzbrp) obj).zze(this.zza, new zzbrq(this, zzcgdVar));
        return zzcgdVar;
    }
}
