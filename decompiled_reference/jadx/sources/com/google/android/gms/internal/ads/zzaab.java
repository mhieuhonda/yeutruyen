package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzaab implements Comparator {
    static final /* synthetic */ zzaab zza = new zzaab();

    private /* synthetic */ zzaab() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzaap) ((List) obj).get(0)).compareTo((zzaap) ((List) obj2).get(0));
    }
}
