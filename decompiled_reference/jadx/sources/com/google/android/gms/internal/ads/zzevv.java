package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevv implements zzfcs {
    private final zzhcp zza;
    private final zzflg zzb;
    private final zzcfp zzc;

    public zzevv(zzhcp zzhcpVar, zzflg zzflgVar, zzcfp zzcfpVar) {
        this.zza = zzhcpVar;
        this.zzb = zzflgVar;
        this.zzc = zzcfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 9;
    }

    final /* synthetic */ zzevw zzc() {
        return new zzevw(this.zzb.zzk, this.zzc.zzl());
    }
}
