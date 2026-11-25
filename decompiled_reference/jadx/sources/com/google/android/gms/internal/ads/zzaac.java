package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzaac implements Comparator {
    static final /* synthetic */ zzaac zza = new zzaac();

    private /* synthetic */ zzaac() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        List list = (List) obj2;
        List list2 = (List) obj;
        return zzgwg.zzg().zza((zzaay) Collections.max(list2, zzaax.zza), (zzaay) Collections.max(list, zzaas.zza), zzaat.zza).zzb(list2.size(), list.size()).zza((zzaay) Collections.max(list2, zzaau.zza), (zzaay) Collections.max(list, zzaav.zza), zzaaw.zza).zze();
    }
}
