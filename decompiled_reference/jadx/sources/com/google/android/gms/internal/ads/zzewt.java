package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzewt implements zzfcs {
    private final zzflg zza;

    zzewt(zzflg zzflgVar) {
        this.zza = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zza(new zzewu(this.zza.zzq));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 58;
    }
}
