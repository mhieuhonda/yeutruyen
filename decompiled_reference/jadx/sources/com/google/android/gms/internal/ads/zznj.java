package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznj {
    public static final zznj zza = new zznj(new zzni());
    public final zzgxd zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznj(zzni zzniVar) {
        this.zzb = zzniVar.zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznj)) {
            return false;
        }
        zznj zznjVar = (zznj) obj;
        if (!this.zzb.equals(zznjVar.zzb)) {
            return false;
        }
        boolean z = zznjVar.zzf;
        boolean z2 = zznjVar.zzi;
        Double d = zznjVar.zzc;
        if (!Objects.equals(null, null)) {
            return false;
        }
        Double d2 = zznjVar.zzd;
        if (!Objects.equals(null, null)) {
            return false;
        }
        boolean z3 = zznjVar.zze;
        boolean z4 = zznjVar.zzg;
        boolean z5 = zznjVar.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, true, true, true, true, true);
    }
}
