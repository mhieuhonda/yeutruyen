package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzrg {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd = false;
    public final int zze;
    public final zzd zzf;
    public final int zzg;
    public final int zzh;

    /* synthetic */ zzrg(zzrf zzrfVar, byte[] bArr) {
        this.zza = zzrfVar.zzi();
        this.zzb = zzrfVar.zzj();
        this.zzc = zzrfVar.zzk();
        this.zze = zzrfVar.zzl();
        this.zzf = zzrfVar.zzm();
        this.zzg = zzrfVar.zzn();
        this.zzh = zzrfVar.zzo();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzrg zzrgVar = (zzrg) obj;
            if (this.zza == zzrgVar.zza && this.zzb == zzrgVar.zzb && this.zzc == zzrgVar.zzc && this.zze == zzrgVar.zze && this.zzg == zzrgVar.zzg && this.zzh == zzrgVar.zzh && this.zzf.equals(zzrgVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), false, false, Integer.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), Integer.valueOf(this.zzh), false, false);
    }
}
