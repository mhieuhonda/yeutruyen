package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhlz {
    public static boolean zza(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char cCharAt = str.charAt(i);
            int i2 = i + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i = i2;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static zzibr zzb(String str) throws IOException {
        try {
            zzico zzicoVar = new zzico(new StringReader(str));
            zzicoVar.zza(zzibw.LEGACY_STRICT);
            return zzhlx.zza(zzicoVar);
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public static long zzc(Number number) {
        if (number instanceof zzhly) {
            return Long.parseLong(number.toString());
        }
        throw new IllegalArgumentException("does not contain a parsed number.");
    }
}
