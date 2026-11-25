package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfud implements Runnable {
    final /* synthetic */ zzful zza;

    zzfud(zzful zzfulVar) {
        Objects.requireNonNull(zzfulVar);
        this.zza = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzL();
    }
}
