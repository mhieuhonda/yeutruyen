package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzblg {
    public static final zzbkh zza = zzbkh.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbkh zzb = zzbkh.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbkh zzc = new zzbkh("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbkh zzd = new zzbkh("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbkh zze;
    public static final zzbkh zzf;

    static {
        zzbkh.zza("gads:sdk_crash_report_enabled", false);
        zze = zzbkh.zza("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbkh.zzc("gads:trapped_exception_sample_rate", 0.01d);
    }
}
