package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeup implements zzfcs {
    private final Clock zza;
    private final zzflg zzb;
    private final long zzc;

    zzeup(Clock clock, zzflg zzflgVar, long j) {
        this.zza = clock;
        this.zzb = zzflgVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zza(new zzeuq(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 4;
    }
}
