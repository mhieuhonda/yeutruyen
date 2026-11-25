package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzham implements Serializable {
    private static final zzham zza = new zzham(new int[0], 0, 0);
    private final int[] zzb;
    private final int zzc;

    private zzham(int[] iArr, int i, int i2) {
        this.zzb = iArr;
        this.zzc = i2;
    }

    /* synthetic */ zzham(int[] iArr, int i, int i2, byte[] bArr) {
        this(iArr, 0, i2);
    }

    public static zzham zza() {
        return zza;
    }

    public static zzham zzb(int i, int i2, int i3) {
        return new zzham(new int[]{0, 2, 1}, 0, 3);
    }

    public static zzham zzc(int i, int i2, int i3, int i4, int i5) {
        return new zzham(new int[]{0, 2, 1, 3, 4}, 0, 5);
    }

    public static zzham zzd(int i, int i2, int i3, int i4, int i5, int i6) {
        return new zzham(new int[]{0, 2, 1, 5, 3, 4}, 0, 6);
    }

    public static zzham zze(int i, int... iArr) {
        int length = iArr.length;
        int i2 = length + 1;
        int[] iArr2 = new int[i2];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, length);
        return new zzham(iArr2, 0, i2);
    }

    public static zzham zzf(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        return new zzham(iArrCopyOf, 0, iArrCopyOf.length);
    }

    public static zzhal zzg(int i) {
        zzgtr.zzd(i >= 0, "Invalid initialCapacity: %s", i);
        return new zzhal(i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzham)) {
            return false;
        }
        zzham zzhamVar = (zzham) obj;
        int i = this.zzc;
        if (i != zzhamVar.zzc) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (zzi(i2) != zzhamVar.zzi(i2)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.zzc; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.zzb[i]);
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
        int[] iArr = this.zzb;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }

    public final int zzh() {
        return this.zzc;
    }

    public final int zzi(int i) {
        zzgtr.zzm(i, this.zzc, "index");
        return this.zzb[i];
    }
}
