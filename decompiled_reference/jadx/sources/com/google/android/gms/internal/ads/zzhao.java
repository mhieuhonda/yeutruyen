package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhao implements Serializable {
    private static final zzhao zza = new zzhao(new long[0], 0, 0);
    private final long[] zzb;
    private final int zzc;

    private zzhao(long[] jArr, int i, int i2) {
        this.zzb = jArr;
        this.zzc = i2;
    }

    /* synthetic */ zzhao(long[] jArr, int i, int i2, byte[] bArr) {
        this(jArr, 0, i2);
    }

    public static zzhan zza(int i) {
        return new zzhan(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzhao)) {
            return false;
        }
        zzhao zzhaoVar = (zzhao) obj;
        int i = this.zzc;
        if (i != zzhaoVar.zzc) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (zzc(i2) != zzhaoVar.zzc(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.zzc; i++) {
            iHashCode = (iHashCode * 31) + Long.hashCode(this.zzb[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.zzc;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        long[] jArr = this.zzb;
        sb.append(jArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(jArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final long zzc(int i) {
        zzgtr.zzm(i, this.zzc, "index");
        return this.zzb[i];
    }
}
