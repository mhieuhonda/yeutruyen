package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbj extends zzhbi {
    private static final AtomicReferenceFieldUpdater zza = AtomicReferenceFieldUpdater.newUpdater(zzhbl.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater zzb = AtomicIntegerFieldUpdater.newUpdater(zzhbl.class, "remainingField");

    private zzhbj() {
        throw null;
    }

    /* synthetic */ zzhbj(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    final void zza(zzhbl zzhblVar, Set set, Set set2) {
        AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(zza, zzhblVar, null, set2);
    }

    @Override // com.google.android.gms.internal.ads.zzhbi
    final int zzb(zzhbl zzhblVar) {
        return zzb.decrementAndGet(zzhblVar);
    }
}
