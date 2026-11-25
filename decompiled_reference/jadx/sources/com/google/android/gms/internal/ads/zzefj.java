package com.google.android.gms.internal.ads;

import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzefj implements zzimz {
    public static zzefj zza() {
        return zzefi.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzinh.zzb(string);
        return string;
    }
}
