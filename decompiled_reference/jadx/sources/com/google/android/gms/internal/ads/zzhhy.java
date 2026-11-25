package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhhy {
    public static final /* synthetic */ int zza = 0;
    private static final zzibk zzb;
    private static final zzhnl zzc;
    private static final zzhni zzd;
    private static final zzhmh zze;
    private static final zzhme zzf;

    static {
        zzibk zzibkVarZza = zzhok.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzibkVarZza;
        zzc = zzhnl.zzd(zzhhx.zza, zzhht.class, zzhoa.class);
        zzd = zzhni.zzd(zzhhu.zza, zzibkVarZza, zzhoa.class);
        zze = zzhmh.zzd(zzhhv.zza, zzhhp.class, zzhnz.class);
        zzf = zzhme.zzd(zzhhw.zza, zzibkVarZza, zzhnz.class);
    }

    public static void zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhneVar.zzd(zzc);
        zzhneVar.zze(zzd);
        zzhneVar.zzb(zze);
        zzhneVar.zzc(zzf);
    }

    static /* synthetic */ zzhoa zzb(zzhht zzhhtVar) {
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzhtdVarZze.zzb(zzg(zzhhtVar).zzaM());
        zzhtdVarZze.zzc(zzf(zzhhtVar.zzc()));
        return zzhoa.zza((zzhte) zzhtdVarZze.zzbu());
    }

    static /* synthetic */ zzhht zzc(zzhoa zzhoaVar) throws GeneralSecurityException {
        if (!zzhoaVar.zzc().zza().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            String strZza = zzhoaVar.zzc().zza();
            String.valueOf(strZza);
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(strZza)));
        }
        try {
            return zzh(zzhtw.zzc(zzhoaVar.zzc().zzb(), zzidz.zzb()), zzhoaVar.zzc().zzc());
        } catch (zzifh e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    static /* synthetic */ zzhnz zzd(zzhhp zzhhpVar, zzhey zzheyVar) {
        zzhtt zzhttVarZzd = zzhtu.zzd();
        zzhttVarZzd.zza(zzg(zzhhpVar.zze()));
        return zzhnz.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzhtu) zzhttVarZzd.zzbu()).zzaM(), zzhta.REMOTE, zzf(zzhhpVar.zze().zzc()), zzhhpVar.zzb());
    }

    static /* synthetic */ zzhhp zze(zzhnz zzhnzVar, zzhey zzheyVar) throws GeneralSecurityException {
        if (!zzhnzVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzhtu zzhtuVarZzc = zzhtu.zzc(zzhnzVar.zzb(), zzidz.zzb());
            if (zzhtuVarZzc.zza() == 0) {
                return zzhhp.zzd(zzh(zzhtuVarZzc.zzb(), zzhnzVar.zzd()), zzhnzVar.zze());
            }
            String strValueOf = String.valueOf(zzhtuVarZzc);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 58);
            sb.append("KmsEnvelopeAeadKeys are only accepted with version 0, got ");
            sb.append(strValueOf);
            throw new GeneralSecurityException(sb.toString());
        } catch (zzifh e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    private static zzhtx zzf(zzhhs zzhhsVar) throws GeneralSecurityException {
        if (zzhhs.zza.equals(zzhhsVar)) {
            return zzhtx.TINK;
        }
        if (zzhhs.zzb.equals(zzhhsVar)) {
            return zzhtx.RAW;
        }
        String strValueOf = String.valueOf(zzhhsVar);
        String.valueOf(strValueOf);
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(strValueOf)));
    }

    private static zzhtw zzg(zzhht zzhhtVar) throws GeneralSecurityException {
        try {
            zzhte zzhteVarZzd = zzhte.zzd(zzhfa.zza(zzhhtVar.zzd()), zzidz.zzb());
            zzhtv zzhtvVarZzd = zzhtw.zzd();
            zzhtvVarZzd.zza(zzhhtVar.zzb());
            zzhtvVarZzd.zzb(zzhteVarZzd);
            return (zzhtw) zzhtvVarZzd.zzbu();
        } catch (zzifh e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzhht zzh(zzhtw zzhtwVar, zzhtx zzhtxVar) throws GeneralSecurityException {
        zzhhr zzhhrVar;
        zzhhs zzhhsVar;
        zzhtd zzhtdVarZze = zzhte.zze();
        zzhtdVarZze.zza(zzhtwVar.zzb().zza());
        zzhtdVarZze.zzb(zzhtwVar.zzb().zzb());
        zzhtdVarZze.zzc(zzhtx.RAW);
        zzheq zzheqVarZzb = zzhfa.zzb(((zzhte) zzhtdVarZze.zzbu()).zzaN());
        if (zzheqVarZzb instanceof zzhgk) {
            zzhhrVar = zzhhr.zza;
        } else if (zzheqVarZzb instanceof zzhgz) {
            zzhhrVar = zzhhr.zzc;
        } else if (zzheqVarZzb instanceof zzhiv) {
            zzhhrVar = zzhhr.zzb;
        } else if (zzheqVarZzb instanceof zzhft) {
            zzhhrVar = zzhhr.zzd;
        } else if (zzheqVarZzb instanceof zzhgb) {
            zzhhrVar = zzhhr.zze;
        } else {
            if (!(zzheqVarZzb instanceof zzhgt)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzheqVarZzb.toString()));
            }
            zzhhrVar = zzhhr.zzf;
        }
        zzhhq zzhhqVar = new zzhhq(null);
        int iOrdinal = zzhtxVar.ordinal();
        if (iOrdinal == 1) {
            zzhhsVar = zzhhs.zza;
        } else {
            if (iOrdinal != 3) {
                int iZza = zzhtxVar.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(iZza).length() + 34);
                sb.append("Unable to parse OutputPrefixType: ");
                sb.append(iZza);
                throw new GeneralSecurityException(sb.toString());
            }
            zzhhsVar = zzhhs.zzb;
        }
        zzhhqVar.zza(zzhhsVar);
        zzhhqVar.zzb(zzhtwVar.zza());
        zzhhqVar.zzd((zzhfh) zzheqVarZzb);
        zzhhqVar.zzc(zzhhrVar);
        return zzhhqVar.zze();
    }
}
