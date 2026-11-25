package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziax implements zzhqo {
    public static zzhqo zzb(zzhqm zzhqmVar) throws GeneralSecurityException {
        zzhqo zzhqoVarZzb = zzhqs.zzb(zzhqmVar);
        try {
            return new zziaw(zzhqoVarZzb, zzhqt.zzb(zzhqmVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhqoVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        throw null;
    }
}
