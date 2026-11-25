package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzgtp implements Serializable {
    zzgtp() {
    }

    public static zzgtp zzc() {
        return zzgsx.zza;
    }

    public static zzgtp zzd(Object obj) {
        return obj == null ? zzgsx.zza : new zzgtw(obj);
    }

    public abstract Object zza(Object obj);

    public abstract zzgtp zzb(zzgti zzgtiVar);
}
