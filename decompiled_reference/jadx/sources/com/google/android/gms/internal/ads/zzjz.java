package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzjz {
    private final Map zza;
    private zzjb zzb;

    /* synthetic */ zzjz(zzlj zzljVar, int i, byte[] bArr) {
        Objects.requireNonNull(zzljVar);
        this.zza = new HashMap();
        this.zzb = zzjb.zza;
    }

    private static final zzjb zzb(zzjb zzjbVar, List list) {
        zzja zzjaVar = new zzja(zzjbVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzjbVar.zza()) {
            if (!hashSet.contains(str)) {
                zzjaVar.zzf(str);
            }
        }
        return zzjaVar.zzg();
    }

    final /* synthetic */ void zza(zzjb zzjbVar) {
        for (Map.Entry entry : new HashMap(this.zza).entrySet()) {
            zzjc zzjcVar = (zzjc) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzb(zzjbVar, list).equals(zzb(this.zzb, list))) {
                zzjcVar.zza();
            }
        }
        this.zzb = zzjbVar;
    }
}
