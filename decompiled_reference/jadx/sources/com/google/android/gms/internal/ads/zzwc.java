package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzwc implements zzwb {
    private zzwc() {
        throw null;
    }

    /* synthetic */ zzwc(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final MediaCodecInfo zzb(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zzd(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final boolean zze(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
