package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfck implements zzfcs {
    private final boolean zza;

    zzfck(zzfii zzfiiVar) {
        this.zza = zzfiiVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zza(new zzfcj(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 36;
    }
}
