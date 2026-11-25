package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfba implements zzfcs {
    private final zzhcp zza;
    private final zzeaw zzb;

    zzfba(zzhcp zzhcpVar, zzeaw zzeawVar) {
        this.zza = zzhcpVar;
        this.zzb = zzeawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 62;
    }

    final /* synthetic */ zzfbb zzc() {
        return new zzfbb(this.zzb.zzb());
    }
}
