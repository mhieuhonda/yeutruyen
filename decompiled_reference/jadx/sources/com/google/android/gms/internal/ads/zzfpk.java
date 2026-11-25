package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfpk {
    private static final ListenableFuture zza = zzhcf.zza(null);
    private final zzhcp zzb;
    private final ScheduledExecutorService zzc;
    private final zzfpl zzd;

    public zzfpk(zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzfpl zzfplVar) {
        this.zzb = zzhcpVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfplVar;
    }

    public final zzfpj zza(Object obj, ListenableFuture listenableFuture) {
        return new zzfpj(this, obj, null, listenableFuture, Collections.singletonList(listenableFuture), listenableFuture, null);
    }

    public final zzfpb zzb(Object obj, ListenableFuture... listenableFutureArr) {
        return new zzfpb(this, obj, Arrays.asList(listenableFutureArr), null);
    }

    protected abstract String zzc(Object obj);

    final /* synthetic */ zzhcp zze() {
        return this.zzb;
    }

    final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzfpl zzg() {
        return this.zzd;
    }
}
