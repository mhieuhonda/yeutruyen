package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhnf {
    public static final zzibk zza = zzibk.zza(new byte[0]);

    public static final zzibk zza(int i) {
        return zzibk.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i).array());
    }

    public static final zzibk zzb(int i) {
        return zzibk.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i).array());
    }
}
