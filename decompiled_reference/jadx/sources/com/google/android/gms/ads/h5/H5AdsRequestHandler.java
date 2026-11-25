package com.google.android.gms.ads.h5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbre;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class H5AdsRequestHandler {
    private final zzbre zza;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = new zzbre(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.zza.zzb();
    }

    public boolean handleH5AdsRequest(String str) {
        return this.zza.zza(str);
    }

    public boolean shouldInterceptRequest(String str) {
        return zzbre.zzc(str);
    }
}
