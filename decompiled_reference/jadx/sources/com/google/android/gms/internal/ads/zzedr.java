package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzedr implements zzhcc {
    final /* synthetic */ zzedw zza;

    zzedr(zzedw zzedwVar) {
        Objects.requireNonNull(zzedwVar);
        this.zza = zzedwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzecn) obj).zze();
        this.zza.zzi().zzn();
    }
}
