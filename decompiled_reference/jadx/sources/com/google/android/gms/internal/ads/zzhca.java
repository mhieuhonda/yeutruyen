package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public class zzhca extends zzhcb {
    private final ListenableFuture zza;

    protected zzhca(ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhcb, com.google.android.gms.internal.ads.zzhbz
    protected final /* synthetic */ Future zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbz, com.google.android.gms.internal.ads.zzgwk
    protected final /* synthetic */ Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    protected final ListenableFuture zzc() {
        return this.zza;
    }
}
