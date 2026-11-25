package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahe {
    public static final zzahe zza = new zzahe(0, 0);
    public final long zzb;
    public final long zzc;

    public zzahe(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (this.zzb == zzaheVar.zzb && this.zzc == zzaheVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        int length = String.valueOf(j).length();
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
