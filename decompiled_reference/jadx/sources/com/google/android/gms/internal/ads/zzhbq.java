package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
abstract class zzhbq extends zzhbh {
    private List zza;

    zzhbq(zzgwp zzgwpVar, boolean z) {
        super(zzgwpVar, z, true);
        List listEmptyList = zzgwpVar.isEmpty() ? Collections.emptyList() : zzgxt.zzb(zzgwpVar.size());
        for (int i = 0; i < zzgwpVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzhbh
    final void zzw(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzhbp(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbh
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
