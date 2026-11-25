package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfvn implements Runnable {
    final /* synthetic */ zzfvo zza;

    zzfvn(zzfvo zzfvoVar) {
        Objects.requireNonNull(zzfvoVar);
        this.zza = zzfvoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvo zzfvoVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfvoVar.zzf();
        float fZzc = zzfvoVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfvoVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfvoVar.zzd().post(new zzfvm(this, fZzc));
        }
    }
}
