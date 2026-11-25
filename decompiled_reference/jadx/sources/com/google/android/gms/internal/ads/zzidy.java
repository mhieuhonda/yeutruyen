package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzidy {
    private final Object zza;
    private final int zzb;

    zzidy(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzidy)) {
            return false;
        }
        zzidy zzidyVar = (zzidy) obj;
        return this.zza == zzidyVar.zza && this.zzb == zzidyVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
