package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzclc implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzcdu zza;
    final /* synthetic */ zzclm zzb;

    zzclc(zzclm zzclmVar, zzcdu zzcduVar) {
        this.zza = zzcduVar;
        Objects.requireNonNull(zzclmVar);
        this.zzb = zzclmVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzZ(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
