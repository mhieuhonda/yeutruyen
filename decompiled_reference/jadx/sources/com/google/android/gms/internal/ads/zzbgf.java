package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbgf {
    final long zza;
    final String zzb;
    final int zzc;

    zzbgf(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgf)) {
            return false;
        }
        zzbgf zzbgfVar = (zzbgf) obj;
        return zzbgfVar.zza == this.zza && zzbgfVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
