package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhwx extends zzhxt {
    public static final BigInteger zza = BigInteger.valueOf(65537);
    private final int zzb;
    private final BigInteger zzc;
    private final zzhww zzd;
    private final zzhwv zze;

    /* synthetic */ zzhwx(int i, BigInteger bigInteger, zzhww zzhwwVar, zzhwv zzhwvVar, byte[] bArr) {
        this.zzb = i;
        this.zzc = bigInteger;
        this.zzd = zzhwwVar;
        this.zze = zzhwvVar;
    }

    public static zzhwu zzb() {
        return new zzhwu(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhwx)) {
            return false;
        }
        zzhwx zzhwxVar = (zzhwx) obj;
        return zzhwxVar.zzb == this.zzb && Objects.equals(zzhwxVar.zzc, this.zzc) && zzhwxVar.zzd == this.zzd && zzhwxVar.zze == this.zze;
    }

    public final int hashCode() {
        return Objects.hash(zzhwx.class, Integer.valueOf(this.zzb), this.zzc, this.zzd, this.zze);
    }

    public final String toString() {
        BigInteger bigInteger = this.zzc;
        zzhwv zzhwvVar = this.zze;
        String strValueOf = String.valueOf(this.zzd);
        String strValueOf2 = String.valueOf(zzhwvVar);
        String strValueOf3 = String.valueOf(bigInteger);
        int length = String.valueOf(strValueOf).length();
        int length2 = String.valueOf(strValueOf2).length();
        int length3 = String.valueOf(strValueOf3).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        sb.append("RSA SSA PKCS1 Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", hashType: ");
        sb.append(strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzheq
    public final boolean zza() {
        return this.zzd != zzhww.zzd;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final BigInteger zzd() {
        return this.zzc;
    }

    public final zzhww zze() {
        return this.zzd;
    }

    public final zzhwv zzf() {
        return this.zze;
    }
}
