package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzach implements Comparator {
    static final /* synthetic */ zzach zza = new zzach();

    private /* synthetic */ zzach() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((zzacg) obj).zzc, ((zzacg) obj2).zzc);
    }
}
