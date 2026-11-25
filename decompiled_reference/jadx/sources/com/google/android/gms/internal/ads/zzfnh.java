package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfnh implements zzfnf {
    private final String zza;

    public zzfnh(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfnf
    public final boolean equals(Object obj) {
        if (obj instanceof zzfnh) {
            return this.zza.equals(((zzfnh) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnf
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
