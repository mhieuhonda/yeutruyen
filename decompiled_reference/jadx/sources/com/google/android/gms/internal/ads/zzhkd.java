package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhkd extends zzhke {
    public zzhkd(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhke
    final zzhkc zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzhkb(bArr, i);
    }
}
