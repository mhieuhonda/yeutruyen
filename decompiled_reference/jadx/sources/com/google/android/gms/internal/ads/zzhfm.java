package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzhfm implements zzhma {
    static final /* synthetic */ zzhfm zza = new zzhfm();

    private /* synthetic */ zzhfm() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        zzhft zzhftVar = (zzhft) zzheqVar;
        int i = zzhfp.zza;
        if (zzhftVar.zzc() != 16 && zzhftVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzhfk zzhfkVar = new zzhfk(null);
        zzhfkVar.zza(zzhftVar);
        zzhfkVar.zzd(num);
        zzhfkVar.zzb(zzibm.zzb(zzhftVar.zzc()));
        zzhfkVar.zzc(zzibm.zzb(zzhftVar.zzd()));
        return zzhfkVar.zze();
    }
}
