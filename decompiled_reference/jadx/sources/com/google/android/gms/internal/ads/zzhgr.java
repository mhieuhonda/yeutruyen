package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhgr {

    @Nullable
    private Integer zza = null;
    private zzhgs zzb = zzhgs.zzc;

    private zzhgr() {
    }

    /* synthetic */ zzhgr(byte[] bArr) {
    }

    public final zzhgr zzb(zzhgs zzhgsVar) {
        this.zzb = zzhgsVar;
        return this;
    }

    public final zzhgt zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzhgt(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final zzhgr zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }
}
