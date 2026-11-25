package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhzn {
    public static zzhev zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzibk zzibkVarZzd;
        zzhnn zzhnnVar = new zzhnn();
        for (int i = 0; i < zzhelVar.zzd(); i++) {
            zzhei zzheiVarZze = ((zzhek) zzhelVar).zze(i);
            if (zzheiVarZze.zzb().equals(zzheb.zza)) {
                zzhev zzhevVar = (zzhev) zzhnxVar.zza(zzheiVarZze);
                zzhdz zzhdzVarZza = zzheiVarZze.zza();
                if (zzhdzVarZza instanceof zzhxv) {
                    zzibkVarZzd = ((zzhxv) zzhdzVarZza).zze();
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
                zzhnnVar.zza(zzibkVarZzd, new zzhzm(zzhevVar, zzheiVarZze.zzc()));
            }
        }
        zzhmp zzhmpVar = (zzhmp) zzhelVar.zzf(zzhmp.class);
        return new zzhzl(zzhnnVar.zzb(), (zzhmpVar == null || zzhmpVar.zza()) ? zzhmt.zza : zzhmz.zza().zzb().zza(zzhelVar, zzhmpVar, "public_key_verify", "verify"));
    }
}
