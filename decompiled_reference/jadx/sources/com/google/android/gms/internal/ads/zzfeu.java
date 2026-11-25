package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfeu implements zzfcs {
    final ScheduledExecutorService zza;

    public zzfeu(zzbzm zzbzmVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zza = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.zzk(zzhcf.zzi(zzhcf.zza(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzfm)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfet.zza, zzcfy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 49;
    }
}
