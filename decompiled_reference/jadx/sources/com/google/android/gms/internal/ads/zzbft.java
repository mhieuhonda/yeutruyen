package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzbft implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbfx zzb;

    zzbft(zzbfx zzbfxVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbfxVar);
        this.zzb = zzbfxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
