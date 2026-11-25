package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzajz {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzajz(long j, long j2, int i) {
        zzgtr.zza(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajz zzajzVar = (zzajz) obj;
            if (this.zza == zzajzVar.zza && this.zzb == zzajzVar.zzb && this.zzc == zzajzVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc)};
        String str = zzfm.zza;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
