package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfbi implements zzfcs {
    private final Bundle zza;

    zzfbi(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zza(new zzfbj(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 30;
    }
}
