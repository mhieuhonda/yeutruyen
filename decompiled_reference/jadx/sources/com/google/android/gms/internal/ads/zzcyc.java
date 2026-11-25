package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcyc implements zzcyd {
    private final Map zza;

    zzcyc(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final zzema zza(int i, String str) {
        return (zzema) this.zza.get(str);
    }
}
