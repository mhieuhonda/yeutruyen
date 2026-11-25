package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhft extends zzhfh {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhfs zze;
    private final zzhfr zzf;

    /* synthetic */ zzhft(int i, int i2, int i3, int i4, zzhfs zzhfsVar, zzhfr zzhfrVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzhfsVar;
        this.zzf = zzhfrVar;
    }

    public static zzhfq zzb() {
        return new zzhfq(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhft)) {
            return false;
        }
        zzhft zzhftVar = (zzhft) obj;
        return zzhftVar.zza == this.zza && zzhftVar.zzb == this.zzb && zzhftVar.zzc == this.zzc && zzhftVar.zzd == this.zzd && zzhftVar.zze == this.zze && zzhftVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzhft.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        zzhfr zzhfrVar = this.zzf;
        String strValueOf = String.valueOf(this.zze);
        String strValueOf2 = String.valueOf(zzhfrVar);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        int i2 = this.zzd;
        int length4 = String.valueOf(i2).length();
        int i3 = this.zza;
        int length5 = String.valueOf(i3).length();
        int i4 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, and ");
        sb.append(i2);
        sb.append("-byte tags, and ");
        sb.append(i3);
        sb.append("-byte AES key, and ");
        sb.append(i4);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zze != zzhfs.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhfs zzg() {
        return this.zze;
    }

    public final zzhfr zzh() {
        return this.zzf;
    }
}
