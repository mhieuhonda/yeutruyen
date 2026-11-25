package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzimv implements zzimz {
    private final Map zza;

    zzimv(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    final Map zza() {
        return this.zza;
    }
}
