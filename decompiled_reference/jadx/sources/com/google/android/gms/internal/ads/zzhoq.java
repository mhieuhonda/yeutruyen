package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhoq {
    private static final zzhma zza = zzhop.zza;
    private static final zzhns zzb = zzhns.zzd(zzhon.zza, zzhom.class, zzhou.class);
    private static final zzhns zzc = zzhns.zzd(zzhoo.zza, zzhom.class, zzhep.class);
    private static final zzhea zzd = zzhmj.zze("type.googleapis.com/google.crypto.tink.AesCmacKey", zzhep.class, zzhta.SYMMETRIC, zzhqv.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        int i = zzhpw.zza;
        zzhpw.zza(zzhne.zza());
        zzhmv.zza().zzb(zza, zzhot.class);
        zzhnb.zza().zzb(zzb);
        zzhnb.zza().zzb(zzc);
        zzhna zzhnaVarZza = zzhna.zza();
        HashMap map = new HashMap();
        zzhot zzhotVar = zzhpr.zzc;
        map.put("AES_CMAC", zzhotVar);
        map.put("AES256_CMAC", zzhotVar);
        zzhor zzhorVar = new zzhor(null);
        zzhorVar.zza(32);
        zzhorVar.zzb(16);
        zzhorVar.zzc(zzhos.zzd);
        map.put("AES256_CMAC_RAW", zzhorVar.zzd());
        zzhnaVarZza.zzd(Collections.unmodifiableMap(map));
        zzhmb.zza().zzb(zzd, true);
    }

    static /* synthetic */ zzhom zzb(zzhot zzhotVar, Integer num) throws GeneralSecurityException {
        zze(zzhotVar);
        zzhol zzholVar = new zzhol(null);
        zzholVar.zza(zzhotVar);
        zzholVar.zzb(zzibm.zzb(zzhotVar.zzc()));
        zzholVar.zzc(num);
        return zzholVar.zzd();
    }

    static /* synthetic */ zzhou zzc(zzhom zzhomVar) throws GeneralSecurityException {
        zze(zzhomVar.zzf());
        return zzhpz.zza(zzhomVar);
    }

    static /* synthetic */ zzhep zzd(zzhom zzhomVar) throws GeneralSecurityException {
        zze(zzhomVar.zzf());
        return zziba.zza(zzhomVar);
    }

    private static void zze(zzhot zzhotVar) throws GeneralSecurityException {
        if (zzhotVar.zzc() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
