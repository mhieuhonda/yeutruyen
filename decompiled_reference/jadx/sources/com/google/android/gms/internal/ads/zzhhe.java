package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzhhe implements zzhnr {
    static final /* synthetic */ zzhhe zza = new zzhhe();

    private /* synthetic */ zzhhe() {
    }

    @Override // com.google.android.gms.internal.ads.zzhnr
    public final /* synthetic */ Object zza(zzhdz zzhdzVar) throws GeneralSecurityException {
        zzhhp zzhhpVar = (zzhhp) zzhdzVar;
        int i = zzhhg.zza;
        String strZzb = zzhhpVar.zze().zzb();
        zzhfh zzhfhVarZzd = zzhhpVar.zze().zzd();
        zzhdr zzhdrVarZzb = zzheo.zza(strZzb).zzb();
        int i2 = zzhhd.zza;
        try {
            return zzhkh.zzc(new zzhhd(zzhte.zzd(zzhfa.zza(zzhfhVarZzd), zzidz.zzb()), zzhdrVarZzb), zzhhpVar.zzc());
        } catch (zzifh e) {
            throw new GeneralSecurityException(e);
        }
    }
}
