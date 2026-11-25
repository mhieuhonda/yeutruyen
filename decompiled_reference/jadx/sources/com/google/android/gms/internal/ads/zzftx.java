package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzftx implements zzhcc {
    final /* synthetic */ zzful zza;

    zzftx(zzful zzfulVar) {
        Objects.requireNonNull(zzfulVar);
        this.zza = zzfulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zza.zzH(th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zza.zzG(obj);
    }
}
