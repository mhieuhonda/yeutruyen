package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhfk {

    @Nullable
    private zzhft zza = null;

    @Nullable
    private zzibm zzb = null;

    @Nullable
    private zzibm zzc = null;

    @Nullable
    private Integer zzd = null;

    private zzhfk() {
    }

    /* synthetic */ zzhfk(byte[] bArr) {
    }

    public final zzhfk zza(zzhft zzhftVar) {
        this.zza = zzhftVar;
        return this;
    }

    public final zzhfk zzb(zzibm zzibmVar) {
        this.zzb = zzibmVar;
        return this;
    }

    public final zzhfk zzc(zzibm zzibmVar) {
        this.zzc = zzibmVar;
        return this;
    }

    public final zzhfk zzd(@Nullable Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzhfl zze() throws GeneralSecurityException {
        zzibk zzibkVarZzb;
        zzhft zzhftVar = this.zza;
        if (zzhftVar == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        zzibm zzibmVar = this.zzb;
        if (zzibmVar == null || this.zzc == null) {
            throw new GeneralSecurityException("Cannot build without key material");
        }
        if (zzhftVar.zzc() != zzibmVar.zzd()) {
            throw new GeneralSecurityException("AES key size mismatch");
        }
        if (zzhftVar.zzd() != this.zzc.zzd()) {
            throw new GeneralSecurityException("HMAC key size mismatch");
        }
        if (this.zza.zza() && this.zzd == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzd != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zzg() == zzhfs.zzc) {
            zzibkVarZzb = zzhnf.zza;
        } else if (this.zza.zzg() == zzhfs.zzb) {
            zzibkVarZzb = zzhnf.zza(this.zzd.intValue());
        } else {
            if (this.zza.zzg() != zzhfs.zza) {
                String strValueOf = String.valueOf(this.zza.zzg());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zzibkVarZzb = zzhnf.zzb(this.zzd.intValue());
        }
        return new zzhfl(this.zza, this.zzb, this.zzc, zzibkVarZzb, this.zzd, null);
    }
}
