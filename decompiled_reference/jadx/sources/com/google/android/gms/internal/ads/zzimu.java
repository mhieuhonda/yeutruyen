package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzimu {
    final LinkedHashMap zza;

    zzimu(int i) {
        this.zza = zzimw.zzc(i);
    }

    final zzimu zza(Object obj, zzini zziniVar) {
        zzinh.zza(obj, "key");
        zzinh.zza(zziniVar, "provider");
        this.zza.put(obj, zziniVar);
        return this;
    }
}
