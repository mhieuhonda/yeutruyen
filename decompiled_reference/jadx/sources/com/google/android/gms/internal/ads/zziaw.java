package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziaw implements zzhqo {
    final zzhqo zza;
    final zzhqo zzb;

    /* synthetic */ zziaw(zzhqo zzhqoVar, zzhqo zzhqoVar2, byte[] bArr) {
        this.zza = zzhqoVar;
        this.zzb = zzhqoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }
}
