package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhkk implements zzhdr {
    private final zzhnp zza;

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzhkj zzhkjVar : this.zza.zza(bArr)) {
            try {
                byte[] bArrZza = zzhkjVar.zza.zza(bArr, bArr2);
                int i = zzhkjVar.zzb;
                int length = bArr.length;
                return bArrZza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
