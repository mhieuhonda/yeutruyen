package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzifu {
    zzifu() {
    }

    public static final boolean zza(Object obj) {
        return !((zzift) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzift zziftVarZzc = (zzift) obj;
        zzift zziftVar = (zzift) obj2;
        if (!zziftVar.isEmpty()) {
            if (!zziftVarZzc.zze()) {
                zziftVarZzc = zziftVarZzc.zzc();
            }
            zziftVarZzc.zzb(zziftVar);
        }
        return zziftVarZzc;
    }
}
