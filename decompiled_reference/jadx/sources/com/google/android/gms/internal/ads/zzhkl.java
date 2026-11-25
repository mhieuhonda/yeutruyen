package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhkl {
    public static zzhdr zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzhmq zzhmqVar;
        zzhmq zzhmqVarZza;
        zzibk zzibkVarZzd;
        zzhnn zzhnnVar = new zzhnn();
        for (int i = 0; i < zzhelVar.zzd(); i++) {
            zzhei zzheiVarZze = ((zzhek) zzhelVar).zze(i);
            if (zzheiVarZze.zzb().equals(zzheb.zza)) {
                zzhdz zzhdzVarZza = zzheiVarZze.zza();
                if (zzhdzVarZza instanceof zzhfg) {
                    zzibkVarZzd = ((zzhfg) zzhdzVarZza).zzc();
                } else {
                    if (!(zzhdzVarZza instanceof zzhmm)) {
                        String name = zzhdzVarZza.getClass().getName();
                        String strValueOf = String.valueOf(zzhdzVarZza.zza());
                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 59 + String.valueOf(strValueOf).length());
                        sb.append("Cannot get output prefix for key of class ");
                        sb.append(name);
                        sb.append(" with parameters ");
                        sb.append(strValueOf);
                        throw new GeneralSecurityException(sb.toString());
                    }
                    zzibkVarZzd = ((zzhmm) zzhdzVarZza).zzd();
                }
                zzhnnVar.zza(zzibkVarZzd, new zzhkj((zzhdr) zzhnxVar.zza(zzheiVarZze), zzheiVarZze.zzc()));
            }
        }
        zzhmp zzhmpVar = (zzhmp) zzhelVar.zzf(zzhmp.class);
        if (zzhmpVar == null || zzhmpVar.zza()) {
            zzhmqVar = zzhmt.zza;
            zzhmqVarZza = zzhmqVar;
        } else {
            zzhmr zzhmrVarZzb = zzhmz.zza().zzb();
            zzhmq zzhmqVarZza2 = zzhmrVarZzb.zza(zzhelVar, zzhmpVar, "aead", "encrypt");
            zzhmqVarZza = zzhmrVarZzb.zza(zzhelVar, zzhmpVar, "aead", "decrypt");
            zzhmqVar = zzhmqVarZza2;
        }
        zzhek zzhekVar = (zzhek) zzhelVar;
        return new zzhkk(new zzhkj((zzhdr) zzhnxVar.zza(zzhekVar.zzc()), zzhekVar.zzc().zzc()), zzhnnVar.zzb(), zzhmqVar, zzhmqVarZza, null);
    }
}
