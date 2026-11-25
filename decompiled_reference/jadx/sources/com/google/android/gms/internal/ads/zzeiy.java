package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzeiy {
    private final zzcbd zza;

    zzeiy(zzcbd zzcbdVar) {
        this.zza = zzcbdVar;
    }

    public final void zza() {
        ListenableFuture listenableFutureZza = this.zza.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zziM)).booleanValue()) {
            zzcgb.zzb(listenableFutureZza, "persistFlags");
        } else {
            zzcgb.zza(listenableFutureZza, "persistFlags", zzcfy.zzh);
        }
    }
}
