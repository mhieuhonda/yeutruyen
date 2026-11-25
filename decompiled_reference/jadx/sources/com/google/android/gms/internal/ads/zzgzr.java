package com.google.android.gms.internal.ads;

import java.io.OutputStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgzr extends OutputStream {
    zzgzr() {
    }

    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        zzgtr.zzo(i, i2 + i, bArr.length);
    }
}
