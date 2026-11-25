package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzaja implements zzaiz {
    private final long zza;
    private final long zzb;
    private final boolean zzc;
    private final zzx zzd;

    public zzaja(long j, long j2, boolean z, zzx zzxVar) {
        boolean z2 = true;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        }
        zzgtr.zza(z2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = zzxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaja zzajaVar = (zzaja) obj;
            if (this.zza == zzajaVar.zza && this.zzb == zzajaVar.zzb && this.zzc == zzajaVar.zzc && Objects.equals(this.zzd, zzajaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((Long.hashCode(this.zza) + 527) * 31) + Long.hashCode(this.zzb);
        zzx zzxVar = this.zzd;
        return (((iHashCode * 31) + (this.zzc ? 1 : 0)) * 31) + (zzxVar != null ? zzxVar.hashCode() : 0);
    }

    public final String toString() {
        String string;
        long j = this.zza;
        Object objValueOf = j == -9223372036854775807L ? "UNSET" : Long.valueOf(j);
        long j2 = this.zzb;
        String string2 = objValueOf.toString();
        if (j2 == -9223372036854775807L) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(String.valueOf(j2).length() + 12);
            sb.append(", endTimeMs=");
            sb.append(j2);
            string = sb.toString();
        }
        boolean z = this.zzc;
        zzx zzxVar = this.zzd;
        String strConcat = zzxVar == null ? "" : ", title=".concat(zzxVar.toString());
        String str = true == z ? ", hidden" : "";
        StringBuilder sb2 = new StringBuilder(string2.length() + 21 + string.length() + str.length() + strConcat.length());
        sb2.append("Chapter: startTimeMs=");
        sb2.append(string2);
        sb2.append(string);
        sb2.append(str);
        sb2.append(strConcat);
        return sb2.toString();
    }
}
