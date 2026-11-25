package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzfnm implements zzhcc {
    final /* synthetic */ zzfnp zza;
    final /* synthetic */ zzfnr zzb;

    zzfnm(zzfnr zzfnrVar, zzfnp zzfnpVar) {
        this.zza = zzfnpVar;
        Objects.requireNonNull(zzfnrVar);
        this.zzb = zzfnrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        zzfnr zzfnrVar = this.zzb;
        synchronized (zzfnrVar) {
            zzfnrVar.zzf(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfnr zzfnrVar = this.zzb;
        synchronized (zzfnrVar) {
            zzfnrVar.zzf(null);
            zzfnrVar.zze().addFirst(this.zza);
            if (zzfnrVar.zzg() == 1) {
                zzfnrVar.zzd();
            }
        }
    }
}
