package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfen implements zzfcs {
    public zzfen(zzcez zzcezVar, zzhcp zzhcpVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        final ListenableFuture listenableFutureZza = zzhcf.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgU)).booleanValue()) {
            listenableFutureZza = zzhcf.zza(null);
        }
        final ListenableFuture listenableFutureZza2 = zzhcf.zza(null);
        return zzhcf.zzo(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfem
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfeo((String) listenableFutureZza.get(), (String) listenableFutureZza2.get());
            }
        }, zzcfy.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 47;
    }
}
