package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzhdd extends zzhcm {
    final /* synthetic */ zzhde zza;
    private final Callable zzb;

    zzhdd(zzhde zzhdeVar, Callable callable) {
        Objects.requireNonNull(zzhdeVar);
        this.zza = zzhdeVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final Object zza() throws Exception {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final void zzf(Object obj) {
        this.zza.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcm
    final void zzg(Throwable th) {
        this.zza.zzb(th);
    }
}
