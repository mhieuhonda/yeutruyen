package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziab implements zzhev {
    public static zzhev zzb(zzhvw zzhvwVar) throws GeneralSecurityException {
        if (!zzhle.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhyn.zzb(zzhvwVar);
        } catch (GeneralSecurityException unused) {
            return new zziaa(zzhvwVar.zzd().zzc(), zzhvwVar.zze().zzc(), zzhvwVar.zzf().zzc().equals(zzhvo.zzc) ? new byte[]{0} : new byte[0], null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
