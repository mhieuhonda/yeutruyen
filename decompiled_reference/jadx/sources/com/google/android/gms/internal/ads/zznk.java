package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zznk {
    public static final zznk zza;
    public static final zznk zzb;
    public static final zznk zzc;
    public final long zzd;
    public final long zze = 0;

    static {
        zznk zznkVar = new zznk(0L, 0L);
        zza = zznkVar;
        zzb = new zznk(Long.MAX_VALUE, 0L);
        zzc = zznkVar;
    }

    public zznk(long j, long j2) {
        this.zzd = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.zzd == ((zznk) obj).zzd;
    }

    public final int hashCode() {
        return ((int) this.zzd) * 31;
    }
}
