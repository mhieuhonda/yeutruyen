package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzckl extends zzig {
    public zzckl(int i, Map map, zzhv zzhvVar, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), zzhvVar, 2000, i2);
    }
}
