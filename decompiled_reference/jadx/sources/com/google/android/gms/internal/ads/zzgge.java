package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgge implements zzhbn {
    final /* synthetic */ zzggj zza;

    zzgge(zzggj zzggjVar) {
        Objects.requireNonNull(zzggjVar);
        this.zza = zzggjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbn
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        zzggc zzggcVar = (zzggc) obj;
        if (zzggcVar != null) {
            return zzhcf.zza(zzggcVar);
        }
        zzggj zzggjVar = this.zza;
        zzggjVar.zza().zzb(51);
        return zzggjVar.zzd(zzggjVar.zze());
    }
}
