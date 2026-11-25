package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzexi implements zzfcs {
    private final zzhcp zza;

    zzexi(zzhcp zzhcpVar) {
        this.zza = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzexh
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzexj(Long.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - com.google.android.gms.ads.internal.zzt.zzh().zzp().zzi().zzb()).longValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 55;
    }
}
