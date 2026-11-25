package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzgat {
    ExecutorService zza(int i);

    ExecutorService zzb(int i, ThreadFactory threadFactory, int i2);

    ExecutorService zzc(int i);

    ExecutorService zzd(ThreadFactory threadFactory, int i);
}
