package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzzt {
    public final long zza;
    public final long zzb;

    public zzzt(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzt)) {
            return false;
        }
        zzzt zzztVar = (zzzt) obj;
        return this.zza == zzztVar.zza && this.zzb == zzztVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
