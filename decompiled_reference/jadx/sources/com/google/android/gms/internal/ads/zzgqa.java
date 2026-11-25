package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgqa implements zzgpl {
    private final List zza = new ArrayList();

    zzgqa() {
    }

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put("vst", new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgpl
    public final void zzd(Map map) {
    }
}
