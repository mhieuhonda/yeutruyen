package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfah implements zzfcs {
    private final zzhcp zza;
    private final zzecz zzb;

    zzfah(zzhcp zzhcpVar, zzecz zzeczVar) {
        this.zza = zzhcpVar;
        this.zzb = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfag
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 23;
    }

    final /* synthetic */ zzfai zzc() {
        zzecz zzeczVar = this.zzb;
        return new zzfai(zzeczVar.zzg(), zzeczVar.zzd(), com.google.android.gms.ads.internal.zzt.zzo().zzk(), zzeczVar.zzq(), zzeczVar.zzm());
    }
}
