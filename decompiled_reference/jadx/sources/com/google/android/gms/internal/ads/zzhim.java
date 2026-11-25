package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhim {
    private static final zzhma zza = zzhil.zza;
    private static final zzhns zzb = zzhns.zzd(zzhik.zza, zzhij.class, zzhdr.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzhkr.zza;
        zzhkr.zza(zzhne.zza());
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzhii.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhii.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhii.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhii.zzj);
        zzhnaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhnb.zza().zzb(zzb);
        zzhmv.zza().zzb(zza, zzhio.class);
    }
}
