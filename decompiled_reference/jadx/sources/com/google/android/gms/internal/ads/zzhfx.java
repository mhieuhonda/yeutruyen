package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzhfx implements zzhma {
    static final /* synthetic */ zzhfx zza = new zzhfx();

    private /* synthetic */ zzhfx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        zzhgb zzhgbVar = (zzhgb) zzheqVar;
        int i = zzhfy.zza;
        if (zzhgbVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
        }
        zzhfu zzhfuVar = new zzhfu(null);
        zzhfuVar.zza(zzhgbVar);
        zzhfuVar.zzc(num);
        zzhfuVar.zzb(zzibm.zzb(zzhgbVar.zzc()));
        return zzhfuVar.zzd();
    }
}
