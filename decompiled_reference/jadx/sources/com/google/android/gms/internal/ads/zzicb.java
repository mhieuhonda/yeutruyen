package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzicb extends zzicf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzicb(zzicc zziccVar) {
        super(zziccVar.zza);
        Objects.requireNonNull(zziccVar);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return zza();
    }
}
