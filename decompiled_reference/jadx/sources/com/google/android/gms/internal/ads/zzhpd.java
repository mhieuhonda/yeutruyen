package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhpd {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;
    private zzhpe zzc = null;
    private zzhpf zzd = zzhpf.zzd;

    private zzhpd() {
    }

    /* synthetic */ zzhpd(byte[] bArr) {
    }

    public final zzhpd zza(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhpd zzb(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzhpd zzc(zzhpf zzhpfVar) {
        this.zzd = zzhpfVar;
        return this;
    }

    public final zzhpd zzd(zzhpe zzhpeVar) {
        this.zzc = zzhpeVar;
        return this;
    }

    public final zzhpg zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
        }
        int iIntValue = this.zzb.intValue();
        zzhpe zzhpeVar = this.zzc;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(iIntValue)));
        }
        if (zzhpeVar == zzhpe.zza) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
            }
        } else if (zzhpeVar == zzhpe.zzb) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
            }
        } else if (zzhpeVar == zzhpe.zzc) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
            }
        } else if (zzhpeVar == zzhpe.zzd) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
            }
        } else {
            if (zzhpeVar != zzhpe.zze) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
            }
        }
        return new zzhpg(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
    }
}
