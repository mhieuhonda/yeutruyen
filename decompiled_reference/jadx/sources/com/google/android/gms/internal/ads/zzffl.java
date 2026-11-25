package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzffl implements zzfcs {
    private final zzhcp zza;

    public zzffl(zzhcp zzhcpVar) {
        this.zza = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(zzffk.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 51;
    }
}
