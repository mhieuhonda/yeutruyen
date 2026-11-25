package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzifl {
    zzifl() {
    }

    public static final List zza(Object obj, long j) {
        zzifb zzifbVar = (zzifb) zzihk.zzm(obj, j);
        if (zzifbVar.zza()) {
            return zzifbVar;
        }
        int size = zzifbVar.size();
        zzifb zzifbVarZzh = zzifbVar.zzh(size == 0 ? 10 : size + size);
        zzihk.zzn(obj, j, zzifbVarZzh);
        return zzifbVarZzh;
    }
}
