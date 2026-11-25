package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzehz implements zzhcc {
    final /* synthetic */ zzcat zza;
    final /* synthetic */ zzcbc zzb;

    zzehz(zzeiq zzeiqVar, zzcbc zzcbcVar, zzcat zzcatVar) {
        this.zzb = zzcbcVar;
        this.zza = zzcatVar;
        Objects.requireNonNull(zzeiqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zzb.zze((String) obj, this.zza);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
