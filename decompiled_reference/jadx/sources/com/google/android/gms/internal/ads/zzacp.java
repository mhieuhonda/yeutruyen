package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzacp {
    private final ByteBuffer zza = ByteBuffer.allocateDirect(500);
    private zzgv zzb;

    private final void zzd(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((zzgu) list.get(i)).zza == 1) {
                this.zzb = zzgv.zza((zzgu) list.get(i));
            }
        }
    }

    private final void zze() {
        ByteBuffer byteBuffer = this.zza;
        byteBuffer.position(byteBuffer.limit());
    }

    public final int zza(ByteBuffer byteBuffer, boolean z) {
        zzgv zzgvVar;
        zzgs zzgsVarZzb;
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.hasRemaining()) {
            zzd(zzgw.zza(byteBuffer2));
            zze();
        }
        List listZza = zzgw.zza(byteBuffer);
        zzd(listZza);
        int size = listZza.size() - 1;
        int i = 0;
        while (size >= 0) {
            zzgu zzguVar = (zzgu) listZza.get(size);
            int i2 = zzguVar.zza;
            if (i2 != 2 && i2 != 15) {
                if (i2 == 3) {
                    if (!z) {
                        break;
                    }
                    i2 = 3;
                    if (i2 != 6) {
                        break;
                    }
                    break;
                }
                if ((i2 != 6 && i2 != 3) || (zzgvVar = this.zzb) == null || (zzgsVarZzb = zzgs.zzb(zzgvVar, zzguVar)) == null || zzgsVarZzb.zza()) {
                    break;
                }
            }
            if (((zzgu) listZza.get(size)).zza == 6 || ((zzgu) listZza.get(size)).zza == 3) {
                i++;
            }
            size--;
        }
        if (i > 1 || size + 1 >= 8) {
            return byteBuffer.limit();
        }
        return size >= 0 ? ((zzgu) listZza.get(size)).zzb.limit() : byteBuffer.position();
    }

    public final void zzb(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        byteBuffer.limit(Math.min(iLimit, iPosition + 500));
        ByteBuffer byteBuffer2 = this.zza;
        byteBuffer2.clear();
        byteBuffer2.put(byteBuffer);
        byteBuffer2.flip();
        byteBuffer.position(iPosition);
        byteBuffer.limit(iLimit);
    }

    public final void zzc() {
        this.zzb = null;
        zze();
    }
}
