package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface zziml extends Closeable {
    int zza(ByteBuffer byteBuffer) throws IOException;

    long zzb() throws IOException;

    long zzc() throws IOException;

    void zzd(long j) throws IOException;

    ByteBuffer zze(long j, long j2) throws IOException;
}
