package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zziba implements zzhep {
    private static final byte[] zza = {0};
    private final zzhqo zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zziba(zzhom zzhomVar) throws GeneralSecurityException {
        this.zzb = zziax.zzb(zzhqm.zzc(zzhqn.zzb(zzhomVar.zzf().zzc()), zzhomVar.zzd()));
        this.zzc = zzhomVar.zzf().zzd();
        this.zzd = zzhomVar.zze().zzc();
        if (zzhomVar.zzf().zzf().equals(zzhos.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzhep zza(zzhom zzhomVar) throws GeneralSecurityException {
        return new zziba(zzhomVar);
    }

    public static zzhep zzb(zzhox zzhoxVar) throws GeneralSecurityException {
        return new zziba(zzhoxVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        byte[] bArr3 = this.zzd;
        return length > 0 ? zzhzw.zza(bArr3, this.zzb.zza(zzhzw.zza(bArr, bArr2), this.zzc)) : zzhzw.zza(bArr3, this.zzb.zza(bArr, this.zzc));
    }

    private zziba(zzhox zzhoxVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzhoxVar.zzf().zzg());
        String.valueOf(strValueOf);
        String strValueOf2 = String.valueOf(strValueOf);
        this.zzb = new zziaz("HMAC".concat(strValueOf2), new SecretKeySpec(zzhoxVar.zzd().zzc(zzhdx.zza()), "HMAC"));
        this.zzc = zzhoxVar.zzf().zzd();
        this.zzd = zzhoxVar.zze().zzc();
        if (zzhoxVar.zzf().zzf().equals(zzhpf.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zziba(zzhqo zzhqoVar, int i) throws GeneralSecurityException {
        this.zzb = zzhqoVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhqoVar.zza(new byte[0], i);
    }
}
