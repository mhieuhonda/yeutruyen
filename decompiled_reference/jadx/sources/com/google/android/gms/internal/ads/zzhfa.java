package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhfa {
    public static byte[] zza(zzheq zzheqVar) throws GeneralSecurityException {
        return ((zzhoa) zzhne.zza().zzk(zzheqVar, zzhoa.class)).zzc().zzaN();
    }

    public static zzheq zzb(byte[] bArr) throws GeneralSecurityException {
        try {
            zzhte zzhteVarZzd = zzhte.zzd(bArr, zzidz.zzb());
            zzhne zzhneVarZza = zzhne.zza();
            zzhoa zzhoaVarZzb = zzhoa.zzb(zzhteVarZzd);
            return !zzhneVarZza.zzi(zzhoaVarZzb) ? new zzhmn(zzhoaVarZzb) : zzhneVarZza.zzj(zzhoaVarZzb);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
