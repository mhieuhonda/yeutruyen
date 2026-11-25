package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgc {

    @Nullable
    private zzhgk zza = null;

    @Nullable
    private zzibm zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhgc() {
    }

    /* synthetic */ zzhgc(byte[] bArr) {
    }

    public final zzhgc zza(zzhgk zzhgkVar) {
        this.zza = zzhgkVar;
        return this;
    }

    public final zzhgc zzb(zzibm zzibmVar) {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhgc zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhgd zzd() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarZzb;
        zzhgk zzhgkVar = this.zza;
        if (zzhgkVar == null || (zzibmVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhgkVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhgkVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzd() == zzhgj.zzc) {
            zzibkVarZzb = zzhnf.zza;
        } else if (this.zza.zzd() == zzhgj.zzb) {
            zzibkVarZzb = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzd() != zzhgj.zza) {
                String strValueOf = String.valueOf(this.zza.zzd());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zzibkVarZzb = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhgd(this.zza, this.zzb, zzibkVarZzb, this.zzc, null);
    }
}
