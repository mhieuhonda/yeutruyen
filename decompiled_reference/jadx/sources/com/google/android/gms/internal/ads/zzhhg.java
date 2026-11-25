package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhhg {
    public static final /* synthetic */ int zza = 0;
    private static final zzhea zzb = zzhmj.zze("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzhdr.class, zzhta.SYMMETRIC, zzhtu.zze());
    private static final zzhma zzc = zzhhf.zza;
    private static final zzhns zzd = zzhns.zzd(zzhhe.zza, zzhhp.class, zzhdr.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        int i = zzhhy.zza;
        zzhhy.zza(zzhne.zza());
        zzhmv.zza().zzb(zzc, zzhht.class);
        zzhnb.zza().zzb(zzd);
        zzhmb.zza().zzb(zzb, true);
    }
}
