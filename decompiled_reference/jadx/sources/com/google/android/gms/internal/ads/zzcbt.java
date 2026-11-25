package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcbt extends zzcbv {
    private final String zza;
    private final int zzb;

    public zzcbt(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcbt)) {
            return false;
        }
        zzcbt zzcbtVar = (zzcbt) obj;
        if (Objects.equal(this.zza, zzcbtVar.zza)) {
            if (Objects.equal(Integer.valueOf(this.zzb), Integer.valueOf(zzcbtVar.zzb))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcbw
    public final int zzc() {
        return this.zzb;
    }
}
