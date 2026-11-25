package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzblp {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static zzbln zza() {
        return (zzbln) zza.get();
    }

    static zzblo zzb() {
        return (zzblo) zzb.get();
    }

    public static void zzc(zzbln zzblnVar) {
        zza.set(zzblnVar);
    }
}
