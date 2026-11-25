package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhjm {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhjl.zza, zzhgk.class, zzhoa.class);
        zzd = zzhni.zzd(zzhji.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhjj.zza, zzhgd.class, zzhnz.class);
        zzf = zzhme.zzd(zzhjk.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    static /* synthetic */ zzhoa zzb(zzhgk zzhgkVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzhrs zzhrsVarZzd = zzhrt.zzd();
        zzhrsVarZzd.zza(zzhgkVar.zzc());
        zzhtdVarZze.zzb(((zzhrt) zzhrsVarZzd.zzbu()).zzaM());
        zzhtdVarZze.zzc(zzf(zzhgkVar.zzd()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    static /* synthetic */ zzhgk zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            String strZza = zzhoaVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            zzhrt zzhrtVarZzc = zzhrt.zzc(zzhoaVar.zzc().zzb(), zzidz.zzb());
            if (zzhrtVarZzc.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            zzhgi zzhgiVarZzb = zzhgk.zzb();
            zzhgiVarZzb.zza(zzhrtVarZzc.zza());
            zzhgiVarZzb.zzb(12);
            zzhgiVarZzb.zzc(16);
            zzhgiVarZzb.zzd(zzg(zzhoaVar.zzc().zzc()));
            return zzhgiVarZzb.zze();
        } catch (zzifh e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    static /* synthetic */ zzhnz zzd(zzhgd zzhgdVar, zzhey zzheyVar) {
        zzhrq zzhrqVarZzd = zzhrr.zzd();
        byte[] bArrZzc = zzhgdVar.zze().zzc(zzheyVar);
        zzhrqVarZzd.zza(zzidl.zzt(bArrZzc, 0, bArrZzc.length));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzhrr) zzhrqVarZzd.zzbu()).zzaM(), zzhta.SYMMETRIC, zzf(zzhgdVar.zzf().zzd()), zzhgdVar.zzb());
    }

    static /* synthetic */ zzhgd zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzhrr zzhrrVarZzc = zzhrr.zzc(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhrrVarZzc.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            zzhgi zzhgiVarZzb = zzhgk.zzb();
            zzhgiVarZzb.zza(zzhrrVarZzc.zzb().zzb());
            zzhgiVarZzb.zzb(12);
            zzhgiVarZzb.zzc(16);
            zzhgiVarZzb.zzd(zzg(zzhnzVar.zzd()));
            zzhgk zzhgkVarZze = zzhgiVarZzb.zze();
            zzhgc zzhgcVarZzd = zzhgd.zzd();
            zzhgcVarZzd.zza(zzhgkVarZze);
            zzhgcVarZzd.zzb(zzibm.zza(zzhrrVarZzc.zzb().zzA(), zzheyVar));
            zzhgcVarZzd.zzc(zzhnzVar.zze());
            return zzhgcVarZzd.zzd();
        } catch (zzifh unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzhtx zzf(zzhgj zzhgjVar) throws GeneralSecurityException {
        if (zzhgj.zza.equals(zzhgjVar)) {
            return zzhtx.TINK;
        }
        if (zzhgj.zzb.equals(zzhgjVar)) {
            return zzhtx.CRUNCHY;
        }
        if (zzhgj.zzc.equals(zzhgjVar)) {
            return zzhtx.RAW;
        }
        String strValueOf = String.valueOf(zzhgjVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhgj zzg(zzhtx zzhtxVar) throws GeneralSecurityException {
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            return zzhgj.zza;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return zzhgj.zzc;
            }
            if (iOrdinal != 4) {
                int iZza = zzhtxVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzhgj.zzb;
    }
}
