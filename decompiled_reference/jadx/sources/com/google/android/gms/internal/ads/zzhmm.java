package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhmm extends zzhdz {
    private final zzhnz zza;

    public zzhmm(zzhnz zzhnzVar, @Nullable zzhey zzheyVar) throws GeneralSecurityException {
        zze(zzhnzVar, zzheyVar);
        this.zza = zzhnzVar;
    }

    private static void zze(zzhnz zzhnzVar, @Nullable zzhey zzheyVar) throws GeneralSecurityException {
        int i = zzhmk.zzb[zzhnzVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final zzheq zza() {
        zzhnz zzhnzVar = this.zza;
        return new zzhml(zzhnzVar.zzg(), zzhnzVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    @Nullable
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhnz zzc(@Nullable zzhey zzheyVar) throws GeneralSecurityException {
        zzhnz zzhnzVar = this.zza;
        zze(zzhnzVar, zzheyVar);
        return zzhnzVar;
    }

    public final zzibk zzd() throws GeneralSecurityException {
        zzhnz zzhnzVar = this.zza;
        if (zzhnzVar.zzd().equals(zzhtx.RAW)) {
            return zzibk.zza(new byte[0]);
        }
        if (zzhnzVar.zzd().equals(zzhtx.TINK)) {
            return zzhnf.zzb(zzhnzVar.zze().intValue());
        }
        if (zzhnzVar.zzd().equals(zzhtx.LEGACY) || zzhnzVar.zzd().equals(zzhtx.CRUNCHY)) {
            return zzhnf.zza(zzhnzVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
