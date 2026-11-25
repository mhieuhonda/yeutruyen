package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzind extends zzimv {
    static {
        zzina.zza(Collections.emptyMap());
    }

    /* synthetic */ zzind(Map map, zzinb zzinbVar) {
        super(map);
    }

    public static zzinc zzc(int i) {
        return new zzinc(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzc = zzimw.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzc.put(entry.getKey(), ((zzini) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzc);
    }
}
