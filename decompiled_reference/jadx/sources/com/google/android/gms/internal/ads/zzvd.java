package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvd extends zzix {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzvd() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzix, com.google.android.gms.internal.ads.zzis
    public final void zza() {
        super.zza();
        this.zzg = 0;
    }

    public final void zzm(int i) {
        this.zzh = i;
    }

    public final long zzn() {
        return this.zzf;
    }

    public final int zzo() {
        return this.zzg;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }

    public final boolean zzq(zzix zzixVar) {
        ByteBuffer byteBuffer;
        zzgtr.zza(!zzixVar.zzi(1073741824));
        zzgtr.zza(!zzixVar.zzi(268435456));
        zzgtr.zza(!zzixVar.zzi(4));
        if (zzp()) {
            if (this.zzg >= this.zzh) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzixVar.zzc;
            if (byteBuffer2 != null && (byteBuffer = this.zzc) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzixVar.zzd;
            if (zzixVar.zzi(1)) {
                zzg(1);
            }
        }
        ByteBuffer byteBuffer3 = zzixVar.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzf = zzixVar.zzd;
        return true;
    }
}
