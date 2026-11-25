package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfls implements zzhcc {
    final /* synthetic */ zzflt zza;
    final /* synthetic */ int zzb;

    zzfls(zzflt zzfltVar, int i) {
        this.zzb = i;
        Objects.requireNonNull(zzfltVar);
        this.zza = zzfltVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "BufferingUrlPinger.attributionReportingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc((String) obj, this.zzb, null);
    }
}
