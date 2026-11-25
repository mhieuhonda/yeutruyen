package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhwy {

    @Nullable
    private zzhxb zza = null;

    @Nullable
    private zzibl zzb = null;

    @Nullable
    private zzibl zzc = null;

    @Nullable
    private zzibl zzd = null;

    @Nullable
    private zzibl zze = null;

    @Nullable
    private zzibl zzf = null;

    @Nullable
    private zzibl zzg = null;

    private zzhwy() {
    }

    /* synthetic */ zzhwy(byte[] bArr) {
    }

    public final zzhwy zza(zzhxb zzhxbVar) {
        this.zza = zzhxbVar;
        return this;
    }

    public final zzhwy zzb(zzibl zziblVar, zzibl zziblVar2) {
        this.zzc = zziblVar;
        this.zzd = zziblVar2;
        return this;
    }

    public final zzhwy zzc(zzibl zziblVar) {
        this.zzb = zziblVar;
        return this;
    }

    public final zzhwy zzd(zzibl zziblVar, zzibl zziblVar2) {
        this.zze = zziblVar;
        this.zzf = zziblVar2;
        return this;
    }

    public final zzhwy zze(zzibl zziblVar) {
        this.zzg = zziblVar;
        return this;
    }

    public final zzhwz zzf() throws GeneralSecurityException {
        zzhxb zzhxbVar = this.zza;
        if (zzhxbVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigIntegerZzd = zzhxbVar.zzf().zzd();
        BigInteger bigIntegerZzd2 = this.zza.zzd();
        BigInteger bigIntegerZzb = this.zzc.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb2 = this.zzd.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb3 = this.zzb.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb4 = this.zze.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb5 = this.zzf.zzb(zzhdx.zza());
        BigInteger bigIntegerZzb6 = this.zzg.zzb(zzhdx.zza());
        if (!bigIntegerZzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigIntegerZzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigIntegerZzb.multiply(bigIntegerZzb2).equals(bigIntegerZzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigIntegerSubtract = bigIntegerZzb.subtract(BigInteger.ONE);
        BigInteger bigIntegerSubtract2 = bigIntegerZzb2.subtract(BigInteger.ONE);
        if (!bigIntegerZzd.multiply(bigIntegerZzb3).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb4).mod(bigIntegerSubtract).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigIntegerZzd.multiply(bigIntegerZzb5).mod(bigIntegerSubtract2).equals(BigInteger.ONE)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigIntegerZzb2.multiply(bigIntegerZzb6).mod(bigIntegerZzb).equals(BigInteger.ONE)) {
            return new zzhwz(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }
}
