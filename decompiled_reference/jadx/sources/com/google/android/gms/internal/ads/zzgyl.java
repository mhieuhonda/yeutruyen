package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyl extends zzgyn implements Serializable {
    static final zzgyl zza = new zzgyl();

    private zzgyl() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyn, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzgyn
    public final zzgyn zza() {
        return zzgyv.zza;
    }
}
