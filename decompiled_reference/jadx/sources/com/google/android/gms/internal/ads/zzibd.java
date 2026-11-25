package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzibd implements zzheu {
    /* synthetic */ zzibd(RSAPrivateCrtKey rSAPrivateCrtKey, zziat zziatVar, zziat zziatVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (zzhlf.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.zzb(zziatVar);
        if (!zziatVar.equals(zziatVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzibi.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzibi.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzheu
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
