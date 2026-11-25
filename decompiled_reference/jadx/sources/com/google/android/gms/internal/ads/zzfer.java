package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfer implements zzfcs {
    final zzhcp zza;
    final List zzb;

    public zzfer(zzbih zzbihVar, zzhcp zzhcpVar, List list) {
        this.zza = zzhcpVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfeq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfes(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 48;
    }
}
