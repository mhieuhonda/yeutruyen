package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgt extends zzhfh {
    private final int zza;
    private final zzhgs zzb;

    /* synthetic */ zzhgt(int i, zzhgs zzhgsVar, byte[] bArr) {
        this.zza = i;
        this.zzb = zzhgsVar;
    }

    public static zzhgr zzb() {
        return new zzhgr(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgt)) {
            return false;
        }
        zzhgt zzhgtVar = (zzhgt) obj;
        return zzhgtVar.zza == this.zza && zzhgtVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzhgt.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        int length = String.valueOf(strValueOf).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzb != zzhgs.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhgs zzd() {
        return this.zzb;
    }
}
