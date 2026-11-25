package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgk extends zzhfh {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzhgj zzd;

    /* synthetic */ zzhgk(int i, int i2, int i3, zzhgj zzhgjVar, byte[] bArr) {
        this.zza = i;
        this.zzd = zzhgjVar;
    }

    public static zzhgi zzb() {
        return new zzhgi(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgk)) {
            return false;
        }
        zzhgk zzhgkVar = (zzhgk) obj;
        if (zzhgkVar.zza == this.zza) {
            int i = zzhgkVar.zzb;
            int i2 = zzhgkVar.zzc;
            if (zzhgkVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzhgk.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzd);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhgj.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzhgj zzd() {
        return this.zzd;
    }
}
