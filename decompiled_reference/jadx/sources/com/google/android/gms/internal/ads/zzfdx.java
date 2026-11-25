package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzfdx implements zzfcs {
    private final Executor zza;
    private final String zzb;

    public zzfdx(zzcfc zzcfcVar, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.zza = executor;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = zzhcf.zza(this.zzb);
        zzfdw zzfdwVar = zzfdw.zza;
        Executor executor = this.zza;
        return zzhcf.zzh(zzhcf.zzk(listenableFutureZza, zzfdwVar, executor), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfdv
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 41;
    }

    final /* synthetic */ ListenableFuture zzc(Throwable th) {
        return zzhcf.zza(new zzfdy(this.zzb));
    }
}
