package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzidz {
    static final zzidz zza = new zzidz(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzidz zzd = null;
    private static volatile int zzf = 1;
    private final Map zze;

    zzidz() {
        this.zze = new HashMap();
    }

    static boolean zza() {
        return false;
    }

    public static zzidz zzb() {
        int i = zzicy.zza;
        return zza;
    }

    public static zzidz zzc() {
        zzidz zzidzVar = zzd;
        if (zzidzVar != null) {
            return zzidzVar;
        }
        synchronized (zzidz.class) {
            zzidz zzidzVar2 = zzd;
            if (zzidzVar2 != null) {
                return zzidzVar2;
            }
            int i = zzicy.zza;
            zzidz zzidzVarZzb = zzieh.zzb(zzidz.class);
            zzd = zzidzVarZzb;
            return zzidzVarZzb;
        }
    }

    public final zzien zzd(zzifz zzifzVar, int i) {
        return (zzien) this.zze.get(new zzidy(zzifzVar, i));
    }

    zzidz(boolean z) {
        this.zze = Collections.emptyMap();
    }
}
