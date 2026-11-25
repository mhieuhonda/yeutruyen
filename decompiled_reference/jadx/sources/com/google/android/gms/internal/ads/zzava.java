package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzava extends zzimg {
    public zzava(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final void zze(ByteBuffer byteBuffer) {
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
