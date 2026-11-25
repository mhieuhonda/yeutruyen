package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbll {
    public static final zzbkh zza;

    static {
        zzbkh.zzb("gads:ad_loader:timeout_ms", DurationKt.MILLIS_IN_MINUTE);
        zza = zzbkh.zzb("gads:rendering:timeout_ms", DurationKt.MILLIS_IN_MINUTE);
        zzbkh.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
