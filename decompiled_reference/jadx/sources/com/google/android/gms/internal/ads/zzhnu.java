package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhnu {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhnu(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhnu)) {
            return false;
        }
        zzhnu zzhnuVar = (zzhnu) obj;
        return zzhnuVar.zza.equals(this.zza) && zzhnuVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        Class cls = this.zzb;
        String simpleName = this.zza.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 22 + String.valueOf(simpleName2).length());
        sb.append(simpleName);
        sb.append(" with primitive type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
