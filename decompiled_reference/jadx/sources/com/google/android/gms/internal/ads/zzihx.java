package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzihx extends zzihu implements Set, KMappedMarker {
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzihx(Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zzihu, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzihu, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zzihw(this.zza.iterator());
    }
}
