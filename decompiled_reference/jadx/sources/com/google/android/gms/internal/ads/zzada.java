package com.google.android.gms.internal.ads;

import android.view.Surface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzada extends zzvo {
    public zzada(Throwable th, zzvp zzvpVar, Surface surface) {
        super(th, zzvpVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
