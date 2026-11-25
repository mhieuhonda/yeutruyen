package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzibh {
    public static String zza(zziat zziatVar) throws GeneralSecurityException {
        zzibi.zzb(zziatVar);
        return zziatVar.toString().concat("withECDSA");
    }

    public static String zzb(zziat zziatVar) throws GeneralSecurityException {
        int iOrdinal = zziatVar.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zziatVar.toString()));
    }
}
