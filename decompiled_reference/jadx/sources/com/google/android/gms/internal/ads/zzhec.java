package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhec {
    static final zzhte zza(zzheq zzheqVar) {
        try {
            return ((zzhoa) zzhne.zza().zzk(null, zzhoa.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzhoj("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }

    public static final zzheq zzb(zzheq zzheqVar) throws GeneralSecurityException {
        return zzheqVar != null ? zzheqVar : zzhfa.zzb(zza(null).zzaN());
    }
}
