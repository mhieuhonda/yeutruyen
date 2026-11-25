package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznp {
    public final long zza;
    public final zzbf zzb;
    public final int zzc;
    public final zzxl zzd;
    public final long zze;
    public final zzbf zzf;
    public final int zzg;
    public final zzxl zzh;
    public final long zzi;
    public final long zzj;

    public zznp(long j, zzbf zzbfVar, int i, zzxl zzxlVar, long j2, zzbf zzbfVar2, int i2, zzxl zzxlVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzbfVar;
        this.zzc = i;
        this.zzd = zzxlVar;
        this.zze = j2;
        this.zzf = zzbfVar2;
        this.zzg = i2;
        this.zzh = zzxlVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zznp zznpVar = (zznp) obj;
            if (this.zza == zznpVar.zza && this.zzc == zznpVar.zzc && this.zze == zznpVar.zze && this.zzg == zznpVar.zzg && this.zzi == zznpVar.zzi && this.zzj == zznpVar.zzj && Objects.equals(this.zzb, zznpVar.zzb) && Objects.equals(this.zzd, zznpVar.zzd) && Objects.equals(this.zzf, zznpVar.zzf) && Objects.equals(this.zzh, zznpVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj));
    }
}
