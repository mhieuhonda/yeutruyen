package com.google.android.gms.internal.ads;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhck extends AbstractOwnableSynchronizer implements Runnable {
    private final zzhcm zza;

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }

    final /* synthetic */ void zza(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }
}
