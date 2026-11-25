package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhmp implements zzhds {
    private final Map zza;

    static {
        new zzhmo().zza();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhmp) {
            return this.zza.equals(((zzhmp) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final boolean zza() {
        return this.zza.isEmpty();
    }
}
