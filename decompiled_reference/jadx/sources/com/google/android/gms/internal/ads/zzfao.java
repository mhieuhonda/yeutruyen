package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfao implements zzfcs {
    private final zzfkm zza;

    zzfao(zzfkm zzfkmVar) {
        this.zza = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zza(new zzfap(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 25;
    }
}
