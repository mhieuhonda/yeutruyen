package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzco extends Exception {
    public zzco(String str, zzcl zzclVar) {
        String strValueOf = String.valueOf(zzclVar);
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(strValueOf).length());
        sb.append(str);
        sb.append(" ");
        sb.append(strValueOf);
        super(sb.toString());
    }
}
