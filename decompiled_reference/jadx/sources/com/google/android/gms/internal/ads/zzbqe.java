package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqe implements zzbpx {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbyh zzc;
    private final zzbyo zzd;

    public zzbqe(com.google.android.gms.ads.internal.zzb zzbVar, zzbyh zzbyhVar, zzbyo zzbyoVar) {
        this.zzb = zzbVar;
        this.zzc = zzbyhVar;
        this.zzd = zzbyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbyk(zzclbVar, map).zza();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbye(zzclbVar, map).zza();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzclbVar == null) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i = z ? -1 : 14;
        }
        zzclbVar.zzam(i);
    }
}
