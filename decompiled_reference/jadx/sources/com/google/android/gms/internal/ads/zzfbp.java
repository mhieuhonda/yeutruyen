package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbp implements zzfcs {
    private final String zza;

    zzfbp(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zza(new zzfbq(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 31;
    }
}
