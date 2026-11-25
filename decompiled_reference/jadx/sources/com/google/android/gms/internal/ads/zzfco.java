package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfco implements zzfcs {
    private final zzhcp zza;
    private final Context zzb;

    zzfco(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 37;
    }

    final /* synthetic */ zzfcm zzc() {
        return new zzfcm(com.google.android.gms.ads.internal.util.zzac.zzb(this.zzb, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzhi)));
    }
}
