package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@25.3.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzepu {
    private zzepl zza;

    zzepu() {
    }

    private zzepu(zzepl zzeplVar) {
        this.zza = zzeplVar;
    }

    public static zzepu zza(zzepl zzeplVar) {
        return new zzepu(zzeplVar);
    }

    public final zzepl zzb(Clock clock, zzepn zzepnVar, zzemf zzemfVar, zzfsm zzfsmVar) {
        zzepl zzeplVar = this.zza;
        return zzeplVar != null ? zzeplVar : new zzepl(clock, zzepnVar, zzemfVar, zzfsmVar);
    }
}
