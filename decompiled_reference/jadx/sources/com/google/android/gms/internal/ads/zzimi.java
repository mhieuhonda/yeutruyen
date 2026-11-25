package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzimi extends zzimg implements zzauw {
    private int zzg;

    protected zzimi(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    protected final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzauv.zzc(byteBuffer.get());
        zzauv.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
