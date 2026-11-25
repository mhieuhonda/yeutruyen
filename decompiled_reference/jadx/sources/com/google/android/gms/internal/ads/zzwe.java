package com.google.android.gms.internal.ads;

import android.os.Build;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzwe implements zzwh {
    static final /* synthetic */ zzwe zza = new zzwe();

    private /* synthetic */ zzwe() {
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final /* synthetic */ int zza(Object obj) {
        int i = zzwi.zza;
        String str = ((zzvp) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
