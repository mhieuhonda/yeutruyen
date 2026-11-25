package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzimh extends zzimk implements zzauw {
    protected final String zza = "moov";

    public zzimh(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzauw
    public final void zzb(zziml zzimlVar, ByteBuffer byteBuffer, long j, zzaut zzautVar) throws IOException {
        zzimlVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzimlVar;
        this.zze = zzimlVar.zzc();
        zzimlVar.zzd(zzimlVar.zzc() + j);
        this.zzf = zzimlVar.zzc();
        this.zzb = zzautVar;
    }
}
