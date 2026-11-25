package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvf implements LoudnessCodecController.OnLoudnessCodecUpdateListener {
    zzvf(zzvi zzviVar) {
        Objects.requireNonNull(zzviVar);
    }

    public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
        return bundle;
    }
}
