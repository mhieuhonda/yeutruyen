package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzvq {
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
            return 0;
        }
        int iZzc = zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, (int) d));
        boolean z = true;
        if (iZzc == 1 && zzvr.zza == null) {
            if (Build.VERSION.SDK_INT >= 37) {
                z = false;
            } else {
                int iZzb = zzb(true);
                if (Build.VERSION.SDK_INT < 35 ? !(zzb(false) != 2 || iZzb == 1) : iZzb != 1) {
                    z = false;
                }
            }
            zzvr.zza = Boolean.valueOf(z);
            if (zzvr.zza.booleanValue()) {
                return 0;
            }
        }
        return iZzc;
    }

    private static int zzb(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            zzt zztVar = new zzt();
            zztVar.zzo("video/avc");
            zzv zzvVarZzP = zztVar.zzP();
            if (zzvVarZzP.zzp != null) {
                List listZzc = zzwi.zzc(zzvy.zzb, zzvVarZzP, z, false);
                for (int i = 0; i < listZzc.size(); i++) {
                    if (((zzvp) listZzc.get(i)).zzd != null && (videoCapabilities = ((zzvp) listZzc.get(i)).zzd.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        return zzc(supportedPerformancePoints, new MediaCodecInfo.VideoCapabilities.PerformancePoint(PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60));
                    }
                }
            }
        } catch (zzwa unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (((MediaCodecInfo.VideoCapabilities.PerformancePoint) list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
