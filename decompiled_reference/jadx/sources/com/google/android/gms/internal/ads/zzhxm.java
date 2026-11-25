package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhxm {

    @Nullable
    private zzhxj zza = null;

    @Nullable
    private BigInteger zzb = null;

    @Nullable
    private Integer zzc = null;

    private zzhxm() {
    }

    /* synthetic */ zzhxm(byte[] bArr) {
    }

    public final zzhxm zza(zzhxj zzhxjVar) {
        this.zza = zzhxjVar;
        return this;
    }

    public final zzhxm zzb(BigInteger bigInteger) {
        this.zzb = bigInteger;
        return this;
    }

    public final zzhxm zzc(@Nullable Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzhxn zzd() throws GeneralSecurityException {
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
        if (this.zza.zze() == zzhxi.zzd) {
            zzibkVarZza = zzhnf.zza;
        } else if (this.zza.zze() == zzhxi.zzc || this.zza.zze() == zzhxi.zzb) {
            zzibkVarZza = zzhnf.zza(this.zzc.intValue());
        } else {
            if (this.zza.zze() != zzhxi.zza) {
                String strValueOf = String.valueOf(this.zza.zze());
                String.valueOf(strValueOf);
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: ".concat(String.valueOf(strValueOf)));
            }
            zzibkVarZza = zzhnf.zzb(this.zzc.intValue());
        }
        return new zzhxn(this.zza, this.zzb, zzibkVarZza, this.zzc, null);
    }
}
