package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzevz implements zzfcs {
    private final Executor zza;
    private final zzcfk zzb;

    zzevz(Executor executor, zzcfk zzcfkVar) {
        this.zza = executor;
        this.zzb = zzcfkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbix.zzdV)).booleanValue()) {
            return zzhcf.zza(new zzewa(null));
        }
        zzcfk zzcfkVar = this.zzb;
        return zzhcf.zzk(zzcfkVar.zzr(), zzevy.zza, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 10;
    }
}
