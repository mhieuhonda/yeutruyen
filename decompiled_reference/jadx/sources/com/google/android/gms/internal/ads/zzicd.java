package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzicd extends zzicf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzicd(zzice zziceVar) {
        super(zziceVar.zza);
        Objects.requireNonNull(zziceVar);
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zza().zzf;
    }
}
