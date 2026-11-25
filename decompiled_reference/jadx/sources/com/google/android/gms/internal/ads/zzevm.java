package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevm {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private zzevl zzb;

    public final void zza(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }

    final void zzc(zzevl zzevlVar) {
        this.zzb = zzevlVar;
    }

    final zzevl zzd() {
        return this.zzb;
    }
}
