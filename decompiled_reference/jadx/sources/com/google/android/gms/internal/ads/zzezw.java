package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezw implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;

    zzezw(zzhcp zzhcpVar, zzflg zzflgVar) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 21;
    }

    final /* synthetic */ zzezx zzc() {
        return new zzezx("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(this.zzb.zzd)));
    }
}
