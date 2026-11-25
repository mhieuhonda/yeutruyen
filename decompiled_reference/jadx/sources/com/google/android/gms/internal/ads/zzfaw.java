package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfaw implements zzfcs {
    private static String zzc;
    private final zzhcp zza;
    private final Context zzb;

    public zzfaw(zzhcp zzhcpVar, Context context) {
        this.zza = zzhcpVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfav
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 27;
    }

    final /* synthetic */ zzfax zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgq)).booleanValue()) {
            return new zzfax(null);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzgz)).booleanValue()) {
            return new zzfax(com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb);
        }
        return new zzfax(zzc);
    }
}
