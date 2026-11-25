package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziaf implements zzhdr {
    private final zziav zza;
    private final zzhep zzb;
    private final int zzc;
    private final byte[] zzd;

    private zziaf(zziav zziavVar, zzhep zzhepVar, int i, byte[] bArr) {
        this.zza = zziavVar;
        this.zzb = zzhepVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzhdr zzb(zzhfl zzhflVar) throws GeneralSecurityException {
        zzhzp zzhzpVar = new zzhzp(zzhflVar.zze().zzc(zzhdx.zza()), zzhflVar.zzg().zzf());
        String strValueOf = String.valueOf(zzhflVar.zzg().zzh());
        String.valueOf(strValueOf);
        String strValueOf2 = String.valueOf(strValueOf);
        return new zziaf(zzhzpVar, new zziba(new zziaz("HMAC".concat(strValueOf2), new SecretKeySpec(zzhflVar.zzf().zzc(zzhdx.zza()), "HMAC")), zzhflVar.zzg().zze()), zzhflVar.zzg().zze(), zzhflVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int length = bArr.length;
        int i = this.zzc;
        int length2 = bArr3.length;
        if (length < i + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhok.zze(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i2 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((zziba) this.zzb).zzc(zzhzw.zza(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
