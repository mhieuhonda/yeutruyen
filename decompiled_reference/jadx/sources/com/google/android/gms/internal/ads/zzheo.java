package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzheo {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhen zza(String str) throws GeneralSecurityException {
        for (zzhen zzhenVar : zza) {
            if (zzhenVar.zza()) {
                return zzhenVar;
            }
        }
        String.valueOf(str);
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
