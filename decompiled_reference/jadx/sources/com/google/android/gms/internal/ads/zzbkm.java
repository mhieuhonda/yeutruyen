package com.google.android.gms.internal.ads;

import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import kotlin.time.DurationKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbkm {
    public static final zzbkh zza = zzbkh.zzb("gads:app_permissions_caching_expiry_ms:expiry", DurationKt.MILLIS_IN_MINUTE);
    public static final zzbkh zzb = zzbkh.zzb("gads:audio_caching_expiry_ms:expiry", CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    public static final zzbkh zzc = zzbkh.zzb("gads:battery_caching_expiry_ms:expiry", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbkh zzd = zzbkh.zzb("gads:device_info_caching_expiry_ms:expiry", PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    public static final zzbkh zze = zzbkh.zzb("gads:hsdp_caching_expiry_ms:expiry", 600000);
    public static final zzbkh zzf = zzbkh.zzb("gads:memory_caching_expiry_ms:expiry", CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    public static final zzbkh zzg = zzbkh.zzb("gads:sdk_environment_caching_expiry_ms:expiry", 600000);
    public static final zzbkh zzh = zzbkh.zzb("gads:telephony_caching_expiry_ms:expiry", CoroutineLiveDataKt.DEFAULT_TIMEOUT);
}
