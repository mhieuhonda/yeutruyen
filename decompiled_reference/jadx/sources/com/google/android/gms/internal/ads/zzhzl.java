package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhzl implements zzhev {
    private final zzhnp zza;

    zzhzl(zzhnp zzhnpVar, zzhmq zzhmqVar) {
        this.zza = zzhnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzhzm zzhzmVar : this.zza.zza(bArr)) {
            try {
                zzhzmVar.zza.zza(bArr, bArr2);
                int i = zzhzmVar.zzb;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
