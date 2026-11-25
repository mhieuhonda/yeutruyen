package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfcy implements zzfcs {
    private final Context zza;
    private final zzhcp zzb;

    zzfcy(Context context, zzhcp zzhcpVar) {
        this.zza = context;
        this.zzb = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return ((Boolean) zzbkp.zzb.zze()).booleanValue() ? this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfcx
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzhcf.zza(new zzfcz(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 59;
    }

    final /* synthetic */ zzfcz zzc() {
        Context context = this.zza;
        return new zzfcz(zzbii.zzc(context), zzbii.zzd(context));
    }
}
