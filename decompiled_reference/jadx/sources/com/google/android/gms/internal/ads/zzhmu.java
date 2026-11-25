package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzhmu implements zzhma {
    static final /* synthetic */ zzhmu zza = new zzhmu();

    private /* synthetic */ zzhmu() {
    }

    @Override // com.google.android.gms.internal.ads.zzhma
    public final /* synthetic */ zzhdz zza(zzheq zzheqVar, Integer num) throws GeneralSecurityException {
        int i = zzhmv.zza;
        zzhte zzhteVarZzc = ((zzhmn) zzheqVar).zzb().zzc();
        zzhea zzheaVarZzd = zzhmb.zza().zzd(zzhteVarZzc.zza());
        if (!zzhmb.zza().zze(zzhteVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhtb zzhtbVarZzd = zzheaVarZzd.zzd(zzhteVarZzc.zzb());
        return new zzhmm(zzhnz.zza(zzhtbVarZzd.zza(), zzhtbVarZzd.zzb(), zzhtbVarZzd.zzc(), zzhteVarZzc.zzc(), num), zzhdx.zza());
    }
}
