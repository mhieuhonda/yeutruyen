package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhmc extends zzhme {
    final /* synthetic */ zzhmd zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzhmc(zzibk zzibkVar, Class cls, zzhmd zzhmdVar) {
        super(zzibkVar, cls, null);
        this.zza = zzhmdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhme
    public final zzhdz zza(zzhod zzhodVar, @Nullable zzhey zzheyVar) throws GeneralSecurityException {
        return this.zza.zza(zzhodVar, zzheyVar);
    }
}
