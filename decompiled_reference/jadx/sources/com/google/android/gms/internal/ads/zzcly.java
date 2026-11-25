package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcly implements zzbpx {
    final /* synthetic */ zzcme zza;

    zzcly(zzcme zzcmeVar) {
        Objects.requireNonNull(zzcmeVar);
        this.zza = zzcmeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                zzcme zzcmeVar = this.zza;
                synchronized (zzcmeVar) {
                    if (zzcmeVar.zzaX() != i) {
                        zzcmeVar.zzaY(i);
                        zzcmeVar.requestLayout();
                    }
                }
            } catch (Exception e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
