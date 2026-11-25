package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzgln extends RuntimeException {
    public zzgln() {
        this(0);
    }

    public zzgln(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 3);
        sb.append("r: ");
        sb.append(i);
        super(sb.toString());
    }

    public zzgln(int i, Throwable th) {
        super("r: 2", th);
    }
}
