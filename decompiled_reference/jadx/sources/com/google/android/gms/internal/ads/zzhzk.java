package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhzk {
    public static zzheu zza(zzhel zzhelVar, zzhnx zzhnxVar) throws GeneralSecurityException {
        zzhmp zzhmpVar = (zzhmp) zzhelVar.zzf(zzhmp.class);
        zzhmq zzhmqVarZza = (zzhmpVar == null || zzhmpVar.zza()) ? zzhmt.zza : zzhmz.zza().zzb().zza(zzhelVar, zzhmpVar, "public_key_sign", "sign");
        zzhek zzhekVar = (zzhek) zzhelVar;
        return new zzhzi(new zzhzj((zzheu) zzhnxVar.zza(zzhekVar.zzc()), zzhekVar.zzc().zzc()), zzhmqVarZza);
    }
}
