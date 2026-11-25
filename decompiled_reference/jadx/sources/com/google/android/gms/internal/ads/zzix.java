package com.google.android.gms.internal.ads;

import com.tekartik.sqflite.Constant;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzix extends zzis {
    public zzv zza;
    public final zziu zzb = new zziu();
    public ByteBuffer zzc;
    public long zzd;
    public ByteBuffer zze;
    private final int zzf;

    static {
        zzal.zzb("media3.decoder");
    }

    public zzix(int i, int i2) {
        this.zzf = i;
    }

    private final ByteBuffer zzm(int i) {
        int i2 = this.zzf;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.zzc;
        throw new zziw(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzis
    public void zza() {
        super.zza();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
    }

    @EnsuresNonNull({Constant.PARAM_ERROR_DATA})
    public final void zzj(int i) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzm(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer byteBufferZzm = zzm(i2);
        byteBufferZzm.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferZzm.put(byteBuffer);
        }
        this.zzc = byteBufferZzm;
    }

    public final boolean zzk() {
        return zzi(1073741824);
    }

    public final void zzl() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
