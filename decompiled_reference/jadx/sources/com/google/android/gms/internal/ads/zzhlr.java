package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhlr {
    static final long[] zza;
    static final long[] zzb;
    static final long[] zzc;
    static final zzhlk[][] zzd;
    static final zzhlk[] zze;
    private static final BigInteger zzf;
    private static final BigInteger zzg;
    private static final BigInteger zzh;
    private static final BigInteger zzi;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        zzf = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzg = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        zzh = bigIntegerMod2;
        BigInteger bigIntegerModPow = BigInteger.valueOf(2L).modPow(bigIntegerSubtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzi = bigIntegerModPow;
        zzhlq zzhlqVar = new zzhlq(null);
        zzhlqVar.zzd(BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract));
        BigInteger bigIntegerZzc = zzhlqVar.zzc();
        BigInteger bigIntegerMultiply = bigIntegerZzc.pow(2).subtract(BigInteger.ONE).multiply(bigIntegerMod.multiply(bigIntegerZzc.pow(2)).add(BigInteger.ONE).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhlqVar.zzb(bigIntegerModPow2);
        zza = zzhlw.zzg(zzb(bigIntegerMod));
        zzb = zzhlw.zzg(zzb(bigIntegerMod2));
        zzc = zzhlw.zzg(zzb(bigIntegerModPow));
        zzd = (zzhlk[][]) Array.newInstance((Class<?>) zzhlk.class, 32, 8);
        zzhlq zzhlqVarZza = zzhlqVar;
        for (int i = 0; i < 32; i++) {
            zzhlq zzhlqVarZza2 = zzhlqVarZza;
            for (int i2 = 0; i2 < 8; i2++) {
                zzd[i][i2] = zzc(zzhlqVarZza2);
                zzhlqVarZza2 = zza(zzhlqVarZza2, zzhlqVarZza);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                zzhlqVarZza = zza(zzhlqVarZza, zzhlqVarZza);
            }
        }
        zzhlq zzhlqVarZza3 = zza(zzhlqVar, zzhlqVar);
        zze = new zzhlk[8];
        for (int i4 = 0; i4 < 8; i4++) {
            zze[i4] = zzc(zzhlqVar);
            zzhlqVar = zza(zzhlqVar, zzhlqVarZza3);
        }
    }

    private static zzhlq zza(zzhlq zzhlqVar, zzhlq zzhlqVar2) {
        zzhlq zzhlqVar3 = new zzhlq(null);
        BigInteger bigIntegerMultiply = zzg.multiply(zzhlqVar.zza().multiply(zzhlqVar2.zza()).multiply(zzhlqVar.zzc()).multiply(zzhlqVar2.zzc()));
        BigInteger bigInteger = zzf;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        zzhlqVar3.zzb(zzhlqVar.zza().multiply(zzhlqVar2.zzc()).add(zzhlqVar2.zza().multiply(zzhlqVar.zzc())).multiply(BigInteger.ONE.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        zzhlqVar3.zzd(zzhlqVar.zzc().multiply(zzhlqVar2.zzc()).add(zzhlqVar.zza().multiply(zzhlqVar2.zza())).multiply(BigInteger.ONE.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger));
        return zzhlqVar3;
    }

    private static byte[] zzb(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = 31 - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }

    private static zzhlk zzc(zzhlq zzhlqVar) {
        BigInteger bigIntegerAdd = zzhlqVar.zzc().add(zzhlqVar.zza());
        BigInteger bigInteger = zzf;
        return new zzhlk(zzhlw.zzg(zzb(bigIntegerAdd.mod(bigInteger))), zzhlw.zzg(zzb(zzhlqVar.zzc().subtract(zzhlqVar.zza()).mod(bigInteger))), zzhlw.zzg(zzb(zzh.multiply(zzhlqVar.zza()).multiply(zzhlqVar.zzc()).mod(bigInteger))));
    }
}
