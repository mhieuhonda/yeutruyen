package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhhc {
    public static final /* synthetic */ int zza = 0;
    private static final zzhns zzb = zzhns.zzd(zzhhb.zza, zzhhh.class, zzhdr.class);
    private static final zzhea zzc = zzhmj.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhdr.class, zzhta.REMOTE, zzhtq.zze());
    private static final zzhma zzd = zzhha.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzhho.zza;
        zzhho.zza(zzhne.zza());
        zzhnb.zza().zzb(zzb);
        zzhmv.zza().zzb(zzd, zzhhj.class);
        zzhmb.zza().zzb(zzc, true);
    }
}
