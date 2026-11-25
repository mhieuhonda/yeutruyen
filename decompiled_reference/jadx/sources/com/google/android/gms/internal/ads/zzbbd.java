package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbbd extends Exception {
    public zzbbd(zzbbe zzbbeVar) {
        Objects.requireNonNull(zzbbeVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbbd(zzbbe zzbbeVar, Throwable th) {
        super(th);
        Objects.requireNonNull(zzbbeVar);
    }
}
