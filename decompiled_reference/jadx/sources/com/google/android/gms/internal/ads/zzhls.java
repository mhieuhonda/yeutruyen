package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhls {
    static final zzhls zzd = new zzhls(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    zzhls(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
