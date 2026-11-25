package com.google.android.gms.internal.ads;

import android.media.Spatializer;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzacm implements Spatializer.OnSpatializerStateChangedListener {
    final /* synthetic */ Runnable zza;

    zzacm(zzaco zzacoVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzacoVar);
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        this.zza.run();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        this.zza.run();
    }
}
