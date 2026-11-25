package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhff {
    private static final zzhdw zza = new zzhfe();

    public static zzhdw zza() throws GeneralSecurityException {
        if (zzhlf.zza()) {
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        }
        return zza;
    }
}
