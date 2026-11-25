package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdi {
    private static Executor zza;

    public static synchronized Executor zza() {
        if (zza == null) {
            zza = zzfm.zzg("ExoPlayer:BackgroundExecutor");
        }
        return zza;
    }
}
