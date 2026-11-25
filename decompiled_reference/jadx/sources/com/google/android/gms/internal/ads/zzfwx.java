package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfwx implements Runnable {
    final /* synthetic */ zzfxc zza;

    zzfwx(zzfxc zzfxcVar) {
        Objects.requireNonNull(zzfxcVar);
        this.zza = zzfxcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzh().zzc();
    }
}
