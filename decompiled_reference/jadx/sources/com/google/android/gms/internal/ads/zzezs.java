package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzezs implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    zzezs(zzhcp zzhcpVar, Context context) {
        this.zzb = zzhcpVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezr
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 57;
    }

    final /* synthetic */ zzezt zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzezt(com.google.android.gms.ads.internal.util.zzs.zzu(this.zza));
    }
}
