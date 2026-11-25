package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgum {
    public static zzguj zza(zzguj zzgujVar) {
        if ((zzgujVar instanceof zzgul) || (zzgujVar instanceof zzguk)) {
            return zzgujVar;
        }
        return zzgujVar instanceof Serializable ? new zzguk(zzgujVar) : new zzgul(zzgujVar);
    }
}
