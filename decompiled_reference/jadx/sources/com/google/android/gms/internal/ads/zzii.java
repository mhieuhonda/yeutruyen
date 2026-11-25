package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzii extends zzig {
    public final int zzc;

    public zzii(int i, String str, IOException iOException, Map map, zzhv zzhvVar, byte[] bArr) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), iOException, zzhvVar, 2004, 1);
        this.zzc = i;
    }
}
