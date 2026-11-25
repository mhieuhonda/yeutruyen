package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdet extends zzdix implements zzbon {
    private final Bundle zzb;

    zzdet(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzs(zzdes.zza);
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
