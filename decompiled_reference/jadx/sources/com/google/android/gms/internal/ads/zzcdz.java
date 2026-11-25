package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcdz {
    private final Clock zza;
    private final zzcdx zzb;

    zzcdz(Clock clock, zzcdx zzcdxVar) {
        this.zza = clock;
        this.zzb = zzcdxVar;
    }

    public static zzcdz zza(Context context) {
        return zzceh.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i, long j) {
        this.zzb.zza(i, j);
    }
}
