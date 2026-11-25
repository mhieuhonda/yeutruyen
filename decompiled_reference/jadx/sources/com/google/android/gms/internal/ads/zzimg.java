package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzimg implements zzauw {
    private static final zzimr zzg = zzimr.zzb(zzimg.class);
    protected final String zza;
    long zzd;
    zziml zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    protected zzimg(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        if (this.zzc) {
            return;
        }
        try {
            zzimr zzimrVar = zzg;
            String str = this.zza;
            zzimrVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            this.zzh = this.zzf.zze(this.zzd, this.zze);
            this.zzc = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzb(zziml zzimlVar, ByteBuffer byteBuffer, long j, zzaut zzautVar) throws IOException {
        this.zzd = zzimlVar.zzc();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzimlVar;
        zzimlVar.zzd(zzimlVar.zzc() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    protected abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        zzc();
        zzimr zzimrVar = zzg;
        String str = this.zza;
        zzimrVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.zzh;
        if (byteBuffer != null) {
            this.zzb = true;
            byteBuffer.rewind();
            zze(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                byteBuffer.slice();
            }
            this.zzh = null;
        }
    }
}
