package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzdtj implements zzgti {
    static final /* synthetic */ zzdtj zza = new zzdtj();

    private /* synthetic */ zzdtj() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (zzblw zzblwVar : (List) obj) {
            if (zzblwVar != null) {
                arrayList.add(zzblwVar);
            }
        }
        return arrayList;
    }
}
