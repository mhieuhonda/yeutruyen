package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhnm implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    zzhnm(zzhnp zzhnpVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhnpVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhno(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
