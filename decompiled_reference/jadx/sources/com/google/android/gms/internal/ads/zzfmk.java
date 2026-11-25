package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfmk implements zzimz {
    private zzfmk(zzfmj zzfmjVar) {
    }

    public static zzfmk zza(zzfmj zzfmjVar) {
        return new zzfmk(zzfmjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzinh.zzb(defaultClock);
        return defaultClock;
    }
}
