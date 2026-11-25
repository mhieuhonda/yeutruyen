package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgwc extends zzgyn implements Serializable {
    final Comparator zza;

    zzgwc(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgyn, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgwc) {
            return this.zza.equals(((zzgwc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
