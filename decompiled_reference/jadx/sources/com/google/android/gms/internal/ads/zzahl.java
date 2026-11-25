package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzahl {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzahl(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzahl zzahlVar = (zzahl) obj;
            if (this.zza == zzahlVar.zza && this.zzc == zzahlVar.zzc && this.zzd == zzahlVar.zzd && Arrays.equals(this.zzb, zzahlVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
