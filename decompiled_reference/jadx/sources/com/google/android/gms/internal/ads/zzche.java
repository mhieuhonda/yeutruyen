package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzche implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzchi zzb;

    zzche(zzchi zzchiVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzchiVar);
        this.zzb = zzchiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzI("windowVisibilityChanged", new String[]{"isVisible", String.valueOf(this.zza)});
    }
}
