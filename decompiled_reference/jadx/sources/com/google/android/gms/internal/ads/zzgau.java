package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgau implements zzgat {
    private zzgau() {
        throw null;
    }

    /* synthetic */ zzgau(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zza(int i) {
        return Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzgav(null)));
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zzb(int i, ThreadFactory threadFactory, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zzc(int i) {
        return zzb(1, new zzgav(null), 2);
    }

    @Override // com.google.android.gms.internal.ads.zzgat
    public final ExecutorService zzd(ThreadFactory threadFactory, int i) {
        return zzb(1, threadFactory, 1);
    }
}
