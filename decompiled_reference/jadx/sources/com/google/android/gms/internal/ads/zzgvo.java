package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgvo extends zzgyn implements Serializable {
    final zzgti zza;
    final zzgyn zzb;

    zzgvo(zzgti zzgtiVar, zzgyn zzgynVar) {
        this.zza = zzgtiVar;
        this.zzb = zzgynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyn, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzgti zzgtiVar = this.zza;
        return this.zzb.compare(zzgtiVar.apply(obj), zzgtiVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgvo) {
            zzgvo zzgvoVar = (zzgvo) obj;
            if (this.zza.equals(zzgvoVar.zza) && this.zzb.equals(zzgvoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        StringBuilder sb = new StringBuilder(length + 12 + string2.length() + 1);
        sb.append(string);
        sb.append(".onResultOf(");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}
