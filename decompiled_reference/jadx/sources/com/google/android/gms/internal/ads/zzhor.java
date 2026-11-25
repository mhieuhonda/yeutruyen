package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhor {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;
    private zzhos zzc = zzhos.zzd;

    private zzhor() {
    }

    /* synthetic */ zzhor(byte[] bArr) {
    }

    public final zzhor zzc(zzhos zzhosVar) {
        this.zzc = zzhosVar;
        return this;
    }

    public final zzhot zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhot(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public final zzhor zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzhor zzb(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 40);
        sb.append("Invalid tag size for AesCmacParameters: ");
        sb.append(i);
        throw new GeneralSecurityException(sb.toString());
    }
}
