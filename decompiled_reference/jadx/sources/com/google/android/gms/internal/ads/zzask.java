package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzask implements zzasl {
    private final ByteBuffer zza;

    public zzask(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzasl
    public final void zzb(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = this.zza;
        synchronized (byteBuffer) {
            int i2 = (int) j;
            byteBuffer.position(i2);
            byteBuffer.limit(i2 + i);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
