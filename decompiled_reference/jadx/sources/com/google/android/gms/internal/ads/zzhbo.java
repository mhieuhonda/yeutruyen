package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhbo extends zzhbq {
    zzhbo(zzgwp zzgwpVar, boolean z) {
        super(zzgwpVar, z);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhbq
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzgxt.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzhbp zzhbpVar = (zzhbp) it.next();
            arrayListZzb.add(zzhbpVar != null ? zzhbpVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
