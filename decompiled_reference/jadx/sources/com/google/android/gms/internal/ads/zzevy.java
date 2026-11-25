package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzevy implements zzgti {
    static final /* synthetic */ zzevy zza = new zzevy();

    private /* synthetic */ zzevy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (true == arrayList.isEmpty()) {
            arrayList = null;
        }
        return new zzewa(arrayList);
    }
}
