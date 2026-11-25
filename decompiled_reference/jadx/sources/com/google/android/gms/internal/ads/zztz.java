package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zztz implements zzsd {
    final /* synthetic */ zzua zza;

    /* synthetic */ zztz(zzua zzuaVar, byte[] bArr) {
        Objects.requireNonNull(zzuaVar);
        this.zza = zzuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsd
    public final void zza(Exception exc) {
        zzeh.zzf("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzaB().zzi(exc);
    }
}
