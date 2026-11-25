package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzja {
    private final Map zza;

    public zzja() {
        this.zza = new HashMap();
    }

    public final zzja zza(String str, int i) {
        this.zza.put(str, Integer.valueOf(i));
        return this;
    }

    public final zzja zzb(String str, long j) {
        this.zza.put(str, Long.valueOf(j));
        return this;
    }

    public final zzja zzc(String str, float f) {
        this.zza.put(str, Float.valueOf(f));
        return this;
    }

    public final zzja zzd(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzja zze(String str, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            this.zza.put(str, null);
            return this;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byteBufferAllocate.put(byteBuffer.duplicate());
        byteBufferAllocate.flip();
        this.zza.put(str, byteBufferAllocate);
        return this;
    }

    public final zzja zzf(String str) {
        this.zza.remove(str);
        return this;
    }

    public final zzjb zzg() {
        return new zzjb(this.zza, null);
    }
}
