package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhof {
    private final Class zza;
    private final zzibk zzb;

    /* synthetic */ zzhof(Class cls, zzibk zzibkVar, byte[] bArr) {
        this.zza = cls;
        this.zzb = zzibkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhof)) {
            return false;
        }
        zzhof zzhofVar = (zzhof) obj;
        return zzhofVar.zza.equals(this.zza) && zzhofVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        zzibk zzibkVar = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String strValueOf = String.valueOf(zzibkVar);
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 21 + String.valueOf(strValueOf).length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(strValueOf);
        return sb.toString();
    }
}
