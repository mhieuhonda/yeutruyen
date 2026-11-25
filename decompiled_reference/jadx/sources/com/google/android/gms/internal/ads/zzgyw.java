package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgyw extends zzgyn implements Serializable {
    final zzgyn zza;

    zzgyw(zzgyn zzgynVar) {
        this.zza = zzgynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyn, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgyw) {
            return this.zza.equals(((zzgyw) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
