package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhxs {
    static {
        int i = zzhtz.zza;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhwr.zzc();
        zzhwt.zzc();
        zzhvn.zza(true);
        zzhxf.zza(true);
        zzhxr.zza(true);
        if (zzhlf.zza()) {
            return;
        }
        zzhvv.zza(true);
    }
}
