package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzqu {
    public static final zzqu zza = new zzqt().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    /* synthetic */ zzqu(zzqt zzqtVar, byte[] bArr) {
        this.zzb = zzqtVar.zze();
        this.zzc = zzqtVar.zzf();
        this.zzd = zzqtVar.zzg();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzqu zzquVar = (zzqu) obj;
            if (this.zzb == zzquVar.zzb && this.zzc == zzquVar.zzc && this.zzd == zzquVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.zzd ? 1 : 0);
    }
}
