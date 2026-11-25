package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzauz extends zzimi {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzims zzm;
    private long zzn;

    public zzauz() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzims.zzj;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzimn.zza(zzauv.zzd(byteBuffer));
            this.zzh = zzimn.zza(zzauv.zzd(byteBuffer));
            this.zzi = zzauv.zza(byteBuffer);
            this.zzj = zzauv.zzd(byteBuffer);
        } else {
            this.zzg = zzimn.zza(zzauv.zza(byteBuffer));
            this.zzh = zzimn.zza(zzauv.zza(byteBuffer));
            this.zzi = zzauv.zza(byteBuffer);
            this.zzj = zzauv.zza(byteBuffer);
        }
        this.zzk = zzauv.zze(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        zzauv.zzb(byteBuffer);
        zzauv.zza(byteBuffer);
        zzauv.zza(byteBuffer);
        this.zzm = new zzims(zzauv.zze(byteBuffer), zzauv.zze(byteBuffer), zzauv.zze(byteBuffer), zzauv.zze(byteBuffer), zzauv.zzf(byteBuffer), zzauv.zzf(byteBuffer), zzauv.zzf(byteBuffer), zzauv.zze(byteBuffer), zzauv.zze(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzauv.zza(byteBuffer);
    }
}
