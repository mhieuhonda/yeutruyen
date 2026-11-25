package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzcfc {
    public final ListenableFuture zza(Context context, int i) {
        zzcgd zzcgdVar = new zzcgd();
        com.google.android.gms.ads.internal.client.zzay.zza();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
            zzcfy.zza.execute(new zzcfb(this, context, zzcgdVar));
        }
        return zzcgdVar;
    }
}
