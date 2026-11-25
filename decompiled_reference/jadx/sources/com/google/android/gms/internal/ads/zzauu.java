package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzauu extends zzimk implements Closeable {
    static {
        zzimr.zzb(zzauu.class);
    }

    public zzauu(zziml zzimlVar, zzaut zzautVar) throws IOException {
        zzd(zzimlVar, zzimlVar.zzb(), zzautVar);
    }

    @Override // com.google.android.gms.internal.ads.zzimk, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzimk
    public final String toString() {
        String string = this.zzc.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
