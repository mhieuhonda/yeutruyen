package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhpy implements zzhou {
    private zzhpy(zzhom zzhomVar, Provider provider) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhomVar.zze().zzc();
            zzhomVar.zzf();
            new SecretKeySpec(zzhomVar.zzd().zzc(zzhdx.zza()), "AES");
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }

    public static zzhou zza(zzhom zzhomVar, Provider provider) throws GeneralSecurityException {
        return new zzhpy(zzhomVar, provider);
    }
}
