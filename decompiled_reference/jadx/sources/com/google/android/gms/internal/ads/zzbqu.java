package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzbqu extends zzbqw {
    private final OnH5AdsEventListener zza;

    public zzbqu(OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbqx
    public final void zzb(String str) {
        this.zza.onH5AdsEvent(str);
    }
}
