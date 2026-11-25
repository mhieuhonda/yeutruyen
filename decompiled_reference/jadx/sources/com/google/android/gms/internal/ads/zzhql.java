package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhql {
    public static zzhep zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzhmq zzhmqVar;
        zzhmq zzhmqVarZza;
        zzibk zzibkVarZzd;
        zzhnn zzhnnVar = new zzhnn();
        for (int i = 0; i < zzhelVar.zzd(); i++) {
            zzhei zzheiVarZze = ((zzhek) zzhelVar).zze(i);
            if (zzheiVarZze.zzb().equals(zzheb.zza)) {
                zzhep zzhepVar = (zzhep) zzhnxVar.zza(zzheiVarZze);
                zzhdz zzhdzVarZza = zzheiVarZze.zza();
                if (zzhdzVarZza instanceof zzhpi) {
                    zzibkVarZzd = ((zzhpi) zzhdzVarZza).zze();
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
                zzhnnVar.zza(zzibkVarZzd, new zzhqj(zzhepVar, zzheiVarZze.zzc()));
            }
        }
        zzhmp zzhmpVar = (zzhmp) zzhelVar.zzf(zzhmp.class);
        if (zzhmpVar == null || zzhmpVar.zza()) {
            zzhmqVar = zzhmt.zza;
            zzhmqVarZza = zzhmqVar;
        } else {
            zzhmr zzhmrVarZzb = zzhmz.zza().zzb();
            zzhmq zzhmqVarZza2 = zzhmrVarZzb.zza(zzhelVar, zzhmpVar, "mac", "compute");
            zzhmqVarZza = zzhmrVarZzb.zza(zzhelVar, zzhmpVar, "mac", "verify");
            zzhmqVar = zzhmqVarZza2;
        }
        zzhek zzhekVar = (zzhek) zzhelVar;
        return new zzhqk(new zzhqj((zzhep) zzhnxVar.zza(zzhekVar.zzc()), zzhekVar.zzc().zzc()), zzhnnVar.zzb(), zzhmqVar, zzhmqVarZza, null);
    }
}
