package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzmf {
    public final zzxl zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzmf(zzxl zzxlVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzgtr.zza(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzgtr.zza(z5);
        this.zza = zzxlVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzmf zzmfVar = (zzmf) obj;
            if (this.zzb == zzmfVar.zzb && this.zzd == zzmfVar.zzd && this.zze == zzmfVar.zze && this.zzg == zzmfVar.zzg && this.zzh == zzmfVar.zzh && this.zzi == zzmfVar.zzi && Objects.equals(this.zza, zzmfVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + 527;
        long j = this.zze;
        return (((((((((((iHashCode * 31) + ((int) this.zzb)) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzmf zza(long j, long j2) {
        return (j == this.zzb && j2 == this.zzc) ? this : new zzmf(this.zza, j, j2, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzmf zzb(long j) {
        return j == this.zzd ? this : new zzmf(this.zza, this.zzb, this.zzc, j, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
