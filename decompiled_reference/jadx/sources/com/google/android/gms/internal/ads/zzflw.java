package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzflw {
    public zzflw() {
        try {
            zzhfc.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzhek zzhekVarZzg = zzhek.zzg(zzhec.zzb(zzhna.zza().zzc("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzhdv.zzb(zzhekVarZzg, zzhdu.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, @Nullable String str, zzdzo zzdzoVar) {
        zzhek zzhekVarZzc;
        if (str != null && (zzhekVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzhdr) zzhekVarZzc.zzh(zzhlg.zza(), zzhdr.class)).zza(bArr, bArr2);
                zzdzoVar.zzc().put("ds", "1");
                return new String(bArrZza, StandardCharsets.UTF_8);
            } catch (UnsupportedOperationException | GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CryptoUtils.decrypt");
                zzdzoVar.zzc().put("dsf", e.toString());
            }
        }
        return null;
    }

    @Nullable
    private static final zzhek zzc(String str) {
        try {
            try {
                return zzhdv.zza(zzhdt.zza(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
