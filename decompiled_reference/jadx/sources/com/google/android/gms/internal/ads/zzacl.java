package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zzacl extends Executor {
    static zzacl zzb(Executor executor, zzdu zzduVar) {
        return new zzack(executor, zzduVar);
    }

    void zza();
}
