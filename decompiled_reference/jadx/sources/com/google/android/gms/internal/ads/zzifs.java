package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzifs {
    private final zzifr zza;

    private zzifs(zzihq zzihqVar, Object obj, zzihq zzihqVar2, Object obj2) {
        this.zza = new zzifr(zzihqVar, "", zzihqVar2, obj2);
    }

    public static zzifs zza(zzihq zzihqVar, Object obj, zzihq zzihqVar2, Object obj2) {
        return new zzifs(zzihqVar, "", zzihqVar2, obj2);
    }

    static void zzb(zzidu zziduVar, zzifr zzifrVar, Object obj, Object obj2) throws IOException {
        zziee.zzf(zziduVar, zzifrVar.zza, 1, obj);
        zziee.zzf(zziduVar, zzifrVar.zzc, 2, obj2);
    }

    static int zzc(zzifr zzifrVar, Object obj, Object obj2) {
        return zziee.zzh(zzifrVar.zza, 1, obj) + zziee.zzh(zzifrVar.zzc, 2, obj2);
    }

    public final int zzd(int i, Object obj, Object obj2) {
        zzifr zzifrVar = this.zza;
        int iZzF = zzidu.zzF(i << 3);
        int iZzc = zzc(zzifrVar, obj, obj2);
        return iZzF + zzidu.zzF(iZzc) + iZzc;
    }

    final zzifr zze() {
        return this.zza;
    }
}
