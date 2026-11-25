package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzsy extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzta zza;

    zzsy(zzta zztaVar) {
        Objects.requireNonNull(zztaVar);
        this.zza = zztaVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsx.zza);
        zzegVarZzu.zzf();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsv.zza);
        zzegVarZzu.zzf();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        zzeg zzegVarZzu = this.zza.zza.zzu();
        zzegVarZzu.zze(-1, zzsw.zza);
        zzegVarZzu.zzf();
    }
}
