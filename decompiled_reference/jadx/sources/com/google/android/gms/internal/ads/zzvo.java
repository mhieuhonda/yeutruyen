package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzvo extends zziv {
    public final int zza;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzvo(Throwable th, zzvp zzvpVar) {
        String str = zzvpVar == null ? null : zzvpVar.zza;
        String.valueOf(str);
        super("Decoder failed: ".concat(String.valueOf(str)), th);
        boolean z = th instanceof MediaCodec.CodecException;
        if (z) {
            ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zza = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
    }
}
