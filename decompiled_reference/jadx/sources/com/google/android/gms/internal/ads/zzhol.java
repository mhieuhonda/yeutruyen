package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhol {

    @Nullable
    private zzhot zza = null;

    @Nullable
    private zzibm zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhol() {
    }

    /* synthetic */ zzhol(byte[] bArr) {
    }

    public final zzhol zza(zzhot zzhotVar) {
        this.zza = zzhotVar;
        return this;
    }

    public final zzhol zzb(zzibm zzibmVar) throws GeneralSecurityException {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhol zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhom zzd() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarZza;
        zzhot zzhotVar = this.zza;
        if (zzhotVar == null || (zzibmVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhotVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhotVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhos.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zzf() == zzhos.zzc || this.zza.zzf() == zzhos.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhos.zza) {
                String strValueOf = String.valueOf(this.zza.zzf());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhom(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }
}
