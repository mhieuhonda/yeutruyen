package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhxa {

    @Nullable
    private zzhwx zza = null;

    @Nullable
    private BigInteger zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhxa() {
    }

    /* synthetic */ zzhxa(byte[] bArr) {
    }

    public final zzhxa zza(zzhwx zzhwxVar) {
        this.zza = zzhwxVar;
        return this;
    }

    public final zzhxa zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhxa zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhxb zzd() throws GeneralSecurityException {
        zzibk zzibkVarZza;
        if (this.zza == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = this.zzb;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        int iZzc = this.zza.zzc();
        if (iBitLength != iZzc) {
            StringBuilder sb = new StringBuilder(String.valueOf(iBitLength).length() + 56 + String.valueOf(iZzc).length());
            sb.append("Got modulus size ");
            sb.append(iBitLength);
            sb.append(", but parameters requires modulus size ");
            sb.append(iZzc);
            throw new GeneralSecurityException(sb.toString());
        }
        if (this.zza.zza() && this.zzc == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!this.zza.zza() && this.zzc != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (this.zza.zze() == zzhww.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zze() == zzhww.zzc || this.zza.zze() == zzhww.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhww.zza) {
                String strValueOf = String.valueOf(this.zza.zze());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhxb(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }
}
