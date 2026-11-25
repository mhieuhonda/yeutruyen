package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfpe implements zzhcc {
    final /* synthetic */ zzfoz zza;
    final /* synthetic */ zzfpj zzb;

    zzfpe(zzfpj zzfpjVar, zzfoz zzfozVar) {
        this.zza = zzfozVar;
        Objects.requireNonNull(zzfpjVar);
        this.zzb = zzfpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
