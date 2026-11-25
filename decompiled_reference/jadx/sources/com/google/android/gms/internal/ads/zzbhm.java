package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbhm extends zzcgd {
    final /* synthetic */ zzbhs zza;

    zzbhm(zzbhs zzbhsVar) {
        Objects.requireNonNull(zzbhsVar);
        this.zza = zzbhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgd, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zza.zzb();
        return super.cancel(z);
    }
}
