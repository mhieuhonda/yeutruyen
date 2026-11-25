package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.1.2 */
/* JADX INFO: loaded from: classes2.dex */
final class zzcs extends zzdt {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzee zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcs(zzee zzeeVar, Boolean bool) {
        super(zzeeVar, true);
        this.zzb = zzeeVar;
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.measurement.zzdt
    final void zza() throws RemoteException {
        Boolean bool = this.zza;
        zzee zzeeVar = this.zzb;
        if (bool != null) {
            ((zzcc) Preconditions.checkNotNull(zzeeVar.zzj)).setMeasurementEnabled(this.zza.booleanValue(), this.zzh);
        } else {
            ((zzcc) Preconditions.checkNotNull(zzeeVar.zzj)).clearMeasurementEnabled(this.zzh);
        }
    }
}
