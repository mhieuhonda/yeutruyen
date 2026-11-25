package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcgb {
    public static void zza(ListenableFuture listenableFuture, String str, Executor executor) {
        zzhcf.zzr(listenableFuture, new zzcfz(str), executor);
    }

    public static void zzb(ListenableFuture listenableFuture, String str) {
        zzhcf.zzr(listenableFuture, new zzcga(str), zzcfy.zzh);
    }
}
