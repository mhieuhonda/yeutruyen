package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzciq {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzauz zzauzVar;
        zzauy zzauyVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzauu(new zzcip(byteBufferDuplicate), zzciu.zzb).zzc().iterator();
            while (true) {
                zzauzVar = null;
                if (!it.hasNext()) {
                    zzauyVar = null;
                    break;
                }
                zzauw zzauwVar = (zzauw) it.next();
                if (zzauwVar instanceof zzauy) {
                    zzauyVar = (zzauy) zzauwVar;
                    break;
                }
            }
            for (zzauw zzauwVar2 : zzauyVar.zzc()) {
                if (zzauwVar2 instanceof zzauz) {
                    zzauzVar = (zzauz) zzauwVar2;
                    break;
                }
            }
            long jZzd = (zzauzVar.zzd() * 1000) / zzauzVar.zzc();
            this.zza = jZzd;
            return jZzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
