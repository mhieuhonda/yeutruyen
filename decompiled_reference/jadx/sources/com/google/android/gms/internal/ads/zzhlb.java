package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhlb implements zzhld {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    zzhlb(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzhld
    public final boolean zza() {
        return this.zza.get();
    }
}
