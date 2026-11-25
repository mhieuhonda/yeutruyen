package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzyp {
    public final int zza;
    public final boolean zzb;

    public zzyp(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzyp zzypVar = (zzyp) obj;
            if (this.zza == zzypVar.zza && this.zzb == zzypVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
