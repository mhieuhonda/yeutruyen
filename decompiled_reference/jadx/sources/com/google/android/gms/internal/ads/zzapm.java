package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzapm implements Comparator {
    static final /* synthetic */ zzapm zza = new zzapm();

    private /* synthetic */ zzapm() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((zzapd) obj).zzb, ((zzapd) obj2).zzb);
    }
}
