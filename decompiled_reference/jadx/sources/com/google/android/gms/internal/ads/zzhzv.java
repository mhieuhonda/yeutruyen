package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhzv {
    private static final Charset zza = Charset.forName("UTF-8");

    public static byte[] zza(String str, int i) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhzu zzhzuVar = new zzhzu(2, new byte[(length * 3) / 4]);
        if (!zzhzuVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i2 = zzhzuVar.zzb;
        byte[] bArr = zzhzuVar.zza;
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }
}
