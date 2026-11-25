package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgl {

    @Nullable
    private zzhgt zza = null;

    @Nullable
    private zzibm zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhgl() {
    }

    /* synthetic */ zzhgl(byte[] bArr) {
    }

    public final zzhgl zza(zzhgt zzhgtVar) {
        this.zza = zzhgtVar;
        return this;
    }

    public final zzhgl zzb(zzibm zzibmVar) {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhgl zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhgm zzd() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarZzb;
        zzhgt zzhgtVar = this.zza;
        if (zzhgtVar == null || (zzibmVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgtVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgtVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhgs.zzc) {
            zzibkVarZzb = zzhnf.zza;
        } else if (this.zza.zzd() == zzhgs.zzb) {
            zzibkVarZzb = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhgs.zza) {
                String strValueOf = String.valueOf(this.zza.zzd());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zzibkVarZzb = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhgm(this.zza, this.zzb, zzibkVarZzb, this.zzc, null);
    }
}
