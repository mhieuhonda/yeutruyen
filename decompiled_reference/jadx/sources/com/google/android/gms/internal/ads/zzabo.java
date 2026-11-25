package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzabo {
    private final Handler zza;
    private final zzabq zzb;
    private boolean zzc;

    public zzabo(Handler handler, zzabq zzabqVar) {
        this.zza = handler;
        this.zzb = zzabqVar;
    }

    public final void zza() {
        this.zzc = true;
    }

    final /* synthetic */ Handler zzb() {
        return this.zza;
    }

    final /* synthetic */ zzabq zzc() {
        return this.zzb;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzc;
    }
}
