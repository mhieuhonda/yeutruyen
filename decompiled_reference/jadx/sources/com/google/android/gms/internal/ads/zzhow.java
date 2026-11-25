package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhow {

    @Nullable
    private zzhpg zza = null;

    @Nullable
    private zzibm zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhow() {
    }

    /* synthetic */ zzhow(byte[] bArr) {
    }

    public final zzhow zza(zzhpg zzhpgVar) {
        this.zza = zzhpgVar;
        return this;
    }

    public final zzhow zzb(zzibm zzibmVar) {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhow zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhox zzd() throws GeneralSecurityException {
        zzibm zzibmVar;
        zzibk zzibkVarZza;
        zzhpg zzhpgVar = this.zza;
        if (zzhpgVar == null || (zzibmVar = this.zzb) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (zzhpgVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (zzhpgVar.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzf() == zzhpf.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zzf() == zzhpf.zzc || this.zza.zzf() == zzhpf.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zzf() != zzhpf.zza) {
                String strValueOf = String.valueOf(this.zza.zzf());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhox(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }
}
